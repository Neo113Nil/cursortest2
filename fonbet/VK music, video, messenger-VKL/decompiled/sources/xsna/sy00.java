package xsna;

import com.vk.ecomm.market.api.search.filters.dto.MarketDeliveryType;
import com.vk.ecomm.market.api.search.filters.dto.MarketSortingOptions;

/* compiled from: MarketFilterDtoUtils.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class sy00 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[MarketDeliveryType.values().length];
        try {
            iArr[MarketDeliveryType.ANY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MarketDeliveryType.COURIER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MarketDeliveryType.PICKUP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[MarketSortingOptions.values().length];
        try {
            iArr2[MarketSortingOptions.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[MarketSortingOptions.COST_ASC.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[MarketSortingOptions.COST_DESC.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[MarketSortingOptions.NOVELTY.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[MarketSortingOptions.RATING_DESC.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
