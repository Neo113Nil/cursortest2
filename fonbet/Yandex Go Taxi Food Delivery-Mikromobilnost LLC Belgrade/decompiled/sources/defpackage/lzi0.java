package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.logistics.sdk.rental_duration_selector.ui.b;
import ru.yandex.taxi.logistics.sdk.rental_duration_selector.ui.c;
import ru.yandex.taxi.logistics.sdk.rental_duration_selector.ui.d;

/* loaded from: classes5.dex */
public final class lzi0 implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ tpr b;
    public final /* synthetic */ d c;

    public /* synthetic */ lzi0(tpr tprVar, d dVar, int i) {
        this.a = i;
        this.b = tprVar;
        this.c = dVar;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        d dVar = this.c;
        tpr tprVar = this.b;
        switch (i) {
            case 0:
                Object collect = tprVar.collect(new b(vprVar, dVar), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            default:
                Object collect2 = tprVar.collect(new c(vprVar, dVar), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
        }
    }
}
