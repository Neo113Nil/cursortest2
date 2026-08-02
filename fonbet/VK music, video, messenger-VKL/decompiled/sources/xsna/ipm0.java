package xsna;

/* compiled from: BroadcastState.kt */
/* loaded from: classes7.dex */
public final class ipm0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public ipm0() {
        this(false, false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ipm0)) {
            return false;
        }
        ipm0 ipm0Var = (ipm0) obj;
        return this.a == ipm0Var.a && this.b == ipm0Var.b && this.c == ipm0Var.c && this.d == ipm0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamingState(isMyStream=");
        sb.append(this.a);
        sb.append(", isEnabled=");
        sb.append(this.b);
        sb.append(", isStarted=");
        sb.append(this.c);
        sb.append(", isSupported=");
        return defpackage.q0.a(sb, this.d, ')');
    }

    public ipm0(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }
}
