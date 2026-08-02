package defpackage;

/* loaded from: classes2.dex */
public final class e8f implements za70 {
    public final g8f a;

    public e8f(g8f g8fVar) {
        this.a = g8fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e8f) && this.a.equals(((e8f) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "Data(invoice=" + this.a + ')';
    }
}
