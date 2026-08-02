package ru.ok.android.externcalls.analytics.internal.upload;

import android.content.Intent;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.core.app.JobIntentService;
import androidx.core.app.SafeJobIntentService;
import java.io.IOException;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.commons.app.ApplicationProvider;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.internal.event.EventChannel;

@CallInternalApi
/* loaded from: classes9.dex */
public class UploadService extends SafeJobIntentService {
    public static final String ACTION_UPLOAD_CONTINUE = "ru.ok.android.onelog.action.UPLOAD_CONTINUE";
    public static final String ACTION_UPLOAD_NEW = "ru.ok.android.onelog.action.UPLOAD_NEW";
    private static final String LOG_TAG = "UploadService";

    private void onHandleUploadContinue(EventChannel eventChannel) {
        try {
            UploadStarter.INSTANCE.uploadContinue(eventChannel);
        } catch (IOException e) {
            CallAnalyticsConfigStorage.INSTANCE.getLogger().e(LOG_TAG, "Cannot upload already grabbed file", e);
        }
    }

    private void onHandleUploadNew(EventChannel eventChannel) {
        try {
            UploadStarter.INSTANCE.uploadNew(eventChannel);
        } catch (IOException e) {
            CallAnalyticsConfigStorage.INSTANCE.getLogger().e(LOG_TAG, "Cannot upload newly grabbed file", e);
        }
    }

    public static void resumeUpload(@NonNull EventChannel eventChannel) {
        try {
            startUploadImpl(new Intent().setAction(ACTION_UPLOAD_CONTINUE).putExtra("channel", eventChannel).setClass(ApplicationProvider.getApplication(), UploadService.class));
        } catch (Throwable th) {
            CallAnalyticsConfigStorage.INSTANCE.getLogger().e(LOG_TAG, "Cannot resume upload", th);
        }
    }

    public static void startUpload(@NonNull EventChannel eventChannel) {
        try {
            startUploadImpl(new Intent().setAction(ACTION_UPLOAD_NEW).putExtra("channel", eventChannel).setClass(ApplicationProvider.getApplication(), UploadService.class));
        } catch (Throwable th) {
            CallAnalyticsConfigStorage.INSTANCE.getLogger().e(LOG_TAG, "Cannot start upload", th);
        }
    }

    private static void startUploadImpl(@NonNull Intent intent) {
        try {
            JobIntentService.enqueueWork(ApplicationProvider.getApplication(), (Class<?>) UploadService.class, CallAnalyticsConfigStorage.INSTANCE.getUpload().getUploadJobId(), intent);
        } catch (SecurityException e) {
            CallAnalyticsConfigStorage.INSTANCE.getLogger().report(LOG_TAG, "Can't start analytics upload", new StatDeliveryException(e));
        }
    }

    @Override // androidx.core.app.JobIntentService
    public void onHandleWork(Intent intent) {
        String action;
        EventChannel eventChannel;
        Object parcelableExtra;
        if (intent == null || (action = intent.getAction()) == null) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableExtra = intent.getParcelableExtra("channel", EventChannel.class);
                eventChannel = (EventChannel) parcelableExtra;
            } else {
                eventChannel = (EventChannel) intent.getParcelableExtra("channel");
            }
            if (eventChannel == null) {
                return;
            }
            CallAnalyticsConfigStorage.INSTANCE.getLogger().d(LOG_TAG, "Handle upload work, channel=" + eventChannel.getKey());
            if (action.equals(ACTION_UPLOAD_NEW)) {
                onHandleUploadNew(eventChannel);
            } else if (action.equals(ACTION_UPLOAD_CONTINUE)) {
                onHandleUploadContinue(eventChannel);
            }
        } catch (Throwable th) {
            try {
                CallAnalyticsConfigStorage.INSTANCE.getLogger().report(LOG_TAG, "Can't start upload job", th);
            } catch (Throwable unused) {
            }
        }
    }
}
