package com.yandex.mapkit.offline_cache.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.huy;
import defpackage.iuy;
import defpackage.jg;
import defpackage.juy;
import defpackage.mh3;
import defpackage.s2s;
import java.util.logging.Logger;

/* loaded from: classes15.dex */
public class BackgroundDownloadJob extends Worker implements BackgroundWorkerListener {
    private static Logger LOGGER = Logger.getLogger(BackgroundDownloadJob.class.getCanonicalName());
    protected static final String TAG = "mapkit_background_download";

    public BackgroundDownloadJob(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doWork$0(BackgroundDownloadInitializer backgroundDownloadInitializer) {
        backgroundDownloadInitializer.setListener(this);
        backgroundDownloadInitializer.initializeMapkit();
    }

    @Override // androidx.work.Worker
    public synchronized juy doWork() {
        LOGGER.info("Start background download job");
        BackgroundDownloadInitializer initializer = BackgroundDownloadManager.getInitializer();
        if (initializer != null) {
            new Handler(Looper.getMainLooper()).post(new mh3(6, this, initializer));
        }
        int i = 29;
        try {
            try {
                wait();
                LOGGER.info("Stop background download job");
            } finally {
                if (initializer != null) {
                    new Handler(Looper.getMainLooper()).post(new jg(i, initializer));
                }
            }
        } catch (InterruptedException unused) {
            LOGGER.info("Background download job interrupted");
            huy huyVar = new huy();
            if (initializer != null) {
                new Handler(Looper.getMainLooper()).post(new jg(i, initializer));
            }
            return huyVar;
        }
        return new iuy();
    }

    @Override // defpackage.kuy
    public synchronized void onStopped() {
        notifyAll();
    }

    @Override // com.yandex.mapkit.offline_cache.internal.BackgroundWorkerListener
    public void updateForegroundInfo(s2s s2sVar) {
        setForegroundAsync(s2sVar);
    }
}
