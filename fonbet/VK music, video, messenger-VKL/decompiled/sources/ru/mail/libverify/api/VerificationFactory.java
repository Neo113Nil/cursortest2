package ru.mail.libverify.api;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.mail.libverify.R;
import ru.mail.libverify.platform.core.PlatformCoreService;
import ru.mail.verify.core.api.UncaughtExceptionListener;
import ru.mail.verify.core.gcm.GcmProcessService;
import ru.mail.verify.core.utils.FileLog;
import ru.mail.verify.core.utils.LogReceiver;
import ru.mail.verify.core.utils.SocketFactoryProvider;
import xsna.bnr0;

/* loaded from: classes11.dex */
public final class VerificationFactory {
    public static final String LIBVERIFY_GCM_TOKEN = "gcm_token";
    public static final String LIBVERIFY_GCM_TOKEN_BROADCAST_ACTION = "ru.mail.libverify.gcm_token";
    public static final String LIBVERIFY_MANIFEST_APPLICATION_KEY_KEY = "ru.mail.libverify.application_key";
    public static final String LIBVERIFY_MANIFEST_APPLICATION_NAME_KEY = "ru.mail.libverify.application_name";
    public static final String LIBVERIFY_MANIFEST_SERVER_ID_KEY = "ru.mail.libverify.server_id";
    public static final String LIBVERIFY_RESOURCE_APPLICATION_KEY_KEY = "libverify_application_key";
    public static final String LIBVERIFY_RESOURCE_APPLICATION_NAME_KEY = "libverify_application_name";
    public static final String LIBVERIFY_RESOURCE_SERVER_ID_KEY = "libverify_server_id";

    @Nullable
    private static volatile ru.mail.libverify.c.d a;
    private static final AtomicBoolean b = new AtomicBoolean(false);

    @NonNull
    private static ru.mail.libverify.c.d a(@NonNull Context context) {
        if (a == null) {
            synchronized (ru.mail.libverify.d0.a.class) {
                try {
                    if (a == null) {
                        ru.mail.libverify.g0.b c = ru.mail.libverify.d0.a.c(context);
                        a = i.a().a(c).a(ru.mail.libverify.d0.a.a()).a();
                    }
                } finally {
                }
            }
        }
        ru.mail.libverify.c.d dVar = a;
        Objects.requireNonNull(dVar);
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Context context) {
        a(context).get();
    }

    public static void bootstrap(@NonNull Context context) {
        ru.mail.libverify.d0.a.a(context);
    }

    public static void deliverGcmMessageIntent(@NonNull Context context, @Nullable String str, @NonNull Map<String, String> map) {
        if (!b.get()) {
            initialize(context);
            FileLog.e("VerificationFactory", "Libverify must be initialized with initialize() method before this call");
        }
        ru.mail.libverify.d0.a.a(context, str, map);
    }

    public static void disableTracer() {
        ru.mail.libverify.d0.a.a().h();
    }

    public static void enableDebugMode() {
        ru.mail.libverify.d0.a.a().g();
    }

    public static void enableSimpleDebugCodeParser() {
        ru.mail.libverify.d0.a.a().getClass();
    }

    @NonNull
    public static VerificationApi get(@NonNull Context context) {
        if (!b.get()) {
            initialize(context);
            FileLog.e("VerificationFactory", "Libverify must be initialized with initialize() method before this call");
        }
        return a(context).get();
    }

    @NonNull
    public static String getGcmServerId(@NonNull Context context) {
        return context.getResources().getString(R.string.libverify_server_id);
    }

    @NonNull
    public static VerificationApi getInstance(@NonNull Context context) throws IllegalArgumentException {
        return get(context);
    }

    @NonNull
    public static PlatformCoreService getPlatformService(@NonNull Context context) {
        return ru.mail.libverify.d0.a.a().a(context);
    }

    @NonNull
    @Deprecated
    public static String[] getRequiredPermissions(@Nullable Context context) {
        return getRequiredPermissions();
    }

    @NonNull
    public static ArrayList<String> getSmsHash(@NonNull Context context) {
        return new ru.mail.libverify.c.a(context).b();
    }

