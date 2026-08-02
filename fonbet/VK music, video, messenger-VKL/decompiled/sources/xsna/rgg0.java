package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.cri;
import xsna.dt1;
import xsna.phw;
import xsna.q630;
import xsna.ty6;
import xsna.uxe0;
import xsna.wkj;

/* compiled from: ReviewBlockHeaderImpl.kt */
/* loaded from: classes18.dex */
public final class rgg0 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d = androidx.compose.runtime.k.b(null);

    public rgg0(qgg0 qgg0Var, gzs gzsVar, gzs gzsVar2) {
        this.a = androidx.compose.runtime.k.b(qgg0Var);
        this.b = androidx.compose.runtime.k.b(gzsVar);
        this.c = androidx.compose.runtime.k.b(gzsVar2);
    }

    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        rgg0 rgg0Var;
        androidx.compose.runtime.a aVar2;
        int i3;
        int i4;
        androidx.compose.runtime.a M = aVar.M(2099657549);
        if ((i & 6) == 0) {
            i2 = i | (M.J(q630Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        int i5 = i2;
        if (M.t(i5 & 1, (i5 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2099657549, i5, -1, "com.vk.ecomm.design.compose.reviewcell.ReviewBlockHeaderImpl.Content (ReviewBlockHeaderImpl.kt:52)");
            }
            wh50 wh50Var = this.d;
            q630 f = txj0.f(com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) wh50Var).getValue()), 1.0f);
            float f2 = 4;
            a.j g = androidx.compose.foundation.layout.a.g(f2);
            dt1.a.getClass();
            ty6.b bVar = dt1.a.l;
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(g, bVar, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar2 = cri.a.g;
            k9q0.w(M, valueOf, bVar2);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            q630.a aVar4 = q630.a.a;
            q630 s = txj0.s(aVar4, 52, 48);
            cp10 d = ja8.d(dt1.a.e, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, s);
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
            k9q0.w(M, d, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar2, M, c2678a);
            k9q0.w(M, c2, dVar);
            q630 b = com.vk.core.compose.component.semantics.b.b(aVar4, (SemanticsConfiguration) ((zak0) wh50Var).getValue());
            boolean z = ((gzs) ((zak0) this.b).getValue()) != null;
            int i6 = i5 & 112;
            boolean z2 = i6 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new sy50(this, 27);
                M.R(x);
            }
            q630 E = ahn.E(ojc.c(b, z, null, null, (gzs) x, 14), "review_block_avatar");
            wh50 wh50Var2 = this.a;
            ldu0.b(phw.a.a(fwu0.l(((qgg0) ((zak0) wh50Var2).getValue()).a, null, null, null, M, 0, 62), null, wkj.a.a, null, null, M, 197000, 26), 40, E, null, null, false, null, null, null, M, 48, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
            M.G();
            float f3 = 2;
            q630 H = s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, 7);
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.k, M, 0);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, H);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar2, M, c2678a);
            k9q0.w(M, c3, dVar);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(f2), dt1.a.n, M, 6);
            int hashCode4 = Long.hashCode(n34.n(M));
            sy90 D4 = M.D();
            q630 c4 = qri.c(M, aVar4);
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
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D4, eVar);
            ur.d(hashCode4, M, bVar2, M, c2678a);
            k9q0.w(M, c4, dVar);
            boolean z3 = ((gzs) ((zak0) this.c).getValue()) != null;
            boolean z4 = i6 == 32;
            Object x2 = M.x();
            if (z4 || x2 == c0012a) {
                x2 = new bbb0(this, 11);
                M.R(x2);
            }
            q630 E2 = ahn.E(ojc.c(aVar4, z3, null, null, (gzs) x2, 14), "review_block_user_name");
            String str = ((qgg0) ((zak0) wh50Var2).getValue()).b;
            if (androidx.compose.runtime.b.d()) {
                i3 = -1;
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            } else {
                i3 = -1;
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.O;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, i3, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str, E2, ylu0Var.getText().m, null, null, 0, 0, null, 2, false, 0, 1, null, frv0Var, M, 100663296, 48, 5880);
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, 1, aVar4);
            androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(6), bVar, M, 54);
            int hashCode5 = Long.hashCode(n34.n(M));
            sy90 D5 = M.D();
            q630 c5 = qri.c(M, F);
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
            k9q0.w(M, a4, cVar);
            k9q0.w(M, D5, eVar);
            ur.d(hashCode5, M, bVar2, M, c2678a);
            k9q0.w(M, c5, dVar);
            q630 E3 = ahn.E(aVar4, "review_block_rating");
            float f4 = ((qgg0) ((zak0) wh50Var2).getValue()).c;
            if (androidx.compose.runtime.b.d()) {
                i4 = 0;
                androidx.compose.runtime.b.f(171813404, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Favorite16> (VkSdkIcons.kt:840)");
            } else {
                i4 = 0;
            }
            lg90 b2 = or.b(M, -1107727797, R.drawable.vk_icon_favorite_16, M, i4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            rxe0.c(f4, b2, E3, false, uxe0.a.b(M), null, M, 448, 40);
            aVar2 = M;
            if (((qgg0) ((zak0) wh50Var2).getValue()).d) {
                aVar2.K(1198294060);
                rgg0Var = this;
                rgg0Var.b((i5 >> 3) & 14, aVar2);
            } else {
                rgg0Var = this;
                aVar2.K(1193451767);
            }
            aVar2.j();
            aVar2.G();
            aVar2.G();
            aVar2.G();
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            rgg0Var = this;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s2 = aVar2.s();
        if (s2 != null) {
            s2.d = new adh(rgg0Var, q630Var, i, 3);
        }
    }

    public final void b(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1406427506);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1406427506, i, -1, "com.vk.ecomm.design.compose.reviewcell.ReviewBlockHeaderImpl.ReviewPinnedBlock (ReviewBlockHeaderImpl.kt:121)");
            }
            q630.a aVar3 = q630.a.a;
            q630 H = s200.H(aVar3, 6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            a.j g = androidx.compose.foundation.layout.a.g(2);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(g, dt1.a.k, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630 E = ahn.E(aVar3, "review_block_pinned_indicator");
            qzu0.a.getClass();
            pzu0.b(qzu0.a1(M), null, E, wlb0.h(M).getIcon().l, M, 440, 0);
            aVar2 = M;
            yqv0.c(d370.N(R.string.review_block_cell_review_is_pinned_text, 0, M), ahn.E(aVar3, "review_block_pinned_text"), wlb0.h(M).getText().s, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).i0, aVar2, 100663344, 48, 5880);
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
            s.d = new si1(this, i, 4);
        }
    }
}
