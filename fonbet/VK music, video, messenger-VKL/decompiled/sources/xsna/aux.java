package xsna;

import com.vk.newsfeed.common.recycler.animators.ItemAnimationType;

/* compiled from: ItemAnimation.kt */
/* loaded from: classes4.dex */
public final class aux {
    public final long a;
    public final ItemAnimationType b;

    public aux(long j, ItemAnimationType itemAnimationType) {
        this.a = j;
        this.b = itemAnimationType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aux)) {
            return false;
        }
        aux auxVar = (aux) obj;
        return this.a == auxVar.a && this.b == auxVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ItemAnimation(duration=" + this.a + ", type=" + this.b + ')';
    }
}
