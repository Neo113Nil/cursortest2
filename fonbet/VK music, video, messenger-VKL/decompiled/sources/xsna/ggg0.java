package xsna;

/* compiled from: AnimatorAnimationSpecs.kt */
/* loaded from: classes11.dex */
public final class ggg0<T> implements phr<T> {
    public final phr<T> a;
    public final int b;

    public ggg0(phr<T> phrVar, int i) {
        this.a = phrVar;
        this.b = i;
    }

    @Override // xsna.iq2
    public final <V extends wq2> xlr0<V> a(itp0<T, V> itp0Var) {
        return new emr0(this.a.a((itp0) itp0Var), this.b * 1000000);
    }
}
