package xsna;

/* compiled from: CatalogCommand.kt */
/* loaded from: classes16.dex */
public final class ktf0 extends n3a {
    public final String a;

    public ktf0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ktf0) && epx.f(this.a, ((ktf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("ReloadSection(sourceBlockId="), this.a, ')');
    }
}
