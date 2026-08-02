package xsna;

import androidx.compose.runtime.a;
import com.vk.ecomm.market.good.ui.topbar.ProductCardTopBarControlAction;
import com.vkontakte.android.R;
import xsna.q630;
import xsna.vmd0;

/* compiled from: ProductCardTopBarActionMenu.kt */
/* loaded from: classes18.dex */
public final class umd0 {
    public final /* synthetic */ vmd0 a;
    public final /* synthetic */ wh50<Boolean> b;

    public umd0(vmd0 vmd0Var, wh50<Boolean> wh50Var) {
        this.a = vmd0Var;
        this.b = wh50Var;
    }

    public final void a(umd0 umd0Var, ProductCardTopBarControlAction productCardTopBarControlAction, androidx.compose.runtime.a aVar, int i) {
        ProductCardTopBarControlAction productCardTopBarControlAction2;
        int i2;
        int i3;
        lqv B;
        int i4;
        int i5;
        String a;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        androidx.compose.runtime.a M = aVar.M(-1387740805);
        int i12 = i | (M.J(umd0Var) ? 4 : 2) | (M.o(productCardTopBarControlAction.ordinal()) ? 32 : 16) | (M.J(this) ? 256 : 128);
        if (M.t(i12 & 1, (i12 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1387740805, i12, -1, "com.vk.ecomm.market.good.ui.topbar.compose.ProductCardTopBarActionMenu.Content.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content (ProductCardTopBarActionMenu.kt:83)");
            }
            vmd0 vmd0Var = this.a;
            boolean J = M.J(vmd0Var) | ((i12 & 112) == 32);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                productCardTopBarControlAction2 = productCardTopBarControlAction;
                x = new ywc(vmd0Var, productCardTopBarControlAction2, this.b, 4);
                M.R(x);
            } else {
                productCardTopBarControlAction2 = productCardTopBarControlAction;
            }
            gzs gzsVar = (gzs) x;
            q630 E = ahn.E(q630.a.a, "product_card_top_bar_action_" + productCardTopBarControlAction2.name());
            int i13 = (i12 >> 3) & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1964661669, i13, -1, "com.vk.ecomm.market.good.ui.topbar.compose.ProductCardTopBarActionMenu.resolveLeftIcon (ProductCardTopBarActionMenu.kt:102)");
            }
            int[] iArr = vmd0.a.$EnumSwitchMapping$0;
            int i14 = iArr[productCardTopBarControlAction2.ordinal()];
            if (i14 == 1) {
                i2 = i13;
                i3 = -1;
                M.K(-1716289475);
                qzu0.a.getClass();
                lg90 F1 = qzu0.F1(M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                B = znk0.B(F1, ylu0Var.getIcon().a, 0L, M, 196616, 28);
                M.j();
            } else if (i14 == 2 || i14 == 3) {
                i2 = i13;
                i3 = -1;
                M.K(-1716018473);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1727563358, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-AdvertisingOutline20> (VkIcons.kt:194)");
                }
                lg90 a2 = pg90.a(R.drawable.vk_icon_advertising_outline_20, 0, M);
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
                B = znk0.B(a2, ylu0Var2.getIcon().a, 0L, M, 196616, 28);
                M.j();
            } else if (i14 == 4) {
                i2 = i13;
                i3 = -1;
                M.K(-1715791522);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1765292196, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-CopyOutline20> (VkIcons.kt:1770)");
                }
                lg90 a3 = pg90.a(R.drawable.vk_icon_copy_outline_20, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                B = znk0.B(a3, ylu0Var3.getIcon().a, 0L, M, 196616, 28);
                M.j();
            } else {
                if (i14 != 5) {
                    throw alb0.c(1745749984, M);
                }
                M.K(-1715573065);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-738888694, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-DeleteOutline20> (VkSdkIcons.kt:620)");
                }
                lg90 b = or.b(M, -525514345, R.drawable.vk_icon_delete_outline_20, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var4 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                i3 = -1;
                i2 = i13;
                B = znk0.B(b, ylu0Var4.getIcon().h, 0L, M, 196616, 28);
                M.j();
            }
            lqv lqvVar = B;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            boolean booleanValue = ((Boolean) ((zak0) vmd0Var.f).getValue()).booleanValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(94331954, i2, i3, "com.vk.ecomm.market.good.ui.topbar.compose.ProductCardTopBarActionMenu.resolveText (ProductCardTopBarActionMenu.kt:138)");
            }
            int i15 = iArr[productCardTopBarControlAction.ordinal()];
            if (i15 == 1) {
                M.K(1334847745);
                if (booleanValue) {
                    i4 = 1334872111;
                    i5 = R.string.product_card_control_action_edit_service;
                } else {
                    i4 = 1334974287;
                    i5 = R.string.product_card_control_action_edit_product;
                }
                a = zq.a(M, i4, i5, M, 0);
                M.j();
            } else if (i15 != 2) {
                if (i15 == 3) {
                    i8 = 1335429615;
                    i9 = R.string.product_card_control_action_promoting_statistics;
                } else if (i15 == 4) {
                    i8 = 1335578074;
                    i9 = R.string.product_card_control_action_copy_link;
                } else {
                    if (i15 != 5) {
                        throw alb0.c(458700536, M);
                    }
                    M.K(1335718845);
                    if (booleanValue) {
                        i10 = 1335743149;
                        i11 = R.string.product_card_control_action_remove_service;
                    } else {
                        i10 = 1335847309;
                        i11 = R.string.product_card_control_action_remove_product;
                    }
                    a = zq.a(M, i10, i11, M, 0);
                    M.j();
                }
                a = zq.a(M, i8, i9, M, 0);
            } else {
                M.K(1335136603);
                if (booleanValue) {
                    i6 = 1335160876;
                    i7 = R.string.product_card_control_action_promote_service;
                } else {
                    i6 = 1335266028;
                    i7 = R.string.product_card_control_action_promote_product;
                }
                a = zq.a(M, i6, i7, M, 0);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aou0.e(umd0Var, gzsVar, E, false, lqvVar, nzo.d(3072, 6, M, a, false), M, i12 & 14);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jk1(i, 4, this, umd0Var, productCardTopBarControlAction);
        }
    }
}
