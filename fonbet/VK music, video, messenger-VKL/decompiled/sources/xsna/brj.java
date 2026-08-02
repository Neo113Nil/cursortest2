package xsna;

/* compiled from: IdeasStoryViewState.kt */
/* loaded from: classes6.dex */
public final class brj {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public brj(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof brj)) {
            return false;
        }
        brj brjVar = (brj) obj;
        return this.a == brjVar.a && this.b == brjVar.b && this.c == brjVar.c && this.d == brjVar.d && this.e == brjVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ControlsViewState(topVisible=");
        sb.append(this.a);
        sb.append(", bottomActuallyVisible=");
        sb.append(this.b);
        sb.append(", backGradientVisible=");
        sb.append(this.c);
        sb.append(", fadeWithDelay=");
        sb.append(this.d);
        sb.append(", excludeAnimation=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
