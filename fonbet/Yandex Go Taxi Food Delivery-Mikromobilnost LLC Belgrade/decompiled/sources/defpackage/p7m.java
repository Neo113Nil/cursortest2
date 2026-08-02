package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.media3.exoplayer.offline.DownloadService;
import androidx.media3.exoplayer.offline.e;
import androidx.media3.exoplayer.scheduler.Requirements;
import java.util.List;

/* loaded from: classes10.dex */
public final class p7m implements l7m {
    public final Context a;
    public final e b;
    public final boolean c;
    public final Class d;
    public DownloadService e;

    public p7m(Context context, e eVar, boolean z, Class cls) {
        this.a = context;
        this.b = eVar;
        this.c = z;
        this.d = cls;
        eVar.d.add(this);
    }

    public final void a() {
        Intent intent;
        Intent intent2;
        Class cls = this.d;
        boolean z = this.c;
        Context context = this.a;
        if (z) {
            try {
                intent = DownloadService.getIntent(context, cls, "androidx.media3.exoplayer.downloadService.action.RESTART");
                tw21.i0(context, intent);
                return;
            } catch (IllegalStateException unused) {
                lk91.j("Failed to restart (foreground launch restriction)");
                return;
            }
        }
        try {
            intent2 = DownloadService.getIntent(context, cls, DownloadService.ACTION_INIT);
            context.startService(intent2);
        } catch (IllegalStateException unused2) {
            lk91.j("Failed to restart (process is idle)");
        }
    }

    @Override // defpackage.l7m
    public final void onDownloadChanged(e eVar, u6m u6mVar, Exception exc) {
        boolean needsStartedService;
        boolean isStopped;
        DownloadService downloadService = this.e;
        if (downloadService != null) {
            downloadService.notifyDownloadChanged(u6mVar);
        }
        DownloadService downloadService2 = this.e;
        if (downloadService2 != null) {
            isStopped = downloadService2.isStopped();
            if (!isStopped) {
                return;
            }
        }
        needsStartedService = DownloadService.needsStartedService(u6mVar.b);
        if (needsStartedService) {
            lk91.j("DownloadService wasn't running. Restarting.");
            a();
        }
    }

    @Override // defpackage.l7m
    public final void onDownloadRemoved(e eVar, u6m u6mVar) {
        DownloadService downloadService = this.e;
        if (downloadService != null) {
            downloadService.notifyDownloadRemoved();
        }
    }

    @Override // defpackage.l7m
    public final void onIdle(e eVar) {
        DownloadService downloadService = this.e;
        if (downloadService != null) {
            downloadService.onIdle();
        }
    }

    @Override // defpackage.l7m
    public final void onInitialized(e eVar) {
        DownloadService downloadService = this.e;
        if (downloadService != null) {
            downloadService.notifyDownloads(eVar.m);
        }
    }

    @Override // defpackage.l7m
    public final void onRequirementsStateChanged(e eVar, Requirements requirements, int i) {
    }

    @Override // defpackage.l7m
    public final void onWaitingForRequirementsChanged(e eVar, boolean z) {
        boolean isStopped;
        if (z || eVar.h) {
            return;
        }
        DownloadService downloadService = this.e;
        if (downloadService != null) {
            isStopped = downloadService.isStopped();
            if (!isStopped) {
                return;
            }
        }
        List list = eVar.m;
        for (int i = 0; i < list.size(); i++) {
            if (((u6m) list.get(i)).b == 0) {
                a();
                return;
            }
        }
    }
}
