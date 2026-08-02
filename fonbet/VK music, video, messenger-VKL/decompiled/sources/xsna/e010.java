package xsna;

import com.vk.api.generated.market.dto.MarketItemLabelActionDto;

/* compiled from: MarketIntegrationInfoBlock.kt */
/* loaded from: classes18.dex */
public final class e010 {
    public final String a;
    public final MarketItemLabelActionDto b;

    public e010(String str, MarketItemLabelActionDto marketItemLabelActionDto) {
        this.a = str;
        this.b = marketItemLabelActionDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e010)) {
            return false;
        }
        e010 e010Var = (e010) obj;
        return epx.f(this.a, e010Var.a) && epx.f(this.b, e010Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        MarketItemLabelActionDto marketItemLabelActionDto = this.b;
        return hashCode + (marketItemLabelActionDto != null ? marketItemLabelActionDto.hashCode() : 0);
    }

    public final String toString() {
        return "MarketIntegrationInfoData(text=" + this.a + ", action=" + this.b + ')';
    }
}
