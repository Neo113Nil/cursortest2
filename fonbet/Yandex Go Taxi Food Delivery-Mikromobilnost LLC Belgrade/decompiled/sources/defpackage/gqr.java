package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class gqr implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ y6f0 b;

    public /* synthetic */ gqr(y6f0 y6f0Var, int i) {
        this.a = i;
        this.b = y6f0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        y6f0 y6f0Var = this.b;
        switch (i) {
            case 0:
                Object o = ((x6f0) y6f0Var).y.o(obj, continuation);
                return o == CoroutineSingletons.COROUTINE_SUSPENDED ? o : zy11.a;
            default:
                return ((x6f0) y6f0Var).y.o(obj, continuation);
        }
    }
}
