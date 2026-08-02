package defpackage;

import com.yandex.messaging.internal.storage.g;
import com.yandex.messaging.internal.translator.f;
import com.yandex.messaging.telemost.domain.a;
import com.yandex.payment.divkit.usecases.c;
import com.yandex.plus.home.internal.di.k;
import com.ybsdk.common.repositiories.auth.e;
import com.ybsdk.di.modules.features.n;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.d;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.j;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.circle_buttons.b;

/* loaded from: classes5.dex */
public final class ey4 implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ tpr b;

    public /* synthetic */ ey4(tpr tprVar, int i) {
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
                Object collect = ((pb) tprVar).collect(new b(vprVar), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            case 1:
                Object collect2 = ((cd0) tprVar).collect(new com.yandex.messaging.internal.storage.b(vprVar), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
            case 2:
                Object collect3 = ((cc7) tprVar).collect(new g(vprVar), continuation);
                return collect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect3 : zy11Var;
            case 3:
                Object collect4 = ((cd0) tprVar).collect(new ru.yandex.taxi.logistics.sdk.tracking.impl.data.b(vprVar), continuation);
                return collect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect4 : zy11Var;
            case 4:
                Object collect5 = ((kotlinx.coroutines.flow.b) tprVar).collect(new c(vprVar), continuation);
                return collect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect5 : zy11Var;
            case 5:
                Object collect6 = ((eif) tprVar).collect(new e(vprVar), continuation);
                return collect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect6 : zy11Var;
            case 6:
                Object collect7 = ((cc7) tprVar).collect(new ru.yandex.taxi.logistics.sdk.delivery.state.g(vprVar), continuation);
                return collect7 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect7 : zy11Var;
            case 7:
                Object collect8 = ((syc) tprVar).collect(new d(vprVar), continuation);
                return collect8 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect8 : zy11Var;
            case 8:
                Object collect9 = ((syc) tprVar).collect(new ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.dynamic_timeline.d(vprVar), continuation);
                return collect9 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect9 : zy11Var;
            case 9:
                Object collect10 = ((syc) tprVar).collect(new ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.feedback.d(vprVar), continuation);
                return collect10 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect10 : zy11Var;
            case 10:
                Object collect11 = ((ey4) tprVar).collect(new com.yandex.messaging.internal.chat.domain.d(vprVar), continuation);
                return collect11 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect11 : zy11Var;
            case 11:
                Object collect12 = ((fi9) tprVar).collect(new com.yandex.messaging.internal.chat.domain.e(vprVar), continuation);
                return collect12 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect12 : zy11Var;
            case 12:
                Object collect13 = ((n1f) tprVar).collect(new f(vprVar), continuation);
                return collect13 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect13 : zy11Var;
            case 13:
                Object collect14 = ((syc) tprVar).collect(new ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.header.d(vprVar), continuation);
                return collect14 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect14 : zy11Var;
            case 14:
                Object collect15 = ((acu) tprVar).collect(new ru.yandex.taxi.logistics.sdk.tracking.impl.domain.f(vprVar), continuation);
                return collect15 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect15 : zy11Var;
            case 15:
                Object collect16 = ((fzw) tprVar).collect(new ru.yandex.logistics.sdk.cargo_form.impl.universal_modal_view.ui.c(vprVar), continuation);
                return collect16 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect16 : zy11Var;
            case 16:
                Object collect17 = ((g92) tprVar).collect(new a(vprVar), continuation);
                return collect17 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect17 : zy11Var;
            case 17:
                Object collect18 = ((w670) tprVar).collect(new ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.e(vprVar), continuation);
                return collect18 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect18 : zy11Var;
            case 18:
                Object collect19 = ((hxr) tprVar).collect(new com.yandex.messaging.domain.poll.f(vprVar), continuation);
                return collect19 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect19 : zy11Var;
            case 19:
                Object collect20 = ((acu) tprVar).collect(new n(vprVar), continuation);
                return collect20 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect20 : zy11Var;
            case 20:
                Object collect21 = ((acu) tprVar).collect(new com.ybsdk.screens.common.b(vprVar), continuation);
                return collect21 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect21 : zy11Var;
            case 21:
                Object collect22 = ((l7) tprVar).collect(new ru.yandex.taxi.logistics.sdk.tracking.impl.ui.a(vprVar), continuation);
                return collect22 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect22 : zy11Var;
            case 22:
                Object collect23 = ((cdz0) tprVar).collect(new ru.yandex.taxi.logistics.sdk.tracking.impl.ui.f(vprVar), continuation);
                return collect23 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect23 : zy11Var;
            case 23:
                Object collect24 = ((cc7) tprVar).collect(new ru.yandex.taxi.logistics.sdk.tracking.impl.ui.g(vprVar), continuation);
                return collect24 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect24 : zy11Var;
            case 24:
                Object collect25 = ((cdz0) tprVar).collect(new j(vprVar), continuation);
                return collect25 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect25 : zy11Var;
            case 25:
                Object collect26 = ((cdz0) tprVar).collect(new ru.yandex.taxi.logistics.sdk.voiceforwarding.impl.b(vprVar), continuation);
                return collect26 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect26 : zy11Var;
            case 26:
                Object collect27 = ((acu) tprVar).collect(new com.yandex.messaging.internal.net.b(vprVar), continuation);
                return collect27 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect27 : zy11Var;
            case 27:
                Object collect28 = ((cdz0) tprVar).collect(new k(vprVar), continuation);
                return collect28 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect28 : zy11Var;
            case 28:
                Object collect29 = ((g801) tprVar).collect(new com.yandex.fintechsdk.flows.payment.kit.internal.widget.d(vprVar), continuation);
                return collect29 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect29 : zy11Var;
            default:
                Object collect30 = ((cdz0) tprVar).collect(new com.yandex.fintechsdk.adapters.yb.sdk.impl.b(vprVar), continuation);
                return collect30 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect30 : zy11Var;
        }
    }
}
