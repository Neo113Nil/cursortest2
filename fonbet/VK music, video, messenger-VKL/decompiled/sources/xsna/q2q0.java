package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.cp8;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: UnavailableView.kt */
/* loaded from: classes16.dex */
public final class q2q0 {
    public static final void a(int i, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var) {
        androidx.compose.runtime.a M = aVar.M(1970805646);
        int i2 = (M.y(gzsVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1970805646, i2, -1, "com.vk.clips.attachments.impl.publish.geolocation.presentation.view.UnavailableView (UnavailableView.kt:24)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            float f = 24;
            q630.a aVar3 = q630.a.a;
            f9t.e(txj0.h(aVar3, f), M, 6);
            String N = d370.N(R.string.clips_geolcation_picker_no_location_permission_message, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.e0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(N, null, ylu0Var.getText().r, null, null, 0, 3, null, 0, false, 0, 0, null, frv0Var, M, 0, 0, 8122);
            f9t.e(txj0.h(aVar3, f), M, 6);
            bhu0.d(gzsVar, ButtonStyle.Primary, ButtonAppearance.Accent, null, ButtonSize.Small, null, null, cp8.d.a.a(d370.N(R.string.clips_geolocation_picker_modal_give_access, 0, M), null, M, 3072, 6), false, null, M, (i2 & 14) | 25008, 3944);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new sy5(gzsVar, q630Var, i, 4);
        }
    }
}
