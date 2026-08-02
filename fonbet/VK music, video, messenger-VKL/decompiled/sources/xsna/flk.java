package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ComposeMusicCuratorVh.kt */
/* loaded from: classes16.dex */
public final class flk implements Cell$Middle {
    public final com.vk.core.compose.component.cell.content.h1 a;
    public final gzs<s3q0> b;

    public flk(com.vk.core.compose.component.cell.content.h1 h1Var, gzs gzsVar) {
        this.a = h1Var;
        this.b = gzsVar;
    }

    @Override // com.vk.core.compose.component.cell.content.Cell$Middle
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1311510137);
        if ((i & 384) == 0) {
            i2 = (M.J(this) ? 256 : 128) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 129) != 128)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1311510137, i2, -1, "com.vk.catalog2.feature.music.holders.CuratorMiddle.Content (ComposeMusicCuratorVh.kt:144)");
            }
            LayoutDirection layoutDirection = (LayoutDirection) M.r(uvi.n);
            bn20 z = hr80.z();
            ButtonSize buttonSize = ButtonSize.Small;
            ButtonStyle buttonStyle = ButtonStyle.Tertiary;
            s890 value = z.c(buttonSize, buttonStyle, false, M, 54, 4).getValue();
            a.c cVar = androidx.compose.foundation.layout.a.e;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(cVar, dt1.a.n, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
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
            this.a.c(s200.H(aVar2, s200.s(value, layoutDirection), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, s200.r(value, layoutDirection), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), Cell$Middle.Size.Medium, M, 48);
            f9t.e(txj0.h(aVar2, 4), M, 6);
            bhu0.e(this.b, buttonSize, buttonStyle, ButtonAppearance.Accent, ahn.E(aVar2, "groupBannerButton"), null, false, false, null, null, null, d370.N(R.string.grop_open_button, 0, M), null, null, null, null, false, null, null, null, M, 28080, 0, 0, 4190176);
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
            s.d = new jo7(i, 2, this, spg0Var, q630Var);
        }
    }
}
