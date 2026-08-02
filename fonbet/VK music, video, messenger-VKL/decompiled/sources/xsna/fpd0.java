package xsna;

import com.vk.dto.common.Image;
import java.util.List;

/* compiled from: CheckoutOrderProduct.kt */
/* loaded from: classes18.dex */
public final class fpd0 {
    public final Image a;
    public final List<Image> b;

    public fpd0(Image image, List<Image> list) {
        this.a = image;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpd0)) {
            return false;
        }
        fpd0 fpd0Var = (fpd0) obj;
        return epx.f(this.a, fpd0Var.a) && epx.f(this.b, fpd0Var.b);
    }

    public final int hashCode() {
        Image image = this.a;
        return this.b.hashCode() + ((image == null ? 0 : image.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductImages(mainImage=");
        sb.append(this.a);
        sb.append(", images=");
        return ms9.a(')', sb, this.b);
    }
}
