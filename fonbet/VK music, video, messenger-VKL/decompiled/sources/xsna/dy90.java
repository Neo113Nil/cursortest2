package xsna;

/* compiled from: ReefState.kt */
/* loaded from: classes5.dex */
public final class dy90 extends wof0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public dy90(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy90)) {
            return false;
        }
        dy90 dy90Var = (dy90) obj;
        return this.a == dy90Var.a && this.b == dy90Var.b && this.c == dy90Var.c && this.d == dy90Var.d && this.e == dy90Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder c = gp.c("PermissionState(locationAccess=", ", mobileNetworkAccess=", ", wifiAccess=", this.a, this.b);
        gsi0.c(c, this.c, ", readPrecisePhoneState=", this.d, ", readPhoneNumbers=");
        return n23.b(c, this.e, ")");
    }
}
