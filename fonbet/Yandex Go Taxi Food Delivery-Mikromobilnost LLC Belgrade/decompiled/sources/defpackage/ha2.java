package defpackage;

import com.yandex.delivery.live.location.impl.repository.a;
import com.yandex.mob.e;
import com.yandex.plus.home.plaque.feature.internal.presentation.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2;
import kotlinx.coroutines.flow.internal.j;
import kotlinx.coroutines.flow.o;
import ru.yandex.taxi.locationsdk.locationprovider.android.impl.f;
import ru.yandex.taxi.locationsdk.locationprovider.android.impl.g;
import ru.yandex.taxi.logistics.sdk.dashboard.storage.b;
import ru.yandex.taxi.logistics.sdk.dashboard.storage.c;
import ru.yandex.taxi.logistics.sdk.management.h;
import ru.yandex.taxi.logistics.sdk.management.i;

/* loaded from: classes9.dex */
public final class ha2 implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ha2(int i, Object obj, Object obj2) {
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
                Object collect = ((tpr) obj2).collect(new f(vprVar, (g) obj), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            case 1:
                Object collect2 = ((tpr) obj2).collect(new b(vprVar, (c) obj), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
            case 2:
                Object a = j.a(vprVar, qqr.b, new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2(null, (bms) obj), continuation, (tpr[]) obj2);
                return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11Var;
            case 3:
                Object a2 = j.a(vprVar, qqr.b, new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2(null, (dms) obj), continuation, (tpr[]) obj2);
                return a2 == CoroutineSingletons.COROUTINE_SUSPENDED ? a2 : zy11Var;
            case 4:
                Object a3 = j.a(vprVar, qqr.b, new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2(null, (ems) obj), continuation, (tpr[]) obj2);
                return a3 == CoroutineSingletons.COROUTINE_SUSPENDED ? a3 : zy11Var;
            case 5:
                Object collect3 = ((eci0) obj2).a.collect(new ru.yandex.taxi.locationsdk.core.input_controller.internal.c(vprVar, (jdt0) obj), continuation);
                return collect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect3 : zy11Var;
            case 6:
                Object collect4 = ((tpr) obj2).collect(new a(vprVar, (com.yandex.delivery.live.location.impl.repository.b) obj), continuation);
                return collect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect4 : zy11Var;
            case 7:
                Object collect5 = ((rol0) obj2).collect(new e(vprVar, (nn20) obj), continuation);
                return collect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect5 : zy11Var;
            case 8:
                Object collect6 = ((tpr) obj2).collect(new com.yandex.quark.webchat.capability.a(vprVar, (nfh) obj), continuation);
                return collect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect6 : zy11Var;
            case 9:
                Object collect7 = ((tpr) obj2).collect(new h(vprVar, (i) obj), continuation);
                return collect7 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect7 : zy11Var;
            case 10:
                Object collect8 = ((mth) obj2).collect(new com.yandex.mob.metrics.a(vprVar, (z160) obj), continuation);
                return collect8 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect8 : zy11Var;
            case 11:
                Object collect9 = ((vpg) obj2).collect(new com.yandex.quark.webchat.b(vprVar, (com.yandex.quark.webchat.c) obj), continuation);
                return collect9 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect9 : zy11Var;
            case 12:
                Object collect10 = ((rol0) obj2).collect(new com.yandex.plus.home.plaque.feature.internal.presentation.c(vprVar, (d) obj), continuation);
                return collect10 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect10 : zy11Var;
            case 13:
                Object collect11 = ((tpr) obj2).collect(new com.yandex.plus.home.api.info.a(vprVar, (d5d0) obj), continuation);
                return collect11 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect11 : zy11Var;
            case 14:
                Object collect12 = ((tpr) obj2).collect(new com.yandex.plus.home.graphql.plusstate.a(vprVar, (com.yandex.plus.home.graphql.plusstate.c) obj), continuation);
                return collect12 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect12 : zy11Var;
            case 15:
                Object collect13 = ((tpr) obj2).collect(new ru.yandex.taxi.locationsdk.core.processor_controller.internal.c(vprVar, (ru.yandex.taxi.locationsdk.core.processor_controller.internal.d) obj), continuation);
                return collect13 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect13 : zy11Var;
            case 16:
                Object collect14 = ((tpr) obj2).collect(new com.ybsdk.api.b(vprVar, (com.ybsdk.api.e) obj), continuation);
                return collect14 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect14 : zy11Var;
            case 17:
                Object collect15 = ((o) obj2).collect(new ru.yandex.taxi.locationsdk.processor_select_source.a(vprVar, (qeq0) obj), continuation);
                return collect15 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect15 : zy11Var;
            case 18:
                Object collect16 = ((tpr) obj2).collect(new ru.yandex.taxi.locationsdk.core.source_location_provider.internal.a(vprVar, (ru.yandex.taxi.locationsdk.core.source_location_provider.internal.b) obj), continuation);
                return collect16 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect16 : zy11Var;
            case 19:
                Object collect17 = ((tpr) obj2).collect(new ru.yandex.taxi.logistics.sdk.tracking.uuid_store.a(vprVar, (ru.yandex.taxi.logistics.sdk.tracking.uuid_store.b) obj), continuation);
                return collect17 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect17 : zy11Var;
            default:
                Object collect18 = ((mth) obj2).collect(new com.yandex.mob.metrics.b(vprVar, (a041) obj), continuation);
                return collect18 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect18 : zy11Var;
        }
    }
}
