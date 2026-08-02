package xsna;

/* compiled from: ButtonState.kt */
/* loaded from: classes16.dex */
public final class rr8 {
    public final boolean a;
    public final boolean b;
    public final afj c;
    public final ily d;
    public final drv e;

    public rr8() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rr8)) {
            return false;
        }
        rr8 rr8Var = (rr8) obj;
        return this.a == rr8Var.a && this.b == rr8Var.b && epx.f(this.c, rr8Var.c) && epx.f(this.d, rr8Var.d) && epx.f(this.e, rr8Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        return "ButtonState(isVisible=" + this.a + ", isEnabled=" + this.b + ", container=" + this.c + ", label=" + this.d + ", icon=" + this.e + ')';
    }

    public rr8(boolean z, boolean z2, afj afjVar, ily ilyVar, drv drvVar) {
        this.a = z;
        this.b = z2;
        this.c = afjVar;
        this.d = ilyVar;
        this.e = drvVar;
    }

    public /* synthetic */ rr8(int i) {
        this(true, true, new afj((String) null, 3), new ily(7), new drv(0, 3));
    }
}
