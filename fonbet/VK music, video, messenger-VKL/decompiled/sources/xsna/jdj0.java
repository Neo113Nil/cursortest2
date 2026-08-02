package xsna;

/* compiled from: Shimmer.kt */
/* loaded from: classes17.dex */
public final class jdj0 {
    public final tjv0 a;
    public final odj0 b;
    public final utk0 c;

    public jdj0(tjv0 tjv0Var, odj0 odj0Var, zhf0 zhf0Var) {
        this.a = tjv0Var;
        this.b = odj0Var;
        this.c = vtk0.a(zhf0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!jdj0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        jdj0 jdj0Var = (jdj0) obj;
        return epx.f(this.a, jdj0Var.a) && epx.f(this.b, jdj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
