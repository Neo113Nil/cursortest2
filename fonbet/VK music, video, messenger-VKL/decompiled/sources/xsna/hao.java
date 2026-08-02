package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import androidx.media3.datasource.cache.a;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.offline.DownloadHelper;
import androidx.media3.exoplayer.offline.DownloadRequest;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.nio.channels.ClosedByInterruptException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.EmptyList;
import one.video.exo.diskcache.core.CachedVideoInfo;
import one.video.player.model.VideoContentType;
import xsna.bx8;
import xsna.dip0;
import xsna.ewo0;
import xsna.kr10;
import xsna.npl;
import xsna.yn80;

/* compiled from: DownloadTask.kt */
/* loaded from: classes8.dex */
public final class hao extends cbn<s3q0, IOException> {
    public final bhs0 i;
    public final Context j;
    public final van k;
    public final xan l;
    public final a.b m;
    public final Executor n;
    public final Handler o;
    public final yan p;
    public final Executor q;
    public final kr10 r;
    public volatile DownloadHelper s;
    public volatile androidx.media3.exoplayer.offline.d t;
    public volatile a u;
    public final b9 v;
    public final yn80.a w;
    public final bpn0 x;
    public final ssk y;

    /* compiled from: DownloadTask.kt */
    public static final class a {
        public final long a;
        public final long b;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            return efz.b(this.b, ")", fp.b(this.a, "ProgressDownload(bytesDownloaded=", ", contentLength="));
        }