    public static boolean hasInstallation(@NonNull Context context) {
        return ru.mail.libverify.l0.c.a(context);
    }

    public static void initialize(@NonNull Context context) {
        if (b.compareAndSet(false, true)) {
            FileLog.v("VerificationFactory", "platform type: %s", ru.mail.libverify.d0.a.a().a(context).getClass().getName());
            FileLog.v("VerificationFactory", "Initialize Verify");
            ru.mail.libverify.d0.a.a(new bnr0(context, 0));
        }
    }

    public static void refreshGcmToken(@NonNull Context context) {
        if (!b.get()) {
            initialize(context);
            FileLog.e("VerificationFactory", "Libverify must be initialized with initialize() method before this call");
        }
        if (ru.mail.libverify.d0.a.e(context)) {
            GcmProcessService.a(context);
        }
    }

    public static void release(@NonNull Context context) {
        if (a != null) {
            synchronized (ru.mail.libverify.d0.a.class) {
                try {
                    if (a != null) {
                        ru.mail.libverify.d0.a.a(context, ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.API_SHUTDOWN, (Object) null));
                        b.set(false);
                        a = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void removeApiEndpoint(@NonNull Context context) {
        get(context).removeApiEndpoint();
    }

    public static void setApiEndpoint(@NonNull Context context, @Nullable String str) {
        get(context).setApiEndpoint(str);
    }

    public static void setApiEndpoints(@NonNull Context context, @NonNull Map<String, String> map) {
        get(context).setApiEndpoints(map);
    }

    public static void setCustomLocale(@NonNull Context context, @NonNull Locale locale) {
        get(context).setCustomLocale(locale);
    }

    public static void setDisableSimDataSend(@NonNull Context context, boolean z) {
        get(context).setSimDataSendDisabled(z);
    }

    public static void setLogReceiver(@NonNull LogReceiver logReceiver) {
        ru.mail.libverify.d0.a.a().getClass();
        FileLog.init(logReceiver);
    }

    public static void setPlatformService(@NonNull Context context, @NonNull PlatformCoreService... platformCoreServiceArr) {
        int length = platformCoreServiceArr.length;
        int i = 0;
        PlatformCoreService platformCoreService = null;
        while (true) {
            if (i >= length) {
                break;
            }
            PlatformCoreService platformCoreService2 = platformCoreServiceArr[i];
            if (platformCoreService == null) {
                platformCoreService = platformCoreService2;
            }
            if (platformCoreService2.isServiceAvailable(context, null)) {
                platformCoreService = platformCoreService2;
                break;
            }
            i++;
        }
        ru.mail.libverify.d0.a.a().a(platformCoreService);
    }

    public static void setSocketFactoryProvider(@NonNull SocketFactoryProvider socketFactoryProvider) {
        ru.mail.libverify.d0.a.a().a(socketFactoryProvider);
    }

    public static void setUncaughtExceptionListener(@NonNull UncaughtExceptionListener uncaughtExceptionListener) {
        ru.mail.libverify.d0.a.a().a(uncaughtExceptionListener);
    }

    public static void signOut(@NonNull Context context, boolean z) {
        if (hasInstallation(context)) {
            get(context).signOut(z);
        }
    }

    public static void softSignOut(@NonNull Context context) {
        if (hasInstallation(context)) {
            get(context).softSignOut();
        }
    }

    @NonNull
    public static String[] getRequiredPermissions() {
        return q.f();
    }

    public static void signOut(@NonNull Context context, boolean z, @Nullable SignOutCallback signOutCallback) {
        if (hasInstallation(context)) {
            get(context).signOut(z, signOutCallback);
        }
    }

    public static void softSignOut(@NonNull Context context, @NonNull SignOutCallback signOutCallback) {
        if (hasInstallation(context)) {
            get(context).softSignOut(signOutCallback);
        }
    }

    public static void deliverGcmMessageIntent(@NonNull Context context, @Nullable String str, @NonNull Bundle bundle) {
        ru.mail.libverify.d0.a.a(context, str, bundle);
    }

    public static void setLocationUsage(@NonNull Context context, boolean z) {
    }
}
