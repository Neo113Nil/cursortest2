package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.tlo0;

/* compiled from: BottomBar.kt */
/* loaded from: classes7.dex */
public final class f48 {
    public static final void a(p48 p48Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        float f;
        a.C0011a.C0012a c0012a;
        q630.a aVar2;
        float f2;
        androidx.compose.runtime.a M = aVar.M(1004769004);
        int i2 = i | (M.J(p48Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1004769004, i2, -1, "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.bottombar.BottomBar (BottomBar.kt:25)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f3 = 12;
            q630 E = s200.E(hr80.m(q630Var, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a), 16, f3);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            b48 b48Var = p48Var.a;
            q630.a aVar4 = q630.a.a;
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (b48Var != null) {
                M.K(-1149940375);
                b48 b48Var2 = p48Var.a;
                ButtonStyle buttonStyle = ButtonStyle.Secondary;
                boolean z = (i2 & 112) == 32;
                Object x = M.x();
                if (z || x == c0012a2) {
                    x = new e48(izsVar, 0);
                    M.R(x);
                }
                gzs gzsVar = (gzs) x;
                f2 = Float.MAX_VALUE;
                q630 E2 = ahn.E(s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), "BottomBarTags.BUTTON_LEFT");
                aVar2 = aVar4;
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                q630 g = E2.g(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                c0012a = c0012a2;
                f = 1.0f;
                b(b48Var2, buttonStyle, gzsVar, g, M, 48);
            } else {
                f = 1.0f;
                c0012a = c0012a2;
                aVar2 = aVar4;
                f2 = Float.MAX_VALUE;
                M.K(-1151275886);
            }
            M.j();
            b48 b48Var3 = p48Var.b;
            ButtonStyle buttonStyle2 = ButtonStyle.Primary;
            boolean z2 = (i2 & 112) == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new se1(izsVar, 2);
                M.R(x2);
            }
            gzs gzsVar2 = (gzs) x2;
            q630 E3 = ahn.E(aVar2, "BottomBarTags.BUTTON_RIGHT");
            if (f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            if (f > f2) {
                f = f2;
            }
            b(b48Var3, buttonStyle2, gzsVar2, E3.g(new xpy(f, true)), M, 48);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wo7(i, 1, p48Var, izsVar, q630Var);
        }
    }

    public static final void b(b48 b48Var, ButtonStyle buttonStyle, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1711615426);
        int i2 = i | (M.J(b48Var) ? 4 : 2) | (M.y(gzsVar) ? 256 : 128) | (M.J(q630Var) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1711615426, i2, -1, "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.bottombar.BottomBarButton (BottomBar.kt:60)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            ButtonSize buttonSize = ButtonSize.Large;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new p1(b48Var, 13);
                M.R(x);
            }
            aVar2 = M;
            bhu0.e(gzsVar, buttonSize, buttonStyle, buttonAppearance, com.vk.core.compose.component.semantics.b.b(q630Var, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3)), null, false, false, null, null, null, tlo0.b.a(b48Var.a, context).toString(), null, null, null, null, b48Var.b, null, null, null, aVar2, ((i2 >> 6) & 14) | X2.b.f, 0, 0, 4059104);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new d48(i, 0, b48Var, buttonStyle, gzsVar, q630Var);
        }
    }
}
