package defpackage;

/* loaded from: classes.dex */
public final class ban implements j131 {
    public final oz40 a;

    public ban(oz40 oz40Var) {
        this.a = oz40Var;
    }

    @Override // defpackage.j131
    public final Object a(r1b0 r1b0Var) {
        return this.a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ban) && this.a == ((ban) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.a + ')';
    }
}
