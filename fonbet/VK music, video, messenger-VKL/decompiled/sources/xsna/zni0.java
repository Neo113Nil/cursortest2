package xsna;

import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;

/* compiled from: StorefrontServicesViewState.kt */
/* loaded from: classes18.dex */
public final class zni0 {
    public final long a;
    public final MarketProductTileConfig b;

    public zni0(long j, MarketProductTileConfig marketProductTileConfig) {
        this.a = j;
        this.b = marketProductTileConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zni0)) {
            return false;
        }
        zni0 zni0Var = (zni0) obj;
        return this.a == zni0Var.a && epx.f(this.b, zni0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Service(id=" + this.a + ", config=" + this.b + ')';
    }
}
