package defpackage;

import com.yandex.quark.deeplinks.internal.a;
import com.yandex.quark.webchat.auth.internal.synchronizer.b;
import com.yandex.quark.webchat.js.c;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class d4h implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;

    public /* synthetic */ d4h(r0 r0Var, int i) {
        this.a = i;
        this.b = r0Var;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        r0 r0Var = this.b;
        switch (i) {
            case 0:
                Object collect = r0Var.collect(new a(vprVar), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            case 1:
                Object collect2 = r0Var.collect(new c(vprVar), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
            case 2:
                Object collect3 = r0Var.collect(new b(vprVar), continuation);
                return collect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect3 : zy11Var;
            default:
                Object collect4 = r0Var.collect(new com.yandex.quark.js.implementation.facade.capability.web.b(vprVar), continuation);
                return collect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect4 : zy11Var;
        }
    }
}
