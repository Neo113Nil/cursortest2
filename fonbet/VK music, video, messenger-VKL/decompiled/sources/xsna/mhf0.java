package xsna;

/* compiled from: BroadcastState.kt */
/* loaded from: classes7.dex */
public final class mhf0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public mhf0() {
        this(false, false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mhf0)) {
            return false;
        }
        mhf0 mhf0Var = (mhf0) obj;
        return this.a == mhf0Var.a && this.b == mhf0Var.b && this.c == mhf0Var.c && this.d == mhf0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordState(isEnabled=");
        sb.append(this.a);
        sb.append(", isStarted=");
        sb.append(this.b);
        sb.append(", isMyStream=");
        sb.append(this.c);
        sb.append(", isSupported=");
        return defpackage.q0.a(sb, this.d, ')');
    }

    public mhf0(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }
}
