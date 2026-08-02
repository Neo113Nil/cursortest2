package xsna;

import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;

/* compiled from: MarketProductTileComposeContent.kt */
/* loaded from: classes18.dex */
public final class jtk0 {
    public final jqi a;
    public final MarketProductTileConfig b;

    public jtk0(jqi jqiVar, MarketProductTileConfig marketProductTileConfig) {
        this.a = jqiVar;
        this.b = marketProductTileConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jtk0)) {
            return false;
        }
        jtk0 jtk0Var = (jtk0) obj;
        return this.a == jtk0Var.a && epx.f(this.b, jtk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "State(key=" + this.a + ", config=" + this.b + ')';
    }
}
