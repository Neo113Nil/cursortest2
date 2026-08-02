package xsna;

/* compiled from: CatalogCommand.kt */
/* loaded from: classes16.dex */
public final class u0g0 extends n3a {
    public final db a;

    public u0g0(db dbVar) {
        this.a = dbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0g0) && epx.f(this.a, ((u0g0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ReplaceBlock(replacementId=" + this.a + ')';
    }
}
