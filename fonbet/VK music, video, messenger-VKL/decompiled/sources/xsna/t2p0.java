package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.button.tool.ToolButton$Appearance;
import com.vk.core.compose.component.button.tool.ToolButton$Mode;
import com.vk.core.compose.component.button.tool.ToolButton$TextPosition;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.view.components.button.tool.VkToolButton;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ToolButtonScreenContent.kt */
/* loaded from: classes18.dex */
public final class t2p0 implements yah0 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        gzs gzsVar3;
        int i2;
        lg90 c;
        androidx.compose.runtime.a M = aVar.M(634723081);
        if ((i & 6) == 0) {
            gzsVar3 = gzsVar;
            i2 = (M.y(gzsVar3) ? 4 : 2) | i;
        } else {
            gzsVar3 = gzsVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(x5Var) ? 256 : 128;
        }
        int i3 = i & 24576;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73875 & i2) != 73874)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(634723081, i2, -1, "com.vk.design.demo.presentation.screens.ToolButtonScreenContent.Content (ToolButtonScreenContent.kt:52)");
            }
            q630 f = txj0.f(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, f);
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
            k9q0.w(M, c2, dVar);
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Tool Button", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            TopBar$Before.e a3 = TopBar$Before.e.a.a(m200.m(M), null, gzsVar3, null, null, null, M, 1572872 | ((i2 << 6) & 896), 58);
            if (((Boolean) M.r(vsx.b)).booleanValue()) {
                M.K(-117689877);
                c = jh.c(qzu0.a, M);
            } else {
                M.K(-117689044);
                c = j8.c(qzu0.a, M);
            }
            d.c.C0760d a4 = d.c.C0760d.a.a(c, null, gzsVar2, null, null, null, M, 1572872 | ((i2 << 3) & 896), 58);
            M.K(646884911);
            lg90 q = m200.q(M);
            M.j();
            muv0.h(a2, null, null, null, null, a3, d.a.a(a4, d.b.a.C0757a.a(q, null, x5Var, null, null, null, M, 12582920 | (i2 & 896), Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), null, null, M, 24576, 12), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8094);
            djn0.a(true, true, M, 438, 0);
            q630 D2 = p490.D(txj0.f(aVar2, 1.0f), p490.x(M), 14);
            androidx.compose.foundation.layout.c a5 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.o, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, D2);
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
            k9q0.w(M, a5, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            Object[] objArr = new Object[0];
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = new iud0(7);
                M.R(x);
            }
            wh50 wh50Var = (wh50) crx0.A(objArr, (gzs) x, M, 48);
            int i4 = (i2 >> 12) & 112;
            c(((Boolean) wh50Var.getValue()).booleanValue(), M, i4);
            b(((Boolean) wh50Var.getValue()).booleanValue(), M, i4);
            boolean J = M.J(wh50Var);
            Object x2 = M.x();
            if (J || x2 == obj) {
                x2 = new m26(2, wh50Var);
                M.R(x2);
            }
            eku0.d("Unscaled font", (gzs) x2, null, ((Boolean) wh50Var.getValue()).booleanValue(), null, false, false, M, 6, 116);
            M = M;
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new pym0(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    public final void b(final boolean z, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(1951112599);
        int i2 = 4;
        int i3 = (i & 6) == 0 ? i | (M.l(z) ? 4 : 2) : i;
        int i4 = 0;
        if (M.t(i3 & 1, (i3 & 3) != 2)) {
            int i5 = -1;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1951112599, i3, -1, "com.vk.design.demo.presentation.screens.ToolButtonScreenContent.ComposeContent (ToolButtonScreenContent.kt:161)");
            }
            q630.a aVar2 = q630.a.a;
            rzo0.a(54, 0, M, "Compose", s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 1, aVar2));
            M.K(-1881494440);
            for (ToolButton$Appearance toolButton$Appearance : ToolButton$Appearance.h()) {
                M.K(-1881492890);
                for (ToolButton$Mode toolButton$Mode : ToolButton$Mode.h()) {
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c = qri.c(M, aVar2);
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
                    k9q0.w(M, a, cri.a.f);
                    k9q0.w(M, D, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c, cri.a.d);
                    M.K(-114815298);
                    for (ToolButton$TextPosition toolButton$TextPosition : ToolButton$TextPosition.h()) {
                        q630 D2 = s200.D(aVar2, i2);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1833469722, i4, i5, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-UserOutline28> (VkSdkIcons.kt:3594)");
                        }
                        lg90 b = or.b(M, 1797559433, R.drawable.vk_icon_user_outline_28, M, i4);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        Object x = M.x();
                        if (x == a.C0011a.a) {
                            x = new e3c0(8);
                            M.R(x);
                        }
                        int i6 = (i3 << 9) & 7168;
                        int i7 = i3;
                        ToolButton$Mode toolButton$Mode2 = toolButton$Mode;
                        xsv0.d((gzs) x, toolButton$Mode2, toolButton$Appearance, D2, toolButton$TextPosition, null, b, null, "Button", false, null, z, null, M, 807406598, i6, 23968);
                        toolButton$Mode = toolButton$Mode2;
                        i2 = i2;
                        i4 = i4;
                        i3 = i7;
                        i5 = i5;
                        aVar2 = aVar2;
                    }
                    M.j();
                    M.G();
                }
                M.j();
            }
            M.j();
            M.K(1796189131);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.r2p0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    t2p0.this.b(z, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public final void c(final boolean z, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(390200454);
        int i2 = (i & 6) == 0 ? (M.l(z) ? 4 : 2) | i : i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(390200454, i2, -1, "com.vk.design.demo.presentation.screens.ToolButtonScreenContent.ViewContent (ToolButtonScreenContent.kt:99)");
            }
            q630.a aVar2 = q630.a.a;
            rzo0.a(54, 0, M, "View", s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 1, aVar2));
            M.K(1320487949);
            for (VkToolButton.Appearance appearance : VkToolButton.Appearance.h()) {
                M.K(1320489747);
                for (VkToolButton.Mode mode : VkToolButton.Mode.h()) {
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c = qri.c(M, aVar2);
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
                    k9q0.w(M, a, cri.a.f);
                    k9q0.w(M, D, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c, cri.a.d);
                    M.K(108217043);
                    for (VkToolButton.TextPosition textPosition : VkToolButton.TextPosition.h()) {
                        q630 D2 = s200.D(aVar2, 4);
                        boolean o = M.o(appearance.ordinal()) | M.o(mode.ordinal()) | M.o(textPosition.ordinal());
                        Object x = M.x();
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (o || x == c0012a) {
                            x = new rte(appearance, mode, textPosition, 8);
                            M.R(x);
                        }
                        izs izsVar = (izs) x;
                        boolean z2 = (i2 & 14) == 4;
                        Object x2 = M.x();
                        if (z2 || x2 == c0012a) {
                            x2 = new p4v(z, 1);
                            M.R(x2);
                        }
                        ae2.a(48, 0, M, izsVar, (izs) x2, D2);
                        mode = mode;
                    }
                    M.j();
                    M.G();
                }
                M.j();
            }
            M.j();
            M.K(-2018749860);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.s2p0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    t2p0.this.c(z, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
