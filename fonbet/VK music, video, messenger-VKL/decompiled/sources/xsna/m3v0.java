package xsna;

import com.vk.ecomm.design.view.tile.MarketProductTileConfig;

/* compiled from: VkMarketProductTileDefaults.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class m3v0 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[MarketProductTileConfig.ProductStatus.values().length];
        try {
            iArr[MarketProductTileConfig.ProductStatus.HardBlock.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MarketProductTileConfig.ProductStatus.Moderation.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MarketProductTileConfig.ProductStatus.Archive.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MarketProductTileConfig.ProductStatus.OutOfStock.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[MarketProductTileConfig.ProductStatus.Normal.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[MarketProductTileConfig.ProductStatus.SoftBlock.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
