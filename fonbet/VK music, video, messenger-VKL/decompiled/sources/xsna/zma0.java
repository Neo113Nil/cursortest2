package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: PinReviewManageServiceScreen.kt */
/* loaded from: classes18.dex */
public final class zma0 {
    public static final void a(gna0 gna0Var, izs<? super rma0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        gna0 gna0Var2;
        androidx.compose.runtime.a M = aVar.M(-1198290881);
        if ((i & 6) == 0) {
            i2 = (M.J(gna0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1198290881, i2, -1, "com.vk.ecomm.reviews.impl.pinnedreview.presentation.base.PinReviewManageServiceScreen (PinReviewManageServiceScreen.kt:26)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c = qri.c(M, aVar2);
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
            b(izsVar, M, (i2 >> 3) & 14);
            jqu0.a(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 6, 14);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new z6u(11);
                M.R(x);
            }
            gna0Var2 = gna0Var;
            njk.a(gna0Var2, (izs) x, null, null, "PinReviewManageServiceScreenCrossfade", kai.c(1302185172, new zrt(izsVar, 1), M), M, (i2 & 14) | 221232);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            gna0Var2 = gna0Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wi1(gna0Var2, izsVar, i, 5);
        }
    }

    public static final void b(izs<? super rma0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        TopBar$Before.e eVar;
        androidx.compose.runtime.a M = aVar.M(-1842722324);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1842722324, i2, -1, "com.vk.ecomm.reviews.impl.pinnedreview.presentation.base.Toolbar (PinReviewManageServiceScreen.kt:47)");
            }
            boolean c = f9k.c(M);
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (c) {
                M.K(1731391489);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(976347900, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CancelOutline28> (VkSdkIcons.kt:280)");
                }
                lg90 b = or.b(M, 861936997, R.drawable.vk_icon_cancel_outline_28, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                String N = d370.N(R.string.vk_back, 0, M);
                boolean z = (i2 & 14) == 4;
                Object x = M.x();
                if (z || x == c0012a) {
                    x = new nac(izsVar, 4);
                    M.R(x);
                }
                gzs gzsVar = (gzs) x;
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new kdw(13);
                    M.R(x2);
                }
                eVar = TopBar$Before.e.a.a(b, N, gzsVar, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), M, 1572872, 24);
                M = M;
                M.j();
            } else {
                M.K(1731817521);
                M.j();
                eVar = null;
            }
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new cd10(8);
                M.R(x3);
            }
            aVar2 = M;
            muv0.h(TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.pin_review_subscription_info_toolbar_title, 0, M), null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), aVar2, 196608, 14), null, null, null, aVar2, 14), null, null, null, null, eVar, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 0, 0, 8158);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new v26(izsVar, i, 4);
        }
    }
}
