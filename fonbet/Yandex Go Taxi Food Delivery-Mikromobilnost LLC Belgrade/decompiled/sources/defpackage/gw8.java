package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.f;
import ru.yandex.logistics.sdk.cargo_form.impl.universal_modal_view.ui.a;

/* loaded from: classes5.dex */
public final class gw8 implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ q98 b;

    public /* synthetic */ gw8(q98 q98Var, int i) {
        this.a = i;
        this.b = q98Var;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        q98 q98Var = this.b;
        switch (i) {
            case 0:
                Object collect = q98Var.collect(new f(vprVar), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            default:
                Object collect2 = q98Var.collect(new a(vprVar), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
        }
    }
}
