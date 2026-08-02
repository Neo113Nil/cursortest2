package xsna;

/* compiled from: IdeasStoryState.kt */
/* loaded from: classes6.dex */
public final class xqj {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public xqj(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public static xqj a(xqj xqjVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        if ((i & 1) != 0) {
            z = xqjVar.a;
        }
        boolean z6 = z;
        if ((i & 2) != 0) {
            z2 = xqjVar.b;
        }
        boolean z7 = z2;
        if ((i & 4) != 0) {
            z3 = xqjVar.c;
        }
        boolean z8 = z3;
        if ((i & 8) != 0) {
            z4 = xqjVar.d;
        }
        boolean z9 = z4;
        if ((i & 16) != 0) {
            z5 = xqjVar.e;
        }
        xqjVar.getClass();
        return new xqj(z6, z7, z8, z9, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqj)) {
            return false;
        }
        xqj xqjVar = (xqj) obj;
        return this.a == xqjVar.a && this.b == xqjVar.b && this.c == xqjVar.c && this.d == xqjVar.d && this.e == xqjVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ControlsState(isControlsVisible=");
        sb.append(this.a);
        sb.append(", controlsFadeWithDelay=");
        sb.append(this.b);
        sb.append(", controlsExcludeAnimation=");
        sb.append(this.c);
        sb.append(", isBottomControlsVisible=");
        sb.append(this.d);
        sb.append(", isBackGradientVisible=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
