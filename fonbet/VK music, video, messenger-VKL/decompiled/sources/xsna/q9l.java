package xsna;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: DeepRecursive.kt */
/* loaded from: classes8.dex */
public final class q9l<T, R> extends p9l<T, R> implements spj<R> {
    public hby b;
    public Object c;
    public spj<Object> d;
    public Object e;

    @Override // xsna.p9l
    public final CoroutineSingletons a(Object obj, iby ibyVar) {
        this.d = ibyVar;
        this.c = obj;
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override // xsna.spj
    public final kotlin.coroutines.d getContext() {
        return EmptyCoroutineContext.b;
    }

    @Override // xsna.spj
    public final void resumeWith(Object obj) {
        this.d = null;
        this.e = obj;
    }
}
