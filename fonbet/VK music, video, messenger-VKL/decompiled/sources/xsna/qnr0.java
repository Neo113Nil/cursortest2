package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.component.topbar.e;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VerificationStubScreen.kt */
/* loaded from: classes18.dex */
public final class qnr0 {
    public static final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(392584480);
        int i2 = (M.J(q630Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(392584480, i2, -1, "com.vk.ecomm.verifiedseller.impl.screens.verificationstub.VerificationStubContent (VerificationStubScreen.kt:58)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.e, dt1.a.o, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1444785948, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CheckCircleOutline56> (VkSdkIcons.kt:374)");
            }
            lg90 b = or.b(M, 1751086399, R.drawable.vk_icon_check_circle_outline_56, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            pzu0.b(b, null, null, wlb0.h(M).getIcon().l, M, 56, 4);
            q630.a aVar4 = q630.a.a;
            f9t.e(txj0.h(aVar4, 12), M, 6);
            aVar2 = M;
            yqv0.c(d370.N(R.string.verification_stub_title, 0, M), null, wlb0.h(M).getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).z, aVar2, 0, 0, 8122);
            f9t.e(txj0.h(aVar4, 8), aVar2, 6);
            yqv0.c(d370.N(R.string.verification_stub_description, 0, aVar2), null, wlb0.h(aVar2).getText().p, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(aVar2).d0, aVar2, 0, 0, 8122);
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
            s.d = new kb5(q630Var, i, 3);
        }
    }

    public static final void b(gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(815348770);
        int i2 = (M.y(gzsVar) ? 4 : 2) | i | (M.y(gzsVar2) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(815348770, i2, -1, "com.vk.ecomm.verifiedseller.impl.screens.verificationstub.VerificationStubScreen (VerificationStubScreen.kt:33)");
            }
            phv0.b(q630.a.a, kai.c(-1371272983, new e5l(6, gzsVar, gzsVar2), M), null, null, null, 0, 0L, 0L, gmi.a, M, 805306422, IronSourceError.ERROR_CODE_INIT_FAILED);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wja(gzsVar, gzsVar2, i, 11);
        }
    }

    public static final void c(String str, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-296153040);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.y(gzsVar2) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-296153040, i2, -1, "com.vk.ecomm.verifiedseller.impl.screens.verificationstub.VerificationStubToolbar (VerificationStubScreen.kt:95)");
            }
            String N = d370.N(R.string.ecomm_verifiedseller_top_bar_back, 0, M);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new n0m0(9);
                M.R(x);
            }
            TopBar$Before.e a = e.a.a(gzsVar, N, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, ((i2 >> 3) & 14) | 196608, 12);
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(str, null, null, null, null, M, (i2 & 14) | 196608, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(905875124, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-InfoCircleOutline28> (VkSdkIcons.kt:1278)");
            }
            lg90 b = or.b(M, 1646480040, R.drawable.vk_icon_info_circle_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            muv0.h(a2, null, null, null, a, null, d.a.a(d.c.C0760d.a.a(b, d370.N(R.string.ecomm_verifiedseller_info, 0, M), gzsVar2, null, null, null, M, 1572872 | (i2 & 896), 56), null, null, null, M, 24576, 14), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8110);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new nn7(i, 6, str, gzsVar, gzsVar2);
        }
    }
}
