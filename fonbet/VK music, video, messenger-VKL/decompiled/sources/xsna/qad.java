package xsna;

import com.vk.ecomm.design.view.tile.MarketProductTileConfig;

/* compiled from: ClipProductAttachesTileAdapter.kt */
/* loaded from: classes18.dex */
public final class qad implements hfz {
    public final MarketProductTileConfig b;

    public qad(MarketProductTileConfig marketProductTileConfig) {
        this.b = marketProductTileConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qad) && epx.f(this.b, ((qad) obj).b);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ClipProductAttachItem(config=" + this.b + ')';
    }
}
