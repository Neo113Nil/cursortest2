package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ImagesContainer.kt */
/* loaded from: classes18.dex */
public final class mnw {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;

    public mnw(qhw qhwVar, i9p0 i9p0Var, kkk kkkVar, gzk0 gzk0Var) {
        this.a = androidx.compose.runtime.k.b(qhwVar);
        this.b = androidx.compose.runtime.k.b(i9p0Var);
        this.c = androidx.compose.runtime.k.b(kkkVar);
        this.d = androidx.compose.runtime.k.b(gzk0Var);
    }

    public final void a(q630 q630Var, pco pcoVar, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1920565592);
        int i2 = i | 6 | (M.J(pcoVar) ? 32 : 16) | (M.J(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1920565592, i2, -1, "com.vk.ecomm.design.compose.tile.impl.image.ImagesContainer.Content (ImagesContainer.kt:38)");
            }
            float f = kqu0.e;
            uog0 b = vog0.b(f);
            q630.a aVar2 = q630.a.a;
            q630 d = rte0.d(aVar2, b);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d, ylu0Var.getImage().c, androidx.compose.ui.graphics.e.a);
            float f2 = (float) 0.5d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 a = r18.a(f2, ylu0Var2.getImage().a, m, vog0.b(f));
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, a);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            qhw qhwVar = (qhw) ((zak0) this.a).getValue();
            if (qhwVar == null) {
                M.K(1833323238);
            } else {
                M.K(-217955205);
                qhwVar.a(txj0.f(aVar2, 1.0f), pcoVar, M, (i2 & 112) | 6);
            }
            M.j();
            gzk0 gzk0Var = (gzk0) ((zak0) this.d).getValue();
            ra8 ra8Var = ra8.a;
            if (gzk0Var == null) {
                M.K(1833459235);
            } else {
                M.K(-217950818);
                float f3 = 6;
                gzk0Var.a(s200.H(ra8Var.b(aVar2, dt1.a.h), f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, 6), M, 0);
            }
            M.j();
            i9p0 i9p0Var = (i9p0) ((zak0) this.b).getValue();
            if (i9p0Var == null) {
                M.K(1833723355);
            } else {
                M.K(-217942298);
                i9p0Var.b(ra8Var.b(aVar2, dt1.a.d), M, 0);
            }
            M.j();
            kkk kkkVar = (kkk) ((zak0) this.c).getValue();
            if (kkkVar == null) {
                M.K(1833805381);
            } else {
                M.K(-217939652);
                kkkVar.a(ra8Var.b(aVar2, dt1.a.j), M, 0);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qq0(i, 4, this, q630Var2, pcoVar);
        }
    }
}
