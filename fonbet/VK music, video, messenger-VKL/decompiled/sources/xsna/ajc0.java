package xsna;

import com.vk.dto.photo.Photo;
import com.vk.newsfeed.posting.impl.domain.model.PhotoTag;
import java.util.List;

/* compiled from: PostingPatch.kt */
/* loaded from: classes4.dex */
public final class ajc0 implements com.vk.newsfeed.posting.impl.domain.model.e {
    public final Photo b;
    public final List<PhotoTag> c;

    public ajc0(Photo photo, List<PhotoTag> list) {
        this.b = photo;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajc0)) {
            return false;
        }
        ajc0 ajc0Var = (ajc0) obj;
        return epx.f(this.b, ajc0Var.b) && epx.f(this.c, ajc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdatePhotoAndTags(photo=");
        sb.append(this.b);
        sb.append(", tags=");
        return ms9.a(')', sb, this.c);
    }
}
