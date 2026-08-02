package xsna;

/* compiled from: StorefrontAction.kt */
/* loaded from: classes18.dex */
public final class mjl0 implements hjl0 {
    public final ay00 b;

    public mjl0(ay00 ay00Var) {
        this.b = ay00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mjl0) && epx.f(this.b, ((mjl0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CartUpdated(event=" + this.b + ')';
    }
}
