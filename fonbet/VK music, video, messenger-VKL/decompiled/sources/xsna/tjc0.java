package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostingState;

/* compiled from: PostingPatch.kt */
/* loaded from: classes4.dex */
public final class tjc0 implements com.vk.newsfeed.posting.impl.domain.model.e {
    public final PostingState b;

    public tjc0(PostingState postingState) {
        this.b = postingState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tjc0) && epx.f(this.b, ((tjc0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "StateRestored(state=" + this.b + ')';
    }
}
