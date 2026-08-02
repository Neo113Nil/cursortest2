package defpackage;

import com.yandex.messaging.extension.flow.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes15.dex */
public final class iqr implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0v0 b;

    public /* synthetic */ iqr(k0v0 k0v0Var, int i) {
        this.a = i;
        this.b = k0v0Var;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        k0v0 k0v0Var = this.b;
        switch (i) {
            case 0:
                CoroutineSingletons m = n0.m(k0v0Var, new b(vprVar), continuation);
                return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : zy11Var;
            default:
                CoroutineSingletons m2 = n0.m(k0v0Var, new com.yandex.messaging.domain.poll.b(vprVar), continuation);
                return m2 == CoroutineSingletons.COROUTINE_SUSPENDED ? m2 : zy11Var;
        }
    }
}
