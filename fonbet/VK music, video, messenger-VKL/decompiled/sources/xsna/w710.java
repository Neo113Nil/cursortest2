package xsna;

import com.vk.search.params.api.domain.model.MarketSearchDeliveryType;
import com.vk.search.params.api.domain.model.MarketSearchSortingOptions;

/* compiled from: MarketLocalizedParamsDescriptionMapper.kt */
/* loaded from: classes5.dex */
public final class w710 extends b920 {

    /* compiled from: MarketLocalizedParamsDescriptionMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MarketSearchSortingOptions.values().length];
            try {
                iArr[MarketSearchSortingOptions.NOVELTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarketSearchSortingOptions.COST_ASC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MarketSearchSortingOptions.COST_DESC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MarketSearchSortingOptions.RATING_DESC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MarketSearchDeliveryType.values().length];
            try {
                iArr2[MarketSearchDeliveryType.PICKUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[MarketSearchDeliveryType.COURIER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[MarketSearchDeliveryType.ANY.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
