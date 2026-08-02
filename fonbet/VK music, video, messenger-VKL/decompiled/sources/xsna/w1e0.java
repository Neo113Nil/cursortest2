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
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ProgressContent.kt */
/* loaded from: classes18.dex */
public final class w1e0 implements yah0 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        gzs gzsVar3;
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-223925015);
        if ((i & 6) == 0) {
            gzsVar3 = gzsVar;
            i2 = (M.y(gzsVar3) ? 4 : 2) | i;
        } else {
            gzsVar3 = gzsVar;
            i2 = i;
        }
        int i3 = i & 24576;
        q630.a aVar3 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar3) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 8195) != 8194)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-223925015, i2, -1, "com.vk.design.demo.presentation.screens.ProgressContent.Content (ProgressContent.kt:42)");
            }
            q630 f = txj0.f(aVar3, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Progress", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            muv0.h(a2, null, null, null, null, TopBar$Before.e.a.a(b, null, gzsVar3, null, null, null, M, 1572872 | ((i2 << 6) & 896), 58), null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8158);
            djn0.a(true, true, M, 438, 0);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = androidx.compose.runtime.k.b(Float.valueOf(0.1f));
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            float f2 = 16;
            bev0.a(((Number) wh50Var.getValue()).floatValue(), 48, 4, 0L, M, txj0.f(s200.D(aVar3, f2), 1.0f));
            q630 f3 = txj0.f(s200.D(aVar3, f2), 1.0f);
            Object x2 = M.x();
            if (x2 == obj) {
                x2 = new l140(9);
                M.R(x2);
            }
            izs izsVar2 = (izs) x2;
            Object x3 = M.x();
            if (x3 == obj) {
                x3 = new ko0(2, wh50Var);
                M.R(x3);
            }
            ae2.a(438, 0, M, izsVar2, (izs) x3, f3);
            q630 f4 = txj0.f(aVar3, 1.0f);
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.h(4, dt1.a.o), dt1.a.k, M, 6);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, f4);
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
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            qzu0.a.getClass();
            lg90 O0 = qzu0.O0(M);
            ButtonSize buttonSize = ButtonSize.Small;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Negative;
            Object x4 = M.x();
            if (x4 == obj) {
                x4 = new s26(1, wh50Var);
                M.R(x4);
            }
            bhu0.e((gzs) x4, buttonSize, buttonStyle, buttonAppearance, null, null, false, false, O0, null, null, "", null, null, null, null, false, null, null, null, M, 1073745334, 384, 0, 4189680);
            lg90 a4 = qzu0.a(M);
            ButtonAppearance buttonAppearance2 = ButtonAppearance.Positive;
            Object x5 = M.x();
            if (x5 == obj) {
                x5 = new v1e0(0, wh50Var);
                M.R(x5);
            }
            aVar2 = M;
            bhu0.e((gzs) x5, buttonSize, buttonStyle, buttonAppearance2, null, null, false, false, a4, null, null, "", null, null, null, null, false, null, null, null, aVar2, 1073745334, 384, 0, 4189680);
            if (kr.f(aVar2)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new u26(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }
}
