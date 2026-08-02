package xsna;

/* compiled from: TopshelfCardConfig.kt */
/* loaded from: classes2.dex */
public final class jap0 {
    public final lap0 a;
    public final map0 b;
    public final x9p0 c;
    public final kbp0 d;
    public final tap0 e;
    public final cbp0 f;

    public jap0(lap0 lap0Var, map0 map0Var, x9p0 x9p0Var, kbp0 kbp0Var, tap0 tap0Var, cbp0 cbp0Var) {
        this.a = lap0Var;
        this.b = map0Var;
        this.c = x9p0Var;
        this.d = kbp0Var;
        this.e = tap0Var;
        this.f = cbp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jap0)) {
            return false;
        }
        jap0 jap0Var = (jap0) obj;
        return epx.f(this.a, jap0Var.a) && epx.f(this.b, jap0Var.b) && epx.f(this.c, jap0Var.c) && epx.f(this.d, jap0Var.d) && epx.f(this.e, jap0Var.e) && epx.f(this.f, jap0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.b.a, this.a.a.hashCode() * 31, 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TopshelfCardConfig(card=" + this.a + ", content=" + this.b + ", background=" + this.c + ", text=" + this.d + ", controls=" + this.e + ", pagination=" + this.f + ')';
    }
}
