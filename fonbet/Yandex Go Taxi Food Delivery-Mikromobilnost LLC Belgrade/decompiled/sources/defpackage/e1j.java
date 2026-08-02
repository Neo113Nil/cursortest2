package defpackage;

import io.flutter.plugins.sharedpreferences.c;
import io.flutter.plugins.sharedpreferences.e;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.logistics.sdk.cargo_form.core.impl.datastore.a;
import ru.yandex.logistics.sdk.cargo_form.core.impl.datastore.b;
import ru.yandex.taxi.logistics.sdk.management.storage.d;

/* loaded from: classes5.dex */
public final class e1j implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ tpr b;
    public final /* synthetic */ kme0 c;

    public /* synthetic */ e1j(tpr tprVar, kme0 kme0Var, int i) {
        this.a = i;
        this.b = tprVar;
        this.c = kme0Var;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        kme0 kme0Var = this.c;
        tpr tprVar = this.b;
        switch (i) {
            case 0:
                Object collect = tprVar.collect(new d(vprVar, kme0Var), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            case 1:
                Object collect2 = tprVar.collect(new a(vprVar, kme0Var), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
            case 2:
                Object collect3 = tprVar.collect(new b(vprVar, kme0Var), continuation);
                return collect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect3 : zy11Var;
            case 3:
                Object collect4 = tprVar.collect(new ru.yandex.logistics.sdk.cargo_form.core.impl.datastore.d(vprVar, kme0Var), continuation);
                return collect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect4 : zy11Var;
            case 4:
                Object collect5 = tprVar.collect(new io.flutter.plugins.sharedpreferences.a(vprVar, kme0Var), continuation);
                return collect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect5 : zy11Var;
            case 5:
                Object collect6 = tprVar.collect(new c(vprVar, kme0Var), continuation);
                return collect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect6 : zy11Var;
            case 6:
                Object collect7 = tprVar.collect(new io.flutter.plugins.sharedpreferences.d(vprVar, kme0Var), continuation);
                return collect7 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect7 : zy11Var;
            default:
                Object collect8 = tprVar.collect(new e(vprVar, kme0Var), continuation);
                return collect8 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect8 : zy11Var;
        }
    }
}
