package xsna;

import com.vk.dto.market.catalog.CatalogMarketCategoryContext;
import com.vk.dto.market.catalog.CatalogMarketDeliveryTypeDto;
import com.vk.ecomm.market.api.search.filters.dto.MarketCatalogFilterVM;
import com.vk.ecomm.market.api.search.filters.dto.MarketDeliveryType;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MarketCatalogFilterToVMConverter.kt */
/* loaded from: classes18.dex */
public final class dv00 {

    /* compiled from: MarketCatalogFilterToVMConverter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[CatalogMarketDeliveryTypeDto.values().length];
            try {
                iArr[CatalogMarketDeliveryTypeDto.ANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogMarketDeliveryTypeDto.COURIER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogMarketDeliveryTypeDto.PICKUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogMarketCategoryContext.Context.values().length];
            try {
                iArr2[CatalogMarketCategoryContext.Context.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CatalogMarketCategoryContext.Context.CLASSIFIEDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[MarketDeliveryType.values().length];
            try {
                iArr3[MarketDeliveryType.ANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[MarketDeliveryType.PICKUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[MarketDeliveryType.COURIER.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[MarketCatalogFilterVM.FilterContextType.values().length];
            try {
                iArr4[MarketCatalogFilterVM.FilterContextType.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[MarketCatalogFilterVM.FilterContextType.CLASSIFIEDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public static MarketCatalogFilterVM.FilterContextType a(CatalogMarketCategoryContext.Context context) {
        int i = a.$EnumSwitchMapping$1[context.ordinal()];
        if (i == 1) {
            return MarketCatalogFilterVM.FilterContextType.MARKET;
        }
        if (i == 2) {
            return MarketCatalogFilterVM.FilterContextType.CLASSIFIEDS;
        }
        throw new NoWhenBranchMatchedException();
    }
}
