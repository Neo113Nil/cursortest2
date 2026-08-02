package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.exoplayer.upstream.a;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes10.dex */
public final class mch implements oyy {
    public static final x8e H = new x8e(20);
    public Handler A;
    public vnu B;
    public ynu C;
    public Uri D;
    public unu E;
    public boolean F;
    public final gyc a;
    public final bou b;
    public final twy c;
    public xf10 y;
    public a z;
    public final CopyOnWriteArrayList x = new CopyOnWriteArrayList();
    public final HashMap w = new HashMap();
    public long G = -9223372036854775807L;

    public mch(gyc gycVar, twy twyVar, bou bouVar) {
        this.a = gycVar;
        this.b = bouVar;
        this.c = twyVar;
    }

    public final unu a(Uri uri, boolean z) {
        HashMap hashMap = this.w;
        unu unuVar = ((androidx.media3.exoplayer.hls.playlist.a) hashMap.get(uri)).w;
        if (unuVar != null && z) {
            if (!uri.equals(this.D)) {
                List list = this.C.e;
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        break;
                    }
                    if (uri.equals(((xnu) list.get(i)).a)) {
                        unu unuVar2 = this.E;
                        if (unuVar2 == null || !unuVar2.o) {
                            this.D = uri;
                            androidx.media3.exoplayer.hls.playlist.a aVar = (androidx.media3.exoplayer.hls.playlist.a) hashMap.get(uri);
                            unu unuVar3 = aVar.w;
                            if (unuVar3 == null || !unuVar3.o) {
                                aVar.f(b(uri));
                            } else {
                                this.E = unuVar3;
                                this.B.i(unuVar3);
                            }
                        }
                    } else {
                        i++;
                    }
                }
            }
            androidx.media3.exoplayer.hls.playlist.a aVar2 = (androidx.media3.exoplayer.hls.playlist.a) hashMap.get(uri);
            unu unuVar4 = aVar2.w;
            if (!aVar2.D) {
                aVar2.D = true;
                if (unuVar4 != null && !unuVar4.o) {
                    aVar2.c(true);
                }
            }
        }
        return unuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Uri b(Uri uri) {
        qnu qnuVar;
        unu unuVar = this.E;
        if (unuVar == null || !unuVar.v.e || (qnuVar = (qnu) unuVar.t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(qnuVar.b));
        int i = qnuVar.c;
        if (i != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return buildUpon.build();
    }

    public final boolean c(Uri uri) {
        int i;
        androidx.media3.exoplayer.hls.playlist.a aVar = (androidx.media3.exoplayer.hls.playlist.a) this.w.get(uri);
        if (aVar.w == null) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max = Math.max(30000L, tw21.l0(aVar.w.u));
        unu unuVar = aVar.w;
        return unuVar.o || (i = unuVar.d) == 2 || i == 1 || aVar.x + max > elapsedRealtime;
    }

    @Override // defpackage.oyy
    public final void d(pyy pyyVar, long j, long j2, boolean z) {
        hg90 hg90Var = (hg90) pyyVar;
        long j3 = hg90Var.a;
        npg npgVar = hg90Var.b;
        x7u0 x7u0Var = hg90Var.w;
        uwy uwyVar = new uwy(npgVar, x7u0Var.c, x7u0Var.w, j2, x7u0Var.b);
        this.c.onLoadTaskConcluded(j3);
        this.y.c(uwyVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // defpackage.oyy
    public final void m(pyy pyyVar, long j, long j2) {
        ynu ynuVar;
        hg90 hg90Var = (hg90) pyyVar;
        znu znuVar = (znu) hg90Var.y;
        boolean z = znuVar instanceof unu;
        if (z) {
            String str = znuVar.a;
            ynu ynuVar2 = ynu.l;
            Uri parse = Uri.parse(str);
            f7s f7sVar = new f7s();
            f7sVar.a = "0";
            f7sVar.l = eh20.q("application/x-mpegURL");
            List singletonList = Collections.singletonList(new xnu(parse, new androidx.media3.common.a(f7sVar), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            ynuVar = new ynu("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            ynuVar = (ynu) znuVar;
        }
        this.C = ynuVar;
        this.D = ((xnu) ynuVar.e.get(0)).a;
        this.x.add(new lch(this));
        List list2 = ynuVar.d;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            Uri uri = (Uri) list2.get(i);
            this.w.put(uri, new androidx.media3.exoplayer.hls.playlist.a(this, uri));
        }
        npg npgVar = hg90Var.b;
        x7u0 x7u0Var = hg90Var.w;
        uwy uwyVar = new uwy(npgVar, x7u0Var.c, x7u0Var.w, j2, x7u0Var.b);
        androidx.media3.exoplayer.hls.playlist.a aVar = (androidx.media3.exoplayer.hls.playlist.a) this.w.get(this.D);
        if (z) {
            aVar.g((unu) znuVar, uwyVar);
        } else {
            aVar.c(false);
        }
        this.c.onLoadTaskConcluded(hg90Var.a);
        this.y.d(uwyVar, 4);
    }

    @Override // defpackage.oyy
    public final void o(pyy pyyVar, long j, long j2, int i) {
        uwy uwyVar;
        hg90 hg90Var = (hg90) pyyVar;
        if (i == 0) {
            long j3 = hg90Var.a;
            uwyVar = new uwy(hg90Var.b);
        } else {
            long j4 = hg90Var.a;
            npg npgVar = hg90Var.b;
            x7u0 x7u0Var = hg90Var.w;
            uwyVar = new uwy(npgVar, x7u0Var.c, x7u0Var.w, j2, x7u0Var.b);
        }
        this.y.h(uwyVar, hg90Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // defpackage.oyy
    public final h0n p(pyy pyyVar, long j, long j2, IOException iOException, int i) {
        hg90 hg90Var = (hg90) pyyVar;
        long j3 = hg90Var.a;
        npg npgVar = hg90Var.b;
        x7u0 x7u0Var = hg90Var.w;
        uwy uwyVar = new uwy(npgVar, x7u0Var.c, x7u0Var.w, j2, x7u0Var.b);
        int i2 = hg90Var.c;
        swy swyVar = new swy(iOException, i);
        twy twyVar = this.c;
        long retryDelayMsFor = twyVar.getRetryDelayMsFor(swyVar);
        boolean z = retryDelayMsFor == -9223372036854775807L;
        this.y.g(uwyVar, i2, iOException, z);
        if (z) {
            twyVar.onLoadTaskConcluded(hg90Var.a);
        }
        return z ? a.f : new h0n(false, 0, retryDelayMsFor);
    }
}
