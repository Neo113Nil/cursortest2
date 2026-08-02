package xsna;

/* compiled from: TimePicker.kt */
/* loaded from: classes11.dex */
public final class evf extends d730<fvf> {
    public final qw1 a;
    public final boolean b;
    public final int c;
    public final iq2<Float> d;

    public evf() {
        throw null;
    }

    public evf(qw1 qw1Var, boolean z, int i, phr phrVar) {
        this.a = qw1Var;
        this.b = z;
        this.c = i;
        this.d = phrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evf)) {
            return false;
        }
        evf evfVar = (evf) obj;
        return epx.f(this.a, evfVar.a) && this.b == evfVar.b && this.c == evfVar.c && epx.f(this.d, evfVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + shy.a(this.c, qoy.b(this.a.hashCode() * 31, 31, this.b), 31);
    }

    @Override // xsna.d730
    public final fvf r() {
        return new fvf(this.a, this.b, this.c, this.d);
    }

    @Override // xsna.d730
    public final void s(fvf fvfVar) {
        fvf fvfVar2 = fvfVar;
        qw1 qw1Var = this.a;
        fvfVar2.r = qw1Var;
        fvfVar2.s = this.b;
        iq2<Float> iq2Var = this.d;
        fvfVar2.u = iq2Var;
        int i = fvfVar2.t;
        int i2 = this.c;
        if (i == i2) {
            return;
        }
        fvfVar2.t = i2;
        myc0.h(fvfVar2.W1(), null, null, new gvf(qw1Var, iq2Var, null), 3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClockDialModifier(state=");
        sb.append(this.a);
        sb.append(", autoSwitchToMinute=");
        sb.append(this.b);
        sb.append(", selection=");
        int i = this.c;
        sb.append((Object) (i == 0 ? "Hour" : i == 1 ? "Minute" : ""));
        sb.append(", animationSpec=");
        sb.append(this.d);
        sb.append(')');
        return sb.toString();
    }
}
