package xsna;

import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: BehaviorSubjectContainer.kt */
/* loaded from: classes17.dex */
public final class gx6<T> {
    public final io.reactivex.rxjava3.subjects.d<T> a;
    public final io.reactivex.rxjava3.disposables.b b = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: BehaviorSubjectContainer.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<io.reactivex.rxjava3.disposables.c, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(io.reactivex.rxjava3.disposables.c cVar) {
            ((io.reactivex.rxjava3.disposables.b) this.receiver).b(cVar);
            return s3q0.a;
        }
    }

    public gx6(io.reactivex.rxjava3.subjects.d<T> dVar) {
        this.a = dVar;
    }

    public final io.reactivex.rxjava3.core.q<T> a() {
        return this.b.c ? io.reactivex.rxjava3.internal.operators.observable.g0.b : new io.reactivex.rxjava3.internal.operators.observable.c0(this.a, new c40(new a(1, this.b, io.reactivex.rxjava3.disposables.b.class, "add", "add(Lio/reactivex/rxjava3/disposables/Disposable;)Z", 8), 7), io.reactivex.rxjava3.internal.functions.a.c);
    }

    public final T b() {
        if (this.b.c) {
            return null;
        }
        return this.a.P0();
    }
}
