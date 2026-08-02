package xsna;

import com.vk.api.generated.market.dto.MarketGetRecommendsResponseDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.kb70;
import xsna.y6u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class h6u implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ h6u(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                List<MarketMarketItemDto> f = ((MarketGetRecommendsResponseDto) obj).f();
                ArrayList arrayList = new ArrayList(c5g.u(f, 10));
                Iterator<T> it = f.iterator();
                while (it.hasNext()) {
                    arrayList.add(new k7u(b210.c((MarketMarketItemDto) it.next()), null));
                }
                return new y6u.e.c(arrayList, this.c);
            default:
                kb70 kb70Var = (kb70) obj;
                return Boolean.valueOf((kb70Var instanceof kb70.d) && ((kb70.d) kb70Var).b <= this.c);
        }
    }
}
