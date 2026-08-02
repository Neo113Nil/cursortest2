package defpackage;

import com.yandex.messaging.domain.personal.organization.a;
import com.yandex.messaging.internal.d0;
import com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.d;
import com.ybsdk.di.modules.features.r;
import io.flutter.plugins.sharedpreferences.f;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.logistics.care.ui.m;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.e;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.header.c;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.live_location.b;

/* loaded from: classes5.dex */
public final class acu implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ tpr b;

    public /* synthetic */ acu(tpr tprVar, int i) {
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
                Object collect = tprVar.collect(new c(vprVar), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            case 1:
                Object collect2 = tprVar.collect(new d(vprVar), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
            case 2:
                Object collect3 = tprVar.collect(new a(vprVar), continuation);
                return collect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect3 : zy11Var;
            case 3:
                Object collect4 = tprVar.collect(new ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.line_divider.a(vprVar), continuation);
                return collect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect4 : zy11Var;
            case 4:
                Object collect5 = tprVar.collect(new b(vprVar), continuation);
                return collect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect5 : zy11Var;
            case 5:
                Object collect6 = tprVar.collect(new e(vprVar), continuation);
                return collect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect6 : zy11Var;
            case 6:
                Object collect7 = tprVar.collect(new ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard.c(vprVar), continuation);
                return collect7 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect7 : zy11Var;
            case 7:
                Object collect8 = tprVar.collect(new com.yandex.messaging.auth.passport.a(vprVar), continuation);
                return collect8 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect8 : zy11Var;
            case 8:
                Object collect9 = tprVar.collect(new ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.pay_now.c(vprVar), continuation);
                return collect9 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect9 : zy11Var;
            case 9:
                Object collect10 = tprVar.collect(new ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.pay_now.e(vprVar), continuation);
                return collect10 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect10 : zy11Var;
            case 10:
                Object collect11 = tprVar.collect(new com.ybsdk.adapters.paymentsdk.impl.a(vprVar), continuation);
                return collect11 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect11 : zy11Var;
            case 11:
                Object collect12 = tprVar.collect(new m(vprVar), continuation);
                return collect12 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect12 : zy11Var;
            case 12:
                Object collect13 = tprVar.collect(new com.ybsdk.utils.poller.d(vprVar), continuation);
                return collect13 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect13 : zy11Var;
            case 13:
                Object collect14 = tprVar.collect(new ru.yandex.logistics.sdk.cargo_form.impl.popup.a(vprVar), continuation);
                return collect14 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect14 : zy11Var;
            case 14:
                Object collect15 = tprVar.collect(new ru.yandex.taxi.logistics.sdk.postcard.presentation.ui.c(vprVar), continuation);
                return collect15 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect15 : zy11Var;
            case 15:
                Object collect16 = tprVar.collect(new com.ybsdk.api.pro.a(vprVar), continuation);
                return collect16 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect16 : zy11Var;
            case 16:
                Object collect17 = tprVar.collect(new com.ybsdk.di.modules.features.m(), continuation);
                return collect17 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect17 : zy11Var;
            case 17:
                Object collect18 = tprVar.collect(new com.ybsdk.feature.qr.payments.internal.domain.a(vprVar), continuation);
                return collect18 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect18 : zy11Var;
            case 18:
                Object collect19 = tprVar.collect(new com.ybsdk.feature.qr.payments.internal.domain.v2.a(vprVar), continuation);
                return collect19 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect19 : zy11Var;
            case 19:
                Object collect20 = tprVar.collect(new ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.rover.b(vprVar), continuation);
                return collect20 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect20 : zy11Var;
            case 20:
                Object collect21 = tprVar.collect(new com.ybsdk.feature.savings.internal.interactors.e(vprVar), continuation);
                return collect21 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect21 : zy11Var;
            case 21:
                Object collect22 = tprVar.collect(new com.ybsdk.feature.savings.internal.interactors.v4.a(vprVar), continuation);
                return collect22 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect22 : zy11Var;
            case 22:
                Object collect23 = tprVar.collect(new com.yandex.messaging.ui.folders.selectDialog.d(vprVar), continuation);
                return collect23 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect23 : zy11Var;
            case 23:
                Object collect24 = tprVar.collect(new r(vprVar), continuation);
                return collect24 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect24 : zy11Var;
            case 24:
                Object collect25 = tprVar.collect(new f(vprVar), continuation);
                return collect25 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect25 : zy11Var;
            case 25:
                Object collect26 = tprVar.collect(new com.ybsdk.screens.common.a(vprVar), continuation);
                return collect26 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect26 : zy11Var;
            case 26:
                Object collect27 = tprVar.collect(new d0(vprVar), continuation);
                return collect27 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect27 : zy11Var;
            case 27:
                Object collect28 = tprVar.collect(new com.yandex.messaging.ui.creation.a(vprVar), continuation);
                return collect28 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect28 : zy11Var;
            case 28:
                Object collect29 = tprVar.collect(new com.yandex.messaging.ui.creation.b(vprVar), continuation);
                return collect29 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect29 : zy11Var;
            default:
                Object collect30 = tprVar.collect(new com.yandex.messaging.ui.timeline.e(vprVar), continuation);
                return collect30 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect30 : zy11Var;
        }
    }
}
