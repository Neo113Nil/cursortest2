package xsna;

/* compiled from: BroadcastState.kt */
/* loaded from: classes7.dex */
public final class sw3 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public sw3() {
        this(false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw3)) {
            return false;
        }
        sw3 sw3Var = (sw3) obj;
        return this.a == sw3Var.a && this.b == sw3Var.b && this.c == sw3Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AsrRecordState(isEnabled=");
        sb.append(this.a);
        sb.append(", isStarted=");
        sb.append(this.b);
        sb.append(", canStop=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    public sw3(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }
}
