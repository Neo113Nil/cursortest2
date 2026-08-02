package xsna;

/* compiled from: ControlsButtons.kt */
/* loaded from: classes16.dex */
public final class rqj {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public rqj(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        z3 = (i & 4) != 0 ? false : z3;
        z4 = (i & 8) != 0 ? false : z4;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rqj)) {
            return false;
        }
        rqj rqjVar = (rqj) obj;
        return this.a == rqjVar.a && this.b == rqjVar.b && this.c == rqjVar.c && this.d == rqjVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ControlsButtonsParams(shouldShowFeedback=");
        sb.append(this.a);
        sb.append(", isLandscape=");
        sb.append(this.b);
        sb.append(", shouldHideShareButton=");
        sb.append(this.c);
        sb.append(", isSmallScreen=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
