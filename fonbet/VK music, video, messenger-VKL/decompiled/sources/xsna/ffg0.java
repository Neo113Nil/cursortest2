package xsna;

/* compiled from: RetryFunction.java */
/* loaded from: classes3.dex */
public final class ffg0 implements io.reactivex.rxjava3.functions.l<io.reactivex.rxjava3.core.q<Throwable>, io.reactivex.rxjava3.core.t<?>> {
    public int b = 0;

    @Override // io.reactivex.rxjava3.functions.l
    public final io.reactivex.rxjava3.core.t<?> apply(io.reactivex.rxjava3.core.q<Throwable> qVar) throws Throwable {
        return qVar.L(new rhh0(this), false);
    }
}
