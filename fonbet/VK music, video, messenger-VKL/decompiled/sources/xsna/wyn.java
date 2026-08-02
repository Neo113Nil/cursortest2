package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.donut.price.model.template.item.DonutPriceTemplateItem;
import com.vk.donut.price.model.template.style.DonutPriceTemplateItemStyle;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: DonutChipContent.kt */
/* loaded from: classes18.dex */
public final class wyn implements yah0 {
    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-633768773);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(x5Var) ? 256 : 128;
        }
        int i3 = i & 24576;
        q630.a aVar3 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73875 & i2) != 73874)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-633768773, i2, -1, "com.vk.design.demo.presentation.screens.DonutChipContent.Content (DonutChipContent.kt:48)");
            }
            xpx B = m4s.B(M);
            boolean l = M.l(wlb0.h(M).s());
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (l || x == obj) {
                x = new DonutPriceTemplate(e43.l(new DonutPriceTemplateItem.StrikethroughText("500", DonutPriceTemplateItemStyle.SECONDARY), new DonutPriceTemplateItem.PlainText(" 300 ₽/мес")));
                M.R(x);
            }
            us2 a = z1o.a((DonutPriceTemplate) x, B, M, 0);
            q630 m = hr80.m(txj0.d(aVar3, 1.0f), wlb0.h(M).getBackground().a, androidx.compose.ui.graphics.e.a);
            dt1.a.getClass();
            ty6.a aVar4 = dt1.a.o;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, aVar4, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            k9q0.w(M, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            b(gzsVar, gzsVar2, x5Var, M, ((i2 >> 6) & 7168) | (i2 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW));
            float f = 16;
            q630 D2 = s200.D(p490.D(txj0.d(txj0.x(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 717, 1, aVar3), 1.0f), p490.x(M), 14), f);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(f), dt1.a.n, M, 6);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c2 = qri.c(M, D2);
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
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            djn0.a(true, false, M, 54, 2);
            androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(8), dt1.a.l, M, 54);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D4 = M.D();
            q630 c3 = qri.c(M, aVar3);
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
            k9q0.w(M, a4, cVar);
            k9q0.w(M, D4, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            yyn.a(ws2.e("300 ₽/мес"), null, null, null, 0L, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 254);
            yyn.a(a, null, null, null, 0L, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 254);
            M.G();
            float f2 = 2;
            q630 D5 = s200.D(new gcv(aVar4), f2);
            androidx.compose.foundation.layout.k a5 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(f2), dt1.a.k, M, 6);
            int hashCode4 = Long.hashCode(n34.n(M));
            sy90 D6 = M.D();
            q630 c4 = qri.c(M, D5);
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
            k9q0.w(M, a5, cVar);
            k9q0.w(M, D6, eVar);
            ur.d(hashCode4, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar);
            rnu0.c(ContentBadgeSize.Small, ContentBadgeMode.Primary, ContentBadgeAppearance.Design.Positive, null, null, null, "Fullscreen Video Compose", null, null, null, false, null, false, null, M, 1573302, 0, 16312);
            M.G();
            M.K(1392520397);
            us2 e = ws2.e("Вам доступно");
            qzu0.a.getClass();
            lg90 I = qzu0.I(M);
            frv0 frv0Var = wlb0.l(M).v0;
            long j = wlb0.h(M).getText().r;
            Object x2 = M.x();
            if (x2 == obj) {
                x2 = new bz(20);
                M.R(x2);
            }
            aVar2 = M;
            yyn.a(e, egi0.b(aVar3, false, (izs) x2), null, I, 0L, j, frv0Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 4096, 148);
            aVar2.j();
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
            s.d = new eoj(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    public final void b(gzs gzsVar, gzs gzsVar2, x5 x5Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        lg90 c;
        androidx.compose.runtime.a M = aVar.M(-946387816);
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
                androidx.compose.runtime.b.f(-946387816, i3, -1, "com.vk.design.demo.presentation.screens.DonutChipContent.DonutChipTopBar (DonutChipContent.kt:129)");
            }
            aVar2 = M;
            TopBar$Middle.Text a = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Donut chip", null, null, null, null, aVar2, 196614, 30), null, null, null, aVar2, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b = or.b(aVar2, -45049119, R.drawable.vk_icon_arrow_left_outline_28, aVar2, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            TopBar$Before.e a2 = TopBar$Before.e.a.a(b, null, gzsVar, null, null, null, aVar2, 1572872 | ((i3 << 6) & 896), 58);
            if (((Boolean) aVar2.r(vsx.b)).booleanValue()) {
                aVar2.K(1054392324);
                c = jh.c(qzu0.a, aVar2);
            } else {
                aVar2.K(1054393157);
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
            s.d = new vyn(i, 0, this, gzsVar2, gzsVar, x5Var);
        }
    }
}
