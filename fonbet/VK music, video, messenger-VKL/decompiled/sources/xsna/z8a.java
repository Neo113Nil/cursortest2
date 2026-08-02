package xsna;

import com.vk.api.generated.market.dto.MarketDeliveryTypeDto;

/* compiled from: CatalogMarketFilterMapper.kt */
/* loaded from: classes16.dex */
public final class z8a {

    /* compiled from: CatalogMarketFilterMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarketDeliveryTypeDto.values().length];
            try {
                iArr[MarketDeliveryTypeDto.ANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarketDeliveryTypeDto.COURIER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MarketDeliveryTypeDto.PICKUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
