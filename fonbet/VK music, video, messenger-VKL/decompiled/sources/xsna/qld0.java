package xsna;

import com.vk.ecomm.design.compose.product_info.MarketProductCardMainInfo;
import com.vk.ecomm.market.good.good2.presentation.IslandPart;

/* compiled from: ProductCardMainInfoViewState.kt */
/* loaded from: classes18.dex */
public final class qld0 implements gld0 {
    public final boolean a;
    public final MarketProductCardMainInfo b;
    public final IslandPart c;

    public qld0(boolean z, MarketProductCardMainInfo marketProductCardMainInfo, IslandPart islandPart) {
        this.a = z;
        this.b = marketProductCardMainInfo;
        this.c = islandPart;
    }

    @Override // xsna.gld0
    public final IslandPart U0() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qld0)) {
            return false;
        }
        qld0 qld0Var = (qld0) obj;
        return this.a == qld0Var.a && epx.f(this.b, qld0Var.b) && this.c == qld0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "ProductCardMainInfoViewState(hasPhoto=" + this.a + ", info=" + this.b + ", islandPart=" + this.c + ')';
    }
}
