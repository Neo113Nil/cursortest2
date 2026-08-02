package xsna;

import com.vk.clips.sdk.shared.feed.model.FeedItem;

/* compiled from: FocusedItemViewData.kt */
/* loaded from: classes17.dex */
public final class qxr<Item> {
    public final FeedItem a;
    public final String b;
    public final int c;

    public qxr(FeedItem feedItem, String str, int i) {
        this.a = feedItem;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxr)) {
            return false;
        }
        qxr qxrVar = (qxr) obj;
        return this.a.equals(qxrVar.a) && epx.f(this.b, qxrVar.b) && this.c == qxrVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FocusedItemViewData(item=");
        sb.append(this.a);
        sb.append(", key=");
        sb.append(this.b);
        sb.append(", position=");
        return vu5.b(sb, this.c, ')');
    }
}
