package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.logistics.sdk.address_details.impl.ui.b;
import ru.yandex.taxi.logistics.sdk.address_details.impl.ui.d;
import ru.yandex.taxi.logistics.sdk.address_details.impl.ui.e;

/* loaded from: classes5.dex */
public final class au0 implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ tpr b;
    public final /* synthetic */ e c;

    public /* synthetic */ au0(tpr tprVar, e eVar, int i) {
        this.a = i;
        this.b = tprVar;
        this.c = eVar;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        e eVar = this.c;
        tpr tprVar = this.b;
        switch (i) {
            case 0:
                Object collect = tprVar.collect(new b(vprVar, eVar), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            default:
                Object collect2 = tprVar.collect(new d(vprVar, eVar), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
        }
    }
}
