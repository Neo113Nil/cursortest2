package defpackage;

import com.yandex.messaging.domain.contacts.d;
import com.yandex.messaging.internal.storage.f;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.logistics.sdk.cargo_form.core.impl.repository.g;
import ru.yandex.taxi.logistics.sdk.delivery.cancel.domain.a;
import ru.yandex.taxi.logistics.sdk.delivery.edit.c;
import ru.yandex.taxi.logistics.sdk.tracking.impl.change_datetime.ui.b;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.h;

/* loaded from: classes5.dex */
public final class cc7 implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ tpr b;
    public final /* synthetic */ String c;

    public /* synthetic */ cc7(tpr tprVar, String str, int i) {
        this.a = i;
        this.b = tprVar;
        this.c = str;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        String str = this.c;
        tpr tprVar = this.b;
        switch (i) {
            case 0:
                Object collect = tprVar.collect(new f(vprVar, str), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            case 1:
                Object collect2 = tprVar.collect(new a(vprVar, str), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
            case 2:
                Object collect3 = tprVar.collect(new b(vprVar, str), continuation);
                return collect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect3 : zy11Var;
            case 3:
                Object collect4 = tprVar.collect(new c(vprVar, str), continuation);
                return collect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect4 : zy11Var;
            case 4:
                Object collect5 = tprVar.collect(new ru.yandex.taxi.logistics.sdk.pay_on_delivery.b(vprVar, str), continuation);
                return collect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect5 : zy11Var;
            case 5:
                Object collect6 = tprVar.collect(new ru.yandex.taxi.logistics.sdk.delivery.state.f(vprVar, str), continuation);
                return collect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect6 : zy11Var;
            case 6:
                Object collect7 = tprVar.collect(new ru.yandex.taxi.logistics.sdk.tracking.impl.edit_order_details.b(vprVar, str), continuation);
                return collect7 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect7 : zy11Var;
            case 7:
                Object collect8 = tprVar.collect(new ru.yandex.taxi.logistics.sdk.tracking.impl.edit_order_details.data.b(vprVar, str), continuation);
                return collect8 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect8 : zy11Var;
            case 8:
                Object collect9 = tprVar.collect(new g(vprVar, str), continuation);
                return collect9 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect9 : zy11Var;
            case 9:
                Object collect10 = tprVar.collect(new d(vprVar, str), continuation);
                return collect10 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect10 : zy11Var;
            case 10:
                Object collect11 = tprVar.collect(new ru.yandex.taxi.logistics.sdk.tracking.impl.domain.neuropostcard_network.b(vprVar, str), continuation);
                return collect11 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect11 : zy11Var;
            case 11:
                Object collect12 = tprVar.collect(new ru.yandex.taxi.logistics.sdk.tracking.impl.domain.neuropostcard_network.d(vprVar, str), continuation);
                return collect12 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect12 : zy11Var;
            case 12:
                Object collect13 = tprVar.collect(new ru.yandex.taxi.logistics.sdk.tracking.impl.rover.b(vprVar, str), continuation);
                return collect13 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect13 : zy11Var;
            case 13:
                Object collect14 = tprVar.collect(new h(vprVar, str), continuation);
                return collect14 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect14 : zy11Var;
            default:
                Object collect15 = tprVar.collect(new ru.yandex.taxi.logistics.sdk.tracking.domain.impl.g(vprVar, str), continuation);
                return collect15 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect15 : zy11Var;
        }
    }
}
