package xsna;

/* compiled from: CatalogCommand.kt */
/* loaded from: classes16.dex */
public final class xxf0 extends n3a {
    public final String a;

    public xxf0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xxf0) && epx.f(this.a, ((xxf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("RemoveWithUniqueIdCmd(uniqueId="), this.a, ')');
    }
}
