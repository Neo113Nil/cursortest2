package xsna;

/* compiled from: CatalogCommand.kt */
/* loaded from: classes16.dex */
public final class ber extends n3a {
    public final String a;

    public ber(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ber) && epx.f(this.a, ((ber) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("FilterSwitchedByReplacementToBlockId(replacementToBlockId="), this.a, ')');
    }
}