        public /* synthetic */ a(int i) {
            this(0L, 0L);
        }

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }
    }

    public hao(String str, bhs0 bhs0Var, Context context, van vanVar, xan xanVar, a.b bVar, Executor executor, Handler handler, yan yanVar) {
        Executor executor2 = executor;
        this.i = bhs0Var;
        this.j = context;
        this.k = vanVar;
        this.l = xanVar;
        this.m = bVar;
        this.n = executor2;
        this.o = handler;
        this.p = yanVar;
        if ((executor2 instanceof ThreadPoolExecutor) && ((ThreadPoolExecutor) executor2).getCorePoolSize() == 1) {
            executor2 = new fao();
        }
        this.q = executor2;
        kr10.b.a aVar = new kr10.b.a();
        com.google.common.collect.h hVar = com.google.common.collect.h.h;
        ImmutableList.b bVar2 = ImmutableList.c;
        com.google.common.collect.g gVar = com.google.common.collect.g.f;
        List list = Collections.EMPTY_LIST;
        com.google.common.collect.g gVar2 = com.google.common.collect.g.f;
        kr10.e.a aVar2 = new kr10.e.a();
        kr10.g gVar3 = kr10.g.a;
        String str2 = xanVar.a.d;
        str2.getClass();
        Uri uri = xanVar.a.b;
        this.r = new kr10(str2, new kr10.c(aVar), uri != null ? new kr10.f(uri, str, null, list, null, gVar2, C.TIME_UNSET) : null, new kr10.e(aVar2), vr10.B, gVar3);
        this.u = new a(0);
        this.v = new b9(this, 15);
        this.w = new yn80.a(bhs0Var.d.b, new k5h(this, 11), new qb8(10), (wn80.m ? this : null) != null ? new fbi0() : null, wn80.i ? new su5(wn80.j, wn80.k, wn80.l) : null, null, null);
        this.x = new bpn0(new c5f(this, 14));
        this.y = new ssk(bhs0Var.c, vanVar);
    }

    public static final void e(hao haoVar, DownloadHelper downloadHelper) {
        bx8.a aVar = haoVar.l.b;
        if (downloadHelper.i() <= 0) {
            EmptyList emptyList = EmptyList.b;
        } else {
            downloadHelper.e();
            dip0 a2 = bhp0.a(downloadHelper.n[0], downloadHelper.p[0]);
            int i = 17;
            g(a2, 2, new b40(i));
            g(a2, 1, new com.vk.movika.sdk.base.observable.e0(20));
            g(a2, 3, new tr0(i));
        }
        npl.d dVar = (npl.d) haoVar.x.getValue();
        dVar.getClass();
        npl.d.a aVar2 = new npl.d.a(dVar);
        s3q0 s3q0Var = s3q0.a;
        s3q0 s3q0Var2 = s3q0.a;
        if (downloadHelper.i() > 0) {
            ArrayList a3 = ym00.a(downloadHelper.h(), 3);
            ArrayList arrayList = new ArrayList(c5g.u(a3, 10));
            Iterator it = a3.iterator();
            while (it.hasNext()) {
                arrayList.add(((androidx.media3.common.a) it.next()).d);
            }
        }
        int i2 = downloadHelper.i();
        for (int i3 = 0; i3 < i2; i3++) {
            downloadHelper.e();
            for (int i4 = 0; i4 < downloadHelper.e.size(); i4++) {
                downloadHelper.o[i3][i4].clear();
            }
            npl.d dVar2 = new npl.d(aVar2);
            try {
                downloadHelper.e();
                downloadHelper.c(i3, dVar2);
            } catch (ExoPlaybackException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public static final DownloadRequest f(hao haoVar, DownloadHelper downloadHelper) {
        long j;
        xan xanVar = haoVar.l;
        bx8.a aVar = xanVar.b;
        String str = xanVar.a.d;
        long S = y2r0.S(0L);
        long j2 = aVar.a;
        DownloadRequest.b f = downloadHelper.f(str, null);
        downloadHelper.d();
        int i = downloadHelper.c;
        if (i == 1) {
            fxc0.z(i == 1);
            fxc0.z(downloadHelper.i);
            ewo0 ewo0Var = downloadHelper.l.i;
            ewo0.c cVar = new ewo0.c();
            ewo0.b bVar = new ewo0.b();
            long longValue = ((Long) ewo0Var.i(cVar, bVar, 0, S).second).longValue();
            if (j2 != C.TIME_UNSET) {
                j = y2r0.S(j2) + longValue;
                long j3 = bVar.d;
                if (j3 != C.TIME_UNSET) {
                    j = Math.min(j, j3 - 1);
                }
            } else {
                j = -9223372036854775807L;
            }
            n3i0 n3i0Var = downloadHelper.l.j;
            if (n3i0Var.isSeekable()) {
                long j4 = n3i0Var.getSeekPoints(longValue).a.b;
                long j5 = -1;
                if (j != C.TIME_UNSET) {
                    long j6 = n3i0Var.getSeekPoints(j).b.b;
                    if (longValue == j || j4 != j6) {
                        j5 = j6 - j4;
                    }
                }
                f.h = new DownloadRequest.ByteRange(j4, j5);
            } else {
                ahn.F("Cannot set download byte range for progressive stream that is unseekable");
            }
        } else if (i == 2) {
            downloadHelper.e();
            long j7 = downloadHelper.l.i.m(0, new ewo0.c(), 0L).m;
            long S2 = j2 == C.TIME_UNSET ? j7 : y2r0.S(j2);
            if (j7 != C.TIME_UNSET) {
                S = Math.min(S, j7);
                S2 = Math.min(S2, j7 - S);
            }
            f.i = new DownloadRequest.TimeRange(S, S2);
        }
        return f.a();
    }

    public static ArrayList g(dip0 dip0Var, int i, izs izsVar) {
        ImmutableList<dip0.a> immutableList = dip0Var.a;
        ArrayList arrayList = new ArrayList();
        for (dip0.a aVar : immutableList) {
            if (aVar.b.c == i) {
                arrayList.add(aVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            dip0.a aVar2 = (dip0.a) it.next();
            pfp0 pfp0Var = aVar2.b;
            k9x q = swe0.q(0, pfp0Var.a);
            ArrayList arrayList3 = new ArrayList();
            j9x it2 = q.iterator();
            while (it2.d) {
                Object next = it2.next();
                if (aVar2.b(((Number) next).intValue())) {
                    arrayList3.add(next);
                }
            }
            ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(new y000());
            }
            g5g.y(arrayList4, arrayList2);
        }
        return arrayList2;
    }

    public static void j(hao haoVar, DownloadRequest downloadRequest, int i, int i2) {
        DownloadRequest downloadRequest2;
        int i3 = (i2 & 4) != 0 ? 0 : 1;
        CachedVideoInfo a2 = haoVar.k.a(haoVar.d());
        long currentTimeMillis = System.currentTimeMillis();
        long j = a2 != null ? a2.c : currentTimeMillis;
        long max = Math.max(haoVar.u.a, a2 != null ? a2.a : 0L);
        long j2 = a2 != null ? a2.b : -1L;
        if (haoVar.u.b > 0) {
            j2 = haoVar.u.b;
        } else if (j2 <= 0) {
            j2 = -1;
        }
        n9o n9oVar = new n9o();
        n9oVar.a = max;
        n9oVar.b = -1.0f;
        DownloadRequest a3 = (a2 == null || (downloadRequest2 = a2.d) == null) ? null : downloadRequest2.a(downloadRequest);
        o7o o7oVar = new o7o(a3 == null ? downloadRequest : a3, i, j, currentTimeMillis, j2, 0, i3, n9oVar);
        van vanVar = haoVar.k;
        androidx.media3.exoplayer.offline.a aVar = vanVar.e;
        if (aVar == null) {
            return;
        }
        synchronized (vanVar.g) {
            try {
                aVar.d(o7oVar);
                s3q0 s3q0Var = s3q0.a;
            } catch (Exception e) {
                Log.e("DiskCache", "Failed to update index.", e);
            }
        }
    }

    public static void k(CountDownLatch countDownLatch, AtomicReference atomicReference, AtomicReference atomicReference2, AtomicBoolean atomicBoolean) {
        try {
            if (!countDownLatch.await(20000L, TimeUnit.MILLISECONDS) && atomicReference.get() == null && atomicReference2.get() == null) {
                atomicBoolean.set(true);
                throw new TimeoutException("Download request timed out");
            }
            Exception exc = (Exception) atomicReference2.get();
            if (exc != null) {
                throw exc;
            }
        } catch (InterruptedException e) {
            throw new IOException("Interrupted while preparing download request", e);
        }
    }

    @Override // xsna.bsg0
    public final void b() {
        this.o.post(new ov(this, 4));
        androidx.media3.exoplayer.offline.d dVar = this.t;
        if (dVar != null) {
            dVar.cancel();
        }
        CachedVideoInfo a2 = this.k.a(d());
        if (this.u.a == 0 && a2 != null && a2.a == 0) {
            van vanVar = this.k;
            String d = d();
            androidx.media3.exoplayer.offline.a aVar = vanVar.e;
            if (aVar == null) {
                return;
            }
            synchronized (vanVar.g) {
                try {
                    aVar.a(d);
                    s3q0 s3q0Var = s3q0.a;
                } catch (Exception e) {
                    Log.e("DiskCache", "Failed to update index.", e);
                }
            }
        }
    }

    @Override // xsna.bsg0
    public final Object c() {
        DownloadRequest downloadRequest;
        yan yanVar;
        dbn dbnVar = this.l.a;
        if (dbnVar.a == VideoContentType.DASH) {
            van vanVar = this.k;
            String str = dbnVar.d;
            androidx.media3.exoplayer.offline.a aVar = vanVar.e;
            if (aVar != null) {
                try {
                    if (aVar.b(str) != null) {
                        try {
                            this.y.e(this.l.a.b);
                        } finally {
                            ssk sskVar = this.y;
                            sskVar.b();
                            sskVar.a();
                        }
                    }
                } catch (Exception e) {
                    Log.e("DiskCache", "Failed to read download index.", e);
                }
            }
        }
        Exception exc = null;
        int i = 5;
        Exception e2 = null;
        int i2 = 5;
        while (!this.h && i2 > 0) {
            try {
                downloadRequest = h();
                e2 = null;
                break;
            } catch (Exception e3) {
                e2 = e3;
                Log.e(IDownloadTask.TAG, e2.getMessage(), e2);
                i2--;
                Thread.sleep(Math.min((4 - i2) * 1000, 5000));
            }
        }
        downloadRequest = null;
        if (downloadRequest == null && !this.h) {
            yan yanVar2 = this.p;
            if (yanVar2 != null) {
                dbn dbnVar2 = this.l.a;
                if (e2 == null) {
                    e2 = new IOException("Failed to create download request");
                }
                yanVar2.d(dbnVar2, e2);
            }
        } else if (downloadRequest != null) {
            this.t = new eco(this.m, this.q, this.l.b).a(downloadRequest);
            Exception e4 = null;
            while (!this.h && i > 0) {
                try {
                    j(this, downloadRequest, 2, 12);
                    androidx.media3.exoplayer.offline.d dVar = this.t;
                    if (dVar == null) {
                        break;
                    }
                    dVar.a(this.v);
                    break;
                } catch (Exception e5) {
                    e4 = e5;
                    Log.e(IDownloadTask.TAG, e4.getMessage(), e4);
                    i--;
                    Thread.sleep(Math.min((4 - i) * 1000, 5000));
                }
            }
            exc = e4;
            boolean z = false;
            boolean z2 = exc == null && !this.h;
            if (!z2 && ((exc instanceof CancellationException) || (exc instanceof InterruptedException) || (exc instanceof ClosedByInterruptException) || this.h)) {
                z = true;
            }
            if (z2) {
                j(this, downloadRequest, 3, 12);
                yan yanVar3 = this.p;
                if (yanVar3 != null) {
                    yanVar3.a(this.l.a);
                }
            } else if (z) {
                j(this, downloadRequest, 1, 12);
            } else {
                j(this, downloadRequest, 4, 8);
                if (!this.h && exc != null && (yanVar = this.p) != null) {
                    yanVar.d(this.l.a, exc);
                }
            }
        }
        return s3q0.a;
    }

    @Override // xsna.cbn
    public final String d() {
        return this.l.a.d;
    }

    public final DownloadRequest h() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        gao gaoVar = new gao(this, countDownLatch, atomicReference, atomicReference2, atomicBoolean, 0);
        Handler handler = this.o;
        handler.post(gaoVar);
        try {
            k(countDownLatch, atomicReference, atomicReference2, atomicBoolean);
            DownloadRequest downloadRequest = (DownloadRequest) atomicReference.get();
            if (downloadRequest != null) {
                return downloadRequest;
            }
            throw new IOException("Failed to create download request");
        } finally {
            handler.post(new ov(this, 4));
        }
    }

    public final DownloadHelper i() {
        DownloadHelper.c cVar = new DownloadHelper.c();
        cVar.a = this.m;
        ArrayList arrayList = new ArrayList();
        r rVar = new r(20);
        fn80 fn80Var = new fn80(this.j, arrayList, false);
        fn80Var.c = true;
        fn80Var.d = new v6j(rVar);
        cVar.b = fn80Var;
        cVar.c = (npl.d) this.x.getValue();
        return cVar.a(this.r);
    }
}
