package defpackage;

import com.yandex.messaging.internal.translator.h;
import com.yandex.messaging.isolated.IsolatedFragment;
import com.yandex.messaging.isolated.MessengerChatFragment;
import com.yandex.messaging.isolated.MessengerChatListFragment;
import com.yandex.messaging.isolated.d;
import com.yandex.messaging.isolated.e;
import com.yandex.messaging.isolated.f;
import com.yandex.messaging.ui.folders.selectDialog.SelectFolderViewModel$createUiStateFlow$$inlined$combine$1$3;
import com.yandex.messaging.ui.joinlink.a;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.j;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.o;
import kotlinx.coroutines.flow.r0;
import ru.yandex.logistics.sdk.cargo_form.impl.universal_modal_view.b;
import ru.yandex.taxi.logistics.sdk.permissions.api.Permission;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.g;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.i;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.live_location.c;

/* loaded from: classes5.dex */
public final class fzw implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fzw(int i, Object obj, Object obj2) {
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
                Object collect = ((tpr) obj2).collect(new h(vprVar, (gzw) obj), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            case 1:
                Object collect2 = ((mth) obj2).collect(new d(vprVar, (IsolatedFragment) obj), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
            case 2:
                Object collect3 = ((r0) obj2).collect(new a(vprVar, (n9x) obj), continuation);
                return collect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect3 : zy11Var;
            case 3:
                Object collect4 = ((r0) obj2).collect(new com.ybsdk.core.mvp.widgets.a(vprVar, (w2y) obj), continuation);
                return collect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect4 : zy11Var;
            case 4:
                Object collect5 = ((acu) obj2).collect(new c(vprVar, (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.live_location.d) obj), continuation);
                return collect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect5 : zy11Var;
            case 5:
                Object collect6 = ((r0) obj2).collect(new com.yandex.plus.pay.ui.core.debug.internal.ui.log.a(vprVar, (llz) obj), continuation);
                return collect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect6 : zy11Var;
            case 6:
                Object collect7 = ((tpr) obj2).collect(new e(vprVar, (MessengerChatFragment) obj), continuation);
                return collect7 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect7 : zy11Var;
            case 7:
                Object collect8 = ((tpr) obj2).collect(new f(vprVar, (MessengerChatListFragment) obj), continuation);
                return collect8 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect8 : zy11Var;
            case 8:
                Object collect9 = ((ey4) obj2).collect(new g(vprVar, (i) obj), continuation);
                return collect9 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect9 : zy11Var;
            case 9:
                Object collect10 = ((fzw) obj2).collect(new ru.yandex.taxi.logistics.sdk.tracking.impl.domain.h(vprVar, (i) obj), continuation);
                return collect10 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect10 : zy11Var;
            case 10:
                Object collect11 = ((tpr) obj2).collect(new com.yandex.messaging.domain.i(vprVar, (f920) obj), continuation);
                return collect11 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect11 : zy11Var;
            case 11:
                Object collect12 = ((tpr) obj2).collect(new b(vprVar, (k130) obj), continuation);
                return collect12 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect12 : zy11Var;
            case 12:
                Object collect13 = ((q98) obj2).collect(new ru.yandex.logistics.sdk.cargo_form.impl.universal_modal_view.ui.b(vprVar, (ru.yandex.logistics.sdk.cargo_form.impl.universal_modal_view.ui.d) obj), continuation);
                return collect13 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect13 : zy11Var;
            case 13:
                Object collect14 = ((tpr) obj2).collect(new androidx.room.e(vprVar, (String[]) obj), continuation);
                return collect14 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect14 : zy11Var;
            case 14:
                Object collect15 = ((g92) obj2).collect(new com.ybsdk.nfc.a(vprVar, (p860) obj), continuation);
                return collect15 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect15 : zy11Var;
            case 15:
                Object collect16 = ((tpr) obj2).collect(new ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.i(vprVar, (vys0) obj), continuation);
                return collect16 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect16 : zy11Var;
            case 16:
                Object collect17 = ((acu) obj2).collect(new ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.pay_now.d(vprVar, (qt90) obj), continuation);
                return collect17 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect17 : zy11Var;
            case 17:
                Object collect18 = ((tpr) obj2).collect(new ru.yandex.taxi.logistics.sdk.permissions.impl.a(vprVar, (Permission) obj), continuation);
                return collect18 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect18 : zy11Var;
            case 18:
                Object collect19 = ((tpr) obj2).collect(new com.yandex.messaging.ui.settings.d(vprVar, (rk80) obj), continuation);
                return collect19 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect19 : zy11Var;
            case 19:
                Object collect20 = ((k) obj2).collect(new ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.poll.a(vprVar, (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.poll.c) obj), continuation);
                return collect20 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect20 : zy11Var;
            case 20:
                Object collect21 = ((tpr) obj2).collect(new com.ybsdk.feature.qr.internal.screens.reader.presentation.a(vprVar, (com.ybsdk.feature.qr.internal.screens.reader.presentation.b) obj), continuation);
                return collect21 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect21 : zy11Var;
            case 21:
                Object collect22 = ((tpr) obj2).collect(new com.ybsdk.rconfig.retriever.c(vprVar, (hnr0) obj), continuation);
                return collect22 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect22 : zy11Var;
            case 22:
                Object collect23 = ((tpr) obj2).collect(new ru.yandex.taxi.logistics.sdk.screen_route_list.ui.a(vprVar, (a6l0) obj), continuation);
                return collect23 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect23 : zy11Var;
            case 23:
                Object collect24 = ((acu) obj2).collect(new ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.rover.c(vprVar, (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.rover.d) obj), continuation);
                return collect24 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect24 : zy11Var;
            case 24:
                tpr[] tprVarArr = (tpr[]) obj2;
                Object a = j.a(vprVar, new ab00(tprVarArr, 22), new SelectFolderViewModel$createUiStateFlow$$inlined$combine$1$3((com.yandex.messaging.ui.folders.selectDialog.e) obj, null), continuation, tprVarArr);
                return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11Var;
            case 25:
                Object collect25 = ((mth) obj2).collect(new com.yandex.messaging.internal.view.timeline.overlay.d(vprVar, (com.yandex.messaging.internal.view.timeline.overlay.e) obj), continuation);
                return collect25 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect25 : zy11Var;
            case 26:
                Object collect26 = ((rol0) obj2).collect(new ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.top_accent_bar.c(vprVar, (gri) obj), continuation);
                return collect26 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect26 : zy11Var;
            case 27:
                Object collect27 = ((tpr) obj2).collect(new ru.yandex.taxi.logistics.sdk.tracking.impl.analytics.a(vprVar, (cjw0) obj), continuation);
                return collect27 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect27 : zy11Var;
            case 28:
                Object collect28 = ((o) obj2).collect(new ru.yandex.taxi.logistics.sdk.tracking.uuid_store.c(vprVar, (UUID) obj), continuation);
                return collect28 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect28 : zy11Var;
            default:
                Object collect29 = ((rol0) obj2).collect(new ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data.e(vprVar, (ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data.f) obj), continuation);
                return collect29 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect29 : zy11Var;
        }
    }
}
