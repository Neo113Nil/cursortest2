package xsna;

import android.content.Context;
import android.content.Intent;
import androidx.media3.datasource.a;
import androidx.media3.datasource.cache.a;
import androidx.media3.exoplayer.offline.DownloadService;
import androidx.media3.exoplayer.scheduler.Requirements;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import one.video.exo.offline.DownloadInfo;
import one.video.exo.offline.OfflineRequirement;

/* compiled from: OneVideoOfflineManager.kt */
/* loaded from: classes8.dex */
public final class mm80 {
    public volatile boolean a;
    public volatile Class<? extends DownloadService> b;
    public volatile pn80 c;
    public volatile androidx.media3.datasource.cache.c d;
    public volatile androidx.media3.exoplayer.offline.c e;
    public volatile one.video.exo.offline.c f;
    public final kt70 g = new kt70();

    public static void a(mm80 mm80Var, String str, sht0 sht0Var, byte[] bArr) {
        synchronized (mm80Var) {
            mm80Var.e().b(str, sht0Var, bArr, null);
        }
    }

    public final synchronized void b(hu70 hu70Var) {
        e().f.add(hu70Var);
    }

    public final synchronized DownloadInfo c(String str) {
        return e().g.get(str);
    }

    public final synchronized androidx.media3.exoplayer.offline.c d() {
        androidx.media3.exoplayer.offline.c cVar;
        cVar = this.e;
        if (cVar == null) {
            throw new IllegalStateException("OneVideoOfflineManager.init() must be called first");
        }
        return cVar;
    }

    public final one.video.exo.offline.c e() {
        one.video.exo.offline.c cVar = this.f;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("OneVideoOfflineManager.init() must be called first");
    }

    public final synchronized HashMap f() {
        return e().g;
    }

    public final synchronized boolean g(String str) {
        return e().g.get(str) != null;
    }

    public final synchronized void h(Context context, Class cls, String str, a.InterfaceC0045a interfaceC0045a, List list, ExecutorService executorService) {
        try {
            this.b = cls;
            this.c = new pn80(context.getApplicationContext(), "video_downloads_database.db", null, 1);
            File file = new File(str);
            g370 g370Var = new g370();
            pn80 pn80Var = this.c;
            if (pn80Var == null) {
                throw new IllegalStateException("OneVideoOfflineManager.init() must be called first");
            }
            int i = 0;
            this.d = new androidx.media3.datasource.cache.c(file, g370Var, pn80Var, false);
            androidx.media3.datasource.cache.c cVar = this.d;
            Set<String> keys = cVar != null ? cVar.getKeys() : null;
            if (keys != null) {
                this.g.b = keys;
            }
            androidx.media3.datasource.cache.c cVar2 = this.d;
            if (cVar2 != null) {
                this.g.c = cVar2;
            }
            pn80 pn80Var2 = this.c;
            if (pn80Var2 == null) {
                throw new IllegalStateException("OneVideoOfflineManager.init() must be called first");
            }
            androidx.media3.exoplayer.offline.a aVar = new androidx.media3.exoplayer.offline.a(pn80Var2);
            a.b bVar = new a.b();
            bVar.c = this.g;
            androidx.media3.datasource.cache.c cVar3 = this.d;
            if (cVar3 == null) {
                throw new IllegalStateException("OneVideoOfflineManager.init() must be called first");
            }
            bVar.a = cVar3;
            bVar.e = interfaceC0045a;
            androidx.media3.exoplayer.offline.c cVar4 = new androidx.media3.exoplayer.offline.c(context, aVar, new androidx.media3.exoplayer.offline.b(bVar, executorService == null ? Executors.newFixedThreadPool(4) : executorService));
            if (cls == null) {
                cVar4.g(false);
            }
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    i |= ((OfflineRequirement) it.next()).i();
                }
                cVar4.h(new Requirements(i));
            }
            this.e = cVar4;
            androidx.media3.exoplayer.offline.c cVar5 = this.e;
            if (cVar5 == null) {
                throw new IllegalStateException("OneVideoOfflineManager.init() must be called first");
            }
            this.f = new one.video.exo.offline.c(context, interfaceC0045a, cVar5, this.b, new lm80(1, this, mm80.class, "clearCachedResource", "clearCachedResource(Landroid/net/Uri;)V", 0));
            this.a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void j(String str) {
        one.video.exo.offline.c e = e();
        Class<? extends DownloadService> cls = e.d;
        if (cls != null) {
            Context context = e.a;
            HashMap<Class<? extends DownloadService>, DownloadService.a> hashMap = DownloadService.j;
            context.startService(new Intent(context, cls).setAction("androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON").putExtra("foreground", false).putExtra("content_id", str).putExtra("stop_reason", 666));
        } else {
            e.c.i(666, str);
        }
    }

    public final synchronized void k(String str) {
        one.video.exo.offline.c e = e();
        Class<? extends DownloadService> cls = e.d;
        if (cls != null) {
            Context context = e.a;
            HashMap<Class<? extends DownloadService>, DownloadService.a> hashMap = DownloadService.j;
            context.startService(new Intent(context, cls).setAction("androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD").putExtra("foreground", false).putExtra("content_id", str));
        } else {
            e.c.f(str);
        }
    }

    public final synchronized void l(String str) {
        one.video.exo.offline.c e = e();
        Class<? extends DownloadService> cls = e.d;
        if (cls != null) {
            Context context = e.a;
            HashMap<Class<? extends DownloadService>, DownloadService.a> hashMap = DownloadService.j;
            context.startService(new Intent(context, cls).setAction("androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON").putExtra("foreground", false).putExtra("content_id", str).putExtra("stop_reason", 0));
        } else {
            e.c.i(0, str);
        }
    }
}
