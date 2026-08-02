package xsna;

import com.vk.dto.newsfeed.entries.Post;
import xsna.xn60;

/* compiled from: NewsfeedListAction.kt */
/* loaded from: classes4.dex */
public final class yn60 implements xn60.b {
    public final Post b;

    public yn60(Post post) {
        this.b = post;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yn60) && epx.f(this.b, ((yn60) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "InsertComment(entry=" + this.b + ')';
    }
}
