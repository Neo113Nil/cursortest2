package xsna;

/* compiled from: OneVideoTrackSelectionRule.kt */
/* loaded from: classes8.dex */
public final class qei0 {
    public final int a;
    public final int b;

    public qei0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qei0)) {
            return false;
        }
        qei0 qei0Var = (qei0) obj;
        return this.a == qei0Var.a && this.b == qei0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return sl9.c(this.a, this.b, "SelectionResult(selectedIndex=", ", reason=", ")");
    }
}
