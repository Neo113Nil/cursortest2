package xsna;

/* compiled from: PlayerState.kt */
/* loaded from: classes17.dex */
public final class j4b0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public j4b0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4b0)) {
            return false;
        }
        j4b0 j4b0Var = (j4b0) obj;
        return this.a == j4b0Var.a && this.b == j4b0Var.b && this.c == j4b0Var.c && this.d == j4b0Var.d && this.e == j4b0Var.e && this.f == j4b0Var.f && this.g == j4b0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerState(isPlaying=");
        sb.append(this.a);
        sb.append(", isBuffering=");
        sb.append(this.b);
        sb.append(", isPausedByUser=");
        sb.append(this.c);
        sb.append(", isPaused=");
        sb.append(this.d);
        sb.append(", isRestricted=");
        sb.append(this.e);
        sb.append(", isError=");
        sb.append(this.f);
        sb.append(", isComplete=");
        return defpackage.q0.a(sb, this.g, ')');
    }

    public j4b0(kih0 kih0Var) {
        this(kih0Var.isPlaying(), kih0Var.d(), kih0Var.M(), kih0Var.isPaused(), kih0Var.B(), kih0Var.J(), kih0Var.a());
    }
}
