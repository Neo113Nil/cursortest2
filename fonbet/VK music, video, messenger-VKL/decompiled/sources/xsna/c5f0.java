package xsna;

import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.photo.Photo;
import java.util.List;

/* compiled from: ReactionsFeedPhotosDto.kt */
/* loaded from: classes4.dex */
public final class c5f0 {
    public final List<a> a;

    /* compiled from: ReactionsFeedPhotosDto.kt */
    public static final class a {
        public final Photo a;
        public final PhotoRestriction b;

        public a(Photo photo, PhotoRestriction photoRestriction) {
            this.a = photo;
            this.b = photoRestriction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            PhotoRestriction photoRestriction = this.b;
            return hashCode + (photoRestriction == null ? 0 : photoRestriction.hashCode());
        }

        public final String toString() {
            return "PhotoDto(photo=" + this.a + ", restriction=" + this.b + ')';
        }
    }

    public c5f0(List<a> list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c5f0) && epx.f(this.a, ((c5f0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ReactionsFeedPhotosDto(photos="), this.a);
    }
}
