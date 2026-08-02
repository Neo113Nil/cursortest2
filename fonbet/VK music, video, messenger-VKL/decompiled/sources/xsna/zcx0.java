package xsna;

/* compiled from: BroadcastState.kt */
/* loaded from: classes7.dex */
public final class zcx0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public zcx0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zcx0)) {
            return false;
        }
        zcx0 zcx0Var = (zcx0) obj;
        return this.a == zcx0Var.a && this.b == zcx0Var.b && this.c == zcx0Var.c && this.d == zcx0Var.d && this.e == zcx0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WatchTogetherState(isVisible=");
        sb.append(this.a);
        sb.append(", isPlaying=");
        sb.append(this.b);
        sb.append(", isButtonEnabled=");
        sb.append(this.c);
        sb.append(", isMediaOptionAllowed=");
        sb.append(this.d);
        sb.append(", isPlayAllowed=");
        return defpackage.q0.a(sb, this.e, ')');
    }

    public /* synthetic */ zcx0(int i) {
        this(false, false, false, false, false);
    }

    public zcx0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }
}
