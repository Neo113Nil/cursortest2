package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: GroupHeaderScreenContent.kt */
/* loaded from: classes18.dex */
public final class uku implements yah0 {
    public final wh50 b = androidx.compose.runtime.k.b(Boolean.FALSE);

    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        gzs gzsVar3;
        int i2;
        gzs gzsVar4;
        x5 x5Var2;
        lg90 c;
        lg90 q1;
        androidx.compose.runtime.a M = aVar.M(-1907292145);
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
                androidx.compose.runtime.b.f(-1907292145, i2, -1, "com.vk.design.demo.presentation.screens.GroupHeaderScreenContent.Content (GroupHeaderScreenContent.kt:34)");
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Group Header", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            TopBar$Before.e a3 = TopBar$Before.e.a.a(m200.m(M), null, gzsVar3, null, null, null, M, 1572872 | ((i2 << 6) & 896), 58);
            if (((Boolean) M.r(vsx.b)).booleanValue()) {
                M.K(937044881);
                c = jh.c(qzu0.a, M);
            } else {
                M.K(937045714);
                c = j8.c(qzu0.a, M);
            }
            d.c.C0760d a4 = d.c.C0760d.a.a(c, null, gzsVar4, null, null, null, M, 1572872 | ((i2 << 3) & 896), 58);
            wh50 wh50Var = this.b;
            if (((Boolean) ((zak0) wh50Var).getValue()).booleanValue()) {
                M.K(937051603);
                qzu0.a.getClass();
                q1 = qzu0.p1(M);
            } else {
                M.K(937052499);
                qzu0.a.getClass();
                q1 = qzu0.q1(M);
            }
            M.j();
            boolean z = (458752 & i2) == 131072;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new z3i(this, 18);
                M.R(x);
            }
            d.b.a a5 = d.b.a.C0757a.a(q1, null, (gzs) x, null, null, null, M, 12582920, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            M.K(-1015825231);
            lg90 q = m200.q(M);
            M.j();
            muv0.h(a2, null, null, null, null, a3, d.a.a(a4, a5, d.b.a.C0757a.a(q, null, x5Var2, null, null, null, M, 12582920 | (i2 & 896), Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), null, M, 24576, 8), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8094);
            M = M;
            M.K(-1015530855);
            boolean booleanValue = ((Boolean) ((zak0) wh50Var).getValue()).booleanValue();
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            nn20.a.b(384, M, new xpy(1.0f, true), booleanValue);
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
            s.d = new tku(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }
}
