package xsna;

/* compiled from: InitialValueObservable.kt */
/* loaded from: classes5.dex */
public abstract class gzw<T> extends io.reactivex.rxjava3.core.q<T> {

    /* compiled from: InitialValueObservable.kt */
    public final class a extends io.reactivex.rxjava3.core.q<T> {
        public final /* synthetic */ qno0 b;

        public a(qno0 qno0Var) {
            this.b = qno0Var;
        }

        @Override // io.reactivex.rxjava3.core.q
        public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
            this.b.N0(vVar);
        }
    }

    public abstract T M0();

    public abstract void N0(io.reactivex.rxjava3.core.v<? super T> vVar);

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super T> vVar) {
        N0(vVar);
        vVar.onNext(M0());
    }
}
