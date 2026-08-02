package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.qzy;

/* compiled from: VkCell.kt */
/* loaded from: classes17.dex */
public final class wiu0 {
    public static final void a(qco0 qco0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(738045064);
        int i3 = i & 6;
        tpg0 tpg0Var = tpg0.a;
        if (i3 == 0) {
            i2 = (M.J(tpg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(qco0Var) ? 32 : 16;
        }
        int i4 = i2 | 384;
        if (M.t(i4 & 1, (i4 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(738045064, i4, -1, "com.vk.core.compose.component.cell.MiddleContent (VkCell.kt:153)");
            }
            q630.a aVar2 = q630.a.a;
            q630 b = tpg0Var.b(1.0f, aVar2, true);
            a.c cVar = androidx.compose.foundation.layout.a.e;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(cVar, dt1.a.n, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            qco0Var.a((i4 >> 3) & 14, M);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zre(qco0Var, q630Var, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(q630 q630Var, boolean z, Cell$Left cell$Left, Cell$Middle cell$Middle, com.vk.core.compose.component.cell.content.o oVar, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        Cell$Left cell$Left2;
        int i5;
        com.vk.core.compose.component.cell.content.o oVar2;
        int i6;
        gzs<s3q0> gzsVar3;
        int i7;
        q630 q630Var2;
        gzs<s3q0> gzsVar4;
        com.vk.core.compose.component.cell.content.o oVar3;
        Cell$Left cell$Left3;
        androidx.compose.runtime.f s;
        gzs<s3q0> gzsVar5;
        androidx.compose.runtime.a M = aVar.M(-1348047843);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z2 = z;
            i3 |= M.l(z2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                Cell$Left cell$Left4 = cell$Left;
                i3 |= M.J(cell$Left4) ? 256 : 128;
                cell$Left2 = cell$Left4;
                if ((i & 3072) == 0) {
                    i3 |= M.J(cell$Middle) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    com.vk.core.compose.component.cell.content.o oVar4 = oVar;
                    i3 |= M.J(oVar4) ? 16384 : 8192;
                    oVar2 = oVar4;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((196608 & i) == 0) {
                        gzsVar3 = gzsVar;
                        i3 |= M.y(gzsVar3) ? 131072 : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= M.y(gzsVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                        }
                        if (M.t(i3 & 1, (i3 & 599187) != 599186)) {
                            q630.a aVar2 = q630.a.a;
                            q630Var2 = i8 != 0 ? aVar2 : q630Var;
                            boolean z3 = i9 != 0 ? true : z2;
                            Cell$Left cell$Left5 = cell$Left2;
                            if (i4 != 0) {
                                cell$Left5 = null;
                            }
                            if (i5 != 0) {
                                oVar2 = null;
                            }
                            if (i6 != 0) {
                                gzsVar3 = null;
                            }
                            gzsVar4 = i7 != 0 ? null : gzsVar2;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1348047843, i3, -1, "com.vk.core.compose.component.cell.VkCell (VkCell.kt:62)");
                            }
                            M.K(-1748055481);
                            Object x = M.x();
                            a.C0011a.C0012a c0012a = a.C0011a.a;
                            if (x == c0012a) {
                                x = ir.h(M);
                            }
                            sg50 sg50Var = (sg50) x;
                            Object x2 = M.x();
                            if (x2 == c0012a) {
                                x2 = qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7, 0L, false);
                                M.R(x2);
                            }
                            guw guwVar = (guw) x2;
                            M.K(1606186799);
                            q630 a = o19.a(txj0.f(q630Var2, 1.0f), z3 ? 1.0f : 0.64f);
                            if (gzsVar3 != null || gzsVar4 != null) {
                                q630 a2 = cuw.a(aVar2, sg50Var, guwVar);
                                if (gzsVar3 == null) {
                                    M.K(2006935951);
                                    Object x3 = M.x();
                                    if (x3 == c0012a) {
                                        x3 = new pm60(18);
                                        M.R(x3);
                                    }
                                    M.j();
                                    gzsVar5 = (gzs) x3;
                                } else {
                                    M.K(1865854846);
                                    M.j();
                                    gzsVar5 = gzsVar3;
                                }
                                a = a.g(ojc.d(a2, sg50Var, guwVar, z3, null, gzsVar4, gzsVar5, 440));
                            }
                            M.j();
                            fvr.n();
                            q630 b = txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.vk.core.compose.component.defaults.c.b, 1, a);
                            fvr.n();
                            q630 C = s200.C(b, fsk.o(M));
                            a.l lVar = androidx.compose.foundation.layout.a.a;
                            float f = kqu0.v;
                            dt1.a.getClass();
                            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.h(f, dt1.a.n), dt1.a.l, M, 48);
                            int hashCode = Long.hashCode(n34.n(M));
                            sy90 D = M.D();
                            q630 c = qri.c(M, C);
                            cri.h7.getClass();
                            LayoutNode.a aVar3 = cri.a.b;
                            if (M.N() == null) {
                                n34.r();
                                throw null;
                            }
                            M.H();
                            if (M.L()) {
                                M.I(aVar3);
                            } else {
                                M.f();
                            }
                            k9q0.w(M, a3, cri.a.f);
                            k9q0.w(M, D, cri.a.e);
                            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                            k9q0.t(M, cri.a.h);
                            k9q0.w(M, c, cri.a.d);
                            tpg0 tpg0Var = tpg0.a;
                            if (cell$Left5 == null) {
                                M.K(788530259);
                            } else {
                                M.K(788530260);
                                cell$Left5.a(tpg0Var, aVar2, M, 54);
                                s3q0 s3q0Var = s3q0.a;
                            }
                            M.j();
                            if (cell$Middle == null) {
                                M.K(788575891);
                                M.j();
                            } else {
                                M.K(788575892);
                                cell$Middle.a(tpg0Var, aVar2, M, 54);
                                s3q0 s3q0Var2 = s3q0.a;
                                M.j();
                            }
                            if (oVar2 == null) {
                                M.K(788620531);
                            } else {
                                M.K(788620532);
                                oVar2.a(tpg0Var, aVar2, M, 54);
                                s3q0 s3q0Var3 = s3q0.a;
                            }
                            M.j();
                            M.G();
                            M.j();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            z2 = z3;
                            cell$Left3 = cell$Left5;
                            oVar3 = oVar2;
                        } else {
                            M.h();
                            q630Var2 = q630Var;
                            gzsVar4 = gzsVar2;
                            cell$Left3 = cell$Left2;
                            oVar3 = oVar2;
                        }
                        Cell$Left cell$Left6 = cell$Left3;
                        com.vk.core.compose.component.cell.content.o oVar5 = oVar3;
                        gzs<s3q0> gzsVar6 = gzsVar3;
                        s = M.s();
                        if (s != null) {
                            s.d = new viu0(q630Var2, z2, cell$Left6, cell$Middle, oVar5, gzsVar6, gzsVar4, i, i2);
                            return;
                        }
                        return;
                    }
                    gzsVar3 = gzsVar;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    if (M.t(i3 & 1, (i3 & 599187) != 599186)) {
                    }
                    Cell$Left cell$Left62 = cell$Left3;
                    com.vk.core.compose.component.cell.content.o oVar52 = oVar3;
                    gzs<s3q0> gzsVar62 = gzsVar3;
                    s = M.s();
                    if (s != null) {
                    }
                }
                oVar2 = oVar;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                gzsVar3 = gzsVar;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                if (M.t(i3 & 1, (i3 & 599187) != 599186)) {
                }
                Cell$Left cell$Left622 = cell$Left3;
                com.vk.core.compose.component.cell.content.o oVar522 = oVar3;
                gzs<s3q0> gzsVar622 = gzsVar3;
                s = M.s();
                if (s != null) {
                }
            }
            cell$Left2 = cell$Left;
            if ((i & 3072) == 0) {
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            oVar2 = oVar;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            gzsVar3 = gzsVar;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            if (M.t(i3 & 1, (i3 & 599187) != 599186)) {
            }
            Cell$Left cell$Left6222 = cell$Left3;
            com.vk.core.compose.component.cell.content.o oVar5222 = oVar3;
            gzs<s3q0> gzsVar6222 = gzsVar3;
            s = M.s();
            if (s != null) {
            }
        }
        z2 = z;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        cell$Left2 = cell$Left;
        if ((i & 3072) == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        oVar2 = oVar;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        gzsVar3 = gzsVar;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        if (M.t(i3 & 1, (i3 & 599187) != 599186)) {
        }
        Cell$Left cell$Left62222 = cell$Left3;
        com.vk.core.compose.component.cell.content.o oVar52222 = oVar3;
        gzs<s3q0> gzsVar62222 = gzsVar3;
        s = M.s();
        if (s != null) {
        }
    }

    @ozl
    public static final void c(qco0 qco0Var, q630 q630Var, qzy qzyVar, ekg0 ekg0Var, androidx.compose.runtime.a aVar, int i, int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(681489101);
        int i4 = (M.J(qco0Var) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
        } else {
            i3 = i4 | (M.J(qzyVar) ? 256 : 128);
        }
        int i6 = i3 | (M.J(ekg0Var) ? 2048 : 1024);
        if (M.t(i6 & 1, (i6 & 1171) != 1170)) {
            if (i5 != 0) {
                qzyVar = qzy.a.a;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(681489101, i6, -1, "com.vk.core.compose.component.cell.VkDeprecatedCell (VkCell.kt:134)");
            }
            q630 f = txj0.f(q630Var, 1.0f);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.l, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            float f2 = kqu0.v;
            q630.a aVar3 = q630.a.a;
            f9t.e(txj0.v(aVar3, f2), M, 0);
            qzyVar.a((i6 >> 6) & 14, M);
            a(qco0Var, null, M, ((i6 << 3) & 112) | 6);
            ekg0Var.a((i6 >> 9) & 14, M);
            f9t.e(txj0.v(aVar3, f2), M, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        qzy qzyVar2 = qzyVar;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new n48(qco0Var, q630Var, qzyVar2, ekg0Var, i, i2);
        }
    }
}
