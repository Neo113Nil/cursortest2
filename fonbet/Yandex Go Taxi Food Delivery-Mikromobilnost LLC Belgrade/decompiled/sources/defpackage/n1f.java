package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.k;
import com.yandex.messaging.internal.o;
import com.yandex.messaging.internal.u;
import com.yandex.messaging.internal.v;
import com.yandex.messaging.internal.w;
import com.yandex.messaging.ui.createpoll.CreatePollActivity;
import com.yandex.messaging.ui.createpoll.c;
import com.yandex.payment.divkit.select.g;
import com.yandex.payment.divkit.select.h;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.g0;
import kotlinx.coroutines.flow.internal.j;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n;
import ru.yandex.logistics.sdk.cargo_form.core.impl.repository.FormInternalStateRepository$special$$inlined$combine$1$3;
import ru.yandex.logistics.sdk.cargo_form.core.impl.repository.d;
import ru.yandex.logistics.sdk.cargo_form.impl.screen_coupon.impl.a;
import ru.yandex.logistics.sdk.cargo_form.impl.screen_coupon.impl.b;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.horizontal_stack.HorizontalStackStateHolder$getWidgets$$inlined$combine$1$3;
import ru.yandex.taxi.logistics.sdk.management.e;
import ru.yandex.taxi.logistics.sdk.management.f;

