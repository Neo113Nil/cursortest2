package xsna;

import com.vk.api.generated.marketIntegrations.dto.MarketIntegrationsTypeDto;

/* compiled from: OrderFromDtoMapper.kt */
/* loaded from: classes18.dex */
public final class uu80 {
    public final f0p0 a;

    /* compiled from: OrderFromDtoMapper.kt */
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

    public uu80(f0p0 f0p0Var) {
        this.a = f0p0Var;
    }
}
