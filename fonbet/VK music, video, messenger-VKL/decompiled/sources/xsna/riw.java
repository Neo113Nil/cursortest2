package xsna;

import com.vk.dto.common.filter.ImageSide;

/* compiled from: ImageSizeFilters.kt */
/* loaded from: classes18.dex */
public final class riw {
    public final int a;
    public final ImageSide b;

    static {
        ImageSide imageSide = ImageSide.WIDTH;
    }

    public riw(int i, ImageSide imageSide) {
        this.a = i;
        this.b = imageSide;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof riw)) {
            return false;
        }
        riw riwVar = (riw) obj;
        return this.a == riwVar.a && this.b == riwVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ImageFilterData(size=" + this.a + ", side=" + this.b + ')';
    }
}
