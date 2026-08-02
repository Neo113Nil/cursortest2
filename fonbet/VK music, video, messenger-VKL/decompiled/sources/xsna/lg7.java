package xsna;

/* compiled from: BlurArea.kt */
/* loaded from: classes17.dex */
public final class lg7 {
    public final zhf0 a;
    public final mdu b;

    public lg7(zhf0 zhf0Var, mdu mduVar) {
        this.a = zhf0Var;
        this.b = mduVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lg7)) {
            return false;
        }
        lg7 lg7Var = (lg7) obj;
        return epx.f(this.a, lg7Var.a) && epx.f(this.b, lg7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BlurArea(rect=" + this.a + ", layer=" + this.b + ')';
    }
}
