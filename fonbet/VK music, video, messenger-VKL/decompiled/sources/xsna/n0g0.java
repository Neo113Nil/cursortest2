package xsna;

/* compiled from: RepeatFunction.java */
/* loaded from: classes3.dex */
public final class n0g0 implements io.reactivex.rxjava3.functions.l<io.reactivex.rxjava3.core.q<Object>, io.reactivex.rxjava3.core.t<?>> {
    public final int b;
    public int c = 0;

    public n0g0(int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public final io.reactivex.rxjava3.core.t<?> apply(io.reactivex.rxjava3.core.q<Object> qVar) throws Throwable {
        return qVar.L(new m0g0(this), false);
    }
}
