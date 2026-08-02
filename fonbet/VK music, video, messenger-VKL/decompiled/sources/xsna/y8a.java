package xsna;

import com.vk.dto.market.catalog.CatalogMarketDeliveryTypeDto;
import com.vk.dto.market.catalog.CatalogMarketStatusOptionId;

/* compiled from: CatalogMarketCustomParamsHelper.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class y8a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[CatalogMarketStatusOptionId.values().length];
        try {
            iArr[CatalogMarketStatusOptionId.ALL_ITEMS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CatalogMarketStatusOptionId.BANNED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CatalogMarketStatusOptionId.NOT_IN_MARKET.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CatalogMarketStatusOptionId.DISABLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[CatalogMarketDeliveryTypeDto.values().length];
        try {
            iArr2[CatalogMarketDeliveryTypeDto.ANY.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[CatalogMarketDeliveryTypeDto.COURIER.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[CatalogMarketDeliveryTypeDto.PICKUP.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
