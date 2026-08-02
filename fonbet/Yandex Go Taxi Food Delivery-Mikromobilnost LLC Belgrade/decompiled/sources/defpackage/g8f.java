package defpackage;

/* loaded from: classes2.dex */
public final class g8f {
    public final f8f a;

    public g8f(f8f f8fVar) {
        this.a = f8fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g8f) && this.a.equals(((g8f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Invoice(externalCreate=" + this.a + ')';
    }
}
