package xsna;

import java.util.Set;

/* compiled from: ImItemListLoaderUpdate.kt */
/* loaded from: classes2.dex */
public final class e6w implements b6w {
    public final Set<b5w> a;

    public e6w(Set<b5w> set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e6w) && epx.f(this.a, ((e6w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ur.c(new StringBuilder("ImItemListLoaderUpdates(updatedItems="), this.a, ')');
    }
}
