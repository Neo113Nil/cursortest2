package defpackage;

import com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.a;
import com.ybsdk.screens.initial.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes3.dex */
public final class owv implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ jqr b;

    public /* synthetic */ owv(jqr jqrVar, int i) {
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
                Object collect = jqrVar.collect(new b(vprVar), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            case 1:
                Object collect2 = jqrVar.collect(new a(vprVar), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
            case 2:
                Object collect3 = jqrVar.collect(new com.ybsdk.feature.split.deposit.internal.ui.payment.status.b(vprVar), continuation);
                return collect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect3 : zy11Var;
            default:
                Object collect4 = jqrVar.collect(new ru.yandex.taxi.logistics.sdk.tracking.impl.ui.b(vprVar), continuation);
                return collect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect4 : zy11Var;
        }
    }
}
