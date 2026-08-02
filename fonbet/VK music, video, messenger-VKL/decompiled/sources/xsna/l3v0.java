package xsna;

import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VkMarketProductTileBayerDefaults.kt */
/* loaded from: classes18.dex */
public final class l3v0 implements n3v0 {
    public static final l3v0 a = new l3v0();

    /* compiled from: VkMarketProductTileBayerDefaults.kt */
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
                iArr[MarketProductTileConfig.ProductStatusType.SoftBlock.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MarketProductTileConfig.ProductStatusType.OutOfStock.ordinal()] = 4;
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r5 == false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    @Override // xsna.n3v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(MarketProductTileConfig.ProductStatusType productStatusType, boolean z, androidx.compose.runtime.a aVar, int i) {
        aVar.K(-496074960);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-496074960, i, -1, "com.vk.ecomm.design.compose.tile.defaults.VkMarketProductTileBayerDefaults.isMuteImage (VkMarketProductTileBayerDefaults.kt:58)");
        }
        boolean z2 = true;
        switch (a.$EnumSwitchMapping$0[productStatusType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 6:
                z2 = false;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                return z2;
            case 4:
                break;
            case 5:
                if (androidx.compose.runtime.b.d()) {
                }
                aVar.j();
                return z2;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // xsna.n3v0
    public final l5g c(MarketProductTileConfig.ProductStatusType productStatusType, androidx.compose.runtime.a aVar, int i) {
        aVar.K(-1500247284);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1500247284, i, -1, "com.vk.ecomm.design.compose.tile.defaults.VkMarketProductTileBayerDefaults.nameWarningIconColor (VkMarketProductTileBayerDefaults.kt:24)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return null;
    }

    @Override // xsna.n3v0
    public final String e(MarketProductTileConfig.e eVar, androidx.compose.runtime.a aVar, int i) {
        String str = eVar.b;
        aVar.K(-296006239);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-296006239, i, -1, "com.vk.ecomm.design.compose.tile.defaults.VkMarketProductTileBayerDefaults.oldPrice (VkMarketProductTileBayerDefaults.kt:109)");
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
        aVar.K(-314136406);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-314136406, i, -1, "com.vk.ecomm.design.compose.tile.defaults.VkMarketProductTileBayerDefaults.isRestricted (VkMarketProductTileBayerDefaults.kt:79)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return z;
    }

    @Override // xsna.n3v0
    public final long g(MarketProductTileConfig.ProductStatusType productStatusType, androidx.compose.runtime.a aVar, int i) {
        long j;
        aVar.K(556908902);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(556908902, i, -1, "com.vk.ecomm.design.compose.tile.defaults.VkMarketProductTileBayerDefaults.mainPriceColor (VkMarketProductTileBayerDefaults.kt:116)");
        }
        int i2 = a.$EnumSwitchMapping$0[productStatusType.ordinal()];
        if (i2 == 1) {
            aVar.K(-1681448845);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var.getText().p;
            aVar.j();
        } else if (i2 == 2) {
            aVar.K(-1681450765);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var2.getText().p;
            aVar.j();
        } else if (i2 == 4) {
            aVar.K(-1681445101);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var3 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var3.getText().p;
            aVar.j();
        } else if (i2 != 5) {
            aVar.K(-1681443375);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var4 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var4.getText().m;
            aVar.j();
        } else {
            aVar.K(-1681447021);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var5 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var5.getText().p;
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return j;
    }

    @Override // xsna.n3v0
    public final lg90 h(MarketProductTileConfig.ProductStatusType productStatusType, androidx.compose.runtime.a aVar, int i) {
        aVar.K(-1884149783);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1884149783, i, -1, "com.vk.ecomm.design.compose.tile.defaults.VkMarketProductTileBayerDefaults.nameWarningIcon (VkMarketProductTileBayerDefaults.kt:29)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return null;
    }

    @Override // xsna.n3v0
    public final String k(MarketProductTileConfig.h hVar, MarketProductTileConfig.ProductStatusType productStatusType, boolean z, androidx.compose.runtime.a aVar, int i) {
        aVar.K(757797019);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(757797019, i, -1, "com.vk.ecomm.design.compose.tile.defaults.VkMarketProductTileBayerDefaults.statusBadge (VkMarketProductTileBayerDefaults.kt:38)");
        }
        if (z && productStatusType != MarketProductTileConfig.ProductStatusType.HardBlock) {
            String a2 = zq.a(aVar, 1183155110, R.string.product_tile_status_badge_for_adults, aVar, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
            return a2;
        }
        aVar.K(1181482567);
        aVar.j();
        if (hVar instanceof MarketProductTileConfig.h.b) {
            String str = ((MarketProductTileConfig.h.b) hVar).a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
            return str;
        }
        String str2 = null;
        switch (a.$EnumSwitchMapping$0[productStatusType.ordinal()]) {
            case 1:
                aVar.K(1183447842);
                aVar.j();
                break;
            case 2:
                aVar.K(1183477602);
                aVar.j();
                break;
            case 3:
                aVar.K(1183507362);
                aVar.j();
                break;
            case 4:
                str2 = zq.a(aVar, -1901483937, R.string.product_tile_status_badge_not_in_stock, aVar, 0);
                break;
            case 5:
                str2 = zq.a(aVar, -1901480993, R.string.product_tile_status_badge_not_in_stock, aVar, 0);
                break;
            case 6:
                aVar.K(1183719650);
                aVar.j();
                break;
            default:
                throw alb0.c(-1901488148, aVar);
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return str2;
    }

    @Override // xsna.n3v0
    public final boolean m(MarketProductTileConfig.ProductStatusType productStatusType, androidx.compose.runtime.a aVar, int i) {
        aVar.K(-58324781);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-58324781, i, -1, "com.vk.ecomm.design.compose.tile.defaults.VkMarketProductTileBayerDefaults.isImageBlocked (VkMarketProductTileBayerDefaults.kt:70)");
        }
        int i2 = a.$EnumSwitchMapping$0[productStatusType.ordinal()];
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return z;
    }

    @Override // xsna.n3v0
    public final String n(MarketProductTileConfig.e eVar, androidx.compose.runtime.a aVar, int i) {
        String str = eVar.c;
        aVar.K(3870323);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(3870323, i, -1, "com.vk.ecomm.design.compose.tile.defaults.VkMarketProductTileBayerDefaults.mainPrice (VkMarketProductTileBayerDefaults.kt:101)");
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
        aVar.K(-1508313862);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1508313862, i, -1, "com.vk.ecomm.design.compose.tile.defaults.VkMarketProductTileBayerDefaults.productName (VkMarketProductTileBayerDefaults.kt:88)");
        }
        MarketProductTileConfig.ProductStatusType productStatusType2 = MarketProductTileConfig.ProductStatusType.HardBlock;
        if (productStatusType == productStatusType2) {
            str = zq.a(aVar, -2085635157, R.string.product_tile_unavailable, aVar, 0);
        } else if (productStatusType == MarketProductTileConfig.ProductStatusType.Moderation) {
            str = zq.a(aVar, -2085632309, R.string.product_tile_unavailable, aVar, 0);
        } else if (!z || productStatusType == productStatusType2) {
            aVar.K(-2085626786);
            aVar.j();
        } else {
            str = zq.a(aVar, -2085628981, R.string.product_tile_specify_age, aVar, 0);
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return str;
    }

    @Override // xsna.n3v0
    public final long p(int i, androidx.compose.runtime.a aVar) {
        aVar.K(-1688367555);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1688367555, i, -1, "com.vk.ecomm.design.compose.tile.defaults.VkMarketProductTileBayerDefaults.nameTextColor (VkMarketProductTileBayerDefaults.kt:19)");
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
