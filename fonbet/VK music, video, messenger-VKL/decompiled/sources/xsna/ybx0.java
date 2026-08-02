package xsna;

/* compiled from: WatchTogetherButtonState.kt */
/* loaded from: classes7.dex */
public final class ybx0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public ybx0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ybx0)) {
            return false;
        }
        ybx0 ybx0Var = (ybx0) obj;
        return this.a == ybx0Var.a && this.b == ybx0Var.b && this.c == ybx0Var.c && this.d == ybx0Var.d && this.e == ybx0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WatchTogetherButtonState(isVisible=");
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

    public /* synthetic */ ybx0(int i) {
        this(false, false, false, false, false);
    }

    public ybx0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }
}
