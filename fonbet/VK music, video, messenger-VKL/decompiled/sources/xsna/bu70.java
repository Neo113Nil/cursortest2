package xsna;

import android.content.Context;
import android.content.Intent;
import androidx.media3.datasource.a;
import androidx.media3.datasource.c;
import androidx.media3.datasource.cache.a;
import androidx.media3.exoplayer.offline.DownloadService;
import androidx.media3.exoplayer.scheduler.Requirements;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import one.video.exo.offline.DownloadInfo;
import one.video.exo.offline.OfflineRequirement;

/* compiled from: OfflineHelper.kt */
@ozl
/* loaded from: classes11.dex */
public final class bu70 {
    public static volatile Class<? extends DownloadService> b;
    public static volatile aes0 c;
    public static volatile androidx.media3.datasource.cache.c d;
    public static volatile androidx.media3.exoplayer.offline.c e;
    public static volatile one.video.exo.offline.c f;
    public static final bu70 a = new bu70();
    public static final kt70 g = new kt70();

    public static one.video.exo.offline.c e() {
        RuntimeException runtimeException;
        one.video.exo.offline.c cVar = f;
        if (cVar != null) {
            return cVar;
        }
        runtimeException = cu70.a;
        throw runtimeException;
    }

    public final synchronized void a(Context context, Class cls, String str, c.a aVar, List list, ExecutorService executorService) {
        RuntimeException runtimeException;
        RuntimeException runtimeException2;
        RuntimeException runtimeException3;
        RuntimeException runtimeException4;
        RuntimeException runtimeException5;
        try {
            b = cls;
            c = new aes0(context.getApplicationContext(), "video_downloads_database.db", null, 1);
            File file = new File(str);
            g370 g370Var = new g370();
            aes0 aes0Var = c;
            if (aes0Var == null) {
                runtimeException = cu70.a;
                throw runtimeException;
            }
            int i = 0;
            d = new androidx.media3.datasource.cache.c(file, g370Var, aes0Var, false);
            androidx.media3.datasource.cache.c cVar = d;
            Set<String> keys = cVar != null ? cVar.getKeys() : null;
            if (keys != null) {
                g.b = keys;
            }
            androidx.media3.datasource.cache.c cVar2 = d;
            if (cVar2 != null) {
                g.c = cVar2;
            }
            aes0 aes0Var2 = c;
            if (aes0Var2 == null) {
                runtimeException2 = cu70.a;
                throw runtimeException2;
            }
            androidx.media3.exoplayer.offline.a aVar2 = new androidx.media3.exoplayer.offline.a(aes0Var2);
            a.b bVar = new a.b();
            bVar.c = g;
            androidx.media3.datasource.cache.c cVar3 = d;
            if (cVar3 == null) {
                runtimeException3 = cu70.a;
                throw runtimeException3;
            }
            bVar.a = cVar3;
            bVar.e = aVar;
            androidx.media3.exoplayer.offline.c cVar4 = new androidx.media3.exoplayer.offline.c(context, aVar2, new androidx.media3.exoplayer.offline.b(bVar, executorService == null ? Executors.newFixedThreadPool(4) : executorService));
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    i |= ((OfflineRequirement) it.next()).i();
                }
                cVar4.h(new Requirements(i));
            }
            e = cVar4;
            androidx.media3.exoplayer.offline.c cVar5 = e;
            if (cVar5 == null) {
                runtimeException4 = cu70.a;
                throw runtimeException4;
            }
            Class<? extends DownloadService> cls2 = b;
            if (cls2 == null) {
                runtimeException5 = cu70.a;
                throw runtimeException5;
            }
            f = new one.video.exo.offline.c(context, aVar, cVar5, cls2, new au70(1, this, bu70.class, "clearCachedResource", "clearCachedResource(Landroid/net/Uri;)V", 0));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(hu70 hu70Var) {
        e().f.add(hu70Var);
    }

    public final synchronized a.b c(a.InterfaceC0045a interfaceC0045a) {
        RuntimeException runtimeException;
        a.b bVar;
        androidx.media3.datasource.cache.c cVar = d;
        if (cVar == null) {
            runtimeException = cu70.a;
            throw runtimeException;
        }
        bVar = new a.b();
        bVar.a = cVar;
        bVar.c = g;
        bVar.e = interfaceC0045a;
        bVar.d(null);
        bVar.h = 2;
        return bVar;
    }

    public final synchronized DownloadInfo d(String str) {
        return e().g.get(str);
    }

    public final synchronized HashMap f() {
        return e().g;
    }

    public final synchronized boolean g(String str) {
        return e().g.get(str) != null;
    }

    public final synchronized void h(String str) {
        one.video.exo.offline.c e2 = e();
        Class<? extends DownloadService> cls = e2.d;
        if (cls != null) {
            Context context = e2.a;
            HashMap<Class<? extends DownloadService>, DownloadService.a> hashMap = DownloadService.j;
            context.startService(new Intent(context, cls).setAction("androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON").putExtra("foreground", false).putExtra("content_id", str).putExtra("stop_reason", 666));
        } else {
            e2.c.i(666, str);
        }
    }

    public final synchronized void i(String str) {
        one.video.exo.offline.c e2 = e();
        Class<? extends DownloadService> cls = e2.d;
        if (cls != null) {
            Context context = e2.a;
            HashMap<Class<? extends DownloadService>, DownloadService.a> hashMap = DownloadService.j;
            context.startService(new Intent(context, cls).setAction("androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD").putExtra("foreground", false).putExtra("content_id", str));
        } else {
            e2.c.f(str);
        }
    }

    public final synchronized void j(ArrayList arrayList) {
        one.video.exo.offline.c e2 = e();
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((OfflineRequirement) it.next()).i();
        }
        e2.d(i);
    }
}
