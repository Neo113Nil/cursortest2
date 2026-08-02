package xsna;

/* compiled from: AnimationSpec.kt */
/* loaded from: classes11.dex */
public final class xmk0<T> implements phr<T> {
    public final float a;
    public final float b;
    public final T c;

    public xmk0() {
        this(null, 7);
    }

    @Override // xsna.iq2
    public final tlr0 a(itp0 itp0Var) {
        T t = this.c;
        return new gmr0(this.a, this.b, t == null ? null : (wq2) itp0Var.a().invoke(t));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xmk0) {
            xmk0 xmk0Var = (xmk0) obj;
            if (xmk0Var.a == this.a && xmk0Var.b == this.b && epx.f(xmk0Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        T t = this.c;
        return Float.hashCode(this.b) + io.reactivex.rxjava3.subjects.b.a(this.a, (t != null ? t.hashCode() : 0) * 31, 31);
    }

    public xmk0(float f, float f2, T t) {
        this.a = f;
        this.b = f2;
        this.c = t;
    }

    @Override // xsna.phr, xsna.iq2
    public final xlr0 a(itp0 itp0Var) {
        T t = this.c;
        return new gmr0(this.a, this.b, t == null ? null : (wq2) itp0Var.a().invoke(t));
    }

    public /* synthetic */ xmk0(Object obj, int i) {
        this(1.0f, 1500.0f, (i & 4) != 0 ? null : obj);
    }
}
