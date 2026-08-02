package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.SexyCell$Align;
import com.vk.core.compose.component.cell.content.SexyCell$Size;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VkSexyCell.kt */
/* loaded from: classes17.dex */
public final class mjv0 {
    /* JADX WARN: Removed duplicated region for block: B:122:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(q630 q630Var, final com.vk.core.compose.component.cell.content.a1 a1Var, g4j0 g4j0Var, g4j0 g4j0Var2, SexyCell$Size sexyCell$Size, SexyCell$Align sexyCell$Align, boolean z, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, final int i, final int i2) {
        q630 q630Var2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        final g4j0 g4j0Var3;
        final SexyCell$Size sexyCell$Size2;
        final boolean z2;
        final gzs<s3q0> gzsVar3;
        final gzs<s3q0> gzsVar4;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var3;
        final g4j0 g4j0Var4;
        final SexyCell$Align sexyCell$Align2;
        androidx.compose.runtime.f s;
        Throwable th;
        int i8;
        gzs<s3q0> gzsVar5;
        androidx.compose.runtime.a M = aVar.M(534561142);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            q630Var2 = q630Var;
        } else if ((i & 6) == 0) {
            q630Var2 = q630Var;
            i3 = (M.J(q630Var2) ? 4 : 2) | i;
        } else {
            q630Var2 = q630Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(a1Var) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? M.J(g4j0Var) : M.y(g4j0Var) ? 256 : 128;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? M.J(g4j0Var2) : M.y(g4j0Var2) ? 2048 : 1024;
        }
        int i12 = i2 & 16;
        if (i12 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= M.o(sexyCell$Size == null ? -1 : sexyCell$Size.ordinal()) ? 16384 : 8192;
        }
        int i13 = i2 & 32;
        int i14 = 196608;
        if (i13 == 0) {
            if ((196608 & i) == 0) {
                i14 = M.o(sexyCell$Align == null ? -1 : sexyCell$Align.ordinal()) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= M.l(z) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            }
            i5 = i2 & 128;
            if (i5 == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i3 |= M.y(gzsVar) ? 8388608 : 4194304;
            }
            i6 = i2 & 256;
            if (i6 == 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i7 = i6;
                i3 |= M.y(gzsVar2) ? 67108864 : 33554432;
                if (M.t(i3 & 1, (i3 & 38347923) != 38347922)) {
                    q630.a aVar3 = q630.a.a;
                    if (i9 != 0) {
                        q630Var2 = aVar3;
                    }
                    g4j0 g4j0Var5 = i10 != 0 ? null : g4j0Var;
                    g4j0 g4j0Var6 = i11 != 0 ? null : g4j0Var2;
                    SexyCell$Size sexyCell$Size3 = i12 != 0 ? SexyCell$Size.Medium : sexyCell$Size;
                    SexyCell$Align sexyCell$Align3 = i13 != 0 ? SexyCell$Align.Middle : sexyCell$Align;
                    boolean z3 = i4 != 0 ? true : z;
                    gzs<s3q0> gzsVar6 = i5 != 0 ? null : gzsVar;
                    gzs<s3q0> gzsVar7 = i7 != 0 ? null : gzsVar2;
                    if (androidx.compose.runtime.b.d()) {
                        th = null;
                        androidx.compose.runtime.b.f(534561142, i3, -1, "com.vk.core.compose.component.cell.VkSexyCell (VkSexyCell.kt:39)");
                    } else {
                        th = null;
                    }
                    Object x = M.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x == c0012a) {
                        x = ir.h(M);
                    }
                    sg50 sg50Var = (sg50) x;
                    Object x2 = M.x();
                    if (x2 == c0012a) {
                        i8 = i3;
                        x2 = qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7, 0L, false);
                        M.R(x2);
                    } else {
                        i8 = i3;
                    }
                    guw guwVar = (guw) x2;
                    M.K(-1682790240);
                    q630 a = o19.a(txj0.f(q630Var2, 1.0f), z3 ? 1.0f : 0.64f);
                    if ((gzsVar6 == null && gzsVar7 == null) ? false : true) {
                        q630 a2 = cuw.a(aVar3, sg50Var, guwVar);
                        if (gzsVar6 == null) {
                            M.K(680913522);
                            Object x3 = M.x();
                            if (x3 == c0012a) {
                                x3 = new xbj0(9);
                                M.R(x3);
                            }
                            M.j();
                            gzsVar5 = (gzs) x3;
                        } else {
                            M.K(-255130053);
                            M.j();
                            gzsVar5 = gzsVar6;
                        }
                        a = a.g(ojc.d(a2, sg50Var, guwVar, z3, null, gzsVar7, gzsVar5, 440));
                    }
                    M.j();
                    sp.l();
                    wn20 wn20Var = wn20.a;
                    int i15 = (i8 >> 12) & 14;
                    M.K(1728504833);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1728504833, i15, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeRichCellDefaults.cellMinHeight (MilkshakeRichCellDefaults.kt:55)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    q630 b = txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, wn20.b, 1, a);
                    sp.l();
                    M.K(-230104048);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-230104048, i15, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeRichCellDefaults.contentPaddings (MilkshakeRichCellDefaults.kt:23)");
                    }
                    float f = kqu0.b;
                    float f2 = kqu0.s;
                    u890 u890Var = new u890(f, f2, f, f2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    q630 C = s200.C(b, u890Var);
                    a.l lVar = androidx.compose.foundation.layout.a.a;
                    sp.l();
                    M.K(1032925727);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1032925727, i15, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeRichCellDefaults.contentGap (MilkshakeRichCellDefaults.kt:29)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    float f3 = kqu0.v;
                    dt1.a.getClass();
                    a.j h = androidx.compose.foundation.layout.a.h(f3, dt1.a.n);
                    sp.l();
                    int i16 = ((i8 >> 15) & 14) | 48;
                    androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(h, wn20Var.a(false, M, i16), M, 0);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c = qri.c(M, C);
                    cri.h7.getClass();
                    LayoutNode.a aVar4 = cri.a.b;
                    if (M.N() == null) {
                        n34.r();
                        throw th;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar4);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, a3, cri.a.f);
                    k9q0.w(M, D, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c, cri.a.d);
                    sp.l();
                    dt1.c a4 = wn20Var.a(true, M, i16);
                    tpg0 tpg0Var = tpg0.a;
                    if (g4j0Var5 == null) {
                        M.K(-461637429);
                    } else {
                        M.K(-461637428);
                        g4j0Var5.a(tpg0Var, tpg0Var.a(aVar3, a4), M, 6);
                        s3q0 s3q0Var = s3q0.a;
                    }
                    M.j();
                    if (a1Var != null) {
                        ((zak0) a1Var.a).setValue(sexyCell$Size3);
                        s3q0 s3q0Var2 = s3q0.a;
                    }
                    if (a1Var == null) {
                        M.K(-461522698);
                    } else {
                        M.K(-461522697);
                        a1Var.a(tpg0Var, aVar3, M, 54);
                        s3q0 s3q0Var3 = s3q0.a;
                    }
                    M.j();
                    if (g4j0Var6 == null) {
                        M.K(-461482026);
                    } else {
                        M.K(-461482025);
                        g4j0Var6.a(tpg0Var, aVar3, M, 54);
                        s3q0 s3q0Var4 = s3q0.a;
                    }
                    M.j();
                    M.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar2 = M;
                    g4j0Var3 = g4j0Var5;
                    q630Var3 = q630Var2;
                    g4j0Var4 = g4j0Var6;
                    sexyCell$Size2 = sexyCell$Size3;
                    sexyCell$Align2 = sexyCell$Align3;
                    gzsVar3 = gzsVar6;
                    z2 = z3;
                    gzsVar4 = gzsVar7;
                } else {
                    M.h();
                    g4j0Var3 = g4j0Var;
                    sexyCell$Size2 = sexyCell$Size;
                    z2 = z;
                    gzsVar3 = gzsVar;
                    gzsVar4 = gzsVar2;
                    aVar2 = M;
                    q630Var3 = q630Var2;
                    g4j0Var4 = g4j0Var2;
                    sexyCell$Align2 = sexyCell$Align;
                }
                s = aVar2.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.ljv0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            mjv0.a(q630.this, a1Var, g4j0Var3, g4j0Var4, sexyCell$Size2, sexyCell$Align2, z2, gzsVar3, gzsVar4, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            i7 = i6;
            if (M.t(i3 & 1, (i3 & 38347923) != 38347922)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        i3 |= i14;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        i5 = i2 & 128;
        if (i5 == 0) {
        }
        i6 = i2 & 256;
        if (i6 == 0) {
        }
        i7 = i6;
        if (M.t(i3 & 1, (i3 & 38347923) != 38347922)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }
}
