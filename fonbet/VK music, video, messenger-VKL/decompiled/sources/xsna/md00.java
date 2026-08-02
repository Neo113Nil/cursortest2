package xsna;

import android.view.View;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.tool.compose.blur.GradientDirection;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.WeakHashMap;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;
import xsna.yk8;
import xsna.yqx0;

/* compiled from: MainContent.kt */
/* loaded from: classes18.dex */
public final class md00 implements yah0 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        wh50 wh50Var;
        lg90 c;
        androidx.compose.runtime.a M = aVar.M(1483524713);
        if ((i & 48) == 0) {
            i2 = (M.y(gzsVar2) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(x5Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1169) != 1168)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1483524713, i2, -1, "com.vk.design.demo.presentation.screens.MainContent.Content (MainContent.kt:56)");
            }
            rv5 c2 = lv5.c(M);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = qq.h(0, M);
            }
            wh50 wh50Var2 = (wh50) x;
            azl azlVar = (azl) M.r(uvi.h);
            M.K(-261878950);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-675090670, 6, -1, "androidx.compose.foundation.layout.<get-statusBars> (WindowInsets.android.kt:180)");
            }
            WeakHashMap<View, yqx0> weakHashMap = yqx0.w;
            te2 te2Var = yqx0.a.c(M).f;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float j1 = azlVar.j1(te2Var.e().b);
            M.j();
            M.K(-261875391);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1596175702, 6, -1, "androidx.compose.foundation.layout.<get-navigationBars> (WindowInsets.android.kt:176)");
            }
            te2 te2Var2 = yqx0.a.c(M).e;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float j12 = azlVar.j1(te2Var2.e().d);
            M.j();
            long j = wlb0.h(M).getBackground().g;
            q630.a aVar2 = q630.a.a;
            q630 d = txj0.d(aVar2, 1.0f);
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.b;
            cp10 d2 = ja8.d(ty6Var, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c3 = qri.c(M, d);
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
            k9q0.w(M, d2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c3, dVar);
            int i3 = i2;
            q630 b = lv5.b(txj0.d(aVar2, 1.0f), c2, 0L, 6);
            cp10 d3 = ja8.d(ty6Var, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c4 = qri.c(M, b);
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
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            ty6.a aVar4 = dt1.a.n;
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, aVar4, M, 0);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c5 = qri.c(M, aVar2);
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
            k9q0.w(M, a, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c5, dVar);
            float f = 12;
            u890 u890Var = new u890(f, j1 + 100, f, j12 + 56);
            boolean z = (i3 & 7168) == 2048;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                wh50Var = wh50Var2;
                x2 = new le2(wh50Var, izsVar);
                M.R(x2);
            } else {
                wh50Var = wh50Var2;
            }
            qqj0.a(null, u890Var, (izs) x2, M, 0);
            M.G();
            M.G();
            wh50 wh50Var3 = wh50Var;
            q630 a2 = lv5.a(txj0.z(aVar2, null, 3), c2, 20, GradientDirection.BottomTop, yk8.a.g(e43.l(new l5g(l5g.c(14, j, 60.0f)), new l5g(l5g.c(14, j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), null, 36);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, aVar4, M, 0);
            int hashCode4 = Long.hashCode(n34.n(M));
            sy90 D4 = M.D();
            q630 c6 = qri.c(M, a2);
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
            ur.d(hashCode4, M, bVar, M, c2678a);
            k9q0.w(M, c6, dVar);
            f9t.e(txj0.h(aVar2, j1), M, 0);
            TopBar$Middle.Text a4 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Vk Design App", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            if (((Boolean) M.r(vsx.b)).booleanValue()) {
                M.K(1876124625);
                c = jh.c(qzu0.a, M);
            } else {
                M.K(1876125458);
                c = j8.c(qzu0.a, M);
            }
            d.c.C0760d a5 = d.c.C0760d.a.a(c, null, gzsVar2, null, null, null, M, 1572872 | ((i3 << 3) & 896), 58);
            M.K(-1969351903);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-585171788, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ServicesOutline28> (VkSdkIcons.kt:3288)");
            }
            lg90 b2 = or.b(M, 419696811, R.drawable.vk_icon_services_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            muv0.h(a4, null, null, null, null, null, d.a.a(a5, d.b.a.C0757a.a(b2, null, x5Var, null, null, null, M, 12582920 | (i3 & 896), Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), null, null, M, 24576, 12), null, false, wlb0.h(M).d().a, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 7614);
            u6u0.c(((Number) wh50Var3.getValue()).intValue(), kai.c(2003531701, new x9a(wh50Var3, 3), M), null, wlb0.h(M).d().a, false, null, null, null, false, M, 48, 500);
            M = M;
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new kd00(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }
}
