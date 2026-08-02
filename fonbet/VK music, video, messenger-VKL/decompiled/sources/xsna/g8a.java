package xsna;

/* compiled from: CatalogLegacyBlockConfig.kt */
/* loaded from: classes.dex */
public final class g8a {
    public final boolean a;

    public g8a() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g8a) && this.a == ((g8a) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("CatalogLegacyBlockConfig(shouldRecreateOnBlockIdChange="), this.a, ')');
    }

    public g8a(boolean z) {
        this.a = z;
    }
}
