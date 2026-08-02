package xsna;

import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: GoodReviewsAndCommentsViewHolder.kt */
/* loaded from: classes18.dex */
public final class q310 {
    public final List<c8u> a;

    /* JADX WARN: Multi-variable type inference failed */
    public q310(List<? extends c8u> list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q310) && epx.f(this.a, ((q310) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("MarketItemReviewsAndCommentsItem(pages="), this.a);
    }

    public q310() {
        this(EmptyList.b);
    }
}
