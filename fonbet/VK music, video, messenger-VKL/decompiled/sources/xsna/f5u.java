package xsna;

import com.vk.dto.common.Good;

/* compiled from: CommunityProfileContentItem.kt */
/* loaded from: classes5.dex */
public final class f5u implements hfz {
    public final Good b;

    public f5u(Good good) {
        this.b = good;
    }

    @Override // xsna.hfz
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Long getItemId() {
        return Long.valueOf(this.b.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f5u) && epx.f(this.b, ((f5u) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "GoodListItem(good=" + this.b + ')';
    }
}
