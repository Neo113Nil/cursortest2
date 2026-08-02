package xsna;

import java.util.Collection;
import xsna.jlb0;

/* compiled from: AutoValue_ImmutableGaugeData.java */
/* loaded from: classes8.dex */
public final class km5<T extends jlb0> extends now<T> {
    public final Collection<T> b;

    public km5(Collection<T> collection) {
        if (collection == null) {
            throw new NullPointerException("Null points");
        }
        this.b = collection;
    }

    @Override // xsna.qtk
    public final Collection<T> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof now)) {
            return false;
        }
        return this.b.equals(((km5) ((now) obj)).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ImmutableGaugeData{points=" + this.b + "}";
    }
}
