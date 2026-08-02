package one.video.exo.offline;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import androidx.media3.datasource.a;
import androidx.media3.exoplayer.offline.DownloadHelper;
import androidx.media3.exoplayer.offline.DownloadRequest;
import androidx.media3.exoplayer.offline.DownloadService;
import androidx.media3.exoplayer.offline.a;
import androidx.media3.exoplayer.offline.c;
import androidx.media3.exoplayer.scheduler.Requirements;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import one.video.exo.offline.a;
import xsna.ahn;
import xsna.epx;
import xsna.f7q;
import xsna.hu70;
import xsna.izs;
import xsna.kr10;
import xsna.lao;
import xsna.m8o;
import xsna.mco;
import xsna.o7o;
import xsna.s3q0;
import xsna.sht0;
import xsna.wn80;

/* compiled from: DownloadTracker.kt */
/* loaded from: classes11.dex */
public final class c {
    public final Context a;
    public final a.InterfaceC0045a b;
    public final androidx.media3.exoplayer.offline.c c;
    public final Class<? extends DownloadService> d;
    public final FunctionReferenceImpl e;
    public final CopyOnWriteArrayList<hu70> f = new CopyOnWriteArrayList<>();
    public final HashMap<String, DownloadInfo> g = new HashMap<>();
    public final androidx.media3.exoplayer.offline.a h;
    public final g i;

    /* compiled from: DownloadTracker.kt */
    public static final class a implements c.InterfaceC0061c {
        public a() {
        }

        @Override // androidx.media3.exoplayer.offline.c.InterfaceC0061c
        public final void a(o7o o7oVar) {
            c cVar = c.this;
            cVar.g.remove(o7oVar.a.b);
            c.a(cVar);
            g gVar = cVar.i;
            if (cVar.c.o.size() <= 0) {
                gVar.b.removeCallbacksAndMessages(null);
                return;
            }
            Handler handler = gVar.b;
            handler.removeCallbacksAndMessages(null);
            gVar.a.a();
            mco mcoVar = gVar.c;
            handler.removeCallbacks(mcoVar);
            handler.postDelayed(mcoVar, 1000L);
        }

