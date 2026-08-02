package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vkontakte.android.R;
import java.util.Map;
import kotlin.Pair;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: OnboardingTooltipScreenContent.kt */
/* loaded from: classes18.dex */
public final class ci80 implements yah0 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        char c;
        LayoutNode.a aVar2;
        cri.a.e eVar;
        wh50 wh50Var;
        wh50 wh50Var2;
        androidx.compose.runtime.a M = aVar.M(322792391);
        int i2 = (i & 6) == 0 ? i | (M.y(gzsVar) ? 4 : 2) : i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(322792391, i2, -1, "com.vk.design.demo.presentation.screens.OnboardingTooltipScreenContent.Content (OnboardingTooltipScreenContent.kt:51)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(VkTooltip$MarkerStyle.Style1);
                M.R(x);
            }
            wh50 wh50Var3 = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(VkTooltip$MarkerSize.Size64);
                M.R(x2);
            }
            wh50 wh50Var4 = (wh50) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = androidx.compose.runtime.k.b(VkOnboarding$TintColor.Lime);
                M.R(x3);
            }
            wh50 wh50Var5 = (wh50) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = pn00.k(new Pair(VkTooltip$BalloonPosition.Top, "Top"), new Pair(VkTooltip$BalloonPosition.Bottom, "Bottom`"), new Pair(VkTooltip$BalloonPosition.TopLeft, "Top left"), new Pair(VkTooltip$BalloonPosition.TopRight, "Top right"), new Pair(VkTooltip$BalloonPosition.BottomRight, "Bottom right"), new Pair(VkTooltip$BalloonPosition.BottomLeft, "Bottom left"));
                M.R(x4);
            }
            Map map = (Map) x4;
            Object x5 = M.x();
            if (x5 == c0012a) {
                dt1.a.getClass();
                x5 = androidx.compose.runtime.k.b(dt1.a.o);
                M.R(x5);
            }
            wh50 wh50Var6 = (wh50) x5;
            Object x6 = M.x();
            if (x6 == c0012a) {
                dt1.a.getClass();
                x6 = androidx.compose.runtime.k.b(dt1.a.f);
                M.R(x6);
            }
            wh50 wh50Var7 = (wh50) x6;
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar3 = q630.a.a;
            q630 c2 = qri.c(M, aVar3);
            cri.h7.getClass();
            int i3 = i2;
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar2 = cri.a.e;
            k9q0.w(M, D, eVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Onboarding Tooltip", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                c = 65535;
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            } else {
                c = 65535;
            }
            lg90 b = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            muv0.h(a2, null, null, null, null, TopBar$Before.e.a.a(b, null, gzsVar, null, null, null, M, 1572872 | ((i3 << 6) & 896), 58), null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8158);
            M = M;
            float f = kqu0.v;
            q630.a aVar5 = aVar3;
            f9t.e(txj0.h(aVar5, f), M, 0);
            djn0.a(true, false, M, 438, 0);
            f9t.e(txj0.h(aVar5, f), M, 0);
            ei80.d(wh50Var3, M, 54);
            f9t.e(txj0.h(aVar5, kqu0.t), M, 0);
            ei80.c(wh50Var4, M, 54);
            f9t.e(txj0.h(aVar5, f), M, 0);
            ei80.b(wh50Var5, M, 54);
            f9t.e(txj0.h(aVar5, f), M, 0);
            q630 f2 = txj0.f(aVar5, 1.0f);
            a.c cVar2 = androidx.compose.foundation.layout.a.e;
            ty6.b bVar2 = dt1.a.k;
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(cVar2, bVar2, M, 6);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, f2);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                aVar2 = aVar4;
                M.I(aVar2);
            } else {
                aVar2 = aVar4;
                M.f();
            }
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D2, eVar2);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            Object x7 = M.x();
            wh50 wh50Var8 = wh50Var5;
            a.C0011a.C0012a c0012a2 = c0012a;
            if (x7 == c0012a2) {
                eVar = eVar2;
                wh50Var = wh50Var7;
                x7 = new e3x(1, wh50Var);
                M.R(x7);
            } else {
                eVar = eVar2;
                wh50Var = wh50Var7;
            }
            wh50 wh50Var9 = wh50Var;
            LayoutNode.a aVar6 = aVar2;
            wh50 wh50Var10 = wh50Var3;
            cri.a.e eVar3 = eVar;
            mpj0.a(390, 2, M, "Top", (gzs) x7, null);
            Object x8 = M.x();
            if (x8 == c0012a2) {
                x8 = new ai80(0, wh50Var9);
                M.R(x8);
            }
            mpj0.a(390, 2, M, "Center", (gzs) x8, null);
            Object x9 = M.x();
            if (x9 == c0012a2) {
                x9 = new sim(wh50Var9, 28);
                M.R(x9);
            }
            mpj0.a(390, 2, M, "Bottom", (gzs) x9, null);
            M.G();
            q630 f3 = txj0.f(aVar5, 1.0f);
            androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(cVar2, bVar2, M, 6);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c4 = qri.c(M, f3);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar6);
            } else {
                M.f();
            }
            k9q0.w(M, a4, cVar);
            k9q0.w(M, D3, eVar3);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar);
            Object x10 = M.x();
            if (x10 == c0012a2) {
                wh50Var2 = wh50Var6;
                x10 = new atm(wh50Var2, 29);
                M.R(x10);
            } else {
                wh50Var2 = wh50Var6;
            }
            mpj0.a(390, 2, M, "Left", (gzs) x10, null);
            Object x11 = M.x();
            if (x11 == c0012a2) {
                x11 = new dj60(wh50Var2, 3);
                M.R(x11);
            }
            mpj0.a(390, 2, M, "Center", (gzs) x11, null);
            Object x12 = M.x();
            if (x12 == c0012a2) {
                x12 = new bi80(wh50Var2, 0);
                M.R(x12);
            }
            mpj0.a(390, 2, M, "Right", (gzs) x12, null);
            M.G();
            f9t.e(txj0.h(aVar5, f), M, 0);
            q630 d = txj0.d(aVar5, 1.0f);
            cp10 d2 = ja8.d((dt1) wh50Var9.getValue(), false);
            int hashCode4 = Long.hashCode(n34.n(M));
            sy90 D4 = M.D();
            q630 c5 = qri.c(M, d);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar6);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cVar);
            k9q0.w(M, D4, eVar3);
            ur.d(hashCode4, M, bVar, M, c2678a);
            k9q0.w(M, c5, dVar);
            q630 D5 = s200.D(txj0.f(aVar5, 1.0f), f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(D5, ylu0Var.getBackground().a, androidx.compose.ui.graphics.e.a);
            androidx.compose.foundation.layout.c a5 = androidx.compose.foundation.layout.b.a(mVar, (dt1.b) wh50Var2.getValue(), M, 0);
            int hashCode5 = Long.hashCode(n34.n(M));
            sy90 D6 = M.D();
            q630 c6 = qri.c(M, m);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar6);
            } else {
                M.f();
            }
            k9q0.w(M, a5, cVar);
            k9q0.w(M, D6, eVar3);
            ur.d(hashCode5, M, bVar, M, c2678a);
            k9q0.w(M, c6, dVar);
            M.K(1399610449);
            for (Map.Entry entry : map.entrySet()) {
                VkTooltip$BalloonPosition vkTooltip$BalloonPosition = (VkTooltip$BalloonPosition) entry.getKey();
                String str = (String) entry.getValue();
                androidx.compose.runtime.a aVar7 = M;
                buv0 z = rdi.z(false, null, null, aVar7, 0, 7);
                VkTooltip$MarkerStyle vkTooltip$MarkerStyle = (VkTooltip$MarkerStyle) wh50Var10.getValue();
                VkTooltip$MarkerSize vkTooltip$MarkerSize = (VkTooltip$MarkerSize) wh50Var4.getValue();
                VkOnboarding$TintColor vkOnboarding$TintColor = (VkOnboarding$TintColor) wh50Var8.getValue();
                boolean y = aVar7.y(z);
                Object x13 = aVar7.x();
                if (y || x13 == c0012a2) {
                    x13 = new b010(z, 19);
                    aVar7.R(x13);
                }
                gzs gzsVar3 = (gzs) x13;
                boolean y2 = aVar7.y(z);
                Object x14 = aVar7.x();
                if (y2 || x14 == c0012a2) {
                    x14 = new kr50(z, 6);
                    aVar7.R(x14);
                }
                q630.a aVar8 = aVar5;
                o9v0.a("Place your awesome text description here", z, aVar8, vkTooltip$MarkerStyle, vkTooltip$MarkerSize, vkOnboarding$TintColor, vkTooltip$BalloonPosition, null, gzsVar3, (gzs) x14, null, null, null, false, null, true, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, kai.c(142562677, new qg(4, str, z), aVar7), aVar7, 390, 805502976, 490624);
                aVar5 = aVar8;
                M = aVar7;
                wh50Var10 = wh50Var10;
                wh50Var8 = wh50Var8;
                c0012a2 = c0012a2;
            }
            M.j();
            M.G();
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new azq(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }
}
