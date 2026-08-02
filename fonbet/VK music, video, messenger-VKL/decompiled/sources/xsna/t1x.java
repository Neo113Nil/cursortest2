package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.IconButtonRippleType;
import com.vkontakte.android.R;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: InputCustomAddressContent.kt */
/* loaded from: classes18.dex */
public final class t1x {
    public static final void a(String str, s53 s53Var, r1x r1xVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1115596186);
        int i2 = (M.J(str) ? 4 : 2) | i | (M.y(s53Var) ? 32 : 16) | (M.y(r1xVar) ? 256 : 128) | 3072;
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1115596186, i2, -1, "com.vk.ecomm.cart.impl.common.modal.InputCustomAddressContent (InputCustomAddressContent.kt:51)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = or.a(str, 0L, 6, M);
            }
            b(r1xVar, kai.c(-2055761095, new s70(5, s53Var, (wh50) x), M), M, ((i2 >> 6) & 14) | Tensorflow.FRAME_WIDTH);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = q630.a.a;
        } else {
            M.h();
        }
        q630 q630Var2 = q630Var;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vwl(str, s53Var, r1xVar, q630Var2, i, 1);
        }
    }

    public static final void b(r1x r1xVar, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-17371997);
        if ((i & 6) == 0) {
            i2 = (M.y(r1xVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        q630.a aVar3 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(jaiVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-17371997, i2, -1, "com.vk.ecomm.cart.impl.common.modal.ModalBottomSheetContainer (InputCustomAddressContent.kt:128)");
            }
            float f = 8;
            q630 H = s200.H(aVar3, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 t = n34.t(p490.D(s200.H(hr80.m(H, ylu0Var.getBackground().g, vog0.b(12)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16, 7), p490.x(M), 14), dz5.I(6, 0, M, false), null);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, t);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (cq.i((i2 >> 6) & 14, M, jaiVar)) {
                androidx.compose.runtime.b.f(-1589335940, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel20> (VkSdkIcons.kt:216)");
            }
            lg90 b = or.b(M, -187349011, R.drawable.vk_icon_cancel_20, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N = d370.N(R.string.ecomm_checkout_close, 0, M);
            q630 b2 = ra8.a.b(aVar3, dt1.a.d);
            float f2 = 44;
            IconButtonRippleType iconButtonRippleType = IconButtonRippleType.Bounded;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var2.getIcon().l;
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new s1x(r1xVar, 0);
                M.R(x);
            }
            aVar2 = M;
            nzu0.c((gzs) x, b, N, b2, f2, j, false, iconButtonRippleType, false, null, null, aVar2, 12607552, 1856);
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
            s.d = new vi1(r1xVar, jaiVar, i);
        }
    }
}
