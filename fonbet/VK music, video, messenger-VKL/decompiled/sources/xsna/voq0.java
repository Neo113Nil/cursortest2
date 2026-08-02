package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.group.header.f;
import com.vk.profile.user.impl.domain.donut.state.DonutBannerDonutType;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wra0;
import xsna.zra0;

/* compiled from: UserProfileDonutBannerViewHolder.kt */
/* loaded from: classes5.dex */
public final class voq0 {

    /* compiled from: UserProfileDonutBannerViewHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DonutBannerDonutType.values().length];
            try {
                iArr[DonutBannerDonutType.Regular.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DonutBannerDonutType.Goals.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(hyn hynVar, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        hyn hynVar2;
        androidx.compose.runtime.a M = aVar.M(819216497);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(hynVar) : M.y(hynVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i & 384;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(819216497, i2, -1, "com.vk.profile.user.impl.ui.adapter.holders.DonutBannerContent (UserProfileDonutBannerViewHolder.kt:78)");
            }
            hynVar2 = hynVar;
            ijk.a(hynVar2, xp2.a(aVar2, null, 3), null, null, kai.c(35267521, new ua30(izsVar, 3), M), M, (i2 & 14) | 24576, 12);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            hynVar2 = hynVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new sag(hynVar2, izsVar, i);
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        r48 r48Var;
        androidx.compose.runtime.a M = aVar.M(1239721367);
        int i2 = i | (M.y(izsVar) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1239721367, i2, -1, "com.vk.profile.user.impl.ui.adapter.holders.DonutBannerError (UserProfileDonutBannerViewHolder.kt:163)");
            }
            q630 d = rte0.d(q630Var, vog0.b(20));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            com.vk.core.compose.component.group.header.f a3 = f.a.a(d370.N(R.string.donut_banner_title, 0, M), null, null, null, null, null, null, null, false, M, 805306368, 510);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(958254720, Tensorflow.FRAME_WIDTH, -1, "com.vk.core.compose.component.group.header.GroupHeader.Middle.Companion.invoke (GroupHeader.kt:1088)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                r48Var = null;
                x = new com.vk.core.compose.component.group.header.a(a3, null);
                M.R(x);
            } else {
                r48Var = null;
            }
            com.vk.core.compose.component.group.header.a aVar3 = (com.vk.core.compose.component.group.header.a) x;
            ((zak0) aVar3.a).setValue(a3);
            ((zak0) aVar3.b).setValue(r48Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            com.vk.core.compose.component.group.header.g.a(aVar3, null, null, null, null, false, M, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            q630 H = s200.H(s200.F(32, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 18, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 28, 5);
            vl20 a4 = zra0.a.a(null, null, d370.N(R.string.user_profile_donut_banner_error_description, 0, M), null, M, 196608, 27);
            ButtonSize buttonSize = ButtonSize.Medium;
            ButtonStyle buttonStyle = ButtonStyle.Secondary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            String N = d370.N(R.string.user_profile_donut_banner_error_retry_button, 0, M);
            boolean z = (i2 & 14) == 4;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new m74(izsVar, 3);
                M.R(x2);
            }
            r48 r48Var2 = r48Var;
            ldv0.d(H, null, a4, wra0.b.a(wra0.a.C3954a.a(N, (gzs) x2, buttonSize, buttonStyle, buttonAppearance, false, null, null, null, null, null, null, false, false, null, null, M, 28032, 12582912, 131040), r48Var2, r48Var2, M, 14), null, null, false, M, 1572870, 50);
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
            s.d = new ne4(izsVar, q630Var, i);
        }
    }
}
