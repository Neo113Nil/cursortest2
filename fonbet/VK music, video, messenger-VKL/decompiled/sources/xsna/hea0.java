package xsna;

import com.vk.dto.common.ImageSize;
import com.vk.dto.photo.Photo;

/* compiled from: PhotoWrapper.kt */
/* loaded from: classes5.dex */
public final class hea0 {
    public final Photo a;

    public hea0(Photo photo) {
        this.a = photo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hea0)) {
            return false;
        }
        Photo photo = this.a;
        hea0 hea0Var = (hea0) obj;
        if (epx.f(photo.J, hea0Var.a.J) && epx.f(photo.y, hea0Var.a.y) && epx.f(photo.t, hea0Var.a.t) && epx.f(photo.s, hea0Var.a.s)) {
            return epx.f(photo, hea0Var.a);
        }
        return false;
    }

    public final int hashCode() {
        Photo photo = this.a;
        int hashCode = photo.hashCode() * 31;
        ImageSize imageSize = photo.J;
        int b = fq.b(photo.y, (hashCode + (imageSize != null ? imageSize.hashCode() : 0)) * 31, 31);
        String str = photo.t;
        int hashCode2 = (b + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = photo.s;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
