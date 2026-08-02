package ru.ok.android.onelog;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.JobIntentService;
import androidx.core.app.SafeJobIntentService;
import java.io.IOException;
import ru.ok.android.commons.app.ApplicationProvider;
import ru.ok.android.utils.Logger;

/* loaded from: classes9.dex */
public class UploadService extends SafeJobIntentService {
    public static final String ACTION_UPLOAD = "ru.ok.android.onelog.action.UPLOAD";
    public static final String EXTRA_TRIGGER = "trigger";
    public static final String SCHEME = "one-log";

    private void onHandleUpload(@NonNull String str, @Nullable OneLogTrigger oneLogTrigger) {
        try {
            OneLogImpl.upload(str, oneLogTrigger);
        } catch (IOException e) {
            Logger.e("Cannot upload", e);
        }
    }

    @Deprecated
    public static void startUpload(@NonNull String str) {
        startUpload(str, null);
    }

    @Override // androidx.core.app.JobIntentService
    public void onHandleWork(Intent intent) {
        String action;
        if (intent == null || (action = intent.getAction()) == null || !action.equals(ACTION_UPLOAD)) {
            return;
        }
        onHandleUpload(intent.getData().getSchemeSpecificPart(), (OneLogTrigger) intent.getParcelableExtra(EXTRA_TRIGGER));
    }

    public static void startUpload(@NonNull String str, @Nullable OneLogTrigger oneLogTrigger) {
        Application application = ApplicationProvider.getApplication();
        JobIntentService.enqueueWork(application, (Class<?>) UploadService.class, OneLogImpl.getInstance().getUploadJobId(), new Intent().setAction(ACTION_UPLOAD).setData(Uri.fromParts(SCHEME, str, null)).putExtra(EXTRA_TRIGGER, oneLogTrigger).setClass(application, UploadService.class));
    }
}
