package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.IconButtonRippleType;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: TopRightActionContent.kt */
/* loaded from: classes18.dex */
public final class i9p0 {
    public final wh50 a;
    public final wh50 b;

    public i9p0() {
        throw null;
    }

    public i9p0(MarketProductTileConfig.i iVar, gzs gzsVar) {
        this.a = androidx.compose.runtime.k.b(iVar);
        this.b = androidx.compose.runtime.k.b(gzsVar);
    }

    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1332158976);
        if ((i & 6) == 0) {
            i2 = i | (M.J(q630Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1332158976, i2, -1, "com.vk.ecomm.design.compose.tile.impl.image.TopRightActionContent.CloseIcon (TopRightActionContent.kt:85)");
            }
            gzs gzsVar = (gzs) ((zak0) this.b).getValue();
            float f = 48;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1624152604, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-DismissDark24> (VkSdkIcons.kt:656)");
            }
            lg90 b = or.b(M, 1971505535, R.drawable.vk_icon_dismiss_dark_24, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            nzu0.c(gzsVar, b, null, q630Var, f, 0L, false, IconButtonRippleType.Bounded, false, null, null, M, 12607936 | ((i2 << 9) & 7168), 1888);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new js8(this, q630Var, i, 4);
        }
    }

    public final void b(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-101709720);
        int i2 = (M.J(q630Var) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-101709720, i2, -1, "com.vk.ecomm.design.compose.tile.impl.image.TopRightActionContent.Content (TopRightActionContent.kt:34)");
            }
            MarketProductTileConfig.i iVar = (MarketProductTileConfig.i) ((zak0) this.a).getValue();
            if (iVar instanceof MarketProductTileConfig.i.b) {
                M.K(1041211308);
                c((i2 << 3) & 1008, M, q630Var, ((MarketProductTileConfig.i.b) iVar).a);
                M.j();
            } else if (iVar instanceof MarketProductTileConfig.i.c) {
                M.K(1041213450);
                d((i2 << 3) & 1008, M, q630Var, ((MarketProductTileConfig.i.c) iVar).a);
                M.j();
            } else if (iVar instanceof MarketProductTileConfig.i.a) {
                M.K(1041215686);
                a(q630Var, M, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                M.j();
            } else {
                M.K(-2082002376);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vue(this, q630Var, i, 5);
        }
    }

    public final void c(final int i, androidx.compose.runtime.a aVar, final q630 q630Var, final boolean z) {
        int i2;
        androidx.compose.runtime.a aVar2;
        lg90 a;
        int i3;
        int i4;
        androidx.compose.runtime.a M = aVar.M(-292436989);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-292436989, i2, -1, "com.vk.ecomm.design.compose.tile.impl.image.TopRightActionContent.Favorite (TopRightActionContent.kt:47)");
            }
            if (z) {
                M.K(-1859067175);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(802946306, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-BookmarkShadowMedium48> (VkIcons.kt:808)");
                }
                a = pg90.a(R.drawable.vk_icon_bookmark_shadow_medium_48, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.K(-1859066016);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1325547728, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-BookmarkOutlineShadowMedium48> (VkIcons.kt:804)");
                }
                a = pg90.a(R.drawable.vk_icon_bookmark_outline_shadow_medium_48, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            }
            M.j();
            lg90 lg90Var = a;
            if (z) {
                i3 = -1796386892;
                i4 = R.string.product_tile_content_description_remove_from_favorite;
            } else {
                i3 = -1796274951;
                i4 = R.string.product_tile_content_description_add_to_favorite;
            }
            String a2 = zq.a(M, i3, i4, M, 0);
            q630 E = ahn.E(q630Var, "product_favourite_button");
            float f = 48;
            gzs gzsVar = (gzs) ((zak0) this.b).getValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            nzu0.c(gzsVar, lg90Var, a2, E, f, ylu0Var.getIcon().c, false, IconButtonRippleType.Bounded, false, null, null, aVar2, 12607552, 1856);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.h9p0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    i9p0.this.c(I, (androidx.compose.runtime.a) obj, q630Var, z);
                    return s3q0.a;
                }
            };
        }
    }

    public final void d(int i, androidx.compose.runtime.a aVar, q630 q630Var, boolean z) {
        int i2;
        q630 q630Var2;
        lg90 a;
        int i3;
        int i4;
        androidx.compose.runtime.a M = aVar.M(-1655294347);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1655294347, i2, -1, "com.vk.ecomm.design.compose.tile.impl.image.TopRightActionContent.Picker (TopRightActionContent.kt:70)");
            }
            if (z) {
                M.K(-1599962952);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(354187936, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-CheckCircleFilledBlueShadowMedium48> (VkIcons.kt:1260)");
                }
                a = pg90.a(R.drawable.vk_icon_check_circle_filled_blue_shadow_medium_48, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else {
                M.K(-1599961136);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-940377636, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-CircleOutlineShadowMedium48> (VkIcons.kt:1496)");
                }
                a = pg90.a(R.drawable.vk_icon_circle_outline_shadow_medium_48, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            }
            lg90 lg90Var = a;
            if (z) {
                i3 = -1599958081;
                i4 = R.string.ecomm_product_tile_accessibility_is_selected;
            } else {
                i3 = -1599955133;
                i4 = R.string.ecomm_product_tile_accessibility_is_not_selected;
            }
            q630Var2 = q630Var;
            vjw.a(lg90Var, zq.a(M, i3, i4, M, 0), q630Var2, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 8 | ((i2 << 3) & 896), 120);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vun0(this, z, q630Var2, i);
        }
    }
}
