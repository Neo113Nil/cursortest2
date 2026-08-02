package xsna;

/* compiled from: PositionDurationViewState.kt */
/* loaded from: classes8.dex */
public final class ozb0 implements l2u0 {
    public static final ozb0 e = new ozb0(0, 0, false, false);
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;

    public ozb0(int i, int i2, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ozb0)) {
            return false;
        }
        ozb0 ozb0Var = (ozb0) obj;
        return this.a == ozb0Var.a && this.b == ozb0Var.b && this.c == ozb0Var.c && this.d == ozb0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + shy.a(this.c, qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31);
    }

    @Override // xsna.n2u0
    public final boolean isVisible() {
        return this.a;
    }

    public final String toString() {
        return rzl.a(this.c, this.d, ", positionSec=", ")", gp.c("PositionDurationViewState(isVisible=", ", isInAnimation=", ", durationSec=", this.a, this.b));
    }
}
