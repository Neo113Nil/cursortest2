package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: SendingCollector.kt */
/* loaded from: classes11.dex */
public final class aki0<T> implements lsr<T> {
    public final ohi0<T> b;

    public aki0(zhd0 zhd0Var) {
        this.b = zhd0Var;
    }

    @Override // xsna.lsr
    public final Object emit(T t, spj<? super s3q0> spjVar) {
        Object t2 = this.b.t(t, spjVar);
        return t2 == CoroutineSingletons.COROUTINE_SUSPENDED ? t2 : s3q0.a;
    }
}
