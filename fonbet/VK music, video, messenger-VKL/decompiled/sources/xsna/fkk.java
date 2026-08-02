package xsna;

import com.vk.ecomm.design.view.tile.MarketProductTileConfig;
import com.vk.newsfeed.common.presentation.model.items.attachments.CtaButtonClickType;

/* compiled from: MarketFaveUiDto.kt */
/* loaded from: classes4.dex */
public final class fkk {
    public final CtaButtonClickType a;
    public final MarketProductTileConfig.a b;

    public fkk(CtaButtonClickType ctaButtonClickType, MarketProductTileConfig.a aVar) {
        this.a = ctaButtonClickType;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fkk)) {
            return false;
        }
        fkk fkkVar = (fkk) obj;
        return this.a == fkkVar.a && epx.f(this.b, fkkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CtaButtonTypeConfig(buttonType=" + this.a + ", buttonTileConfig=" + this.b + ')';
    }
}
