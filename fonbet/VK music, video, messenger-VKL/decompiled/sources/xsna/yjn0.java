package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: Surface.kt */
/* loaded from: classes11.dex */
public final class yjn0 {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final q630 q630Var, r5j0 r5j0Var, final long j, final long j2, float f, final jai jaiVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        r5j0 r5j0Var2;
        int i4;
        float f2;
        final r5j0 r5j0Var3;
        final float f3;
        androidx.compose.runtime.f s;
        final r5j0 r5j0Var4;
        final float f4;
        androidx.compose.runtime.a M = aVar.M(174096871);
        if ((i & 6) == 0) {
            i3 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            r5j0Var2 = r5j0Var;
            i3 |= M.J(r5j0Var2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= M.p(j) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i3 |= M.p(j2) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= M.J(null) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((196608 & i) == 0) {
                f2 = f;
                i3 |= M.n(f2) ? 131072 : 65536;
                if ((1572864 & i) == 0) {
                    i3 |= M.y(jaiVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                }
                if (M.t(i3 & 1, (599187 & i3) != 599186)) {
                    M.V();
                    if ((i & 1) == 0 || M.i()) {
                        r5j0 r5j0Var5 = i5 != 0 ? androidx.compose.ui.graphics.e.a : r5j0Var2;
                        if (i4 != 0) {
                            f4 = 0;
                            r5j0Var4 = r5j0Var5;
                            M.S();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(174096871, i3, -1, "androidx.compose.material.Surface (Surface.kt:101)");
                            }
                            pqo pqoVar = hbp.b;
                            final float f5 = ((pco) M.r(pqoVar)).b + f4;
                            rvi.b(new c9e0[]{vcl0.b(j2, yfj.a), pqoVar.b(new pco(f5))}, kai.c(-2004281689, new wzs() { // from class: xsna.qjn0
                                @Override // xsna.wzs
                                public final Object invoke(Object obj, Object obj2) {
                                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(-2004281689, intValue, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:107)");
                                        }
                                        q630 c = yjn0.c(f4, yjn0.d(j, (gbp) aVar2.r(hbp.a), f5, aVar2), q630.this, r5j0Var4);
                                        Object x = aVar2.x();
                                        a.C0011a.C0012a c0012a = a.C0011a.a;
                                        if (x == c0012a) {
                                            x = new kul0(1);
                                            aVar2.R(x);
                                        }
                                        q630 b = egi0.b(c, false, (izs) x);
                                        s3q0 s3q0Var = s3q0.a;
                                        Object x2 = aVar2.x();
                                        if (x2 == c0012a) {
                                            x2 = sjn0.a;
                                            aVar2.R(x2);
                                        }
                                        q630 b2 = skn0.b(b, s3q0Var, (PointerInputEventHandler) x2);
                                        dt1.a.getClass();
                                        cp10 d = ja8.d(dt1.a.b, true);
                                        int m = n34.m(aVar2);
                                        sy90 D = aVar2.D();
                                        q630 c2 = qri.c(aVar2, b2);
                                        cri.h7.getClass();
                                        LayoutNode.a aVar3 = cri.a.b;
                                        if (aVar2.N() == null) {
                                            n34.r();
                                            throw null;
                                        }
                                        aVar2.H();
                                        if (aVar2.L()) {
                                            aVar2.I(aVar3);
                                        } else {
                                            aVar2.f();
                                        }
                                        k9q0.w(aVar2, d, cri.a.f);
                                        k9q0.w(aVar2, D, cri.a.e);
                                        cri.a.b bVar = cri.a.g;
                                        if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m))) {
                                            kr.a(m, aVar2, m, bVar);
                                        }
                                        k9q0.w(aVar2, c2, cri.a.d);
                                        if (er.f(0, aVar2, jaiVar)) {
                                            androidx.compose.runtime.b.e();
                                        }
                                    } else {
                                        aVar2.h();
                                    }
                                    return s3q0.a;
                                }
                            }, M), M, 56);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            r5j0Var3 = r5j0Var4;
                            f3 = f4;
                        } else {
                            r5j0Var4 = r5j0Var5;
                        }
                    } else {
                        M.h();
                        r5j0Var4 = r5j0Var2;
                    }
                    f4 = f2;
                    M.S();
                    if (androidx.compose.runtime.b.d()) {
                    }
                    pqo pqoVar2 = hbp.b;
                    final float f52 = ((pco) M.r(pqoVar2)).b + f4;
                    rvi.b(new c9e0[]{vcl0.b(j2, yfj.a), pqoVar2.b(new pco(f52))}, kai.c(-2004281689, new wzs() { // from class: xsna.qjn0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                            int intValue = ((Integer) obj2).intValue();
                            if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-2004281689, intValue, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:107)");
                                }
                                q630 c = yjn0.c(f4, yjn0.d(j, (gbp) aVar2.r(hbp.a), f52, aVar2), q630.this, r5j0Var4);
                                Object x = aVar2.x();
                                a.C0011a.C0012a c0012a = a.C0011a.a;
                                if (x == c0012a) {
                                    x = new kul0(1);
                                    aVar2.R(x);
                                }
                                q630 b = egi0.b(c, false, (izs) x);
                                s3q0 s3q0Var = s3q0.a;
                                Object x2 = aVar2.x();
                                if (x2 == c0012a) {
                                    x2 = sjn0.a;
                                    aVar2.R(x2);
                                }
                                q630 b2 = skn0.b(b, s3q0Var, (PointerInputEventHandler) x2);
                                dt1.a.getClass();
                                cp10 d = ja8.d(dt1.a.b, true);
                                int m = n34.m(aVar2);
                                sy90 D = aVar2.D();
                                q630 c2 = qri.c(aVar2, b2);
                                cri.h7.getClass();
                                LayoutNode.a aVar3 = cri.a.b;
                                if (aVar2.N() == null) {
                                    n34.r();
                                    throw null;
                                }
                                aVar2.H();
                                if (aVar2.L()) {
                                    aVar2.I(aVar3);
                                } else {
                                    aVar2.f();
                                }
                                k9q0.w(aVar2, d, cri.a.f);
                                k9q0.w(aVar2, D, cri.a.e);
                                cri.a.b bVar = cri.a.g;
                                if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m))) {
                                    kr.a(m, aVar2, m, bVar);
                                }
                                k9q0.w(aVar2, c2, cri.a.d);
                                if (er.f(0, aVar2, jaiVar)) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar2.h();
                            }
                            return s3q0.a;
                        }
                    }, M), M, 56);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    r5j0Var3 = r5j0Var4;
                    f3 = f4;
                } else {
                    M.h();
                    r5j0Var3 = r5j0Var2;
                    f3 = f2;
                }
                s = M.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.rjn0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            yjn0.a(q630.this, r5j0Var3, j, j2, f3, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            f2 = f;
            if ((1572864 & i) == 0) {
            }
            if (M.t(i3 & 1, (599187 & i3) != 599186)) {
            }
            s = M.s();
            if (s != null) {
            }
        }
        r5j0Var2 = r5j0Var;
        if ((i & 384) == 0) {
        }
        if ((i & 3072) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        f2 = f;
        if ((1572864 & i) == 0) {
        }
        if (M.t(i3 & 1, (599187 & i3) != 599186)) {
        }
        s = M.s();
        if (s != null) {
        }
    }

    public static final void b(final gzs gzsVar, final q630 q630Var, final r5j0 r5j0Var, final long j, final long j2, final float f, final sg50 sg50Var, final jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        gzs gzsVar2;
        int i2;
        r5j0 r5j0Var2;
        final long j3;
        jai jaiVar2;
        androidx.compose.runtime.a M = aVar.M(2141308794);
        if ((i & 6) == 0) {
            gzsVar2 = gzsVar;
            i2 = (M.y(gzsVar2) ? 4 : 2) | i;
        } else {
            gzsVar2 = gzsVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(true) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            r5j0Var2 = r5j0Var;
            i2 |= M.J(r5j0Var2) ? 2048 : 1024;
        } else {
            r5j0Var2 = r5j0Var;
        }
        if ((i & 24576) == 0) {
            j3 = j;
            i2 |= M.p(j3) ? 16384 : 8192;
        } else {
            j3 = j;
        }
        if ((196608 & i) == 0) {
            i2 |= M.p(j2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.J(null) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= M.n(f) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= M.J(sg50Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            jaiVar2 = jaiVar;
            i2 |= M.y(jaiVar2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        } else {
            jaiVar2 = jaiVar;
        }
        if (M.t(i2 & 1, (306783379 & i2) != 306783378)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2141308794, i2, -1, "androidx.compose.material.Surface (Surface.kt:209)");
            }
            pqo pqoVar = hbp.b;
            final float f2 = ((pco) M.r(pqoVar)).b + f;
            final gzs gzsVar3 = gzsVar2;
            final r5j0 r5j0Var3 = r5j0Var2;
            final jai jaiVar3 = jaiVar2;
            rvi.b(new c9e0[]{vcl0.b(j2, yfj.a), pqoVar.b(new pco(f2))}, kai.c(-1766606150, new wzs() { // from class: xsna.ojn0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1766606150, intValue, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:215)");
                        }
                        iyk0 iyk0Var = abx.a;
                        q630 b = ojc.b(yjn0.c(f, yjn0.d(j3, (gbp) aVar2.r(hbp.a), f2, aVar2), q630.this.g(as20.a), r5j0Var3), sg50Var, jlg0.a(7), true, null, gzsVar3, 24);
                        dt1.a.getClass();
                        cp10 d = ja8.d(dt1.a.b, true);
                        int m = n34.m(aVar2);
                        sy90 D = aVar2.D();
                        q630 c = qri.c(aVar2, b);
                        cri.h7.getClass();
                        LayoutNode.a aVar3 = cri.a.b;
                        if (aVar2.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar2.H();
                        if (aVar2.L()) {
                            aVar2.I(aVar3);
                        } else {
                            aVar2.f();
                        }
                        k9q0.w(aVar2, d, cri.a.f);
                        k9q0.w(aVar2, D, cri.a.e);
                        cri.a.b bVar = cri.a.g;
                        if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m))) {
                            kr.a(m, aVar2, m, bVar);
                        }
                        k9q0.w(aVar2, c, cri.a.d);
                        if (er.f(0, aVar2, jaiVar3)) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.pjn0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    yjn0.b(gzs.this, q630Var, r5j0Var, j, j2, f, sg50Var, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final q630 c(float f, long j, q630 q630Var, r5j0 r5j0Var) {
        return rte0.d(hr80.m(a5j0.b(q630Var, f, r5j0Var, false, 0L, 0L, 24).g(q630.a.a), j, r5j0Var), r5j0Var);
    }

    public static final long d(long j, gbp gbpVar, float f, androidx.compose.runtime.a aVar) {
        long j2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1561611256, 0, -1, "androidx.compose.material.surfaceColorAtElevation (Surface.kt:485)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1462282791, 6, -1, "androidx.compose.material.MaterialTheme.<get-colors> (MaterialTheme.kt:97)");
        }
        k9g k9gVar = (k9g) aVar.r(l9g.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (!l5g.d(j, k9gVar.c()) || gbpVar == null) {
            aVar.K(-1124546347);
            aVar.j();
            j2 = j;
        } else {
            aVar.K(-1124614454);
            j2 = gbpVar.a(j, f, aVar, 0);
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return j2;
    }
}
