package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: BottomActions.kt */
/* loaded from: classes14.dex */
public final class v38 {
    public static final void a(boolean z, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, int i) {
        boolean z2;
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(599153250);
        if ((i & 6) == 0) {
            z2 = z;
            i2 = (M.l(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(gzsVar2) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(599153250, i2, -1, "com.vk.antispam.view.BottomActions (BottomActions.kt:18)");
            }
            float f = 12;
            q630.a aVar3 = q630.a.a;
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 1, aVar3);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 E = ahn.E(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), "CancelButton");
            String N = d370.N(R.string.dialog_bar_spam_action_bottom_button_cancel, 0, M);
            ButtonSize buttonSize = ButtonSize.Large;
            ButtonStyle buttonStyle = ButtonStyle.Secondary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            int i3 = i2;
            bhu0.e(gzsVar2, buttonSize, buttonStyle, buttonAppearance, E, null, false, false, null, null, null, N, null, null, null, null, false, null, null, null, M, ((i2 >> 6) & 14) | X2.b.f, 0, 0, 4190176);
            f9t.e(txj0.v(aVar3, f), M, 6);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 E2 = ahn.E(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), "ReadyButton");
            String N2 = d370.N(R.string.dialog_bar_spam_action_bottom_button_ready, 0, M);
            ButtonStyle buttonStyle2 = ButtonStyle.Primary;
            boolean z3 = (i3 & 112) == 32;
            Object x = M.x();
            if (z3 || x == a.C0011a.a) {
                x = new yc(gzsVar, 13);
                M.R(x);
            }
            aVar2 = M;
            bhu0.e((gzs) x, buttonSize, buttonStyle2, buttonAppearance, E2, null, false, false, null, null, null, N2, null, null, null, null, z2, null, null, null, aVar2, X2.b.f, (i3 << 21) & 29360128, 0, 4059104);
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
            s.d = new u38(i, 0, gzsVar2, gzsVar, z);
        }
    }
}
