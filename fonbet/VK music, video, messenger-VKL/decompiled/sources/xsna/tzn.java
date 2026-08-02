package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: DonutFeedSnippetContent.kt */
/* loaded from: classes18.dex */
public final class tzn implements yah0 {
    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1276466921);
        if ((i & 6) == 0) {
            i2 = i | (M.y(gzsVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar2) ? 32 : 16;
        }
        if ((i & 196608) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (65555 & i2) != 65554)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1276466921, i2, -1, "com.vk.design.demo.presentation.screens.DonutFeedSnippetContent.Content (DonutFeedSnippetContent.kt:32)");
            }
            q630.a aVar2 = q630.a.a;
            q630 d = txj0.d(aVar2, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d, ylu0Var.getBackground().a, androidx.compose.ui.graphics.e.a);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            b(gzsVar, gzsVar2, M, ((i2 >> 9) & 896) | (i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
            djn0.a(false, true, M, 438, 0);
            q630 d2 = txj0.d(aVar2, 1.0f);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(16), dt1.a.n, M, 6);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, d2);
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
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            q630 f = txj0.f(aVar2, 1.0f);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new y8(20);
                M.R(x);
            }
            ae2.a(54, 4, M, (izs) x, null, f);
            q630 f2 = txj0.f(aVar2, 1.0f);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new g53(17);
                M.R(x2);
            }
            ae2.a(54, 4, M, (izs) x2, null, f2);
            q630 f3 = txj0.f(aVar2, 1.0f);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new qm(18);
                M.R(x3);
            }
            ae2.a(54, 4, M, (izs) x3, null, f3);
            q630 f4 = txj0.f(aVar2, 1.0f);
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new af2(17);
                M.R(x4);
            }
            ae2.a(54, 4, M, (izs) x4, null, f4);
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new szn(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    public final void b(gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        lg90 c;
        androidx.compose.runtime.a M = aVar.M(664216662);
        if ((i & 6) == 0) {
            i2 = i | (M.y(gzsVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar2) ? 32 : 16;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(664216662, i3, -1, "com.vk.design.demo.presentation.screens.DonutFeedSnippetContent.DonutActionButtonTopBar (DonutFeedSnippetContent.kt:88)");
            }
            aVar2 = M;
            TopBar$Middle.Text a = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Donut action button", null, null, null, null, aVar2, 196614, 30), null, null, null, aVar2, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b = or.b(aVar2, -45049119, R.drawable.vk_icon_arrow_left_outline_28, aVar2, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            TopBar$Before.e a2 = TopBar$Before.e.a.a(b, null, gzsVar, null, null, null, aVar2, 1572872 | ((i3 << 6) & 896), 58);
            if (((Boolean) aVar2.r(vsx.b)).booleanValue()) {
                aVar2.K(-1637898590);
                c = jh.c(qzu0.a, aVar2);
            } else {
                aVar2.K(-1637897757);
                c = j8.c(qzu0.a, aVar2);
            }
            muv0.h(a, null, null, null, null, a2, d.a.a(d.c.C0760d.a.a(c, null, gzsVar2, null, null, null, aVar2, 1572872 | ((i3 << 3) & 896), 58), null, null, null, aVar2, 24576, 14), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 0, 0, 8094);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new owl(i, 2, this, gzsVar, gzsVar2);
        }
    }
}
