package xsna;

/* compiled from: ControlsStyle.kt */
/* loaded from: classes8.dex */
public final class yqj {
    public static final yqj e = new yqj(false, false, false, false);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public yqj(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqj)) {
            return false;
        }
        yqj yqjVar = (yqj) obj;
        return this.a == yqjVar.a && this.b == yqjVar.b && this.c == yqjVar.c && this.d == yqjVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder c = gp.c("ControlsStyle(isBottomSeekBar=", ", isFullSeekPreview=", ", isFastSpeedEnabled=", this.a, this.b);
        c.append(this.c);
        c.append(", isExtendSeekBar=");
        c.append(this.d);
        c.append(")");
        return c.toString();
    }
}
