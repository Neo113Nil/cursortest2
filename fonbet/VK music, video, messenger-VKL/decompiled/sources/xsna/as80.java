package xsna;

import com.vk.dto.stories.model.StoriesContainer;

/* compiled from: OpenStoriesRequest.kt */
/* loaded from: classes6.dex */
public final class as80 {
    public final StoriesContainer a;
    public final long b;

    public as80(StoriesContainer storiesContainer, long j) {
        this.a = storiesContainer;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as80)) {
            return false;
        }
        as80 as80Var = (as80) obj;
        return epx.f(this.a, as80Var.a) && this.b == as80Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenStoriesRequest(storiesContainer=");
        sb.append(this.a);
        sb.append(", startClickTime=");
        return vu5.a(')', this.b, sb);
    }
}
