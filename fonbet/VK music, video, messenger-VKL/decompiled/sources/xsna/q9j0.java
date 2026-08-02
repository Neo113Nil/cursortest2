package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import xsna.cri;
import xsna.dt1;
import xsna.phw;
import xsna.q630;
import xsna.xpv;

/* compiled from: ShareVariantCell.kt */
/* loaded from: classes7.dex */
public final class q9j0 {
    public static final void a(final int i, final lg90 lg90Var, final boolean z, final q630 q630Var, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        long j;
        androidx.compose.runtime.a M = aVar.M(-1696133369);
        if ((i2 & 6) == 0) {
            i3 = (M.o(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.l(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1696133369, i3, -1, "com.vk.video.ui.share.impl.presentation.views.ActionShareVariantCell (ShareVariantCell.kt:49)");
            }
            long j2 = wlb0.h(M).getIcon().j;
            if (we7.m(M) || z) {
                M.K(781454297);
                j = wlb0.h(M).getBackground().m;
                M.j();
            } else {
                M.K(781556783);
                j = wlb0.h(M).r().a;
                M.j();
            }
            int i4 = i3 >> 3;
            c(i, xpv.a.a(lg90Var, j2, new rek0(j), M, 24584 | (i4 & 14), 8), q630Var, M, (i4 & 896) | (i3 & 14));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.o9j0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    q9j0.a(i, lg90Var, z, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(int i, lg90 lg90Var, q630 q630Var, androidx.compose.runtime.a aVar, int i2) {
        lg90 lg90Var2;
        androidx.compose.runtime.a M = aVar.M(850321652);
        int i3 = (M.o(i) ? 4 : 2) | i2 | (M.y(lg90Var) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(850321652, i3, -1, "com.vk.video.ui.share.impl.presentation.views.AppShareVariantCell (ShareVariantCell.kt:33)");
            }
            lg90Var2 = lg90Var;
            c(i, phw.a.a(lg90Var2, null, null, null, null, M, 196616 | ((i3 >> 3) & 14), 30), q630Var, M, i3 & 910);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            lg90Var2 = lg90Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new tq8(i, lg90Var2, q630Var, i2);
        }
    }

    public static final void c(final int i, final efj efjVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(1976721099);
        if ((i2 & 6) == 0) {
            i3 = (M.o(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(efjVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.J(q630Var) ? 256 : 128;
        }
        int i4 = i3;
        if (M.t(i4 & 1, (i4 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1976721099, i4, -1, "com.vk.video.ui.share.impl.presentation.views.ShareVariantCell (ShareVariantCell.kt:72)");
            }
            float f = 4;
            q630 G = s200.G(txj0.v(q630Var, 72), f, f, f, 8);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, G);
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
            ldu0.b(efjVar, 56, null, null, null, false, null, null, null, M, ((i4 >> 3) & 14) | 48, IronSourceError.ERROR_CODE_INIT_FAILED);
            f9t.e(txj0.h(q630.a.a, 6), M, 6);
            String N = d370.N(i, i4 & 14, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.w0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(N, null, ylu0Var.getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, 0, 0, 8186);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.p9j0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i2 | 1);
                    q9j0.c(i, efjVar, q630Var, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
