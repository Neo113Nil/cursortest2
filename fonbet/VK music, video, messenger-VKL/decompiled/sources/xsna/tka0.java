package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Pair;
import xsna.chs;
import xsna.cri;
import xsna.dt1;
import xsna.ma5;
import xsna.phw;
import xsna.q630;
import xsna.uka0;

/* compiled from: PicturePage.kt */
/* loaded from: classes5.dex */
public final class tka0 {
    public static final void a(final ma5.a aVar, final float f, final boolean z, final fb5 fb5Var, final lg90 lg90Var, androidx.compose.runtime.a aVar2, final int i) {
        int i2;
        androidx.compose.runtime.a aVar3;
        int i3;
        a.C0011a.C0012a c0012a;
        int i4;
        rg50 rg50Var;
        Pair m;
        String str = aVar.a;
        androidx.compose.runtime.a M = aVar2.M(-225370837);
        if ((i & 6) == 0) {
            i2 = (M.J(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.n(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(fb5Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-225370837, i2, -1, "com.vk.profile.design.compose.header.header.picture.paging.page.PicturePage (PicturePage.kt:44)");
            }
            float f2 = 1.0f;
            if (aVar.d && z) {
                f2 = 1.0f + (0.100000024f * f);
            }
            float f3 = f2;
            boolean booleanValue = ((Boolean) M.r(c5x.a)).booleanValue();
            boolean J = M.J(str);
            Object x = M.x();
            int i5 = i2;
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (J || x == c0012a2) {
                x = androidx.compose.runtime.i.a(0);
                M.R(x);
            }
            rg50 rg50Var2 = (rg50) x;
            if (booleanValue) {
                M.K(-988114499);
                M.j();
                m = new Pair(chs.d.a, lg90Var == null ? new y6g(l5g.j) : lg90Var);
                c0012a = c0012a2;
                aVar3 = M;
                rg50Var = rg50Var2;
                i4 = -1;
                i3 = 0;
            } else {
                M.K(-988015764);
                M.W(-1832986490, M.O(str, Integer.valueOf(rg50Var2.getIntValue())));
                String str2 = aVar.b;
                boolean z2 = (i5 & 14) == 4;
                Object x2 = M.x();
                if (z2 || x2 == c0012a2) {
                    x2 = new rka0(aVar, 0);
                    M.R(x2);
                }
                aVar3 = M;
                i3 = 0;
                c0012a = c0012a2;
                i4 = -1;
                rg50Var = rg50Var2;
                m = fwu0.m(null, str2, (gzs) x2, null, null, null, aVar3, 0, Sdk.SDKError.Reason.TPAT_ERROR_VALUE);
                aVar3.a0();
                aVar3.j();
            }
            chs chsVar = (chs) m.d();
            lg90 lg90Var2 = (lg90) m.g();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1574496494, i3, i4, "com.vk.profile.design.compose.header.header.picture.paging.page.getPicturePageUiState (PicturePageUiState.kt:26)");
            }
            vka0 vka0Var = new vka0(f3, chsVar instanceof chs.b ? uka0.a.a : qka0.d(chsVar instanceof chs.c, aVar3) ? uka0.b.a : uka0.c.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            boolean J2 = aVar3.J(rg50Var);
            Object x3 = aVar3.x();
            if (J2 || x3 == c0012a) {
                x3 = new iia0(rg50Var, 1);
                aVar3.R(x3);
            }
            b(lg90Var2, fb5Var, vka0Var, (gzs) x3, aVar3, 8 | ((i5 >> 6) & 112));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = M;
            aVar3.h();
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ska0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    tka0.a(ma5.a.this, f, z, fb5Var, lg90Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(lg90 lg90Var, fb5 fb5Var, vka0 vka0Var, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        uka0 uka0Var = vka0Var.b;
        androidx.compose.runtime.a M = aVar.M(836995597);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(fb5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(vka0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(gzsVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(836995597, i2, -1, "com.vk.profile.design.compose.header.header.picture.paging.page.PicturePageContent (PicturePage.kt:82)");
            }
            q630.a aVar3 = q630.a.a;
            q630 d = rte0.d(txj0.h(txj0.d(aVar3, 1.0f), fb5Var.a), androidx.compose.ui.graphics.e.a);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630 d3 = txj0.d(aVar3, 1.0f);
            boolean z = (i2 & 896) == 256;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new b810(vka0Var, 14);
                M.R(x);
            }
            aVar2 = M;
            gdv0.f(phw.a.a(lg90Var, null, fb5Var.b, null, null, M, 196616 | (i2 & 14), 26), rdu.a(d3, (izs) x), null, false, null, null, aVar2, 3072);
            mm2.f(uka0Var instanceof uka0.b, null, anp.e(null, 3), anp.f(null, 3), null, hji.a, aVar2, 200064, 18);
            mm2.f(uka0Var instanceof uka0.a, null, anp.e(null, 3), anp.f(null, 3), null, kai.c(-504246814, new zwq(gzsVar, 2), M), aVar2, 200064, 18);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new foj(lg90Var, fb5Var, vka0Var, gzsVar, i, 1);
        }
    }
}
