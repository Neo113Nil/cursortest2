package xsna;

import com.vk.ecomm.design.view.tile.MarketProductTileConfig;
import com.vk.newsfeed.common.presentation.model.items.attachments.CtaButtonClickType;

/* compiled from: MarketFaveUiDto.kt */
/* loaded from: classes4.dex */
public final class py00 extends ol60 {
    public final MarketProductTileConfig h;
    public final r530 i;
    public final CtaButtonClickType j;
    public final boolean k;

    public py00(MarketProductTileConfig marketProductTileConfig, r530 r530Var, CtaButtonClickType ctaButtonClickType, boolean z) {
        super(396, 0, 0, 0, null);
        this.h = marketProductTileConfig;
        this.i = r530Var;
        this.j = ctaButtonClickType;
        this.k = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof py00)) {
            return false;
        }
        py00 py00Var = (py00) obj;
        return epx.f(this.h, py00Var.h) && epx.f(this.i, py00Var.i) && this.j == py00Var.j && this.k == py00Var.k;
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + qoy.b((this.j.hashCode() + ((this.i.hashCode() + (this.h.hashCode() * 31)) * 31)) * 31, 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketFaveUiDto(tileConfig=");
        sb.append(this.h);
        sb.append(", moderationConfig=");
        sb.append(this.i);
        sb.append(", ctaButtonClickType=");
        sb.append(this.j);
        sb.append(", isClickable=");
        return n23.b(sb, this.k, ", seqId=0)");
    }
}
