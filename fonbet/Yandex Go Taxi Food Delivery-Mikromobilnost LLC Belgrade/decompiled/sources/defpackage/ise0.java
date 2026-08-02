package defpackage;

/* loaded from: classes13.dex */
public final class ise0 extends qse0 {
    public final vmn0 a;

    public ise0(vmn0 vmn0Var) {
        this.a = vmn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ise0) && this.a == ((ise0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "SelfDrivingCar(action=" + this.a + ", showSummaryParams=null)";
    }
}
