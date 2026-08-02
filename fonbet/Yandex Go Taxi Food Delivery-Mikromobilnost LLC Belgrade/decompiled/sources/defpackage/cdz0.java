package defpackage;

import com.yandex.plus.home.internal.di.j;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.f;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.c;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.e;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.i;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.timeline.a;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.top_accent_bar.d;
import ru.yandex.taxi.logistics.sdk.ui.form.background.video.b;

/* loaded from: classes5.dex */
public final class cdz0 implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ tpr b;

    public /* synthetic */ cdz0(tpr tprVar, int i) {
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
                Object collect2 = tprVar.collect(new d(vprVar), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
            case 2:
                Object collect3 = tprVar.collect(new c(vprVar), continuation);
                return collect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect3 : zy11Var;
            case 3:
                Object collect4 = tprVar.collect(new e(vprVar), continuation);
                return collect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect4 : zy11Var;
            case 4:
                Object collect5 = tprVar.collect(new i(vprVar), continuation);
                return collect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect5 : zy11Var;
            case 5:
                Object collect6 = tprVar.collect(new com.ybsdk.feature.transfer.version2.internal.screens.main.domain.c(vprVar), continuation);
                return collect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect6 : zy11Var;
            case 6:
                Object collect7 = tprVar.collect(new com.ybsdk.feature.transfer.internal.screens.result.domain.a(vprVar), continuation);
                return collect7 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect7 : zy11Var;
            case 7:
                Object collect8 = tprVar.collect(new com.yandex.plus.home.feature.webviews.internal.treasury.a(vprVar), continuation);
                return collect8 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect8 : zy11Var;
            case 8:
                Object collect9 = tprVar.collect(new f(vprVar), continuation);
                return collect9 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect9 : zy11Var;
            case 9:
                Object collect10 = tprVar.collect(new ru.yandex.taxi.logistics.sdk.tracking.impl.vertical_timeline.ui.c(vprVar), continuation);
                return collect10 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect10 : zy11Var;
            case 10:
                Object collect11 = tprVar.collect(new b(vprVar), continuation);
                return collect11 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect11 : zy11Var;
            case 11:
                Object collect12 = tprVar.collect(new ru.yandex.taxi.logistics.sdk.voiceforwarding.impl.a(vprVar), continuation);
                return collect12 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect12 : zy11Var;
            case 12:
                Object collect13 = tprVar.collect(new j(vprVar), continuation);
                return collect13 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect13 : zy11Var;
            default:
                Object collect14 = tprVar.collect(new com.yandex.fintechsdk.adapters.yb.sdk.impl.a(vprVar), continuation);
                return collect14 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect14 : zy11Var;
        }
    }
}
