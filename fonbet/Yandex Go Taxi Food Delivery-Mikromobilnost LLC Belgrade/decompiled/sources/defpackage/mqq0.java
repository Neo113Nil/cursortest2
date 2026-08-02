package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class mqq0 implements vpr {
    public final ioq0 a;

    public mqq0(y6f0 y6f0Var) {
        this.a = y6f0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Object o = this.a.o(obj, continuation);
        return o == CoroutineSingletons.COROUTINE_SUSPENDED ? o : zy11.a;
    }
}
