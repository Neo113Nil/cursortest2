package xsna;

/* compiled from: CourierMapViewState.kt */
/* loaded from: classes18.dex */
public final class qm00 {
    public final gk9 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public qm00() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm00)) {
            return false;
        }
        qm00 qm00Var = (qm00) obj;
        return epx.f(this.a, qm00Var.a) && this.b == qm00Var.b && this.c == qm00Var.c && this.d == qm00Var.d && this.e == qm00Var.e;
    }

    public final int hashCode() {
        gk9 gk9Var = this.a;
        return Boolean.hashCode(this.e) + qoy.b(qoy.b(qoy.b((gk9Var == null ? 0 : gk9Var.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MapViewState(cameraPosition=");
        sb.append(this.a);
        sb.append(", isUserLocationShown=");
        sb.append(this.b);
        sb.append(", isPositionMoving=");
        sb.append(this.c);
        sb.append(", isMapCreated=");
        sb.append(this.d);
        sb.append(", isLoading=");
        return defpackage.q0.a(sb, this.e, ')');
    }

    public /* synthetic */ qm00(int i) {
        this(null, false, false, false, true);
    }

    public qm00(gk9 gk9Var, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = gk9Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }
}
