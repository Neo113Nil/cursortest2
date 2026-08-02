package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: CompletableDeferred.kt */
/* loaded from: classes11.dex */
public final class o7i<T> extends pyx implements n7i<T> {
    public o7i(eyx eyxVar) {
        super(true);
        f0(eyxVar);
    }

    @Override // xsna.n7i
    public final boolean A(Throwable th) {
        return i0(new d8i(th, false));
    }

    @Override // xsna.zrl
    public final Object H(spj<? super T> spjVar) {
        Object J = J(spjVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return J;
    }
}
