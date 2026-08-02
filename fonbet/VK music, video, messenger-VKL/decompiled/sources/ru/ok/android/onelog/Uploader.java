package ru.ok.android.onelog;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.locks.Lock;
import ru.ok.android.api.common.BoxedApiValue;
import ru.ok.android.api.core.ApiClient;
import ru.ok.android.api.core.ApiException;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiRequestException;
import ru.ok.android.commons.app.ApplicationProvider;
import ru.ok.android.utils.Logger;
import xsna.e9e0;
import xsna.t33;

/* loaded from: classes9.dex */
final class Uploader {
    private static final String FORM_FACTOR_PHONE = "phone";
    private static final String FORM_FACTOR_TABLET = "tablet";
    private static String applicationString;
    private static String platformString;
    private final e9e0<File> file;
    private final Lock lock;

    public Uploader(e9e0<File> e9e0Var, Lock lock) {
        this.file = e9e0Var;
        this.lock = lock;
    }

    public static void execute(@NonNull ApiClient apiClient, @NonNull OneLogItem oneLogItem) throws IOException, ApiException {
        execute(apiClient, Collections.singleton(oneLogItem));
    }

    @NonNull
    public static String getApplicationParam() {
        String str = applicationString;
        if (str != null) {
            return str;
        }
        String str2 = ApplicationProvider.getPackageName() + StringUtils.PROCESS_POSTFIX_DELIMITER + ApplicationProvider.getVersionName() + StringUtils.PROCESS_POSTFIX_DELIMITER + ApplicationProvider.getVersionCode();
        applicationString = str2;
        return str2;
    }

    @NonNull
    public static String getPlatformParam() {
        String str = platformString;
        if (str != null) {
            return str;
        }
        StringBuilder a = t33.a("android:", ApplicationProvider.getApplication().getResources().getConfiguration().smallestScreenWidthDp < 600 ? "phone" : "tablet", StringUtils.PROCESS_POSTFIX_DELIMITER);
        a.append(Build.VERSION.RELEASE);
        String sb = a.toString();
        platformString = sb;
        return sb;
    }

    public void drop() {
        File file = this.file.get();
        try {
            try {
                this.lock.lock();
                if (file.exists()) {
                    Files.delete(file);
                    Logger.d("drop %s", file);
                } else {
                    Logger.d("no drop %s", file);
                }
            } catch (IOException e) {
                Logger.e(e, "drop failed %s");
            }
        } finally {
            this.lock.unlock();
        }
    }

    public void upload(@Nullable OneLogTrigger oneLogTrigger) {
        try {
            ApiClient apiClient = OneLogImpl.getInstance().getApiClient();
            File file = this.file.get();
            try {
                try {
                    this.lock.lock();
                } finally {
                    this.lock.unlock();
                }
            } catch (IOException | ApiException e) {
                Logger.e(e, "upload failed");
            }
            if (!file.exists() || file.length() == 0) {
                Logger.d("nothing to upload");
                return;
            }
            try {
                execute(apiClient, new StreamingOneLogItemsApiValue(file, oneLogTrigger));
            } catch (ApiInvocationException e2) {
                int errorCode = e2.getErrorCode();
                if (errorCode == 2 || errorCode == 453 || errorCode == 102 || errorCode == 103) {
                    Logger.w("recoverable invocation error occurred, will retry");
                    throw e2;
                }
                Logger.e("upload error %s", e2.getErrorMessage());
                Logger.e("upload failed, removing possibly broken logs");
            } catch (ApiRequestException e3) {
                Logger.e("upload error %s", e3.getMessage());
                Logger.e("upload failed, removing likely broken logs");
            }
            Files.delete(file);
        } catch (Exception unused) {
            Logger.d("api not initialized, will retry");
        }
    }

    public static void execute(@NonNull ApiClient apiClient, @NonNull Collection<OneLogItem> collection) throws IOException, ApiException {
        if (collection.isEmpty()) {
            Logger.d("nothing to upload");
        } else {
            execute(apiClient, new SimpleOneLogItemsApiValue(collection, OneLogTrigger.explicitUpload(collection.size())));
        }
    }

    private static void execute(@NonNull ApiClient apiClient, @NonNull BoxedApiValue boxedApiValue) throws IOException, ApiException {
        apiClient.execute((ApiExecutableRequest) new OneLogApiRequest(getApplicationParam(), getPlatformParam(), boxedApiValue));
    }
}
