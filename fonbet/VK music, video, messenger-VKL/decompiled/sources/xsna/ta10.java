package xsna;

import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;

/* compiled from: MarketPriorityBlockModel.kt */
/* loaded from: classes17.dex */
public final class ta10 {
    public final MarketProductTileConfig a;
    public final com.vk.core.compose.component.semantics.a b;

    public ta10(MarketProductTileConfig marketProductTileConfig, com.vk.core.compose.component.semantics.a aVar) {
        this.a = marketProductTileConfig;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta10)) {
            return false;
        }
        ta10 ta10Var = (ta10) obj;
        return epx.f(this.a, ta10Var.a) && this.b.equals(ta10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GoodItem(good=" + this.a + ", semanticsConfiguration=" + this.b + ')';
    }
}
