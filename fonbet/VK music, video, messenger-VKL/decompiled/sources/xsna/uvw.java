package xsna;

import com.vk.api.generated.market.dto.MarketItemLabelActionDto;

/* compiled from: StorefrontState.kt */
/* loaded from: classes18.dex */
public final class uvw {
    public final dly a;
    public final String b;
    public final MarketItemLabelActionDto c;

    public uvw(dly dlyVar, String str, MarketItemLabelActionDto marketItemLabelActionDto) {
        this.a = dlyVar;
        this.b = str;
        this.c = marketItemLabelActionDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvw)) {
            return false;
        }
        uvw uvwVar = (uvw) obj;
        return epx.f(this.a, uvwVar.a) && epx.f(this.b, uvwVar.b) && epx.f(this.c, uvwVar.c);
    }

    public final int hashCode() {
        dly dlyVar = this.a;
        int a = urd0.a((dlyVar == null ? 0 : dlyVar.hashCode()) * 31, 31, this.b);
        MarketItemLabelActionDto marketItemLabelActionDto = this.c;
        return a + (marketItemLabelActionDto != null ? marketItemLabelActionDto.hashCode() : 0);
    }

    public final String toString() {
        return "InfoBlockState(labelIcon=" + this.a + ", text=" + this.b + ", action=" + this.c + ')';
    }
}
