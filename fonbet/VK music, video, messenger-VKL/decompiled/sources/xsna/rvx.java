package xsna;

import com.vk.clips.sdk.shared.feed.model.FeedItem;

/* compiled from: ItemWithKey.kt */
/* loaded from: classes17.dex */
public final class rvx<Item> {
    public final FeedItem a;
    public final String b;

    public rvx(FeedItem feedItem, String str) {
        this.a = feedItem;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvx)) {
            return false;
        }
        rvx rvxVar = (rvx) obj;
        return this.a.equals(rvxVar.a) && epx.f(this.b, rvxVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ItemWithKey(item=");
        sb.append(this.a);
        sb.append(", key=");
        return ho8.a(sb, this.b, ')');
    }
}
