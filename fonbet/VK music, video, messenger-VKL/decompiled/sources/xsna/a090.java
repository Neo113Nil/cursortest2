package xsna;

import com.vk.dto.fave.MarketFavable;

/* compiled from: OtherGoodsHolder.kt */
/* loaded from: classes18.dex */
public final class a090 {
    public final k7u a;
    public final MarketFavable b;

    public a090(k7u k7uVar, MarketFavable marketFavable) {
        this.a = k7uVar;
        this.b = marketFavable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a090)) {
            return false;
        }
        a090 a090Var = (a090) obj;
        return epx.f(this.a, a090Var.a) && epx.f(this.b, a090Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OtherGoodItem(goodWrapper=" + this.a + ", faveItem=" + this.b + ')';
    }
}
