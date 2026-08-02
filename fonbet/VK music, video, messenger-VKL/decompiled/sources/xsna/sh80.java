package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.g7v0;
import xsna.q630;
import xsna.ty6;

/* compiled from: OnboardingScreenContent.kt */
/* loaded from: classes18.dex */
public final class sh80 implements yah0 {
    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(741272105);
        if ((i & 6) == 0) {
            i2 = i | (M.y(gzsVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(741272105, i2, -1, "com.vk.design.demo.presentation.screens.OnboardingScreenContent.Content (OnboardingScreenContent.kt:113)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar3 = dt1.a.n;
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, aVar3, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar4 = q630.a.a;
            q630 c = qri.c(M, aVar4);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
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
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            muv0.e("Onboarding Banners", null, null, b, null, gzsVar, false, null, false, null, aVar2, 4102 | ((i2 << 15) & 458752), 0, 2006);
            float f = kqu0.v;
            f9t.e(txj0.h(aVar4, f), aVar2, 0);
            djn0.a(true, true, aVar2, 438, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) aVar2.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().p;
            q630 D2 = s200.D(txj0.f(aVar4, 1.0f), f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) aVar2.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 D3 = p490.D(hr80.m(D2, ylu0Var2.getBackground().a, androidx.compose.ui.graphics.e.a), p490.x(aVar2), 14);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar3, aVar2, 0);
            int hashCode2 = Long.hashCode(n34.n(aVar2));
            sy90 D4 = aVar2.D();
            q630 c2 = qri.c(aVar2, D3);
            if (aVar2.N() == null) {
                n34.r();
                throw null;
            }
            aVar2.H();
            if (aVar2.L()) {
                aVar2.I(aVar5);
            } else {
                aVar2.f();
            }
            k9q0.w(aVar2, a2, cVar);
            k9q0.w(aVar2, D4, eVar);
            ur.d(hashCode2, aVar2, bVar, aVar2, c2678a);
            k9q0.w(aVar2, c2, dVar);
            rzo0.a(6, 2, aVar2, "View", null);
            VkOnboarding$TintColor vkOnboarding$TintColor = VkOnboarding$TintColor.Lime;
            Object x = aVar2.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new a44(27);
                aVar2.R(x);
            }
            wh80.c("Добавьте <u>аккаунт</u> VK", "Добавить", g7v0.f.b, vkOnboarding$TintColor, j, (gzs) x, aVar2);
            VkOnboarding$TintColor vkOnboarding$TintColor2 = VkOnboarding$TintColor.Cyan;
            Object x2 = aVar2.x();
            if (x2 == c0012a) {
                x2 = new de4(28);
                aVar2.R(x2);
            }
            wh80.c("Подключите <u>уведомления</u>", "Включить", g7v0.b.b, vkOnboarding$TintColor2, j, (gzs) x2, aVar2);
            rzo0.a(6, 2, aVar2, "Compose", null);
            wh80.a(0, aVar2);
            wh80.b(0, j, aVar2);
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
            s.d = new uma(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }
}
