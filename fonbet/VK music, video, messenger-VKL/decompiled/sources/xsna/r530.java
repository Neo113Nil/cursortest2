package xsna;

import com.vk.ecomm.design.view.tile.MarketProductTileConfig;
import com.vk.ecomm.moderation.api.restrictions.ModerationRestriction;

/* compiled from: MarketFaveUiDto.kt */
/* loaded from: classes4.dex */
public final class r530 {
    public final MarketProductTileConfig a;
    public final c530 b;
    public ModerationRestriction c;

    public r530(MarketProductTileConfig marketProductTileConfig, c530 c530Var) {
        ModerationRestriction moderationRestriction = ModerationRestriction.NONE;
        this.a = marketProductTileConfig;
        this.b = c530Var;
        this.c = moderationRestriction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r530)) {
            return false;
        }
        r530 r530Var = (r530) obj;
        return epx.f(this.a, r530Var.a) && epx.f(this.b, r530Var.b) && this.c == r530Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ModerationWrapperConfig(tileConfig=" + this.a + ", moderationItem=" + this.b + ", restriction=" + this.c + ')';
    }
}
