package xsna;

import com.vk.clips.sdk.shared.feed.model.FeedItem;
import xsna.c2r;

/* compiled from: FeedPatch.kt */
/* loaded from: classes17.dex */
public final class g2r implements c2r.e {
    public final FeedItem b;

    public g2r(FeedItem.d dVar) {
        this.b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g2r) && epx.f(this.b, ((g2r) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Single(item=" + this.b + ')';
    }
}
