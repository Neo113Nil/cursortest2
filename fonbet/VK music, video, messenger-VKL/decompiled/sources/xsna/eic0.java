package xsna;

import com.vk.dto.tags.Tag;
import com.vk.newsfeed.posting.impl.domain.model.PhotoTag;

/* compiled from: PostingPatch.kt */
/* loaded from: classes4.dex */
public final class eic0 implements com.vk.newsfeed.posting.impl.domain.model.e {
    public final PhotoTag b;
    public final Tag c;

    public eic0(PhotoTag photoTag, Tag tag) {
        this.b = photoTag;
        this.c = tag;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eic0)) {
            return false;
        }
        eic0 eic0Var = (eic0) obj;
        return epx.f(this.b, eic0Var.b) && epx.f(this.c, eic0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Tag tag = this.c;
        return hashCode + (tag == null ? 0 : tag.hashCode());
    }

    public final String toString() {
        return "AddPhotoTag(photoTag=" + this.b + ", tag=" + this.c + ')';
    }
}