        @Override // androidx.media3.exoplayer.offline.c.InterfaceC0061c
        public final void e(androidx.media3.exoplayer.offline.c cVar, o7o o7oVar, Exception exc) {
            DownloadInfo downloadInfo = new DownloadInfo(o7oVar);
            c cVar2 = c.this;
            cVar2.g.put(o7oVar.a.b, downloadInfo);
            c.a(cVar2);
            g gVar = cVar2.i;
            if (cVar2.c.o.size() <= 0) {
                gVar.b.removeCallbacksAndMessages(null);
                return;
            }
            Handler handler = gVar.b;
            handler.removeCallbacksAndMessages(null);
            gVar.a.a();
            mco mcoVar = gVar.c;
            handler.removeCallbacks(mcoVar);
            handler.postDelayed(mcoVar, 1000L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, a.InterfaceC0045a interfaceC0045a, androidx.media3.exoplayer.offline.c cVar, Class<? extends DownloadService> cls, izs<? super Uri, s3q0> izsVar) {
        this.a = context;
        this.b = interfaceC0045a;
        this.c = cVar;
        this.d = cls;
        this.e = (FunctionReferenceImpl) izsVar;
        androidx.media3.exoplayer.offline.a aVar = cVar.b;
        this.h = aVar;
        this.i = new g(new d(this, cVar));
        cVar.f.add(new a());
        try {
            a.C0060a g = aVar.g(new int[0]);
            while (g.moveToNext()) {
                try {
                    o7o l = androidx.media3.exoplayer.offline.a.l(g.b);
                    this.g.put(l.a.b, new DownloadInfo(l));
                } finally {
                }
            }
            s3q0 s3q0Var = s3q0.a;
            g.close();
        } catch (IOException e) {
            ahn.G("Failed to query downloads", e);
        }
    }

    public static final void a(c cVar) {
        Iterator<hu70> it = cVar.f.iterator();
        while (it.hasNext()) {
            it.next().kg(cVar.g);
        }
    }

    public static DownloadRequest c(DownloadRequest downloadRequest, Uri uri) {
        DownloadRequest.b bVar = new DownloadRequest.b(downloadRequest.b, uri);
        bVar.c(downloadRequest.h);
        bVar.d(downloadRequest.f);
        bVar.b(downloadRequest.g);
        bVar.e(downloadRequest.d);
        bVar.f(downloadRequest.e);
        return bVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(String str, sht0 sht0Var, byte[] bArr, m8o m8oVar) {
        String str2;
        kr10 a2;
        if (this.g.get(str) != null) {
            return;
        }
        int i = lao.$EnumSwitchMapping$0[sht0Var.a().ordinal()];
        if (i == 1) {
            str2 = MimeTypes.APPLICATION_MP4;
        } else if (i == 2) {
            str2 = MimeTypes.APPLICATION_M3U8;
        } else {
            if (i != 3) {
                a2 = null;
                if (a2 != null) {
                    return;
                }
                DownloadHelper.c cVar = new DownloadHelper.c();
                cVar.b(this.b);
                Context context = this.a;
                cVar.c(f7q.a(context));
                a.C2180a.a(context, str, cVar.a(a2), bArr, m8oVar, this.d, this.c);
                return;
            }
            str2 = MimeTypes.APPLICATION_MPD;
        }
        kr10.a aVar = new kr10.a();
        aVar.c(str);
        aVar.f(sht0Var.b());
        aVar.d(str2);
        a2 = aVar.a();
        if (a2 != null) {
        }
    }

    public final void d(int i) {
        Class<? extends DownloadService> cls = this.d;
        if (cls == null) {
            this.c.h(new Requirements(i));
        } else {
            Requirements requirements = new Requirements(i);
            HashMap<Class<? extends DownloadService>, DownloadService.a> hashMap = DownloadService.j;
            Context context = this.a;
            context.startService(new Intent(context, cls).setAction("androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS").putExtra("foreground", false).putExtra("requirements", requirements));
        }
    }

    /* JADX WARN: Type inference failed for: r9v9, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    public final void e(String str, String str2) {
        DownloadRequest downloadRequest;
        kr10 d;
        kr10.f fVar;
        HashMap<String, DownloadInfo> hashMap = this.g;
        try {
            if (hashMap.get(str) != null) {
                a.C0060a g = this.h.g(new int[0]);
                do {
                    try {
                        if (!g.moveToNext()) {
                            s3q0 s3q0Var = s3q0.a;
                            g.close();
                            return;
                        }
                        downloadRequest = androidx.media3.exoplayer.offline.a.l(g.b).a;
                    } finally {
                    }
                } while (!epx.f(downloadRequest.b, str));
                DownloadInfo downloadInfo = hashMap.get(str);
                boolean f = epx.f((downloadInfo == null || (d = downloadInfo.d()) == null || (fVar = d.b) == null) ? null : fVar.b, MimeTypes.APPLICATION_MPD);
                androidx.media3.exoplayer.offline.c cVar = this.c;
                Context context = this.a;
                Class<? extends DownloadService> cls = this.d;
                if (f && !wn80.z) {
                    this.e.invoke(downloadRequest.c);
                } else if (cls != null) {
                    HashMap<Class<? extends DownloadService>, DownloadService.a> hashMap2 = DownloadService.j;
                    context.startService(new Intent(context, cls).setAction("androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD").putExtra("foreground", false).putExtra("content_id", str));
                } else {
                    cVar.f(str);
                }
                if (cls != null) {
                    DownloadService.k(context, cls, c(downloadRequest, Uri.parse(str2)));
                } else {
                    cVar.a(c(downloadRequest, Uri.parse(str2)), 0);
                }
                g.close();
            }
        } catch (IOException e) {
            ahn.G("Failed to query downloads", e);
        }
    }
}
