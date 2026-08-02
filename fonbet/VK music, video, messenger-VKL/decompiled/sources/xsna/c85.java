package xsna;

/* compiled from: Filters.kt */
/* loaded from: classes5.dex */
public final class c85 {
    public final boolean a;

    public c85(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c85) && this.a == ((c85) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("AuthorFilter(isEnabled="), this.a, ')');
    }
}
