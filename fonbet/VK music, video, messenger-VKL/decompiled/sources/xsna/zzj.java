package xsna;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: CoverActions.kt */
/* loaded from: classes5.dex */
public final class zzj {
    public static final void a(boolean z, gzs gzsVar, gzs gzsVar2, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1636499111);
        int i2 = i | (M.l(z) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.y(gzsVar2) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1636499111, i2, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.settings.photo.cover.CoverActions (CoverActions.kt:30)");
            }
            a.h hVar = androidx.compose.foundation.layout.a.g;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(hVar, dt1.a.k, M, 6);
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
            uog0 b = vog0.b(56);
            q630.a aVar3 = q630.a.a;
            q630 d = rte0.d(aVar3, b);
            long c2 = l5g.c(14, wlb0.h(M).getBackground().l, 0.45f);
            e.a aVar4 = androidx.compose.ui.graphics.e.a;
            q630 m = hr80.m(d, c2, aVar4);
            String N = d370.N(R.string.user_profile_edit_actions_edit_cover, 0, M);
            ButtonSize buttonSize = ButtonSize.Medium;
            ButtonStyle buttonStyle = ButtonStyle.Tertiary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Overlay;
            qzu0.a.getClass();
            bhu0.e(gzsVar, buttonSize, buttonStyle, buttonAppearance, m, null, false, false, qzu0.X0(M), null, null, N, null, null, null, null, z, null, null, null, M, ((i2 >> 3) & 14) | 1073745328, (i2 << 21) & 29360128, 0, 4058592);
            M = M;
            nzu0.c(gzsVar2, qzu0.B(M), d370.N(R.string.user_profile_edit_actions_delete_cover, 0, M), s200.D(m200.u(hr80.m(rte0.d(aVar3, vog0.a), l5g.c(14, wlb0.h(M).getBackground().l, 0.45f), aVar4), IntrinsicSize.Max), 6), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, wlb0.h(M).getIcon().c, false, null, z, null, null, M, ((i2 >> 6) & 14) | 64 | ((i2 << 24) & 234881024), 1744);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wac(i, 1, (Object) gzsVar, (xzs) gzsVar2, q630Var, z);
        }
    }
}
