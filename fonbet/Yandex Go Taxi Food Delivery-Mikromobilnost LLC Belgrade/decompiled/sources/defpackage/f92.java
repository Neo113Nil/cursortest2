package defpackage;

import com.yandex.delivery.utils.dialogmanager.impl.a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.locationsdk.locationprovider.android.impl.b;
import ru.yandex.taxi.locationsdk.locationprovider.android.impl.d;

/* loaded from: classes9.dex */
public final class f92 implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ eci0 b;

    public /* synthetic */ f92(eci0 eci0Var, int i) {
        this.a = i;
        this.b = eci0Var;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        eci0 eci0Var = this.b;
        switch (i) {
            case 0:
                Object collect = eci0Var.a.collect(new b(vprVar), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            case 1:
                Object collect2 = eci0Var.a.collect(new d(vprVar), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
            case 2:
                Object collect3 = eci0Var.a.collect(new a(vprVar), continuation);
                return collect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect3 : zy11Var;
            default:
                Object collect4 = eci0Var.a.collect(new com.yandex.delivery.utils.notificationmanager.impl.a(vprVar), continuation);
                return collect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect4 : zy11Var;
        }
    }
}
