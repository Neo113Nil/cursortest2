package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.locationsdk.core.processor_controller.internal.a;
import ru.yandex.taxi.logistics.sdk.management.deliveries.g;

/* loaded from: classes9.dex */
public final class euh implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ jqr b;

    public /* synthetic */ euh(jqr jqrVar, int i) {
        this.a = i;
        this.b = jqrVar;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        jqr jqrVar = this.b;
        switch (i) {
            case 0:
                Object collect = jqrVar.collect(new g(vprVar), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            default:
                Object collect2 = jqrVar.collect(new a(vprVar), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
        }
    }
}
