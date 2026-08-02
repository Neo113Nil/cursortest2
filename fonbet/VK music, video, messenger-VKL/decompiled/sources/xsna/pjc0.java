package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;

/* compiled from: PostingPatch.kt */
/* loaded from: classes4.dex */
public final class pjc0 implements com.vk.newsfeed.posting.impl.domain.model.e {
    public final PostEditableData b;

    public pjc0(PostEditableData postEditableData) {
        this.b = postEditableData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pjc0) && epx.f(this.b, ((pjc0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "DraftLoaded(data=" + this.b + ')';
    }
}
