package xsna;

/* compiled from: SlotTable.kt */
/* loaded from: classes11.dex */
public final class ysf0 extends wn4 {
    public final wn4 a;
    public final int b;

    public ysf0(wn4 wn4Var, int i) {
        this.a = wn4Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ysf0)) {
            return false;
        }
        ysf0 ysf0Var = (ysf0) obj;
        return epx.f(ysf0Var.a, this.a) && ysf0Var.b == this.b;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b * 31);
    }
}
