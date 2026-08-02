package defpackage;

/* loaded from: classes8.dex */
public final class iro implements za70 {
    public final jro a;

    public iro(jro jroVar) {
        this.a = jroVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iro) && this.a.equals(((iro) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(experiments=" + this.a + ')';
    }
}
