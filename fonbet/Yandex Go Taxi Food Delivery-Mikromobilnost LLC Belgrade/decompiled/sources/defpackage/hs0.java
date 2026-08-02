package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.g;
import ru.yandex.logistics.sdk.cargo_form.impl.address_details.config.a;
import ru.yandex.logistics.sdk.cargo_form.impl.address_details.config.b;

/* loaded from: classes5.dex */
public final class hs0 implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;
    public final /* synthetic */ is0 c;

    public /* synthetic */ hs0(g gVar, is0 is0Var, int i) {
        this.a = i;
        this.b = gVar;
        this.c = is0Var;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        is0 is0Var = this.c;
        g gVar = this.b;
        switch (i) {
            case 0:
                Object collect = gVar.collect(new a(vprVar, is0Var), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            default:
                Object collect2 = gVar.collect(new b(vprVar, is0Var), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
        }
    }
}
