package xsna;

import com.vk.ecomm.design.compose.gallery.ProductGalleryItem;
import com.vk.ecomm.market.good.good2.presentation.IslandPart;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: ProductCardGalleryViewState.kt */
/* loaded from: classes18.dex */
public final class eld0 implements gld0 {
    public final List<ProductGalleryItem> a;
    public final int b;
    public final IslandPart c;

    public eld0(ListBuilder listBuilder, int i, IslandPart islandPart) {
        this.a = listBuilder;
        this.b = i;
        this.c = islandPart;
    }

    @Override // xsna.gld0
    public final IslandPart U0() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eld0)) {
            return false;
        }
        eld0 eld0Var = (eld0) obj;
        return epx.f(this.a, eld0Var.a) && this.b == eld0Var.b && this.c == eld0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + shy.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ProductCardGalleryViewState(items=" + this.a + ", currentPosition=" + this.b + ", islandPart=" + this.c + ')';
    }
}
