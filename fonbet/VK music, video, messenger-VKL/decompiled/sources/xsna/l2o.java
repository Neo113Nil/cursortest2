package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SeparatorAppearance;
import com.vk.core.compose.component.defaults.SeparatorDpi;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.donut.design.view.reaction.DonutReactionButtonView;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: DonutReactionButtonContent.kt */
/* loaded from: classes18.dex */
public final class l2o implements yah0 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        gzs gzsVar3;
        gzs gzsVar4;
        androidx.compose.runtime.a M = aVar.M(-1305210279);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar2) ? 32 : 16;
        }
        int i3 = i & 24576;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73747 & i2) != 73746)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1305210279, i2, -1, "com.vk.design.demo.presentation.screens.DonutReactionButtonContent.Content (DonutReactionButtonContent.kt:49)");
            }
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = androidx.compose.runtime.i.a(5);
                M.R(x);
            }
            rg50 rg50Var = (rg50) x;
            Object x2 = M.x();
            if (x2 == obj) {
                x2 = androidx.compose.runtime.k.b(Boolean.TRUE);
                M.R(x2);
            }
            wh50 wh50Var = (wh50) x2;
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
            gzs gzsVar5 = null;
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
            int i4 = i2;
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            b(gzsVar, gzsVar2, M, (i4 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i4 >> 9) & 896));
            float f = 16;
            q630 D2 = s200.D(p490.D(txj0.d(txj0.x(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 717, 1, aVar2), 1.0f), p490.x(M), 14), f);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(f), dt1.a.n, M, 6);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c2 = qri.c(M, D2);
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
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            djn0.a(true, false, M, 54, 2);
            float f2 = 8;
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(f2), dt1.a.l, M, 54);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D4 = M.D();
            q630 c3 = qri.c(M, aVar2);
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
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            if (((Boolean) wh50Var.getValue()).booleanValue()) {
                M.K(1070520594);
                Object x3 = M.x();
                if (x3 == obj) {
                    x3 = new com.vk.movika.sdk.android.defaultplayer.interactive.b(14);
                    M.R(x3);
                }
                M.j();
                gzsVar3 = (gzs) x3;
            } else {
                M.K(1070533396);
                M.j();
                gzsVar3 = null;
            }
            o2o.a(null, null, gzsVar3, null, M, 6, 10);
            Integer valueOf2 = Integer.valueOf(rg50Var.getIntValue());
            if (((Boolean) wh50Var.getValue()).booleanValue()) {
                M.K(1070696581);
                Object x4 = M.x();
                if (x4 == obj) {
                    x4 = new p3h(rg50Var, 11);
                    M.R(x4);
                }
                M.j();
                gzsVar4 = (gzs) x4;
            } else {
                M.K(1070721876);
                M.j();
                gzsVar4 = null;
            }
            o2o.a(valueOf2, null, gzsVar4, null, M, 0, 10);
            if (((Boolean) wh50Var.getValue()).booleanValue()) {
                M.K(1070878706);
                Object x5 = M.x();
                if (x5 == obj) {
                    x5 = new h13(12);
                    M.R(x5);
                }
                gzsVar5 = (gzs) x5;
            } else {
                M.K(1070891508);
            }
            M.j();
            o2o.a(5500, null, gzsVar5, null, M, 6, 10);
            M.G();
            f9t.e(txj0.h(aVar2, f2), M, 6);
            SeparatorDpi separatorDpi = SeparatorDpi.At1x;
            SeparatorAppearance separatorAppearance = SeparatorAppearance.Primary;
            ijv0.c(separatorDpi, separatorAppearance, txj0.f(aVar2, 1.0f), M, 438, 0);
            djn0.a(false, true, M, 390, 1);
            boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
            int intValue = rg50Var.getIntValue();
            Object x6 = M.x();
            if (x6 == obj) {
                x6 = new cnh(rg50Var, 4);
                M.R(x6);
            }
            c(intValue, ((i4 >> 6) & 7168) | 384, M, (gzs) x6, booleanValue);
            f9t.e(txj0.h(aVar2, f2), M, 6);
            ijv0.c(separatorDpi, separatorAppearance, txj0.f(aVar2, 1.0f), M, 438, 0);
            boolean booleanValue2 = ((Boolean) wh50Var.getValue()).booleanValue();
            Object x7 = M.x();
            if (x7 == obj) {
                x7 = new b2k(1, wh50Var);
                M.R(x7);
            }
            eku0.d("Clickable", (gzs) x7, null, booleanValue2, null, false, false, M, 54, 116);
            M = M;
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new k2o(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    public final void b(gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        lg90 c;
        androidx.compose.runtime.a M = aVar.M(-54568717);
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
                androidx.compose.runtime.b.f(-54568717, i3, -1, "com.vk.design.demo.presentation.screens.DonutReactionButtonContent.DonutReactionButtonTopBar (DonutReactionButtonContent.kt:157)");
            }
            aVar2 = M;
            TopBar$Middle.Text a = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Donut reaction button", null, null, null, null, aVar2, 196614, 30), null, null, null, aVar2, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b = or.b(aVar2, -45049119, R.drawable.vk_icon_arrow_left_outline_28, aVar2, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            TopBar$Before.e a2 = TopBar$Before.e.a.a(b, null, gzsVar, null, null, null, aVar2, 1572872 | ((i3 << 6) & 896), 58);
            if (((Boolean) aVar2.r(vsx.b)).booleanValue()) {
                aVar2.K(-900912993);
                c = jh.c(qzu0.a, aVar2);
            } else {
                aVar2.K(-900912160);
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
            s.d = new z9k(i, 1, this, gzsVar, gzsVar2);
        }
    }

    public final void c(final int i, final int i2, androidx.compose.runtime.a aVar, final gzs gzsVar, final boolean z) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(490697945);
        if ((i2 & 6) == 0) {
            i3 = (M.l(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.o(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.y(gzsVar) ? 256 : 128;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(490697945, i3, -1, "com.vk.design.demo.presentation.screens.DonutReactionButtonContent.DonutReactionViewImplementation (DonutReactionButtonContent.kt:114)");
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
            int i4 = i3 & 14;
            boolean z2 = i4 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new swb(z, 1);
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean z3 = i4 == 4;
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new izs() { // from class: xsna.f2o
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        ((DonutReactionButtonView) obj).setOnClickListener(z ? new xv0(9) : null);
                        return s3q0.a;
                    }
                };
                M.R(x2);
            }
            ae2.a(0, 2, M, izsVar, (izs) x2, null);
            int i5 = i3 & 112;
            int i6 = i3 & 896;
            boolean z4 = (i5 == 32) | (i4 == 4) | (i6 == 256);
            Object x3 = M.x();
            if (z4 || x3 == c0012a) {
                x3 = new izs() { // from class: xsna.g2o
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        DonutReactionButtonView donutReactionButtonView = new DonutReactionButtonView((Context) obj, null, 6);
                        donutReactionButtonView.setCount(Integer.valueOf(i));
                        donutReactionButtonView.setOnClickListener(z ? gzsVar : null);
                        return donutReactionButtonView;
                    }
                };
                M.R(x3);
            }
            izs izsVar2 = (izs) x3;
            boolean z5 = (i6 == 256) | (i5 == 32) | (i4 == 4);
            Object x4 = M.x();
            if (z5 || x4 == c0012a) {
                x4 = new izs() { // from class: xsna.h2o
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        DonutReactionButtonView donutReactionButtonView = (DonutReactionButtonView) obj;
                        donutReactionButtonView.setCount(Integer.valueOf(i));
                        donutReactionButtonView.setOnClickListener(z ? gzsVar : null);
                        return s3q0.a;
                    }
                };
                M.R(x4);
            }
            ae2.a(0, 2, M, izsVar2, (izs) x4, null);
            boolean z6 = i4 == 4;
            Object x5 = M.x();
            if (z6 || x5 == c0012a) {
                x5 = new xum(z, 1);
                M.R(x5);
            }
            izs izsVar3 = (izs) x5;
            boolean z7 = i4 == 4;
            Object x6 = M.x();
            if (z7 || x6 == c0012a) {
                x6 = new izs() { // from class: xsna.i2o
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        ((DonutReactionButtonView) obj).setOnClickListener(z ? new vi0(16) : null);
                        return s3q0.a;
                    }
                };
                M.R(x6);
            }
            ae2.a(0, 2, M, izsVar3, (izs) x6, null);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.j2o
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i2 | 1);
                    l2o.this.c(i, I, (androidx.compose.runtime.a) obj, gzsVar, z);
                    return s3q0.a;
                }
            };
        }
    }
}
