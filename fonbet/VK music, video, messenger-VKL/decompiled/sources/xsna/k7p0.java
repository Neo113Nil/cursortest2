package xsna;

import com.vk.dto.common.Image;

/* compiled from: MarketItemReviewsViewState.kt */
/* loaded from: classes18.dex */
public final class k7p0 {
    public final Image a;
    public final String b;

    public k7p0(Image image, String str) {
        this.a = image;
        this.b = str;
    }

    public final Image a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7p0)) {
            return false;
        }
        k7p0 k7p0Var = (k7p0) obj;
        return epx.f(this.a, k7p0Var.a) && epx.f(this.b, k7p0Var.b);
    }

    public final int hashCode() {
        Image image = this.a;
        return this.b.hashCode() + ((image == null ? 0 : image.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopBarData(productImage=");
        sb.append(this.a);
        sb.append(", productName=");
        return ho8.a(sb, this.b, ')');
    }
}
