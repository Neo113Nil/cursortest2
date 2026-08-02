package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class gph implements vpr, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ y6f0 b;

    public /* synthetic */ gph(y6f0 y6f0Var, int i) {
        this.a = i;
        this.b = y6f0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        y6f0 y6f0Var = this.b;
        switch (i) {
            case 0:
                return ((x6f0) y6f0Var).y.o(obj, continuation);
            default:
                Object o = ((x6f0) y6f0Var).y.o((k7z) obj, continuation);
                return o == CoroutineSingletons.COROUTINE_SUSPENDED ? o : zy11.a;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
        }
        return new FunctionReferenceImpl(2, this.b, y6f0.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
