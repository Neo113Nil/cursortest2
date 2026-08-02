package com.yandex.mapkit.offline_cache.internal;

import android.content.Context;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.WorkManager;
import androidx.work.impl.b;
import com.yandex.runtime.Runtime;
import defpackage.i8e;
import defpackage.jz50;
import defpackage.k8e;
import defpackage.kbs;
import defpackage.q270;
import defpackage.r270;
import java.util.Collections;

/* loaded from: classes11.dex */
public class BackgroundDownloadManager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static BackgroundDownloadInitializer initializer;
    private static BackgroundDownloadManager instance;
    private int activeDownloads = 0;
    private boolean allowCellular = false;
    private WorkManager workManager;

    private BackgroundDownloadManager(BackgroundDownloadInitializer backgroundDownloadInitializer, Context context) {
        this.workManager = null;
        initializer = backgroundDownloadInitializer;
        this.workManager = b.i(context);
    }

    private void disableBackgroundDownloading() {
        this.workManager.c("mapkit_background_download");
    }

    private void enableBackgroundDownloading() {
        NetworkType networkType = this.allowCellular ? NetworkType.CONNECTED : NetworkType.UNMETERED;
        i8e i8eVar = new i8e();
        i8eVar.c = networkType;
        i8eVar.b = new jz50(null);
        k8e a = i8eVar.a();
        q270 q270Var = new q270(BackgroundDownloadJob.class);
        q270Var.c.j = a;
        r270 r270Var = (r270) q270Var.a();
        WorkManager workManager = this.workManager;
        ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.REPLACE;
        workManager.getClass();
        workManager.g("mapkit_background_download", existingWorkPolicy, Collections.singletonList(r270Var));
    }

    public static synchronized BackgroundDownloadInitializer getInitializer() {
        BackgroundDownloadInitializer backgroundDownloadInitializer;
        synchronized (BackgroundDownloadManager.class) {
            backgroundDownloadInitializer = initializer;
        }
        return backgroundDownloadInitializer;
    }

    public static BackgroundDownloadManager getInstance() {
        initialize(null, Runtime.getApplicationContext());
        return instance;
    }

    public static void initialize(BackgroundDownloadInitializer backgroundDownloadInitializer, Context context) {
        if (instance == null) {
            instance = new BackgroundDownloadManager(backgroundDownloadInitializer, context);
        } else {
            if (backgroundDownloadInitializer == null) {
                return;
            }
            kbs.g("BackgroundDownloadManager reinitialization");
        }
    }

    public void decrementActiveDownloads() {
        int i = this.activeDownloads - 1;
        this.activeDownloads = i;
        if (i == 0) {
            disableBackgroundDownloading();
        }
    }

    public void incrementActiveDownloads() {
        int i = this.activeDownloads + 1;
        this.activeDownloads = i;
        if (i == 1) {
            enableBackgroundDownloading();
        }
    }

    public void updateBackgroundDownloading(boolean z) {
        this.allowCellular = z;
        if (this.activeDownloads > 0) {
            enableBackgroundDownloading();
        }
    }
}
