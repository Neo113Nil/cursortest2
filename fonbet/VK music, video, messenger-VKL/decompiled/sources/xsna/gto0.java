package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: TileScreenContent.kt */
/* loaded from: classes18.dex */
public final class gto0 implements yah0 {
    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        gzs gzsVar3;
        x5 x5Var2;
        lg90 c;
        androidx.compose.runtime.a M = aVar.M(-926364377);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            gzsVar3 = gzsVar2;
            i2 |= M.y(gzsVar3) ? 32 : 16;
        } else {
            gzsVar3 = gzsVar2;
        }
        if ((i & 384) == 0) {
            x5Var2 = x5Var;
            i2 |= M.y(x5Var2) ? 256 : 128;
        } else {
            x5Var2 = x5Var;
        }
        int i3 = i & 24576;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 8339) != 8338)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-926364377, i2, -1, "com.vk.design.demo.presentation.screens.tile.TileScreenContent.Content (TileScreenContent.kt:24)");
            }
            q630 d = txj0.d(aVar2, 1.0f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, d);
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
            k9q0.w(M, c2, cri.a.d);
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Tile", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            TopBar$Before.e a3 = TopBar$Before.e.a.a(m200.m(M), null, gzsVar, null, null, null, M, 1572872 | ((i2 << 6) & 896), 58);
            if (((Boolean) M.r(vsx.b)).booleanValue()) {
                M.K(-12120899);
                c = jh.c(qzu0.a, M);
            } else {
                M.K(-12120066);
                c = j8.c(qzu0.a, M);
            }
            d.c.C0760d a4 = d.c.C0760d.a.a(c, null, gzsVar3, null, null, null, M, 1572872 | ((i2 << 3) & 896), 58);
            M.K(-375445059);
            lg90 q = m200.q(M);
            M.j();
            muv0.h(a2, null, null, null, null, a3, d.a.a(a4, d.b.a.C0757a.a(q, null, x5Var2, null, null, null, M, 12582920 | (i2 & 896), Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), null, null, M, 24576, 12), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8094);
            M = M;
            M.K(-375153907);
            co20.a.g(null, M, 48);
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vwq(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }
}
