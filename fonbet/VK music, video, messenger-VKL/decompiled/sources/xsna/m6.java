package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: AboutVideoDescriptionDelegate.kt */
/* loaded from: classes7.dex */
public final class m6 {
    public static final void a(us2 us2Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        String str;
        String str2;
        q630.a aVar2;
        String str3;
        int i2;
        String str4 = us2Var.c;
        androidx.compose.runtime.a M = aVar.M(1402615786);
        int i3 = i | (M.J(us2Var) ? 4 : 2) | 48;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1402615786, i3, -1, "com.vk.video.ui.discovery.minimizable.description.SubtitleContent (AboutVideoDescriptionDelegate.kt:216)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar3 = q630.a.a;
            q630 c = qri.c(M, aVar3);
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
            if (drm0.N(str4)) {
                str = str4;
                str2 = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                aVar2 = aVar3;
                str3 = "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)";
                M.K(-700094988);
            } else {
                M.K(-691597857);
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                xpy xpyVar = new xpy(1.0f, false);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.s0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                str = str4;
                aVar2 = aVar3;
                str2 = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                str3 = "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)";
                yqv0.d(us2Var, xpyVar, ylu0Var.getText().p, 0, null, 2, false, 1, null, null, frv0Var, M, (i3 & 14) | 100663296, 6, 6904);
            }
            M.j();
            String N = d370.N(R.string.more, 0, M);
            if (!drm0.N(str)) {
                N = go9.b(" ", N);
            }
            String str5 = N;
            if (androidx.compose.runtime.b.d()) {
                i2 = -1;
                androidx.compose.runtime.b.f(1040687336, 0, -1, str2);
            } else {
                i2 = -1;
            }
            ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var2.getText().m;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, i2, str3);
            }
            wuv0 wuv0Var2 = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
            yqv0.c(str5, q630Var2, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var2.u0, M, 48, 0, 8184);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new l6(us2Var, q630Var2, i, 0);
        }
    }
}
