package xsna;

/* compiled from: ListItems.kt */
/* loaded from: classes6.dex */
public final class z690 extends p7l0 {
    public final qai0 b;

    public z690(qai0 qai0Var) {
        this.b = qai0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return z690.class.equals(obj != null ? obj.getClass() : null) && epx.f(this.b, ((z690) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "PackStylesAdapterItem(item=" + this.b + ')';
    }
}
