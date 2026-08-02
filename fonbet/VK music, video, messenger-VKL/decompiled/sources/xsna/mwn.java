package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import com.vk.core.compose.component.defaults.SeparatorAppearance;
import com.vk.core.compose.component.defaults.SeparatorDpi;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.donut.price.model.template.item.DonutPriceTemplateItem;
import com.vk.donut.price.model.template.style.DonutPriceTemplateItemStyle;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.libvideo.design.compose.video.videocard.VideoCardViewState;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.mno0;
import xsna.q630;
import xsna.rmw;
import xsna.ty6;

/* compiled from: DonutBadgeContent.kt */
/* loaded from: classes18.dex */
public final class mwn implements yah0 {
    @Override // xsna.yah0
    public final void a(final gzs gzsVar, final gzs gzsVar2, final x5 x5Var, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        gzs gzsVar3;
        int i2;
        gzs gzsVar4;
        x5 x5Var2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(-759808151);
        if ((i & 6) == 0) {
            gzsVar3 = gzsVar;
            i2 = (M.y(gzsVar3) ? 4 : 2) | i;
        } else {
            gzsVar3 = gzsVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            gzsVar4 = gzsVar2;
            i2 |= M.y(gzsVar4) ? 32 : 16;
        } else {
            gzsVar4 = gzsVar2;
        }
        if ((i & 384) == 0) {
            x5Var2 = x5Var;
            i2 |= M.y(x5Var2) ? 256 : 128;
        } else {
            x5Var2 = x5Var;
        }
        int i4 = i & 24576;
        q630.a aVar2 = q630.a.a;
        if (i4 == 0) {
            i2 |= M.J(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        int i5 = i2;
        if (M.t(i5 & 1, (73875 & i5) != 73874)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-759808151, i5, -1, "com.vk.design.demo.presentation.screens.DonutBadgeContent.Content (DonutBadgeContent.kt:63)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            boolean l = M.l(ylu0Var.s());
            Object x = M.x();
            if (l || x == a.C0011a.a) {
                i3 = 0;
                x = new DonutPriceTemplate(e43.l(new DonutPriceTemplateItem.StrikethroughText("500", DonutPriceTemplateItemStyle.SECONDARY), new DonutPriceTemplateItem.PlainText(" 300 ₽/мес")));
                M.R(x);
            } else {
                i3 = 0;
            }
            us2 a = z1o.a((DonutPriceTemplate) x, null, M, 1);
            q630 d = txj0.d(aVar2, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, i3, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d, ylu0Var2.getBackground().a, androidx.compose.ui.graphics.e.a);
            dt1.a.getClass();
            ty6.a aVar3 = dt1.a.o;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, aVar3, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            b(gzsVar3, gzsVar4, x5Var2, M, ((i5 >> 6) & 7168) | (i5 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW));
            float f = 16;
            q630 D2 = s200.D(p490.D(txj0.d(txj0.x(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 717, 1, aVar2), 1.0f), p490.x(M), 14), f);
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
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            djn0.a(true, false, M, 54, 2);
            float f2 = 8;
            androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(f2), dt1.a.l, M, 54);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D4 = M.D();
            q630 c3 = qri.c(M, aVar2);
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
            k9q0.w(M, a4, cVar);
            k9q0.w(M, D4, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            own.a(ws2.e("300 ₽/мес"), null, null, 0L, M, 0, 14);
            own.a(a, null, null, 0L, M, 0, 14);
            M.G();
            own.a(ws2.e("Поддержать за 300 ₽/мес"), null, null, 0L, M, 0, 14);
            f9t.e(txj0.h(aVar2, f2), M, 6);
            SeparatorDpi separatorDpi = SeparatorDpi.At1x;
            SeparatorAppearance separatorAppearance = SeparatorAppearance.Primary;
            ijv0.c(separatorDpi, separatorAppearance, txj0.f(aVar2, 1.0f), M, 438, 0);
            djn0.a(false, true, M, 390, 1);
            c((i5 >> 15) & 14, M);
            f9t.e(txj0.h(aVar2, f2), M, 6);
            ijv0.c(separatorDpi, separatorAppearance, txj0.f(aVar2, 1.0f), M, 438, 0);
            float f3 = 2;
            q630 D5 = s200.D(new gcv(aVar3), f3);
            androidx.compose.foundation.layout.k a5 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(f3), dt1.a.k, M, 6);
            int hashCode4 = Long.hashCode(n34.n(M));
            sy90 D6 = M.D();
            q630 c4 = qri.c(M, D5);
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
            k9q0.w(M, a5, cVar);
            k9q0.w(M, D6, eVar);
            ur.d(hashCode4, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar);
            rnu0.c(ContentBadgeSize.Small, ContentBadgeMode.Primary, ContentBadgeAppearance.Design.Negative, null, null, null, "Example", null, null, null, false, null, false, null, M, 1573302, 0, 16312);
            M = M;
            M.G();
            d(a, M, (i5 >> 12) & 112);
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
            s.d = new wzs() { // from class: xsna.lwn
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    mwn.this.a(gzsVar, gzsVar2, x5Var, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void b(gzs gzsVar, gzs gzsVar2, x5 x5Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        lg90 c;
        androidx.compose.runtime.a M = aVar.M(184428023);
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
                androidx.compose.runtime.b.f(184428023, i3, -1, "com.vk.design.demo.presentation.screens.DonutBadgeContent.DonutBadgeTopBar (DonutBadgeContent.kt:158)");
            }
            aVar2 = M;
            TopBar$Middle.Text a = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Donut badge", null, null, null, null, aVar2, 196614, 30), null, null, null, aVar2, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b = or.b(aVar2, -45049119, R.drawable.vk_icon_arrow_left_outline_28, aVar2, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            TopBar$Before.e a2 = TopBar$Before.e.a.a(b, null, gzsVar, null, null, null, aVar2, 1572872 | ((i3 << 6) & 896), 58);
            if (((Boolean) aVar2.r(vsx.b)).booleanValue()) {
                aVar2.K(1141687779);
                c = jh.c(qzu0.a, aVar2);
            } else {
                aVar2.K(1141688612);
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
            s.d = new qqd(this, gzsVar, gzsVar2, x5Var, i, 1);
        }
    }

    public final void c(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1408409706);
        if ((i & 6) == 0) {
            i2 = (M.J(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 1;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1408409706, i2, -1, "com.vk.design.demo.presentation.screens.DonutBadgeContent.DonutBadgeViewImplementation (DonutBadgeContent.kt:127)");
            }
            a.j g = androidx.compose.foundation.layout.a.g(8);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(g, dt1.a.l, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630.a.a);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new ob(21);
                M.R(x);
            }
            ae2.a(6, 6, M, (izs) x, null, null);
            Object x2 = M.x();
            if (x2 == c0012a) {
                DonutPriceTemplate donutPriceTemplate = new DonutPriceTemplate(e43.l(new DonutPriceTemplateItem.StrikethroughText("500", DonutPriceTemplateItemStyle.SECONDARY), new DonutPriceTemplateItem.PlainText(" 300 ₽/мес")));
                M.R(donutPriceTemplate);
                x2 = donutPriceTemplate;
            }
            DonutPriceTemplate donutPriceTemplate2 = (DonutPriceTemplate) x2;
            boolean y = M.y(donutPriceTemplate2);
            Object x3 = M.x();
            if (y || x3 == c0012a) {
                x3 = new kdn(donutPriceTemplate2, i3);
                M.R(x3);
            }
            ae2.a(0, 6, M, (izs) x3, null, null);
            M.G();
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new qb(23);
                M.R(x4);
            }
            ae2.a(6, 6, M, (izs) x4, null, null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new loa(this, i, 1);
        }
    }

    public final void d(us2 us2Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1356467791);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (M.J(us2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1356467791, i2, -1, "com.vk.design.demo.presentation.screens.DonutBadgeContent.VideoCardViewWithDonut (DonutBadgeContent.kt:174)");
            }
            PreviewViewState.DurationBadge durationBadge = new PreviewViewState.DurationBadge(new mno0.i("22:34"), false, null, 6);
            PreviewViewState.l lVar = new PreviewViewState.l(new mno0.i("300 ₽/мес"), new mno0.i(""));
            VkColorToken vkColorToken = VkColorToken.AccentBlue;
            List l = e43.l(new VideoCardViewState(PreviewViewState.a0.b(null, true, durationBadge, lVar, null, null, null, null, null, null, vkColorToken, 1008), new VideoCardViewState.c("", new VideoMetaViewState(new VideoMetaViewState.i(new mno0.i("Рисуем постер через маски в Figma"), 2), new VideoMetaViewState.a(null, null, null, false, new mno0.i("123K"), new mno0.i("1 час назад"), null, 0, 207), i3), new rmw.d(R.drawable.vk_icon_more_vertical_24), new mno0.g(R.string.accessibility_actions))), new VideoCardViewState(PreviewViewState.a0.b(null, true, new PreviewViewState.DurationBadge(new mno0.i("22:34"), false, null, 6), new PreviewViewState.l(new mno0.a(new o4e(us2Var, 13)), new mno0.i("")), null, null, null, null, null, null, vkColorToken, 1008), new VideoCardViewState.c("", new VideoMetaViewState(new VideoMetaViewState.i(new mno0.i("Рисуем постер через маски в Figma"), 2), new VideoMetaViewState.a(null, null, null, false, new mno0.i("123K"), new mno0.i("1 час назад"), null, 0, 207), 4), new rmw.d(R.drawable.vk_icon_more_vertical_24), new mno0.g(R.string.accessibility_actions))));
            q630 f = txj0.f(q630.a.a, 1.0f);
            a.j g = androidx.compose.foundation.layout.a.g(24);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            Iterator a2 = yu50.a(M, c, cri.a.d, 1595695220, l);
            while (a2.hasNext()) {
                com.vk.libvideo.design.compose.video.videocard.a.d((VideoCardViewState) a2.next(), null, M, 0, 2);
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fo7(this, us2Var, i, 1);
        }
    }
}
