package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.ecomm.design.view.DiscreteProgressBar;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: MarketDiscreteProgressBarContent.kt */
/* loaded from: classes18.dex */
public final class vw00 implements yah0 {
    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        vw00 vw00Var = this;
        androidx.compose.runtime.a M = aVar.M(-291245183);
        if ((i & 6) == 0) {
            i2 = i | (M.y(gzsVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 196608) == 0) {
            i2 |= M.J(vw00Var) ? 131072 : 65536;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (65539 & i3) != 65538)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-291245183, i3, -1, "com.vk.design.demo.presentation.screens.MarketDiscreteProgressBarContent.Content (MarketDiscreteProgressBarContent.kt:42)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Discrete Progress Bar", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            muv0.h(a2, null, null, null, null, TopBar$Before.e.a.a(b, null, gzsVar, null, null, null, M, 1572872 | ((i3 << 6) & 896), 58), null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8158);
            M = M;
            djn0.a(false, true, M, 438, 0);
            vw00Var = this;
            vw00Var.b(null, M, (i3 >> 12) & 112);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new tw00(vw00Var, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        Object obj;
        kg50 kg50Var;
        kg50 kg50Var2;
        wh50 wh50Var;
        LayoutNode.a aVar3;
        kg50 kg50Var3;
        androidx.compose.runtime.a M = aVar.M(-180609136);
        int i2 = i | 6;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-180609136, i2, -1, "com.vk.design.demo.presentation.screens.MarketDiscreteProgressBarContent.Content (MarketDiscreteProgressBarContent.kt:66)");
            }
            final int H = f870.H(wlb0.h(M).getText().a);
            final int H2 = f870.H(wlb0.h(M).b().a);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            final wh50 wh50Var2 = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.d.a(1.0f);
                M.R(x2);
            }
            final kg50 kg50Var4 = (kg50) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = androidx.compose.runtime.d.a(3.0f);
                M.R(x3);
            }
            final kg50 kg50Var5 = (kg50) x3;
            q630.a aVar4 = q630.a.a;
            q630 m = hr80.m(txj0.f(aVar4, 1.0f), wlb0.h(M).getBackground().g, androidx.compose.ui.graphics.e.a);
            float f = kqu0.b;
            float f2 = kqu0.c;
            q630 E = s200.E(m, f, f2);
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new j60(27);
                M.R(x4);
            }
            izs izsVar = (izs) x4;
            boolean o = M.o(H) | M.o(H2);
            Object x5 = M.x();
            if (o || x5 == c0012a) {
                obj = new izs() { // from class: xsna.uw00
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        DiscreteProgressBar discreteProgressBar = (DiscreteProgressBar) obj2;
                        discreteProgressBar.setActiveColor(H);
                        discreteProgressBar.setInactiveColor(H2);
                        discreteProgressBar.setCumulative(((Boolean) wh50Var2.getValue()).booleanValue());
                        int progress = discreteProgressBar.getProgress();
                        kg50 kg50Var6 = kg50Var4;
                        if (progress != an10.b(kg50Var6.getFloatValue())) {
                            discreteProgressBar.setProgress(an10.b(kg50Var6.getFloatValue()));
                        }
                        int max = discreteProgressBar.getMax();
                        kg50 kg50Var7 = kg50Var5;
                        if (max != an10.b(kg50Var7.getFloatValue())) {
                            discreteProgressBar.setMax(an10.b(kg50Var7.getFloatValue()));
                        }
                        return s3q0.a;
                    }
                };
                kg50Var = kg50Var4;
                kg50Var2 = kg50Var5;
                wh50Var = wh50Var2;
                M.R(obj);
            } else {
                kg50Var2 = kg50Var5;
                obj = x5;
                wh50Var = wh50Var2;
                kg50Var = kg50Var4;
            }
            kg50 kg50Var6 = kg50Var2;
            ae2.a(6, 0, M, izsVar, (izs) obj, E);
            q630 E2 = s200.E(txj0.f(aVar4, 1.0f), f, f2);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E2);
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
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            kg50 kg50Var7 = kg50Var;
            q630 c2 = qri.c(M, aVar4);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
            Object x6 = M.x();
            if (x6 == c0012a) {
                x6 = new yc4(1, wh50Var);
                M.R(x6);
            }
            zov0.a(booleanValue, (izs) x6, null, false, null, M, 48, 28);
            f9t.e(txj0.v(aVar4, kqu0.v), M, 0);
            yqv0.c("cumulative dots", null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, M, 6, 0, 16382);
            M.G();
            ty6.a aVar6 = dt1.a.o;
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, aVar6, M, 48);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, aVar4);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                aVar3 = aVar5;
                M.I(aVar3);
            } else {
                aVar3 = aVar5;
                M.f();
            }
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            LayoutNode.a aVar7 = aVar3;
            yqv0.c("currentDots " + an10.b(kg50Var7.getFloatValue()), null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, M, 0, 0, 16382);
            float floatValue = kg50Var7.getFloatValue();
            Object x7 = M.x();
            if (x7 == c0012a) {
                kg50Var3 = kg50Var7;
                x7 = new cqv(kg50Var3, 10);
                M.R(x7);
            } else {
                kg50Var3 = kg50Var7;
            }
            hkv0.c(floatValue, (izs) x7, null, false, null, new awf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kg50Var6.getFloatValue()), 0, null, M, 48, 476);
            M.G();
            androidx.compose.foundation.layout.c a4 = androidx.compose.foundation.layout.b.a(mVar, aVar6, M, 48);
            int hashCode4 = Long.hashCode(n34.n(M));
            sy90 D4 = M.D();
            q630 c4 = qri.c(M, aVar4);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar7);
            } else {
                M.f();
            }
            k9q0.w(M, a4, cVar);
            k9q0.w(M, D4, eVar);
            ur.d(hashCode4, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar);
            kg50 kg50Var8 = kg50Var3;
            yqv0.c("maxDots " + an10.b(kg50Var6.getFloatValue()), null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, M, 0, 0, 16382);
            float floatValue2 = kg50Var6.getFloatValue();
            Object x8 = M.x();
            if (x8 == c0012a) {
                x8 = new a5(12, kg50Var6, kg50Var8);
                M.R(x8);
            }
            aVar2 = M;
            hkv0.c(floatValue2, (izs) x8, null, false, null, new awf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f), 12, null, aVar2, 1572912, 412);
            if (kr.f(aVar2)) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar4;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new bo7(this, q630Var2, i, 3);
        }
    }
}
