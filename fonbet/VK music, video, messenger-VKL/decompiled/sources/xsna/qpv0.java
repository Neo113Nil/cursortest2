package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VkTabsFixedIcon.kt */
/* loaded from: classes17.dex */
public final class qpv0 {
    public final wh50 a;
    public final wh50 b;

    public qpv0() {
        throw null;
    }

    public qpv0(gzs gzsVar, lg90 lg90Var) {
        this.a = androidx.compose.runtime.k.b(lg90Var);
        this.b = androidx.compose.runtime.k.b(gzsVar);
    }

    public final void a(final int i, androidx.compose.runtime.a aVar, q630 q630Var, final boolean z) {
        final q630 q630Var2;
        float f;
        androidx.compose.runtime.a M = aVar.M(425257618);
        int i2 = (M.l(z) ? 4 : 2) | i | 48 | (M.J(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(425257618, i2, -1, "com.vk.core.compose.component.tabs.VkTabsFixedIcon.Content (VkTabsFixedIcon.kt:36)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = ir.h(M);
            }
            sg50 sg50Var = (sg50) x;
            bpn0 bpn0Var = npv0.a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1236285910, 0, -1, "com.vk.core.compose.component.defaults.VkTabsDefault.fixedIconOuterPaddingLeft (VkTabsDefault.kt:195)");
            }
            float f2 = kqu0.a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f3 = kqu0.v;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1023965441, 0, -1, "com.vk.core.compose.component.defaults.VkTabsDefault.fixedIconOuterPaddingRight (VkTabsDefault.kt:203)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630.a aVar2 = q630.a.a;
            q630 H = s200.H(aVar2, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.b;
            cp10 d = ja8.d(ty6Var, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            q630Var2 = aVar2;
            q630 b = ojc.b(q630Var2, sg50Var, qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 0L, true), z, new plg0(0), (gzs) ((zak0) this.b).getValue(), 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1919483864, 0, -1, "com.vk.core.compose.component.defaults.VkTabsDefault.fixedIconClickablePadding (VkTabsDefault.kt:187)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 D2 = s200.D(b, kqu0.s);
            cp10 d2 = ja8.d(ty6Var, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c2 = qri.c(M, D2);
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
            k9q0.w(M, d2, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            q630 q = txj0.q(q630Var2, 24);
            cp10 d3 = ja8.d(dt1.a.f, false);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D4 = M.D();
            q630 c3 = qri.c(M, q);
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
            k9q0.w(M, d3, cVar);
            k9q0.w(M, D4, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            if (z) {
                M.K(472898887);
                f = ((Number) M.r(hfj.a)).floatValue();
                M.j();
            } else {
                M.K(-1460669406);
                M.j();
                f = 0.64f;
            }
            rvi.a(hfj.a.b(Float.valueOf(f)), kai.c(815404928, new com.vk.movika.tools.controls.seekbar.v(this, 18), M), M, 56);
            M.G();
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(z, q630Var2, i) { // from class: xsna.ppv0
                public final /* synthetic */ boolean c;
                public final /* synthetic */ q630 d;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    qpv0.this.a(I, (androidx.compose.runtime.a) obj, this.d, this.c);
                    return s3q0.a;
                }
            };
        }
    }
}
