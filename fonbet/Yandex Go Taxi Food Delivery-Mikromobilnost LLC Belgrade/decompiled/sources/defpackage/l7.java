package defpackage;

import android.os.Bundle;
import com.yandex.messaging.domain.folders.j;
import com.yandex.messaging.internal.a0;
import com.yandex.messaging.internal.m;
import com.yandex.messaging.internal.n;
import com.yandex.messaging.internal.q;
import com.yandex.messaging.internal.z;
import com.yandex.messaging.ui.imageviewer.ImageViewerActivity;
import com.yandex.payment.divkit.usecases.o;
import com.yandex.payment.divkit.usecases.p;
import io.flutter.plugins.sharedpreferences.g;
import java.util.Date;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.h;
import kotlinx.coroutines.flow.m0;
import ru.yandex.logistics.care.ui.f;
import ru.yandex.logistics.care.ui.l;
import ru.yandex.logistics.sdk.cargo_form.core.api.a;
import ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.k;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll.Anchor;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll.c;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll.e;
import ru.yandex.taxi.logistics.sdk.management.d;
import ru.yandex.taxi.logistics.sdk.management.storage.b;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.TrackingWidgetModelProvider$widgetsFlow$$inlined$combine$1$3;

/* loaded from: classes5.dex */
public final class l7 implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ l7(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.c = obj;
        this.w = obj2;
        this.b = obj3;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        Object obj2 = this.w;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                Object collect = ((q98) obj3).collect(new a(vprVar, (m7) obj2, (String) obj), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            case 1:
                Object collect2 = ((tpr) obj3).collect(new ru.yandex.taxi.logistics.sdk.management.storage.a(vprVar, (b) obj2, (String) obj), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
            case 2:
                Object collect3 = ((tpr) obj3).collect(new f(vprVar, (pt8) obj2, (l) obj), continuation);
                return collect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect3 : zy11Var;
            case 3:
                Object collect4 = ((tpr) obj3).collect(new com.yandex.messaging.internal.view.timeline.translations.a(vprVar, (pcb) obj2, (String) obj), continuation);
                return collect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect4 : zy11Var;
            case 4:
                Object collect5 = ((tpr) obj3).collect(new ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.a(vprVar, (List) obj2, (Integer) obj), continuation);
                return collect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect5 : zy11Var;
            case 5:
                Object collect6 = ((tpr) obj3).collect(new d(vprVar, (String) obj, (puh) obj2), continuation);
                return collect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect6 : zy11Var;
            case 6:
                Object collect7 = ((tpr) obj3).collect(new ru.yandex.taxi.logistics.sdk.delivery.state.a(vprVar, (kme0) obj2, (ru.yandex.taxi.logistics.sdk.delivery.state.b) obj), continuation);
                return collect7 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect7 : zy11Var;
            case 7:
                Object collect8 = ((tpr) obj3).collect(new com.yandex.messaging.domain.organizations.a(vprVar, (lsn) obj2, (String) obj), continuation);
                return collect8 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect8 : zy11Var;
            case 8:
                Object collect9 = ((rol0) obj3).collect(new com.yandex.messaging.domain.personal.organization.employee.a(vprVar, (uun) obj2, (String) obj), continuation);
                return collect9 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect9 : zy11Var;
            case 9:
                Object collect10 = ((ui7) obj3).collect(new ru.yandex.logistics.sdk.cargo_form.core.impl.a(vprVar, (y3s) obj2, (kg31) obj), continuation);
                return collect10 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect10 : zy11Var;
            case 10:
                Object collect11 = ((gci0) obj3).a.collect(new j(vprVar, (Set) obj2, (p7t) obj), continuation);
                return collect11 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect11 : zy11Var;
            case 11:
                Object collect12 = ((rol0) obj3).collect(new m(vprVar, (o8t) obj2, (n) obj), continuation);
                return collect12 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect12 : zy11Var;
            case 12:
                Object collect13 = ((fi9) obj3).collect(new q(vprVar, (String) obj, (Date) obj2), continuation);
                return collect13 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect13 : zy11Var;
            case 13:
                Object collect14 = ((h) obj3).collect(new z(vprVar, (a0) obj2, (String) obj), continuation);
                return collect14 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect14 : zy11Var;
            case 14:
                Object collect15 = ((tpr) obj3).collect(new com.yandex.messaging.ui.imageviewer.b(vprVar, (ImageViewerActivity) obj2, (Bundle) obj), continuation);
                return collect15 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect15 : zy11Var;
            case 15:
                Object collect16 = ((tpr) obj3).collect(new ru.yandex.taxi.logistics.sdk.tracking.domain.impl.a(vprVar, (hh00) obj2, (t701) obj), continuation);
                return collect16 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect16 : zy11Var;
            case 16:
                Object collect17 = ((m0) obj3).collect(new o(vprVar, (p) obj2, (kq60) obj), continuation);
                return collect17 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect17 : zy11Var;
            case 17:
                Object collect18 = ((tpr) obj3).collect(new ru.yandex.taxi.logistics.sdk.postcard.presentation.a(vprVar, (ru.yandex.taxi.logistics.sdk.postcard.presentation.b) obj2, (String) obj), continuation);
                return collect18 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect18 : zy11Var;
            case 18:
                Object collect19 = ((tpr) obj3).collect(new com.ybsdk.core.common.data.cache.a(vprVar, (com.ybsdk.core.common.data.cache.b) obj2, (vvj0) obj), continuation);
                return collect19 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect19 : zy11Var;
            case 19:
                Object collect20 = ((tpr) obj3).collect(new c(vprVar, (e) obj2, (Anchor) obj), continuation);
                return collect20 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect20 : zy11Var;
            case 20:
                Object collect21 = ((tpr) obj3).collect(new com.yandex.messaging.ui.folders.selectDialog.c(vprVar, (com.yandex.messaging.ui.folders.selectDialog.e) obj2, (q7t) obj), continuation);
                return collect21 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect21 : zy11Var;
            case 21:
                Object collect22 = ((tpr) obj3).collect(new io.flutter.plugins.sharedpreferences.b(vprVar, (kme0) obj2, (g) obj), continuation);
                return collect22 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect22 : zy11Var;
            case 22:
                Object collect23 = ((tpr) obj3).collect(new com.ybsdk.feature.testpayment.internal.domain.a(vprVar, (com.ybsdk.feature.testpayment.internal.domain.b) obj2, (hhy0) obj), continuation);
                return collect23 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect23 : zy11Var;
            case 23:
                tpr[] tprVarArr = (tpr[]) obj3;
                Object a = kotlinx.coroutines.flow.internal.j.a(vprVar, new akt0(tprVarArr, 14), new TrackingWidgetModelProvider$widgetsFlow$$inlined$combine$1$3(null, (String[]) obj2, (j801) obj), continuation, tprVarArr);
                return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11Var;
            case 24:
                Object collect24 = ((tpr) obj3).collect(new k(vprVar, (String) obj, (String) obj2), continuation);
                return collect24 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect24 : zy11Var;
            default:
                Object collect25 = ((tpr) obj3).collect(new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.uploaded_images_preview.a(vprVar, (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.uploaded_images_preview.b) obj2, (pd21) obj), continuation);
                return collect25 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect25 : zy11Var;
        }
    }

    public /* synthetic */ l7(tpr tprVar, String str, Object obj, int i) {
        this.a = i;
        this.c = tprVar;
        this.b = str;
        this.w = obj;
    }
}
