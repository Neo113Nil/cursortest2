package xsna;

import com.vk.dto.common.Image;

/* compiled from: StorefrontViewedGoods.kt */
/* loaded from: classes18.dex */
public final class lpl0 {
    public final Image a;
    public final boolean b;

    public lpl0(Image image, boolean z) {
        this.a = image;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lpl0)) {
            return false;
        }
        lpl0 lpl0Var = (lpl0) obj;
        return epx.f(this.a, lpl0Var.a) && this.b == lpl0Var.b;
    }

    public final int hashCode() {
        Image image = this.a;
        return Boolean.hashCode(this.b) + ((image == null ? 0 : image.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StorefrontViewedGoodItem(image=");
        sb.append(this.a);
        sb.append(", blurred=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