/* loaded from: classes15.dex */
public final class n1f implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n1f(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Object collect = ((tpr) obj2).collect(new a(vprVar, (b) obj), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            case 1:
                Object collect2 = ((tpr) obj2).collect(new c(vprVar, (CreatePollActivity) obj), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
            case 2:
                Object collect3 = ((m0) obj2).collect(new g(vprVar, (h) obj), continuation);
                return collect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect3 : zy11Var;
            case 3:
                Object collect4 = ((n) obj2).collect(new com.yandex.div.internal.storage.a(vprVar, (com.yandex.div.internal.storage.b) obj), continuation);
                return collect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect4 : zy11Var;
            case 4:
                Object collect5 = ((syc) obj2).collect(new e(vprVar, (f) obj), continuation);
                return collect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect5 : zy11Var;
            case 5:
                Object collect6 = ((tpr) obj2).collect(new ru.yandex.logistics.sdk.cargo_form.core.impl.interactor.a(vprVar, (j0g) obj), continuation);
                return collect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect6 : zy11Var;
            case 6:
                Object collect7 = ((tpr) obj2).collect(new ru.yandex.taxi.logistics.sdk.delivery_sdd_slots_selector.ui.c(vprVar, (poi) obj), continuation);
                return collect7 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect7 : zy11Var;
            case 7:
                Object collect8 = ((tpr) obj2).collect(new ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.dynamic_timeline.b(vprVar, (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.dynamic_timeline.f) obj), continuation);
                return collect8 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect8 : zy11Var;
            case 8:
                Object collect9 = ((tpr) obj2).collect(new g0(vprVar, (g0c) obj), continuation);
                return collect9 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect9 : zy11Var;
            case 9:
                Object collect10 = ((tpr) obj2).collect(new androidx.slidingpanelayout.widget.b(vprVar, (txr) obj), continuation);
                return collect10 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect10 : zy11Var;
            case 10:
                tpr[] tprVarArr = (tpr[]) obj2;
                Object a = j.a(vprVar, new v10(tprVarArr, 20), new FormInternalStateRepository$special$$inlined$combine$1$3(null, (ru.yandex.logistics.sdk.cargo_form.core.impl.repository.c) obj), continuation, tprVarArr);
                return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11Var;
            case 11:
                Object collect11 = ((tpr) obj2).collect(new d(vprVar, (o5s) obj), continuation);
                return collect11 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect11 : zy11Var;
            case 12:
                Object collect12 = ((tpr) obj2).collect(new ru.yandex.logistics.sdk.cargo_form.impl.photocomments.b(vprVar, (c0k0) obj), continuation);
                return collect12 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect12 : zy11Var;
            case 13:
                Object collect13 = ((rol0) obj2).collect(new com.yandex.messaging.internal.chat.domain.b(vprVar, (com.yandex.messaging.internal.chat.domain.c) obj), continuation);
                return collect13 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect13 : zy11Var;
            case 14:
                Object collect14 = ((tpr) obj2).collect(new com.yandex.messaging.internal.translator.e(vprVar, (o1b0) obj), continuation);
                return collect14 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect14 : zy11Var;
            case 15:
                Object collect15 = ((tpr) obj2).collect(new com.yandex.messaging.domain.statuses.d(vprVar, (com.yandex.messaging.domain.statuses.e) obj), continuation);
                return collect15 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect15 : zy11Var;
            case 16:
                Object collect16 = ((tpr) obj2).collect(new com.yandex.messaging.domain.f(vprVar, (y6t) obj), continuation);
                return collect16 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect16 : zy11Var;
            case 17:
                Object collect17 = ((tpr) obj2).collect(new com.yandex.messaging.internal.j(vprVar, (n8t) obj), continuation);
                return collect17 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect17 : zy11Var;
            case 18:
                Object collect18 = ((tpr) obj2).collect(new k(vprVar, (x8t) obj), continuation);
                return collect18 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect18 : zy11Var;
            case 19:
                Object collect19 = ((jqr) obj2).collect(new o(vprVar, (u8t) obj), continuation);
                return collect19 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect19 : zy11Var;
            case 20:
                Object collect20 = ((fi9) obj2).collect(new u(vprVar, (v) obj), continuation);
                return collect20 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect20 : zy11Var;
            case 21:
                Object collect21 = ((tpr) obj2).collect(new com.yandex.messaging.domain.personal.b(vprVar, (zrm) obj), continuation);
                return collect21 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect21 : zy11Var;
            case 22:
                Object collect22 = ((fi9) obj2).collect(new com.yandex.messaging.internal.storage.stickers.a(vprVar, (com.yandex.messaging.internal.storage.stickers.b) obj), continuation);
                return collect22 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect22 : zy11Var;
            case 23:
                Object collect23 = ((tpr) obj2).collect(new com.yandex.messaging.internal.textsuggest.a(vprVar, (pet) obj), continuation);
                return collect23 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect23 : zy11Var;
            case 24:
                Object collect24 = ((mth) obj2).collect(new w(vprVar, (set) obj), continuation);
                return collect24 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect24 : zy11Var;
            case 25:
                Object collect25 = ((kotlinx.coroutines.flow.o) obj2).collect(new ru.yandex.taxi.locationsdk.processor_on_jump_or_divergence.internal.processor.b(vprVar, (ez60) obj), continuation);
                return collect25 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect25 : zy11Var;
            case 26:
                Object collect26 = ((acu) obj2).collect(new ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.header.e(vprVar, (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.header.f) obj), continuation);
                return collect26 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect26 : zy11Var;
            case 27:
                tpr[] tprVarArr2 = (tpr[]) obj2;
                Object a2 = j.a(vprVar, new v10(tprVarArr2, 26), new HorizontalStackStateHolder$getWidgets$$inlined$combine$1$3(null, (nru) obj), continuation, tprVarArr2);
                return a2 == CoroutineSingletons.COROUTINE_SUSPENDED ? a2 : zy11Var;
            case 28:
                Object collect27 = ((tpr) obj2).collect(new ru.yandex.taxi.locationsdk.processor_on_jump_or_divergence.internal.processor.c(vprVar, (xrr) obj), continuation);
                return collect27 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect27 : zy11Var;
            default:
                Object collect28 = ((rol0) obj2).collect(new com.yandex.messaging.domain.chat.f(vprVar, (ChatRequest) obj), continuation);
                return collect28 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect28 : zy11Var;
        }
    }
}
