package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.IconButtonRippleType;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.dw20;
import xsna.q630;

/* compiled from: ProductCardRejectDetailsBottomSheet.kt */
/* loaded from: classes18.dex */
public final class jmd0 extends jmu0 {

    /* compiled from: ProductCardRejectDetailsBottomSheet.kt */
    public static final class a extends dw20.b {
        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            return new jmd0();
        }
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(428712169);
        int i2 = (M.y(this) ? 4 : 2) | i;
        boolean z = true;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(428712169, i2, -1, "com.vk.ecomm.market.good.ui.holder.reject.ProductCardRejectDetailsBottomSheet.ThemedContent (ProductCardRejectDetailsBottomSheet.kt:33)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            int i3 = i2 & 14;
            boolean z2 = i3 == 4 || M.y(this);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new p1d0(this, 2);
                M.R(x);
            }
            kmd0.a(48, M, (gzs) x, txj0.f(aVar2, 1.0f));
            if (i3 != 4 && !M.y(this)) {
                z = false;
            }
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new gd70(this, 17);
                M.R(x2);
            }
            gzs gzsVar = (gzs) x2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1589335940, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel20> (VkSdkIcons.kt:216)");
            }
            lg90 b = or.b(M, -187349011, R.drawable.vk_icon_cancel_20, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N = d370.N(R.string.product_card_reject_info_bottom_sheet_close, 0, M);
            q630 b2 = ra8.a.b(aVar2, dt1.a.d);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            nzu0.c(gzsVar, b, N, b2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ylu0Var.getIcon().l, false, IconButtonRippleType.Bounded, false, null, null, M, 12582976, 1872);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new te1(this, i, 9);
        }
    }
}
