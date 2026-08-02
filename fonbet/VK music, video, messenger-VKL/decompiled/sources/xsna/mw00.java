package xsna;

import com.vk.api.generated.market.dto.MarketCountersFilterDto;
import java.util.Collections;

/* compiled from: MarketCountersRepository.kt */
/* loaded from: classes18.dex */
public final class mw00 {
    public final yd10 a = new yd10();

    /* compiled from: MarketCountersRepository.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarketCountersFilterDto.values().length];
            try {
                iArr[MarketCountersFilterDto.SINGLE_CART_ITEMS_COUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarketCountersFilterDto.BOOKMARK_ITEMS_COUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final io.reactivex.rxjava3.internal.operators.observable.j1 a(MarketCountersFilterDto marketCountersFilterDto) {
        return rsg0.a0(yfb.x(this.a.f(Collections.singletonList(marketCountersFilterDto)))).U(new mm6(new j4x(marketCountersFilterDto, 4), 24));
    }
}
