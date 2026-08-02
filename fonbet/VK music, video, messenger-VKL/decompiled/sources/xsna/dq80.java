package xsna;

/* compiled from: CatalogCommand.kt */
/* loaded from: classes16.dex */
public final class dq80 extends n3a {
    public final String a;

    public dq80(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dq80) && epx.f(this.a, ((dq80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("OpenCatalogOptions(sourceBlockId="), this.a, ')');
    }
}
