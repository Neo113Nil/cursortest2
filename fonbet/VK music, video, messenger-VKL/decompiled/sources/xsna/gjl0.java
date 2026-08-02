package xsna;

/* compiled from: StorefrontAction.kt */
/* loaded from: classes18.dex */
public final class gjl0 implements hjl0 {
    public final ay00 b;

    public gjl0(ay00 ay00Var) {
        this.b = ay00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gjl0) && epx.f(this.b, ((gjl0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CartUpdated(event=" + this.b + ')';
    }
}
