package xsna;

/* compiled from: BroadcastState.kt */
/* loaded from: classes7.dex */
public final class tah0 {
    public final boolean a;
    public final boolean b;

    public tah0() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tah0)) {
            return false;
        }
        tah0 tah0Var = (tah0) obj;
        return this.a == tah0Var.a && this.b == tah0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScreenCastState(isEnabled=");
        sb.append(this.a);
        sb.append(", isStarted=");
        return defpackage.q0.a(sb, this.b, ')');
    }

    public tah0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
