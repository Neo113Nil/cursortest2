package xsna;

import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;

/* compiled from: ProductListViewState.kt */
/* loaded from: classes18.dex */
public final class upd0 {
    public final vpd0 a;
    public final MarketProductTileConfig b;

    public upd0(vpd0 vpd0Var, MarketProductTileConfig marketProductTileConfig) {
        this.a = vpd0Var;
        this.b = marketProductTileConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof upd0)) {
            return false;
        }
        upd0 upd0Var = (upd0) obj;
        return epx.f(this.a, upd0Var.a) && epx.f(this.b, upd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ProductListItem(model=" + this.a + ", config=" + this.b + ')';
    }
}
