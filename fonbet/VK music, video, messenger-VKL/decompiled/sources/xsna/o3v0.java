package xsna;

import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import com.vkontakte.android.R;

/* compiled from: VkMarketProductTileSellerDefaults.kt */
/* loaded from: classes18.dex */
public final class o3v0 implements n3v0 {
    public static final o3v0 a = new o3v0();

    /* compiled from: VkMarketProductTileSellerDefaults.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarketProductTileConfig.ProductStatusType.values().length];
            try {
                iArr[MarketProductTileConfig.ProductStatusType.Moderation.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarketProductTileConfig.ProductStatusType.HardBlock.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MarketProductTileConfig.ProductStatusType.OutOfStock.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MarketProductTileConfig.ProductStatusType.SoftBlock.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MarketProductTileConfig.ProductStatusType.Archive.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MarketProductTileConfig.ProductStatusType.Normal.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.n3v0
    public final boolean b(MarketProductTileConfig.ProductStatusType productStatusType, boolean z, androidx.compose.runtime.a aVar, int i) {
        aVar.K(1833363020);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1833363020, i, -1, "com.vk.ecomm.design.compose.tile.defaults.VkMarketProductTileSellerDefaults.isMuteImage (VkMarketProductTileSellerDefaults.kt:67)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return false;
    }

    @Override // xsna.n3v0
    public final l5g c(MarketProductTileConfig.ProductStatusType productStatusType, androidx.compose.runtime.a aVar, int i) {
        l5g c;
        aVar.K(-1103566040);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1103566040, i, -1, "com.vk.ecomm.design.compose.tile.defaults.VkMarketProductTileSellerDefaults.nameWarningIconColor (VkMarketProductTileSellerDefaults.kt:26)");
        }
        switch (a.$EnumSwitchMapping$0[productStatusType.ordinal()]) {
            case 1:
                aVar.K(329963986);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                c = com.vk.movika.sdk.android.defaultplayer.interactive.c.c(ylu0Var.q().d, aVar);
                break;
            case 2:
                aVar.K(329965841);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                c = com.vk.movika.sdk.android.defaultplayer.interactive.c.c(ylu0Var2.q().m, aVar);
                break;
            case 3:
                aVar.K(329967700);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var3 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                c = com.vk.movika.sdk.android.defaultplayer.interactive.c.c(ylu0Var3.q().g, aVar);
                break;
            case 4:
                aVar.K(329969620);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var4 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                c = com.vk.movika.sdk.android.defaultplayer.interactive.c.c(ylu0Var4.q().g, aVar);
                break;
            case 5:
                aVar.K(329971476);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var5 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                c = com.vk.movika.sdk.android.defaultplayer.interactive.c.c(ylu0Var5.q().g, aVar);
                break;
            case 6:
                aVar.K(1639215637);
                aVar.j();
                c = null;
                break;
            default:
                throw alb0.c(329962058, aVar);
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return c;
    }

    @Override // xsna.n3v0
    public final String e(MarketProductTileConfig.e eVar, androidx.compose.runtime.a aVar, int i) {
        String str = eVar.b;
        aVar.K(825875581);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(825875581, i, -1, "com.vk.ecomm.design.compose.tile.defaults.VkMarketProductTileSellerDefaults.oldPrice (VkMarketProductTileSellerDefaults.kt:103)");
        }
        String str2 = eVar.c;
        if (str2 != null && str2.length() != 0 && (str == null || str.length() == 0)) {
            str = eVar.a;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return str;
    }

    @Override // xsna.n3v0
    public final boolean f(boolean z, androidx.compose.runtime.a aVar, int i) {
        aVar.K(582654278);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(582654278, i, -1, "com.vk.ecomm.design.compose.tile.defaults.VkMarketProductTileSellerDefaults.isRestricted (VkMarketProductTileSellerDefaults.kt:77)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return false;
    }

    @Override // xsna.n3v0
    public final long g(MarketProductTileConfig.ProductStatusType productStatusType, androidx.compose.runtime.a aVar, int i) {
        aVar.K(138572546);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(138572546, i, -1, "com.vk.ecomm.design.compose.tile.defaults.VkMarketProductTileSellerDefaults.mainPriceColor (VkMarketProductTileSellerDefaults.kt:108)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
        }
        ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        long j = ylu0Var.getText().m;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return j;
    }

    @Override // xsna.n3v0
    public final lg90 h(MarketProductTileConfig.ProductStatusType productStatusType, androidx.compose.runtime.a aVar, int i) {
        lg90 b;
        aVar.K(-666680123);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-666680123, i, -1, "com.vk.ecomm.design.compose.tile.defaults.VkMarketProductTileSellerDefaults.nameWarningIcon (VkMarketProductTileSellerDefaults.kt:37)");
        }
        switch (a.$EnumSwitchMapping$0[productStatusType.ordinal()]) {
            case 1:
                aVar.K(-729465325);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1430437698, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-ClockOutline16> (VkIcons.kt:1588)");
                }
                b = or.b(aVar, -495877277, R.drawable.vk_icon_clock_outline_16, aVar, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                break;
            case 2:
                aVar.K(-729463783);
                qzu0.a.getClass();
                b = qzu0.Q(aVar);
                aVar.j();
                break;
            case 3:
                aVar.K(-729460295);
                qzu0.a.getClass();
                b = qzu0.Q(aVar);
                aVar.j();
                break;
            case 4:
                aVar.K(-729462055);
                qzu0.a.getClass();
                b = qzu0.Q(aVar);
                aVar.j();
                break;
            case 5:
                aVar.K(-729458631);
                qzu0.a.getClass();
                b = qzu0.Q(aVar);
                aVar.j();
                break;
            case 6:
                aVar.K(-1138338920);
                aVar.j();
                b = null;
                break;
            default:
                throw alb0.c(-729466840, aVar);
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return b;
    }

    @Override // xsna.n3v0
    public final String k(MarketProductTileConfig.h hVar, MarketProductTileConfig.ProductStatusType productStatusType, boolean z, androidx.compose.runtime.a aVar, int i) {
        aVar.K(-81475337);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-81475337, i, -1, "com.vk.ecomm.design.compose.tile.defaults.VkMarketProductTileSellerDefaults.statusBadge (VkMarketProductTileSellerDefaults.kt:51)");
        }
        if (hVar instanceof MarketProductTileConfig.h.b) {
            String str = ((MarketProductTileConfig.h.b) hVar).a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
            return str;
        }
        int i2 = a.$EnumSwitchMapping$0[productStatusType.ordinal()];
        String str2 = null;
        switch (i2) {
            case 1:
                str2 = zq.a(aVar, -988374279, R.string.product_tile_status_badge_moderation, aVar, 0);
                break;
            case 2:
                str2 = zq.a(aVar, -988371338, R.string.product_tile_status_badge_blocked, aVar, 0);
                break;
            case 3:
                str2 = zq.a(aVar, -988367493, R.string.product_tile_status_badge_not_in_stock, aVar, 0);
                break;
            case 4:
                aVar.K(-574653946);
                aVar.j();
                break;
            case 5:
                str2 = zq.a(aVar, -988364553, R.string.product_tile_status_badge_inactive, aVar, 0);
                break;
            case 6:
                aVar.K(-574445626);
                aVar.j();
                break;
            default:
                throw alb0.c(-988375459, aVar);
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return str2;
    }

    @Override // xsna.n3v0
    public final boolean m(MarketProductTileConfig.ProductStatusType productStatusType, androidx.compose.runtime.a aVar, int i) {
        aVar.K(1604490031);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1604490031, i, -1, "com.vk.ecomm.design.compose.tile.defaults.VkMarketProductTileSellerDefaults.isImageBlocked (VkMarketProductTileSellerDefaults.kt:72)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return false;
    }

    @Override // xsna.n3v0
    public final String n(MarketProductTileConfig.e eVar, androidx.compose.runtime.a aVar, int i) {
        String str = eVar.c;
        aVar.K(1244442831);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1244442831, i, -1, "com.vk.ecomm.design.compose.tile.defaults.VkMarketProductTileSellerDefaults.mainPrice (VkMarketProductTileSellerDefaults.kt:95)");
        }
        if (str == null || str.length() == 0) {
            str = String.valueOf(eVar.a);
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return str;
    }

    @Override // xsna.n3v0
    public final String o(String str, boolean z, MarketProductTileConfig.ProductStatusType productStatusType, androidx.compose.runtime.a aVar, int i) {
        aVar.K(-265612906);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-265612906, i, -1, "com.vk.ecomm.design.compose.tile.defaults.VkMarketProductTileSellerDefaults.productName (VkMarketProductTileSellerDefaults.kt:86)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return str;
    }

    @Override // xsna.n3v0
    public final long p(int i, androidx.compose.runtime.a aVar) {
        aVar.K(-1498520039);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1498520039, i, -1, "com.vk.ecomm.design.compose.tile.defaults.VkMarketProductTileSellerDefaults.nameTextColor (VkMarketProductTileSellerDefaults.kt:20)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
        }
        ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        long j = ylu0Var.getText().p;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return j;
    }
}
