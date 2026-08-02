package xsna;

import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.photo.PhotoTag;

/* compiled from: PhotoTagSuggestedConfirmationDto.kt */
/* loaded from: classes4.dex */
public final class zba0 {
    public final Photos a;
    public final PhotoTag b;

    public zba0(Photos photos, PhotoTag photoTag) {
        this.a = photos;
        this.b = photoTag;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zba0)) {
            return false;
        }
        zba0 zba0Var = (zba0) obj;
        return epx.f(this.a, zba0Var.a) && epx.f(this.b, zba0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        PhotoTag photoTag = this.b;
        return hashCode + (photoTag == null ? 0 : photoTag.hashCode());
    }

    public final String toString() {
        return "PhotoTagSuggestedConfirmationDto(entry=" + this.a + ", firstTag=" + this.b + ')';
    }
}
