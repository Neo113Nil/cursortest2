package xsna;

import com.vk.dto.common.Good;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import com.vk.ecomm.moderation.api.restrictions.ModerationRestriction;

/* compiled from: StorefrontState.kt */
/* loaded from: classes18.dex */
public final class b5u {
    public final Good a;
    public final c530 b;
    public final MarketProductTileConfig c;
    public final ModerationRestriction d;

    public b5u(Good good, c530 c530Var, MarketProductTileConfig marketProductTileConfig, ModerationRestriction moderationRestriction) {
        this.a = good;
        this.b = c530Var;
        this.c = marketProductTileConfig;
        this.d = moderationRestriction;
    }

    public static b5u a(b5u b5uVar, Good good, MarketProductTileConfig marketProductTileConfig, ModerationRestriction moderationRestriction, int i) {
        c530 c530Var = b5uVar.b;
        if ((i & 8) != 0) {
            moderationRestriction = b5uVar.d;
        }
        return new b5u(good, c530Var, marketProductTileConfig, moderationRestriction);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5u)) {
            return false;
        }
        b5u b5uVar = (b5u) obj;
        return epx.f(this.a, b5uVar.a) && epx.f(this.b, b5uVar.b) && epx.f(this.c, b5uVar.c) && this.d == b5uVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "GoodItem(good=" + this.a + ", moderationItem=" + this.b + ", config=" + this.c + ", restriction=" + this.d + ')';
    }
}
