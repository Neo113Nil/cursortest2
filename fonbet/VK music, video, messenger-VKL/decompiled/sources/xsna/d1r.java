package xsna;

import com.vk.clips.sdk.shared.feed.model.FeedItem;
import java.util.List;

/* compiled from: FeedItemsViewState.kt */
/* loaded from: classes17.dex */
public final class d1r {
    public final List<FeedItem> a;
    public final Integer b;

    /* JADX WARN: Multi-variable type inference failed */
    public d1r(List<? extends FeedItem> list, Integer num) {
        this.a = list;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1r)) {
            return false;
        }
        d1r d1rVar = (d1r) obj;
        return epx.f(this.a, d1rVar.a) && epx.f(this.b, d1rVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedItemsViewState(list=");
        sb.append(this.a);
        sb.append(", indexToFocus=");
        return uqi.b(sb, this.b, ')');
    }
}
