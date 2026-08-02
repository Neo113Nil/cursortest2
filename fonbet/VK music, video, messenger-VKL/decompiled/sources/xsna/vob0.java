package xsna;

import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;

/* compiled from: PollEditorPatch.kt */
/* loaded from: classes4.dex */
public final class vob0 implements yob0 {
    public final PostingPollDto b;

    public vob0(PostingPollDto postingPollDto) {
        this.b = postingPollDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vob0) && epx.f(this.b, ((vob0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "NewPollState(postingPollDto=" + this.b + ')';
    }
}
