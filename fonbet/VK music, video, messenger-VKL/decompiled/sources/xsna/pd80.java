package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.tool.onboarding.VkOnboarding$HighlighterMarkerType;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;
import xsna.v5v;

/* compiled from: OnboardingHighlighterScreenContent.kt */
/* loaded from: classes18.dex */
public final class pd80 implements yah0 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        int i3;
        wh50 wh50Var;
        wh50 wh50Var2;
        wh50 wh50Var3;
        wh50 wh50Var4;
        LayoutNode.a aVar3;
        wh50 wh50Var5;
        wh50 wh50Var6;
        androidx.compose.runtime.a M = aVar.M(-1206405373);
        if ((i & 6) == 0) {
            i2 = i | (M.y(gzsVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1206405373, i2, -1, "com.vk.design.demo.presentation.screens.OnboardingHighlighterScreenContent.Content (OnboardingHighlighterScreenContent.kt:56)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = "This is a <u>narrow span</u>\nLine just for space\nFoo Bar Baz\nLine just for space\nThis is a looong span";
                M.R("This is a <u>narrow span</u>\nLine just for space\nFoo Bar Baz\nLine just for space\nThis is a looong span");
            }
            String str = (String) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                bpn0 bpn0Var = v5v.c;
                x2 = v5v.a.a(str);
                M.R(x2);
            }
            v5v v5vVar = (v5v) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = androidx.compose.runtime.k.b(VkOnboarding$HighlighterMarkerType.Type4);
                M.R(x3);
            }
            wh50 wh50Var7 = (wh50) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = androidx.compose.runtime.k.b(VkOnboarding$TintColor.Lime);
                M.R(x4);
            }
            wh50 wh50Var8 = (wh50) x4;
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = androidx.compose.runtime.k.b(null);
                M.R(x5);
            }
            wh50 wh50Var9 = (wh50) x5;
            Object x6 = M.x();
            if (x6 == c0012a) {
                x6 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x6);
            }
            wh50 wh50Var10 = (wh50) x6;
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar4 = dt1.a.n;
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, aVar4, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            int i4 = i2;
            q630.a aVar5 = q630.a.a;
            q630 c = qri.c(M, aVar5);
            cri.h7.getClass();
            LayoutNode.a aVar6 = cri.a.b;
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
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Onboarding Highlighter", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                i3 = 0;
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            } else {
                i3 = 0;
            }
            lg90 b = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, i3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            muv0.h(a2, null, null, null, null, TopBar$Before.e.a.a(b, null, gzsVar, null, null, null, M, 1572872 | ((i4 << 6) & 896), 58), null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8158);
            float f = kqu0.v;
            f9t.e(txj0.h(aVar5, f), M, 0);
            djn0.a(false, true, M, 438, 0);
            f9t.e(txj0.h(aVar5, f), M, 0);
            rd80.c(wh50Var7, M, 54);
            f9t.e(txj0.h(aVar5, kqu0.t), M, 0);
            rd80.b(wh50Var8, M, 54);
            f9t.e(txj0.h(aVar5, f), M, 0);
            float f2 = 4;
            q630 D2 = s200.D(aVar5, f2);
            ty6.a aVar7 = dt1.a.o;
            q630 c2 = lr.c(aVar7, D2);
            ButtonAppearance buttonAppearance = ButtonAppearance.Positive;
            ButtonSize buttonSize = ButtonSize.Small;
            ButtonStyle buttonStyle = ButtonStyle.Outline;
            Object x7 = M.x();
            if (x7 == c0012a) {
                wh50Var = wh50Var9;
                wh50Var2 = wh50Var10;
                x7 = new hc1(19, wh50Var, wh50Var2);
                M.R(x7);
            } else {
                wh50Var = wh50Var9;
                wh50Var2 = wh50Var10;
            }
            wh50 wh50Var11 = wh50Var;
            wh50 wh50Var12 = wh50Var2;
            bhu0.e((gzs) x7, buttonSize, buttonStyle, buttonAppearance, c2, null, false, false, null, null, null, "Show highlight", null, null, null, null, false, null, null, null, M, 3510, 384, 0, 4190176);
            q630 c3 = lr.c(aVar7, s200.D(aVar5, f2));
            ButtonAppearance buttonAppearance2 = ButtonAppearance.Negative;
            Object x8 = M.x();
            if (x8 == c0012a) {
                wh50Var3 = wh50Var11;
                wh50Var4 = wh50Var12;
                x8 = new fy0(15, wh50Var3, wh50Var4);
                M.R(x8);
            } else {
                wh50Var3 = wh50Var11;
                wh50Var4 = wh50Var12;
            }
            wh50 wh50Var13 = wh50Var3;
            wh50 wh50Var14 = wh50Var4;
            bhu0.e((gzs) x8, buttonSize, buttonStyle, buttonAppearance2, c3, null, false, false, null, null, null, "Hide highlight", null, null, null, null, false, null, null, null, M, 3510, 384, 0, 4190176);
            f9t.e(txj0.h(aVar5, f), M, 0);
            q630 d = txj0.d(aVar5, 1.0f);
            cp10 d2 = ja8.d(dt1.a.f, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c4 = qri.c(M, d);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                aVar3 = aVar6;
                M.I(aVar3);
            } else {
                aVar3 = aVar6;
                M.f();
            }
            k9q0.w(M, d2, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar);
            q630 D4 = s200.D(aVar5, f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(D4, ylu0Var.getBackground().a, androidx.compose.ui.graphics.e.a);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, aVar4, M, 48);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D5 = M.D();
            q630 c5 = qri.c(M, m);
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
            k9q0.w(M, D5, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c5, dVar);
            Object x9 = M.x();
            if (x9 == c0012a) {
                ztj ztjVar = new ztj(str, wh50Var7, wh50Var8, wh50Var13, 3);
                wh50Var5 = wh50Var7;
                wh50Var6 = wh50Var8;
                M.R(ztjVar);
                x9 = ztjVar;
            } else {
                wh50Var5 = wh50Var7;
                wh50Var6 = wh50Var8;
            }
            izs izsVar2 = (izs) x9;
            Object x10 = M.x();
            if (x10 == c0012a) {
                x10 = new nv2(28, wh50Var5, wh50Var6);
                M.R(x10);
            }
            ae2.a(390, 2, M, izsVar2, (izs) x10, null);
            f9t.e(txj0.h(aVar5, f), M, 0);
            d8v0.a(v5vVar.b, null, (VkOnboarding$HighlighterMarkerType) wh50Var5.getValue(), (VkOnboarding$TintColor) wh50Var6.getValue(), ((Boolean) wh50Var14.getValue()).booleanValue(), false, true, null, kai.c(1267272497, new od80(v5vVar, 0), M), M, 806879232, 418);
            aVar2 = M;
            aVar2.G();
            aVar2.G();
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
            s.d = new i07(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }
}
