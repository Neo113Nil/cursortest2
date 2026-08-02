package xsna;

/* compiled from: AbstractInstrument.java */
/* loaded from: classes8.dex */
public abstract class te {
    public final ym5 a;

    public te(ym5 ym5Var) {
        this.a = ym5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof te) {
            return this.a.equals(((te) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return getClass().getSimpleName() + "{descriptor=" + this.a + '}';
    }
}
