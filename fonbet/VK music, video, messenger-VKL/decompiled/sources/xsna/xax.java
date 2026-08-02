package xsna;

/* compiled from: CommunityProfileTopBarHost.kt */
/* loaded from: classes5.dex */
public final class xax {
    public static final xax e = new xax(false, false, false, false);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public xax() {
        this(false, false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xax)) {
            return false;
        }
        xax xaxVar = (xax) obj;
        return this.a == xaxVar.a && this.b == xaxVar.b && this.c == xaxVar.c && this.d == xaxVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InteractiveBoundsExpectations(expectsBeforeIcon=");
        sb.append(this.a);
        sb.append(", expectsExtraIcon=");
        sb.append(this.b);
        sb.append(", expectsMainIcon=");
        sb.append(this.c);
        sb.append(", expectsStoriesMiddle=");
        return defpackage.q0.a(sb, this.d, ')');
    }

    public xax(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }
}
