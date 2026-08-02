package xsna;

import com.vk.clips.sdk.shared.feed.model.FeedItem;
import java.util.List;

/* compiled from: ItemsWithLookup.kt */
/* loaded from: classes17.dex */
public final class gwx {
    public final List<FeedItem> a;
    public final bpn0 b = new bpn0(new qbj(this, 18));

    /* JADX WARN: Multi-variable type inference failed */
    public gwx(List<? extends FeedItem> list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gwx) && epx.f(this.a, ((gwx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ItemsWithLookup(items="), this.a);
    }
}
