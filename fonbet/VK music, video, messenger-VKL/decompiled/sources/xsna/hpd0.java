package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.fave.MarketFavable;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;

/* compiled from: ProductItem.kt */
/* loaded from: classes18.dex */
public final class hpd0 {
    public final long a;
    public final UserId b;
    public final MarketProductTileConfig c;
    public final c530 d;
    public final MarketFavable e;
    public final int f;
    public final zjk g;

    public hpd0(long j, UserId userId, MarketProductTileConfig marketProductTileConfig, c530 c530Var, MarketFavable marketFavable, int i, zjk zjkVar) {
        this.a = j;
        this.b = userId;
        this.c = marketProductTileConfig;
        this.d = c530Var;
        this.e = marketFavable;
        this.f = i;
        this.g = zjkVar;
    }

    public static hpd0 a(hpd0 hpd0Var, MarketProductTileConfig marketProductTileConfig, MarketFavable marketFavable, zjk zjkVar, int i) {
        long j = hpd0Var.a;
        UserId userId = hpd0Var.b;
        c530 c530Var = hpd0Var.d;
        if ((i & 32) != 0) {
            marketFavable = hpd0Var.e;
        }
        MarketFavable marketFavable2 = marketFavable;
        int i2 = hpd0Var.f;
        if ((i & 128) != 0) {
            zjkVar = hpd0Var.g;
        }
        return new hpd0(j, userId, marketProductTileConfig, c530Var, marketFavable2, i2, zjkVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpd0)) {
            return false;
        }
        hpd0 hpd0Var = (hpd0) obj;
        return this.a == hpd0Var.a && epx.f(this.b, hpd0Var.b) && epx.f(this.c, hpd0Var.c) && this.d.equals(hpd0Var.d) && epx.f(this.e, hpd0Var.e) && this.f == hpd0Var.f && epx.f(this.g, hpd0Var.g);
    }

    public final int hashCode() {
        int a = shy.a(this.f, (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + bh10.a(Long.hashCode(this.a) * 31, 31, this.b.b)) * 31)) * 961)) * 31, 31);
        zjk zjkVar = this.g;
        return a + (zjkVar == null ? 0 : zjkVar.hashCode());
    }

    public final String toString() {
        return "ProductItem(productId=" + this.a + ", ownerId=" + this.b + ", config=" + this.c + ", moderationItem=" + this.d + ", adsLabel=null, favable=" + this.e + ", cartQuantity=" + this.f + ", cta=" + this.g + ')';
    }
}
