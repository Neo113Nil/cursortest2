package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.media3.exoplayer.dash.DashManifestStaleException;
import androidx.media3.exoplayer.upstream.a;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public final class ogg extends c45 {
    public final boolean A;
    public final ipg B;
    public final cgg C;
    public final z8h D;
    public final qmm E;
    public final twy F;
    public final jc5 G;
    public final long H;
    public final long I;
    public final xf10 J;
    public final gg90 K;
    public final sae L;
    public final Object M;
    public final SparseArray N;
    public final jgg O;
    public final jgg P;
    public final gyc Q;
    public final tyy R;
    public kpg S;
    public a T;
    public cj01 U;
    public DashManifestStaleException V;
    public Handler W;
    public yd10 Z;
    public Uri a0;
    public final Uri b0;
    public egg c0;
    public boolean d0;
    public long e0;
    public long f0;
    public long g0;
    public int h0;
    public long i0;
    public int j0;
    public fe10 k0;

    static {
        ge10.a("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [jgg] */
    /* JADX WARN: Type inference failed for: r2v11, types: [jgg] */
    public ogg(fe10 fe10Var, ipg ipgVar, gg90 gg90Var, cgg cggVar, z8h z8hVar, qmm qmmVar, twy twyVar, long j, long j2) {
        this.k0 = fe10Var;
        this.Z = fe10Var.c;
        zd10 zd10Var = fe10Var.b;
        zd10Var.getClass();
        Uri uri = zd10Var.a;
        this.a0 = uri;
        this.b0 = uri;
        this.c0 = null;
        this.B = ipgVar;
        this.K = gg90Var;
        this.C = cggVar;
        this.E = qmmVar;
        this.F = twyVar;
        this.H = j;
        this.I = j2;
        this.D = z8hVar;
        this.G = new jc5();
        final int i = 0;
        this.A = false;
        this.J = a(null);
        this.M = new Object();
        this.N = new SparseArray();
        this.Q = new gyc(this);
        this.i0 = -9223372036854775807L;
        this.g0 = -9223372036854775807L;
        this.L = new sae(22, this);
        this.R = new kgg(this);
        this.O = new Runnable(this) { // from class: jgg
            public final /* synthetic */ ogg b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                ogg oggVar = this.b;
                switch (i2) {
                    case 0:
                        oggVar.n();
                        break;
                    default:
                        oggVar.l(false);
                        break;
                }
            }
        };
        final int i2 = 1;
        this.P = new Runnable(this) { // from class: jgg
            public final /* synthetic */ ogg b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                ogg oggVar = this.b;
                switch (i22) {
                    case 0:
                        oggVar.n();
                        break;
                    default:
                        oggVar.l(false);
                        break;
                }
            }
        };
    }

    public static boolean h(pxa0 pxa0Var) {
        List list = pxa0Var.c;
        for (int i = 0; i < list.size(); i++) {
            int i2 = ((a70) list.get(i)).b;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.uf10
    public final boolean canUpdateMediaItem(fe10 fe10Var) {
        fe10 mediaItem = getMediaItem();
        zd10 zd10Var = mediaItem.b;
        zd10Var.getClass();
        zd10 zd10Var2 = fe10Var.b;
        return zd10Var2 != null && zd10Var2.a.equals(zd10Var.a) && zd10Var2.c.equals(zd10Var.c) && Objects.equals(null, null) && mediaItem.c.equals(fe10Var.c);
    }

    @Override // defpackage.uf10
    public final xe10 createPeriod(sf10 sf10Var, au1 au1Var, long j) {
        int intValue = ((Integer) sf10Var.a).intValue() - this.j0;
        xf10 a = a(sf10Var);
        mmm mmmVar = new mmm(this.w.c, 0, sf10Var);
        int i = this.j0 + intValue;
        egg eggVar = this.c0;
        cj01 cj01Var = this.U;
        long j2 = this.g0;
        vyc0 vyc0Var = this.z;
        d6z.z(vyc0Var);
        igg iggVar = new igg(i, eggVar, this.G, intValue, this.C, cj01Var, this.E, mmmVar, this.F, a, j2, this.R, au1Var, this.D, this.Q, vyc0Var);
        this.N.put(i, iggVar);
        return iggVar;
    }

    @Override // defpackage.c45
    public final void e(cj01 cj01Var) {
        this.U = cj01Var;
        Looper myLooper = Looper.myLooper();
        vyc0 vyc0Var = this.z;
        d6z.z(vyc0Var);
        qmm qmmVar = this.E;
        qmmVar.setPlayer(myLooper, vyc0Var);
        qmmVar.prepare();
        if (this.A) {
            l(false);
            return;
        }
        this.S = this.B.createDataSource();
        this.T = new a("DashMediaSource");
        this.W = tw21.n(null);
        n();
    }

    @Override // defpackage.c45
    public final void g() {
        this.d0 = false;
        this.S = null;
        a aVar = this.T;
        if (aVar != null) {
            aVar.f(null);
            this.T = null;
        }
        this.e0 = 0L;
        this.f0 = 0L;
        this.a0 = this.b0;
        this.V = null;
        Handler handler = this.W;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.W = null;
        }
        this.g0 = -9223372036854775807L;
        this.h0 = 0;
        this.i0 = -9223372036854775807L;
        this.N.clear();
        jc5 jc5Var = this.G;
        jc5Var.a.clear();
        jc5Var.b.clear();
        jc5Var.c.clear();
        this.E.release();
    }

    @Override // defpackage.uf10
    public final synchronized fe10 getMediaItem() {
        return this.k0;
    }

    public final void i() {
        boolean z;
        a aVar = this.T;
        kgg kggVar = new kgg(this);
        synchronized (u0a1.b) {
            z = u0a1.c;
        }
        if (z) {
            kggVar.a();
            return;
        }
        if (aVar == null) {
            aVar = new a("SntpClient");
        }
        aVar.g(new jzz(), new ngg(2, kggVar), 1);
    }

    public final void j(hg90 hg90Var, long j) {
        long j2 = hg90Var.a;
        npg npgVar = hg90Var.b;
        x7u0 x7u0Var = hg90Var.w;
        uwy uwyVar = new uwy(npgVar, x7u0Var.c, x7u0Var.w, j, x7u0Var.b);
        this.F.onLoadTaskConcluded(j2);
        this.J.c(uwyVar, hg90Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void k(IOException iOException) {
        lk91.f("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.g0 = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        l(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x016d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(boolean z) {
        long j;
        long j2;
        long j3;
        boolean z2;
        egg eggVar;
        long j4;
        boolean z3;
        long j5;
        long j6;
        int i;
        long j7;
        float f;
        long j8;
        float f2;
        long W;
        long min;
        boolean z4;
        pgg b;
        long j9;
        long j10;
        boolean z5;
        int i2;
        long j11;
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.N;
            if (i3 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i3);
            if (keyAt >= this.j0) {
                igg iggVar = (igg) sparseArray.valueAt(i3);
                egg eggVar2 = this.c0;
                int i4 = keyAt - this.j0;
                iggVar.O = eggVar2;
                iggVar.P = i4;
                iggVar.F.updateManifest(eggVar2);
                tsb[] tsbVarArr = iggVar.L;
                if (tsbVarArr != null) {
                    for (tsb tsbVar : tsbVarArr) {
                        ((dgg) tsbVar.x).a(eggVar2, i4);
                    }
                    iggVar.K.onContinueLoadingRequested(iggVar);
                }
                iggVar.Q = eggVar2.getPeriod(i4).d;
                for (tgo tgoVar : iggVar.M) {
                    Iterator it = iggVar.Q.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            bho bhoVar = (bho) it.next();
                            if (bhoVar.a().equals(tgoVar.x.a())) {
                                tgoVar.a(bhoVar, eggVar2.dynamic && i4 == eggVar2.getPeriodCount() - 1);
                            }
                        }
                    }
                }
            }
            i3++;
        }
        pxa0 period = this.c0.getPeriod(0);
        int periodCount = this.c0.getPeriodCount() - 1;
        pxa0 period2 = this.c0.getPeriod(periodCount);
        long periodDurationUs = this.c0.getPeriodDurationUs(periodCount);
        long W2 = tw21.W(tw21.E(this.g0));
        long periodDurationUs2 = this.c0.getPeriodDurationUs(0);
        long j12 = period.b;
        List list = period.c;
        long W3 = tw21.W(j12);
        boolean h = h(period);
        int i5 = 0;
        long j13 = W3;
        while (true) {
            j = periodDurationUs;
            if (i5 >= list.size()) {
                j2 = 0;
                W3 = j13;
                break;
            }
            a70 a70Var = (a70) list.get(i5);
            List list2 = a70Var.c;
            int i6 = a70Var.b;
            j2 = 0;
            boolean z6 = (i6 == 1 || i6 == 2) ? false : true;
            if ((h && z6) || list2.isEmpty()) {
                j11 = periodDurationUs2;
            } else {
                pgg b2 = ((s4j0) list2.get(0)).b();
                if (b2 == null || b2.R(periodDurationUs2, W2) == 0) {
                    break;
                }
                j11 = periodDurationUs2;
                j13 = Math.max(j13, b2.f(b2.i(periodDurationUs2, W2)) + W3);
            }
            i5++;
            periodDurationUs = j;
            periodDurationUs2 = j11;
        }
        long j14 = period2.b;
        List list3 = period2.c;
        long W4 = tw21.W(j14);
        boolean h2 = h(period2);
        long j15 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        int i7 = 0;
        while (true) {
            if (i7 >= list3.size()) {
                j3 = j15;
                break;
            }
            a70 a70Var2 = (a70) list3.get(i7);
            List list4 = a70Var2.c;
            int i8 = a70Var2.b;
            if (i8 != 1 && i8 != 2) {
                z4 = true;
                if ((h2 || !z4) && !list4.isEmpty()) {
                    b = ((s4j0) list4.get(0)).b();
                    if (b != null) {
                        j3 = W4 + j;
                        break;
                    }
                    j9 = W4;
                    j10 = j;
                    long R = b.R(j10, W2);
                    if (R == j2) {
                        j3 = j9;
                        break;
                    }
                    z5 = h2;
                    i2 = i7;
                    long i9 = (b.i(j10, W2) + R) - 1;
                    j15 = Math.min(j15, b.h(i9, j10) + b.f(i9) + j9);
                } else {
                    i2 = i7;
                    j9 = W4;
                    j10 = j;
                    z5 = h2;
                }
                i7 = i2 + 1;
                j = j10;
                h2 = z5;
                W4 = j9;
            }
            z4 = false;
            if (h2) {
            }
            b = ((s4j0) list4.get(0)).b();
            if (b != null) {
            }
        }
        if (this.c0.dynamic) {
            for (int i10 = 0; i10 < list3.size(); i10++) {
                pgg b3 = ((s4j0) ((a70) list3.get(i10)).c.get(0)).b();
                if (b3 != null && !b3.P()) {
                }
            }
            z2 = true;
            if (z2) {
                long j16 = this.c0.timeShiftBufferDepthMs;
                if (j16 != -9223372036854775807L) {
                    W3 = Math.max(W3, j3 - tw21.W(j16));
                }
            }
            long j17 = j3 - W3;
            eggVar = this.c0;
            if (eggVar.dynamic) {
                j4 = -9223372036854775807L;
                z3 = z2;
                j5 = -9223372036854775807L;
                j6 = j2;
            } else {
                d6z.x(eggVar.availabilityStartTimeMs != -9223372036854775807L);
                long W5 = (W2 - tw21.W(this.c0.availabilityStartTimeMs)) - W3;
                yd10 yd10Var = getMediaItem().c;
                long l0 = tw21.l0(W5);
                long j18 = yd10Var.c;
                if (j18 != -9223372036854775807L) {
                    j7 = Math.min(l0, j18);
                } else {
                    kvq0 kvq0Var = this.c0.serviceDescription;
                    if (kvq0Var != null) {
                        long j19 = kvq0Var.c;
                        if (j19 != -9223372036854775807L) {
                            j7 = Math.min(l0, j19);
                        }
                    }
                    j7 = l0;
                }
                long l02 = tw21.l0(W5 - j17);
                if (l02 < j2 && j7 > j2) {
                    l02 = j2;
                }
                j4 = -9223372036854775807L;
                long j20 = this.c0.minBufferTimeMs;
                if (j20 != -9223372036854775807L) {
                    l02 = Math.min(l02 + j20, l0);
                }
                long j21 = l02;
                long j22 = yd10Var.b;
                if (j22 != -9223372036854775807L) {
                    j21 = tw21.j(j22, j21, l0);
                } else {
                    kvq0 kvq0Var2 = this.c0.serviceDescription;
                    if (kvq0Var2 != null) {
                        long j23 = kvq0Var2.b;
                        if (j23 != -9223372036854775807L) {
                            j21 = tw21.j(j23, j21, l0);
                        }
                    }
                }
                long j24 = j21;
                long j25 = j24 > j7 ? j24 : j7;
                long j26 = this.Z.a;
                if (j26 == -9223372036854775807L) {
                    egg eggVar3 = this.c0;
                    kvq0 kvq0Var3 = eggVar3.serviceDescription;
                    if (kvq0Var3 != null) {
                        long j27 = kvq0Var3.a;
                        if (j27 != -9223372036854775807L) {
                            j26 = j27;
                        }
                    }
                    j26 = eggVar3.suggestedPresentationDelayMs;
                    if (j26 == -9223372036854775807L) {
                        j26 = this.H;
                    }
                }
                if (j26 < j24) {
                    j26 = j24;
                }
                long j28 = this.I;
                if (j26 > j25) {
                    j26 = tw21.j(tw21.l0(W5 - Math.min(j28, j17 / 2)), j24, j25);
                }
                long j29 = j25;
                z3 = z2;
                float f3 = yd10Var.d;
                if (f3 == -3.4028235E38f) {
                    kvq0 kvq0Var4 = this.c0.serviceDescription;
                    f3 = kvq0Var4 != null ? kvq0Var4.d : -3.4028235E38f;
                }
                float f4 = yd10Var.e;
                if (f4 == -3.4028235E38f) {
                    kvq0 kvq0Var5 = this.c0.serviceDescription;
                    f4 = kvq0Var5 != null ? kvq0Var5.e : -3.4028235E38f;
                }
                if (f3 == -3.4028235E38f && f4 == -3.4028235E38f) {
                    f = f4;
                    kvq0 kvq0Var6 = this.c0.serviceDescription;
                    j8 = W5;
                    if (kvq0Var6 == null || kvq0Var6.a == -9223372036854775807L) {
                        f3 = 1.0f;
                        f2 = 1.0f;
                        xd10 xd10Var = new xd10();
                        xd10Var.a = j26;
                        xd10Var.b = j24;
                        xd10Var.c = j29;
                        xd10Var.d = f3;
                        xd10Var.e = f2;
                        this.Z = new yd10(xd10Var);
                        long l03 = tw21.l0(W3) + this.c0.availabilityStartTimeMs;
                        W = j8 - tw21.W(this.Z.a);
                        min = Math.min(j28, j17 / 2);
                        if (W >= min) {
                            j6 = min;
                            j5 = l03;
                        } else {
                            j5 = l03;
                            j6 = W;
                        }
                    }
                } else {
                    f = f4;
                    j8 = W5;
                }
                f2 = f;
                xd10 xd10Var2 = new xd10();
                xd10Var2.a = j26;
                xd10Var2.b = j24;
                xd10Var2.c = j29;
                xd10Var2.d = f3;
                xd10Var2.e = f2;
                this.Z = new yd10(xd10Var2);
                long l032 = tw21.l0(W3) + this.c0.availabilityStartTimeMs;
                W = j8 - tw21.W(this.Z.a);
                min = Math.min(j28, j17 / 2);
                if (W >= min) {
                }
            }
            long W6 = W3 - tw21.W(period.b);
            egg eggVar4 = this.c0;
            f(new lgg(eggVar4.availabilityStartTimeMs, j5, this.g0, this.j0, W6, j17, j6, eggVar4, getMediaItem(), !this.c0.dynamic ? this.Z : null));
            if (this.A) {
                Handler handler = this.W;
                jgg jggVar = this.P;
                handler.removeCallbacks(jggVar);
                if (z3) {
                    Handler handler2 = this.W;
                    egg eggVar5 = this.c0;
                    long E = tw21.E(this.g0);
                    int periodCount2 = eggVar5.getPeriodCount() - 1;
                    pxa0 period3 = eggVar5.getPeriod(periodCount2);
                    long j30 = period3.b;
                    List list5 = period3.c;
                    long W7 = tw21.W(j30);
                    long periodDurationUs3 = eggVar5.getPeriodDurationUs(periodCount2);
                    long W8 = tw21.W(E);
                    long W9 = tw21.W(eggVar5.availabilityStartTimeMs);
                    long W10 = tw21.W(eggVar5.minUpdatePeriodMs);
                    if (W10 == j4 || W10 >= 5000000) {
                        W10 = 5000000;
                    }
                    int i11 = 0;
                    while (i11 < list5.size()) {
                        List list6 = ((a70) list5.get(i11)).c;
                        if (list6.isEmpty()) {
                            i = i11;
                        } else {
                            i = i11;
                            pgg b4 = ((s4j0) list6.get(0)).b();
                            if (b4 != null) {
                                long j31 = (b4.j(periodDurationUs3, W8) + (W9 + W7)) - W8;
                                if (j31 > j2 && (j31 < W10 - 100000 || (j31 > W10 && j31 < W10 + 100000))) {
                                    W10 = j31;
                                }
                            }
                        }
                        i11 = i + 1;
                    }
                    handler2.postDelayed(jggVar, ygb1.c(W10, 1000L, RoundingMode.CEILING));
                }
                if (this.d0) {
                    n();
                    return;
                }
                if (z) {
                    egg eggVar6 = this.c0;
                    if (eggVar6.dynamic) {
                        long j32 = eggVar6.minUpdatePeriodMs;
                        if (j32 != j4) {
                            if (j32 == j2) {
                                j32 = 5000;
                            }
                            this.W.postDelayed(this.O, Math.max(j2, (this.e0 + j32) - SystemClock.elapsedRealtime()));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        z2 = false;
        if (z2) {
        }
        long j172 = j3 - W3;
        eggVar = this.c0;
        if (eggVar.dynamic) {
        }
        long W62 = W3 - tw21.W(period.b);
        egg eggVar42 = this.c0;
        f(new lgg(eggVar42.availabilityStartTimeMs, j5, this.g0, this.j0, W62, j172, j6, eggVar42, getMediaItem(), !this.c0.dynamic ? this.Z : null));
        if (this.A) {
        }
    }

    @Override // defpackage.uf10
    public final void maybeThrowSourceInfoRefreshError() {
        this.R.b();
    }

    public final void n() {
        Uri uri;
        this.W.removeCallbacks(this.O);
        if (this.T.c()) {
            return;
        }
        if (this.T.d()) {
            this.d0 = true;
            return;
        }
        synchronized (this.M) {
            uri = this.a0;
        }
        this.d0 = false;
        mpg mpgVar = new mpg();
        mpgVar.a = uri;
        mpgVar.i = 1;
        this.T.g(new hg90(this.S, mpgVar.a(), 4, this.K), this.L, this.F.getMinimumLoadableRetryCount(4));
    }

    @Override // defpackage.uf10
    public final void releasePeriod(xe10 xe10Var) {
        igg iggVar = (igg) xe10Var;
        iggVar.F.release();
        for (tsb tsbVar : iggVar.L) {
            tsbVar.z(iggVar);
        }
        iggVar.K = null;
        this.N.remove(iggVar.a);
    }

    @Override // defpackage.uf10
    public final synchronized void updateMediaItem(fe10 fe10Var) {
        this.k0 = fe10Var;
    }
}
