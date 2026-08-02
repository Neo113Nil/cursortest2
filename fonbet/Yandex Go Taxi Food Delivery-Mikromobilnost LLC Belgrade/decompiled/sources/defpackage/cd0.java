package defpackage;

import com.yandex.messaging.ui.calllist.d;
import com.yandex.messaging.ui.settings.folder.addChat.h;
import com.yandex.messaging.ui.settings.folder.addChat.i;
import com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.f;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.internal.j;
import kotlinx.coroutines.flow.r0;
import ru.yandex.logistics.sdk.cargo_form.impl.address_details.domain.AddressDetailsScreenStateRepositoryImpl$screenStateFlow$$inlined$combine$1$3;
import ru.yandex.logistics.sdk.cargo_form.impl.domain.repository.a;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.e;
import ru.yandex.taxi.logistics.sdk.tracking.impl.change_datetime.ui.c;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.ads_banner.b;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.circle_buttons.BaseButtonsStateHolder$special$$inlined$combine$1$3;

/* loaded from: classes5.dex */
public final class cd0 implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cd0(int i, Object obj, Object obj2) {
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
                Object collect = ((g) obj2).collect(new h(vprVar, (i) obj), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            case 1:
                Object collect2 = ((gci0) obj2).a.collect(new a(vprVar, (bt0) obj), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
            case 2:
                tpr[] tprVarArr = (tpr[]) obj2;
                Object a = j.a(vprVar, new v10(tprVarArr, 1), new AddressDetailsScreenStateRepositoryImpl$screenStateFlow$$inlined$combine$1$3(null, (rt0) obj), continuation, tprVarArr);
                return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11Var;
            case 3:
                Object collect3 = ((pb) obj2).collect(new b(vprVar, (jc1) obj), continuation);
                return collect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect3 : zy11Var;
            case 4:
                Object collect4 = ((g) obj2).collect(new ru.yandex.logistics.sdk.cargo_form.impl.ai_widgets.data.a(vprVar, (bq1) obj), continuation);
                return collect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect4 : zy11Var;
            case 5:
                Object collect5 = ((l7) obj2).collect(new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.banner_carousel.a(vprVar, (tr4) obj), continuation);
                return collect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect5 : zy11Var;
            case 6:
                Object collect6 = ((mth) obj2).collect(new com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.b(vprVar, (tls) obj), continuation);
                return collect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect6 : zy11Var;
            case 7:
                tpr[] tprVarArr2 = (tpr[]) obj2;
                Object a2 = j.a(vprVar, new v10(tprVarArr2, 5), new BaseButtonsStateHolder$special$$inlined$combine$1$3(null, (fy4) obj), continuation, tprVarArr2);
                return a2 == CoroutineSingletons.COROUTINE_SUSPENDED ? a2 : zy11Var;
            case 8:
                Object collect7 = ((tpr) obj2).collect(new com.ybsdk.core.mvp.a(vprVar, (uc5) obj), continuation);
                return collect7 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect7 : zy11Var;
            case 9:
                Object collect8 = ((tpr) obj2).collect(new com.ybsdk.feature.transfer.version2.internal.screens.budget.domain.a(vprVar, (com.ybsdk.feature.transfer.version2.internal.screens.budget.domain.b) obj), continuation);
                return collect8 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect8 : zy11Var;
            case 10:
                Object collect9 = ((fi9) obj2).collect(new com.yandex.messaging.domain.search.a(), continuation);
                return collect9 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect9 : zy11Var;
            case 11:
                Object collect10 = ((fi9) obj2).collect(new com.yandex.messaging.internal.storage.a(vprVar, (String) obj), continuation);
                return collect10 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect10 : zy11Var;
            case 12:
                Object collect11 = ((tpr) obj2).collect(new com.yandex.messaging.ui.calllist.info.a(vprVar, (nbt) obj), continuation);
                return collect11 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect11 : zy11Var;
            case 13:
                Object collect12 = ((g) obj2).collect(new com.yandex.messaging.ui.calllist.b(vprVar, (d) obj), continuation);
                return collect12 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect12 : zy11Var;
            case 14:
                Object collect13 = ((tpr) obj2).collect(new ru.yandex.taxi.logistics.sdk.tracking.impl.data.a(vprVar, (ov7) obj), continuation);
                return collect13 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect13 : zy11Var;
            case 15:
                Object collect14 = ((tpr) obj2).collect(new com.ybsdk.feature.card.internal.interactors.i(vprVar, (com.ybsdk.feature.card.internal.interactors.j) obj), continuation);
                return collect14 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect14 : zy11Var;
            case 16:
                Object collect15 = ((tpr) obj2).collect(new ru.yandex.logistics.care.ui.d(vprVar, (pt8) obj), continuation);
                return collect15 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect15 : zy11Var;
            case 17:
                Object collect16 = ((jqr) obj2).collect(new ru.yandex.logistics.care.ui.g(vprVar, (MapBuilder) obj), continuation);
                return collect16 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect16 : zy11Var;
            case 18:
                Object collect17 = ((tpr) obj2).collect(new e(vprVar, (ru.yandex.logistics.sdk.cargo_form.impl.ui.h) obj), continuation);
                return collect17 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect17 : zy11Var;
            case 19:
                Object collect18 = ((q98) obj2).collect(new ru.yandex.logistics.sdk.cargo_form.impl.ui.g(vprVar, (ru.yandex.logistics.sdk.cargo_form.impl.ui.h) obj), continuation);
                return collect18 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect18 : zy11Var;
            case 20:
                Object collect19 = ((r0) obj2).collect(new c(vprVar, (ru.yandex.taxi.logistics.sdk.tracking.impl.change_datetime.ui.d) obj), continuation);
                return collect19 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect19 : zy11Var;
            case 21:
                Object collect20 = ((tpr) obj2).collect(new com.yandex.messaging.internal.view.chat.d(vprVar, (com.yandex.messaging.internal.view.chat.e) obj), continuation);
                return collect20 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect20 : zy11Var;
            case 22:
                Object collect21 = ((g) obj2).collect(new ru.yandex.taxi.locationsdk.processor_on_jump_or_divergence.internal.processor.a(vprVar, (v2u) obj), continuation);
                return collect21 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect21 : zy11Var;
            case 23:
                Object collect22 = ((tpr) obj2).collect(new com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.e(vprVar, (f) obj), continuation);
                return collect22 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect22 : zy11Var;
            case 24:
                Object collect23 = ((tpr) obj2).collect(new com.yandex.messaging.ui.main.telemessenger.connection.b(vprVar, (r5e) obj), continuation);
                return collect23 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect23 : zy11Var;
            case 25:
                Object collect24 = ((r0) obj2).collect(new ru.yandex.taxi.sdk.delivery_screen_contact_picker.impl.ui.c(vprVar, (ru.yandex.taxi.sdk.delivery_screen_contact_picker.impl.ui.d) obj), continuation);
                return collect24 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect24 : zy11Var;
            case 26:
                Object collect25 = ((tpr) obj2).collect(new com.yandex.messaging.internal.authorized.sync.b(vprVar, (eke) obj), continuation);
                return collect25 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect25 : zy11Var;
            case 27:
                Object collect26 = ((tpr) obj2).collect(new com.ybsdk.core.utils.ext.b(vprVar, (tls) obj), continuation);
                return collect26 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect26 : zy11Var;
            case 28:
                Object collect27 = ((tpr) obj2).collect(new ru.yandex.taxi.logistics.sdk.dashboard.storage.a(vprVar, (ru.yandex.taxi.logistics.sdk.dashboard.storage.c) obj), continuation);
                return collect27 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect27 : zy11Var;
            default:
                Object collect28 = ((syc) obj2).collect(new ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.costdetails.b(vprVar, (jye) obj), continuation);
                return collect28 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect28 : zy11Var;
        }
    }
}
