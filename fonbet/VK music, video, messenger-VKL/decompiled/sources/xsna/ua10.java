package xsna;

import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;

/* compiled from: MarketPriorityBlockModel.kt */
/* loaded from: classes17.dex */
public final class ua10 {
    public final MarketProductTileConfig a;
    public final com.vk.core.compose.component.semantics.a b;

    public ua10(MarketProductTileConfig marketProductTileConfig, com.vk.core.compose.component.semantics.a aVar) {
        this.a = marketProductTileConfig;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua10)) {
            return false;
        }
        ua10 ua10Var = (ua10) obj;
        return epx.f(this.a, ua10Var.a) && this.b.equals(ua10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ServiceItem(service=" + this.a + ", semanticsConfiguration=" + this.b + ')';
    }
}
