package xsna;

/* compiled from: BookingCalendarScreenViewState.kt */
/* loaded from: classes18.dex */
public final class tn7 implements ao50 {
    public final fi50 a;

    public tn7(fi50 fi50Var) {
        this.a = fi50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tn7) && this.a.equals(((tn7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return j8.b(new StringBuilder("BookingCalendarScreenViewState(scene="), this.a, ')');
    }
}
