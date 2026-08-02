package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: AboutAppUnverifiedContent.kt */
/* loaded from: classes6.dex */
public final class o3 {
    public static final void a(final int i, androidx.compose.runtime.a aVar, gzs gzsVar, final q630 q630Var, boolean z) {
        final gzs gzsVar2 = gzsVar;
        final boolean z2 = z;
        androidx.compose.runtime.a M = aVar.M(2116311410);
        int i2 = i | (M.l(z2) ? 4 : 2) | (M.y(gzsVar2) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2116311410, i2, -1, "com.vk.superapp.presentation.about.compose.AboutAppUnverifiedContent (AboutAppUnverifiedContent.kt:30)");
            }
            long j = wlb0.h(M).getBackground().g;
            e.a aVar2 = androidx.compose.ui.graphics.e.a;
            q630 m = hr80.m(q630Var, j, aVar2);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            k9q0.w(M, c, dVar);
            q630.a aVar4 = q630.a.a;
            float f = 12;
            float f2 = 16;
            q630 m2 = hr80.m(rte0.d(s200.E(txj0.f(aVar4, 1.0f), f2, f), vog0.b(10)), wlb0.h(M).getBackground().a, aVar2);
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.k, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, m2);
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
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            String N = d370.N(R.string.apps_about_unverified_warning_text, 0, M);
            q630 D3 = s200.D(aVar4, f);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            yqv0.c(N, D3.g(new xpy(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true)).g(new gor0(dt1.a.l)), wlb0.h(M).getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).m0, M, 0, 0, 8184);
            vjw.a(pg90.a(R.drawable.apps_about_app_unverified_icon, 0, M), null, txj0.v(new gor0(dt1.a.m), 74), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 56, 120);
            M.G();
            q630 H = s200.H(txj0.f(aVar4, 1.0f), f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, f2, 2);
            String N2 = d370.N(R.string.apps_about_unverified_button_text, 0, M);
            ButtonSize buttonSize = ButtonSize.Large;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            boolean z3 = (i2 & 112) == 32;
            Object x = M.x();
            if (z3 || x == a.C0011a.a) {
                x = new m3(0, gzsVar);
                M.R(x);
            }
            gzsVar2 = gzsVar;
            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, H, null, false, false, null, null, null, N2, null, null, null, null, z, null, null, null, M, 28080, (i2 << 21) & 29360128, 0, 4059104);
            z2 = z;
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(i, gzsVar2, q630Var, z2) { // from class: xsna.n3
                public final /* synthetic */ boolean b;
                public final /* synthetic */ gzs c;
                public final /* synthetic */ q630 d;

                {
                    this.b = z2;
                    this.c = gzsVar2;
                    this.d = q630Var;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o3.a(ne7.I(385), (androidx.compose.runtime.a) obj, this.c, this.d, this.b);
                    return s3q0.a;
                }
            };
        }
    }
}
