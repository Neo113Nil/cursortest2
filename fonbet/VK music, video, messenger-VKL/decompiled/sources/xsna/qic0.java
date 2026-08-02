package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PhotoTag;

/* compiled from: PostingPatch.kt */
/* loaded from: classes4.dex */
public final class qic0 implements com.vk.newsfeed.posting.impl.domain.model.e {
    public final PhotoTag b;

    public qic0(PhotoTag photoTag) {
        this.b = photoTag;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qic0) && epx.f(this.b, ((qic0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "RemovePhotoTag(tag=" + this.b + ')';
    }
}
