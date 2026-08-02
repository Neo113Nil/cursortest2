package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.us2;

/* compiled from: DonutChip.kt */
/* loaded from: classes18.dex */
public final class yyn {
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ee, code lost:
    
        if (r2 == null) goto L123;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final us2 us2Var, q630 q630Var, gzs<s3q0> gzsVar, lg90 lg90Var, long j, long j2, frv0 frv0Var, float f, androidx.compose.runtime.a aVar, final int i, final int i2) {
        q630 q630Var2;
        int i3;
        gzs<s3q0> gzsVar2;
        int i4;
        int i5;
        long j3;
        int i6;
        frv0 frv0Var2;
        int i7;
        int i8;
        int i9;
        float f2;
        androidx.compose.runtime.a aVar2;
        final lg90 lg90Var2;
        final long j4;
        final q630 q630Var3;
        final gzs<s3q0> gzsVar3;
        final frv0 frv0Var3;
        final float f3;
        final long j5;
        androidx.compose.runtime.f s;
        lg90 lg90Var3;
        long j6;
        boolean z;
        frv0 frv0Var4;
        long j7;
        boolean z2;
        q630.a aVar3;
        q630 q630Var4;
        androidx.compose.runtime.a M = aVar.M(1191780412);
        int i10 = (M.J(us2Var) ? 4 : 2) | i;
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 = i10 | 48;
            q630Var2 = q630Var;
        } else {
            q630Var2 = q630Var;
            i3 = i10 | (M.J(q630Var2) ? 32 : 16);
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i4 = i3 | 384;
            gzsVar2 = gzsVar;
        } else {
            gzsVar2 = gzsVar;
            i4 = i3 | (M.y(gzsVar2) ? 256 : 128);
        }
        if ((i2 & 8) == 0) {
            if ((i & 4096) == 0 ? M.J(lg90Var) : M.y(lg90Var)) {
                i5 = 2048;
                int i13 = i4 | i5 | 24576;
                if ((i2 & 32) != 0) {
                    j3 = j2;
                    if (M.p(j3)) {
                        i6 = 131072;
                        int i14 = i13 | i6;
                        if ((i2 & 64) == 0) {
                            frv0Var2 = frv0Var;
                            if (M.J(frv0Var2)) {
                                i7 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                                i8 = i14 | i7;
                                i9 = i2 & 128;
                                if (i9 == 0) {
                                    i8 |= 12582912;
                                    f2 = f;
                                } else {
                                    f2 = f;
                                    if ((i & 12582912) == 0) {
                                        i8 |= M.n(f2) ? 8388608 : 4194304;
                                    }
                                }
                                if (M.t(i8 & 1, (i8 & 4793491) == 4793490)) {
                                    aVar2 = M;
                                    aVar2.h();
                                    lg90Var2 = lg90Var;
                                    j4 = j;
                                    q630Var3 = q630Var2;
                                    gzsVar3 = gzsVar2;
                                    frv0Var3 = frv0Var2;
                                    f3 = f2;
                                    j5 = j3;
                                } else {
                                    M.V();
                                    int i15 = i & 1;
                                    q630.a aVar4 = q630.a.a;
                                    if (i15 == 0 || M.i()) {
                                        if (i11 != 0) {
                                            q630Var2 = aVar4;
                                        }
                                        if (i12 != 0) {
                                            gzsVar2 = null;
                                        }
                                        if ((i2 & 8) != 0) {
                                            M.K(-1455283704);
                                            qzu0.a.getClass();
                                            lg90Var3 = qzu0.I(M);
                                            M.j();
                                            i8 &= -7169;
                                        } else {
                                            lg90Var3 = lg90Var;
                                        }
                                        j6 = l5g.k;
                                        if ((i2 & 32) != 0) {
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                            }
                                            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                            j3 = ylu0Var.getText().p;
                                            i8 &= -458753;
                                        }
                                        if ((i2 & 64) != 0) {
                                            M.K(-1455276572);
                                            if (androidx.compose.runtime.b.d()) {
                                                z2 = false;
                                                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                                            } else {
                                                z2 = false;
                                            }
                                            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                            frv0Var4 = wuv0Var.s0;
                                            M.j();
                                            i8 &= -3670017;
                                            z = z2;
                                        } else {
                                            z = false;
                                            frv0Var4 = frv0Var2;
                                        }
                                        if (i9 != 0) {
                                            f2 = 1.0f;
                                        }
                                        j7 = j3;
                                    } else {
                                        M.h();
                                        if ((i2 & 8) != 0) {
                                            i8 &= -7169;
                                        }
                                        if ((i2 & 32) != 0) {
                                            i8 &= -458753;
                                        }
                                        if ((i2 & 64) != 0) {
                                            i8 &= -3670017;
                                        }
                                        lg90Var3 = lg90Var;
                                        j6 = j;
                                        frv0Var4 = frv0Var2;
                                        z = false;
                                        j7 = j3;
                                    }
                                    M.S();
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(1191780412, i8, -1, "com.vk.donut.design.compose.chip.DonutChip (DonutChip.kt:37)");
                                    }
                                    Object x = M.x();
                                    a.C0011a.C0012a c0012a = a.C0011a.a;
                                    if (x == c0012a) {
                                        x = ir.h(M);
                                    }
                                    sg50 sg50Var = (sg50) x;
                                    M.K(-1455270412);
                                    if (gzsVar2 != null) {
                                        boolean J = M.J(gzsVar2);
                                        Object x2 = M.x();
                                        if (J || x2 == c0012a) {
                                            x2 = new j66(1, gzsVar2);
                                            M.R(x2);
                                        }
                                        q630 b = ojc.b(aVar4, sg50Var, null, false, null, (gzs) x2, 28);
                                        aVar3 = aVar4;
                                        q630Var4 = q630Var2.g(b);
                                    } else {
                                        aVar3 = aVar4;
                                    }
                                    q630Var4 = q630Var2;
                                    M.j();
                                    q630 E = ahn.E(q630Var4, "donut_chip_chip");
                                    dt1.a.getClass();
                                    lg90 lg90Var4 = lg90Var3;
                                    androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
                                    int hashCode = Long.hashCode(n34.n(M));
                                    sy90 D = M.D();
                                    q630 c = qri.c(M, E);
                                    cri.h7.getClass();
                                    int i16 = i8;
                                    LayoutNode.a aVar5 = cri.a.b;
                                    if (M.N() == null) {
                                        n34.r();
                                        throw null;
                                    }
                                    M.H();
                                    if (M.L()) {
                                        M.I(aVar5);
                                    } else {
                                        M.f();
                                    }
                                    k9q0.w(M, a, cri.a.f);
                                    k9q0.w(M, D, cri.a.e);
                                    k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                                    k9q0.t(M, cri.a.h);
                                    k9q0.w(M, c, cri.a.d);
                                    int i17 = i16 >> 9;
                                    long j8 = j6;
                                    pzu0.b(lg90Var4, null, null, j8, M, (i17 & 14) | 3128, 4);
                                    q630 a2 = o19.a(aVar3, f2);
                                    boolean z3 = (i16 & 14) != 4 ? z : true;
                                    Object x3 = M.x();
                                    if (z3 || x3 == c0012a) {
                                        us2.b bVar = new us2.b();
                                        bVar.g(" ");
                                        bVar.h(us2Var);
                                        x3 = bVar.n();
                                        M.R(x3);
                                    }
                                    aVar2 = M;
                                    frv0 frv0Var5 = frv0Var4;
                                    yqv0.d((us2) x3, a2, j7, 0, null, 2, false, 1, null, null, frv0Var5, aVar2, (i17 & 896) | 100663296, (i17 & 7168) | 6, 6904);
                                    aVar2.G();
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    lg90Var2 = lg90Var4;
                                    q630Var3 = q630Var2;
                                    gzsVar3 = gzsVar2;
                                    frv0Var3 = frv0Var5;
                                    j4 = j8;
                                    f3 = f2;
                                    j5 = j7;
                                }
                                s = aVar2.s();
                                if (s == null) {
                                    s.d = new wzs() { // from class: xsna.xyn
                                        @Override // xsna.wzs
                                        public final Object invoke(Object obj, Object obj2) {
                                            ((Integer) obj2).getClass();
                                            yyn.a(us2.this, q630Var3, gzsVar3, lg90Var2, j4, j5, frv0Var3, f3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                                            return s3q0.a;
                                        }
                                    };
                                    return;
                                }
                                return;
                            }
                        } else {
                            frv0Var2 = frv0Var;
                        }
                        i7 = 524288;
                        i8 = i14 | i7;
                        i9 = i2 & 128;
                        if (i9 == 0) {
                        }
                        if (M.t(i8 & 1, (i8 & 4793491) == 4793490)) {
                        }
                        s = aVar2.s();
                        if (s == null) {
                        }
                    }
                } else {
                    j3 = j2;
                }
                i6 = 65536;
                int i142 = i13 | i6;
                if ((i2 & 64) == 0) {
                }
                i7 = 524288;
                i8 = i142 | i7;
                i9 = i2 & 128;
                if (i9 == 0) {
                }
                if (M.t(i8 & 1, (i8 & 4793491) == 4793490)) {
                }
                s = aVar2.s();
                if (s == null) {
                }
            }
        }
        i5 = 1024;
        int i132 = i4 | i5 | 24576;
        if ((i2 & 32) != 0) {
        }
        i6 = 65536;
        int i1422 = i132 | i6;
        if ((i2 & 64) == 0) {
        }
        i7 = 524288;
        i8 = i1422 | i7;
        i9 = i2 & 128;
        if (i9 == 0) {
        }
        if (M.t(i8 & 1, (i8 & 4793491) == 4793490)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }
}
