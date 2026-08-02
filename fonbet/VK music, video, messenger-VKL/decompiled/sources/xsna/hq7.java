package xsna;

/* compiled from: BookingEditScreenViewState.kt */
/* loaded from: classes18.dex */
public final class hq7 implements ao50 {
    public final fi50 a;

    public hq7(fi50 fi50Var) {
        this.a = fi50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hq7) && this.a.equals(((hq7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return j8.b(new StringBuilder("BookingEditScreenViewState(scene="), this.a, ')');
    }
}
