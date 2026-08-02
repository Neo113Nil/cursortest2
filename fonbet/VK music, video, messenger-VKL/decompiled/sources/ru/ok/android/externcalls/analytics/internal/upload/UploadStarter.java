package ru.ok.android.externcalls.analytics.internal.upload;

import java.io.IOException;
import java.util.concurrent.Executor;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.internal.event.EventChannel;
import ru.ok.android.externcalls.analytics.internal.event.EventQueueCollector;
import xsna.a72;
import xsna.gv2;

/* compiled from: UploadStarter.kt */
@CallInternalApi
/* loaded from: classes9.dex */
public final class UploadStarter {
    public static final UploadStarter INSTANCE = new UploadStarter();
    private static final String LOG_TAG = "UploadStarter";

    private UploadStarter() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resumeUpload$lambda$0(EventChannel eventChannel) {
        try {
            INSTANCE.uploadContinue(eventChannel);
        } catch (IOException e) {
            CallAnalyticsConfigStorage.INSTANCE.getLogger().e(LOG_TAG, "Cannot upload", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startUpload$lambda$0(EventChannel eventChannel) {
        try {
            INSTANCE.uploadNew(eventChannel);
        } catch (IOException e) {
            CallAnalyticsConfigStorage.INSTANCE.getLogger().e(LOG_TAG, "Cannot upload", e);
        }
    }

    public final void resumeUpload(EventChannel eventChannel) {
        Executor uploadExecutor = CallAnalyticsConfigStorage.INSTANCE.getUpload().getUploadExecutor();
        if (uploadExecutor == null) {
            UploadService.resumeUpload(eventChannel);
        } else {
            uploadExecutor.execute(new a72(eventChannel, 22));
        }
    }

    public final void startUpload(EventChannel eventChannel) {
        Executor uploadExecutor = CallAnalyticsConfigStorage.INSTANCE.getUpload().getUploadExecutor();
        if (uploadExecutor == null) {
            UploadService.startUpload(eventChannel);
        } else {
            uploadExecutor.execute(new gv2(eventChannel, 15));
        }
    }

    public final void uploadContinue(EventChannel eventChannel) throws IOException {
        EventQueueCollector.getInstance(eventChannel).uploadGrabbed();
    }

    public final void uploadNew(EventChannel eventChannel) throws IOException {
        EventQueueCollector.getInstance(eventChannel).grabAndUpload();
    }
}
