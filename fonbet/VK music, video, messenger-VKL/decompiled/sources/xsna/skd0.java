package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.ecomm.market.good.ui.ProductCardError;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wra0;
import xsna.zra0;

/* compiled from: ProductCardError.kt */
/* loaded from: classes18.dex */
public final class skd0 {

    /* compiled from: ProductCardError.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductCardError.values().length];
            try {
                iArr[ProductCardError.Internet.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductCardError.Server.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(ProductCardError productCardError, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        int i2;
        int i3;
        lg90 a2;
        t8p0 a3;
        int i4;
        int i5;
        androidx.compose.runtime.a M = aVar.M(1572766608);
        int i6 = i | (M.o(productCardError.ordinal()) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i6 & 1, (i6 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1572766608, i6, -1, "com.vk.ecomm.market.good.ui.ProductCardError (ProductCardError.kt:24)");
            }
            q630 d = txj0.d(q630Var, 1.0f);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630 f = txj0.f(q630.a.a, 1.0f);
            int i7 = i6 & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1827195444, i7, -1, "com.vk.ecomm.market.good.ui.resolveErrorIcon (ProductCardError.kt:70)");
            }
            int[] iArr = a.$EnumSwitchMapping$0;
            int i8 = iArr[productCardError.ordinal()];
            if (i8 == 1) {
                q630Var2 = f;
                i2 = -1;
                i3 = 0;
                M.K(436159783);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (ylu0Var.s()) {
                    M.K(436232881);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1159337732, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-IllustrationAntennaLight56> (VkSdkIcons.kt:1088)");
                    }
                    a2 = pg90.a(R.drawable.vk_icon_illustration_antenna_light_56, 0, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                } else {
                    M.K(436307250);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1060812596, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-IllustrationAntennaDark56> (VkSdkIcons.kt:1084)");
                    }
                    a2 = pg90.a(R.drawable.vk_icon_illustration_antenna_dark_56, 0, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                }
                a3 = csa0.a(a2, 0L, 0L, null, null, M, 196616, 30);
                M.j();
            } else {
                if (i8 != 2) {
                    throw alb0.c(706805001, M);
                }
                M.K(706815415);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1223610404, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ErrorOutline56> (VkSdkIcons.kt:814)");
                }
                lg90 a4 = pg90.a(R.drawable.vk_icon_error_outline_56, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var2 = f;
                i3 = 0;
                i2 = -1;
                a3 = csa0.a(a4, ylu0Var2.getIcon().l, 0L, null, null, M, 196616, 28);
                M.j();
            }
            t8p0 t8p0Var = a3;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-117785463, i7, i2, "com.vk.ecomm.market.good.ui.resolveErrorTitle (ProductCardError.kt:53)");
            }
            int i9 = iArr[productCardError.ordinal()];
            if (i9 == 1) {
                i4 = R.string.product_card_internet_error_title;
            } else {
                if (i9 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i4 = R.string.product_card_server_error_title;
            }
            String N = d370.N(i4, i3, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(206573541, i7, i2, "com.vk.ecomm.market.good.ui.resolveErrorDescription (ProductCardError.kt:62)");
            }
            int i10 = iArr[productCardError.ordinal()];
            if (i10 == 1) {
                i5 = R.string.product_card_internet_error_description;
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i5 = R.string.product_card_server_error_description;
            }
            String N2 = d370.N(i5, i3, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            vl20 a5 = zra0.a.a(N, null, N2, null, M, 196608, 26);
            r48 a6 = wra0.a.C3954a.a(d370.N(R.string.product_card_error_retry, i3, M), gzsVar, ButtonSize.Small, ButtonStyle.Tertiary, ButtonAppearance.Accent, false, null, null, null, null, null, null, false, false, null, null, M, (i6 & 112) | 28032, 12582912, 131040);
            M = M;
            ldv0.d(q630Var2, t8p0Var, a5, wra0.b.a(a6, null, null, M, 14), null, null, false, M, 6, 112);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ejh(i, 3, productCardError, gzsVar, q630Var);
        }
    }
}
