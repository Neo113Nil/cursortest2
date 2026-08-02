package xsna;

import com.vk.api.generated.marketIntegrations.dto.MarketIntegrationsTypeDto;

/* compiled from: OrderListFromDtoMapper.kt */
/* loaded from: classes18.dex */
public final class iv80 {

    /* compiled from: OrderListFromDtoMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarketIntegrationsTypeDto.values().length];
            try {
                iArr[MarketIntegrationsTypeDto.OZON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarketIntegrationsTypeDto.GENERAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
