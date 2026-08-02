package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostingContext;

/* compiled from: PostingPatch.kt */
/* loaded from: classes4.dex */
public final class sjc0 implements com.vk.newsfeed.posting.impl.domain.model.e {
    public final PostingContext b;

    public sjc0(PostingContext postingContext) {
        this.b = postingContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sjc0) && epx.f(this.b, ((sjc0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "LoadingStarted(context=" + this.b + ')';
    }
}
