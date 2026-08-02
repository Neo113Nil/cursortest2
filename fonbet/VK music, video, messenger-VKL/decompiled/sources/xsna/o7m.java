package xsna;

/* compiled from: Node.kt */
/* loaded from: classes.dex */
public final class o7m implements z470 {
    public final l7m a;

    public o7m(l7m l7mVar) {
        this.a = l7mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o7m) && this.a.equals(((o7m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DiContextNodeKey(diContext=" + this.a + ')';
    }
}
