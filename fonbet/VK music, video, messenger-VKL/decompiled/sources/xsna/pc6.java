package xsna;

/* compiled from: BaseDeferredUseCase.kt */
/* loaded from: classes6.dex */
public abstract class pc6<TParams, TResult> {
    public final asl b(kotlin.coroutines.d dVar, Object obj) {
        return myc0.b(zvj.a(dVar), null, null, new oc6(this, obj, null), 3);
    }

    public abstract Object c(TParams tparams, spj<? super TResult> spjVar);

    public Void a(TParams tparams, Throwable th) {
        throw th;
    }
}
