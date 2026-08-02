package xsna;

import com.vk.dto.common.Image;

/* compiled from: MarketProductTilePaginatedImagesView.kt */
/* loaded from: classes18.dex */
public final class tjw {
    public final Image a;
    public final String b;
    public final Integer c;
    public final boolean d;
    public final boolean e;

    public tjw(Image image, String str, Integer num, boolean z, boolean z2) {
        this.a = image;
        this.b = str;
        this.c = num;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tjw)) {
            return false;
        }
        tjw tjwVar = (tjw) obj;
        return epx.f(this.a, tjwVar.a) && epx.f(this.b, tjwVar.b) && epx.f(this.c, tjwVar.c) && this.d == tjwVar.d && this.e == tjwVar.e;
    }

    public final int hashCode() {
        Image image = this.a;
        int hashCode = (image == null ? 0 : image.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        return Boolean.hashCode(this.e) + qoy.b((hashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageItem(image=");
        sb.append(this.a);
        sb.append(", contentDescription=");
        sb.append(this.b);
        sb.append(", placeholderResId=");
        sb.append(this.c);
        sb.append(", isMuted=");
        sb.append(this.d);
        sb.append(", isRestricted=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
