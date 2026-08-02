package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.c;

/* loaded from: classes9.dex */
public final class fyc extends c implements eyc {
    public fyc(l8x l8xVar) {
        super(true);
        Q(l8xVar);
    }

    public final boolean j0(Throwable th) {
        return T(new tzc(th, false));
    }

    @Override // defpackage.noh
    public final Object k(Continuation continuation) {
        Object s = s(continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }
}
