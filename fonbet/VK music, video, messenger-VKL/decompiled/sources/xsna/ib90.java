package xsna;

/* compiled from: PagerIndicator.kt */
/* loaded from: classes16.dex */
public final class ib90 {
    public final mc90 a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public ib90(mc90 mc90Var, int i, boolean z, boolean z2) {
        this.a = mc90Var;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib90)) {
            return false;
        }
        ib90 ib90Var = (ib90) obj;
        return this.a.equals(ib90Var.a) && this.b == ib90Var.b && this.c == ib90Var.c && this.d == ib90Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(shy.a(3, shy.a(this.b, this.a.hashCode() * 31, 31), 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagerIndicatorState(pagerState=");
        sb.append(this.a);
        sb.append(", pageCount=");
        sb.append(this.b);
        sb.append(", indicationCount=3, hasAddPage=");
        sb.append(this.c);
        sb.append(", isDark=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
