package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostingStepScreen;

/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public final class mlc0 {
    public final PostingStepScreen a;

    public mlc0(PostingStepScreen postingStepScreen) {
        this.a = postingStepScreen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mlc0) && epx.f(this.a, ((mlc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PostingScreenState(screen=" + this.a + ')';
    }
}
