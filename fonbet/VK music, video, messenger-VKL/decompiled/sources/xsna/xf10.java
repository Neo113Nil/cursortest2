package xsna;

/* compiled from: BasicMarquee.kt */
/* loaded from: classes11.dex */
final class xf10 extends d730<yf10> {
    public final int a = Integer.MAX_VALUE;
    public final int b;
    public final int c;
    public final mr d;
    public final float e;

    public xf10(int i, int i2, mr mrVar, float f) {
        this.b = i;
        this.c = i2;
        this.d = mrVar;
        this.e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf10)) {
            return false;
        }
        xf10 xf10Var = (xf10) obj;
        return this.a == xf10Var.a && this.b == xf10Var.b && this.c == xf10Var.c && epx.f(this.d, xf10Var.d) && pco.b(this.e, xf10Var.e);
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + ((this.d.hashCode() + shy.a(this.c, shy.a(this.b, shy.a(0, Integer.hashCode(this.a) * 31, 31), 31), 31)) * 31);
    }

    @Override // xsna.d730
    public final yf10 r() {
        return new yf10(this.a, this.b, this.c, this.d, this.e);
    }

    @Override // xsna.d730
    public final void s(yf10 yf10Var) {
        yf10 yf10Var2 = yf10Var;
        ((zak0) yf10Var2.y).setValue(this.d);
        ((zak0) yf10Var2.z).setValue(new vf10());
        int i = yf10Var2.p;
        int i2 = this.a;
        int i3 = this.b;
        int i4 = this.c;
        float f = this.e;
        if (i == i2 && yf10Var2.q == i3 && yf10Var2.r == i4 && pco.b(yf10Var2.s, f)) {
            return;
        }
        yf10Var2.p = i2;
        yf10Var2.q = i3;
        yf10Var2.r = i4;
        yf10Var2.s = f;
        yf10Var2.j2();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarqueeModifierElement(iterations=");
        sb.append(this.a);
        sb.append(", animationMode=Immediately, delayMillis=");
        sb.append(this.b);
        sb.append(", initialDelayMillis=");
        sb.append(this.c);
        sb.append(", spacing=");
        sb.append(this.d);
        sb.append(", velocity=");
        return ir.f(')', this.e, sb);
    }
}
