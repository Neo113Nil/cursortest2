package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.a0;
import kotlinx.coroutines.flow.h0;
import kotlinx.coroutines.flow.l0;
import kotlinx.coroutines.flow.r;
import ru.yandex.taxi.locationsdk.core.input_controller.internal.e;
import ru.yandex.taxi.logistics.sdk.management.deliveries.a;
import ru.yandex.taxi.logistics.sdk.management.deliveries.b;
import ru.yandex.taxi.logistics.sdk.management.deliveries.c;
import ru.yandex.taxi.logistics.sdk.management.localstate.d;

/* loaded from: classes9.dex */
public final class mth implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ tpr b;

    public /* synthetic */ mth(tpr tprVar, int i) {
        this.a = i;
        this.b = tprVar;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tpr tprVar = this.b;
        switch (i) {
            case 0:
                Object collect = tprVar.collect(new a(vprVar), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            case 1:
                Object collect2 = tprVar.collect(new b(vprVar), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
            case 2:
                Object collect3 = tprVar.collect(new c(vprVar), continuation);
                return collect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect3 : zy11Var;
            case 3:
                Object collect4 = tprVar.collect(new d(vprVar), continuation);
                return collect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect4 : zy11Var;
            case 4:
                Object collect5 = tprVar.collect(new r(vprVar, new Ref$IntRef()), continuation);
                return collect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect5 : zy11Var;
            case 5:
                Object collect6 = tprVar.collect(new a0(vprVar), continuation);
                return collect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect6 : zy11Var;
            case 6:
                Object collect7 = tprVar.collect(new h0(vprVar), continuation);
                return collect7 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect7 : zy11Var;
            case 7:
                Object collect8 = tprVar.collect(new l0(vprVar, new Ref$IntRef()), continuation);
                return collect8 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect8 : zy11Var;
            case 8:
                Object collect9 = tprVar.collect(new com.yandex.mob.am.b(vprVar), continuation);
                return collect9 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect9 : zy11Var;
            case 9:
                Object collect10 = tprVar.collect(new com.yandex.plus.home.plaque.feature.internal.presentation.b(vprVar), continuation);
                return collect10 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect10 : zy11Var;
            case 10:
                Object collect11 = tprVar.collect(new com.yandex.plus.home.plaque.plugin.internal.a(vprVar), continuation);
                return collect11 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect11 : zy11Var;
            case 11:
                Object collect12 = tprVar.collect(new com.yandex.plus.home.graphql.plusstate.b(vprVar), continuation);
                return collect12 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect12 : zy11Var;
            case 12:
                Object collect13 = tprVar.collect(new e(vprVar), continuation);
                return collect13 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect13 : zy11Var;
            case 13:
                Object collect14 = tprVar.collect(new com.yandex.plus.home.plaque.plugin.internal.proxy.b(vprVar), continuation);
                return collect14 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect14 : zy11Var;
            case 14:
                Object collect15 = tprVar.collect(new com.ybsdk.api.d(vprVar), continuation);
                return collect15 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect15 : zy11Var;
            case 15:
                Object collect16 = tprVar.collect(new com.ybsdk.rconfig.retriever.b(vprVar), continuation);
                return collect16 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect16 : zy11Var;
            case 16:
                Object collect17 = tprVar.collect(new com.yandex.quark.js.implementation.facade.capability.web.a(vprVar), continuation);
                return collect17 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect17 : zy11Var;
            case 17:
                Object collect18 = tprVar.collect(new com.yandex.quark.webchat.feature.delegate.a(vprVar), continuation);
                return collect18 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect18 : zy11Var;
            default:
                Object collect19 = tprVar.collect(new com.yandex.quark.js.implementation.webView.internal.b(vprVar), continuation);
                return collect19 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect19 : zy11Var;
        }
    }
}
