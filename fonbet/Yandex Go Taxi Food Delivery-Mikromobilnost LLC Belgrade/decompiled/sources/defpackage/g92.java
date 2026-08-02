package defpackage;

import androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3;
import com.yandex.mob.l;
import com.yandex.plus.home.plaque.feature.internal.a;
import com.yandex.plus.home.plaque.plugin.internal.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.j;
import kotlinx.coroutines.flow.internal.k;
import kotlinx.coroutines.flow.o;
import ru.yandex.taxi.locationsdk.locationprovider.android.impl.c;

/* loaded from: classes9.dex */
public final class g92 implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g92(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Object collect = ((fi9) obj).collect(new c(vprVar), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            case 1:
                Object emit = vprVar.emit(((sls) obj).invoke(), continuation);
                return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : zy11Var;
            case 2:
                Object emit2 = vprVar.emit(obj, continuation);
                return emit2 == CoroutineSingletons.COROUTINE_SUSPENDED ? emit2 : zy11Var;
            case 3:
                Object collect2 = ((g92) obj).collect(new l(vprVar), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
            case 4:
                Object collect3 = ((mth) obj).collect(new a(vprVar), continuation);
                return collect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect3 : zy11Var;
            case 5:
                Object collect4 = ((mth) obj).collect(new b(vprVar), continuation);
                return collect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect4 : zy11Var;
            case 6:
                Object collect5 = ((rol0) obj).collect(new com.yandex.plus.treasury.impl.b(vprVar), continuation);
                return collect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect5 : zy11Var;
            case 7:
                Object collect6 = ((gci0) obj).a.collect(new com.ybsdk.api.a(vprVar), continuation);
                return collect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect6 : zy11Var;
            case 8:
                Object collect7 = ((k) obj).collect(new com.ybsdk.api.c(vprVar), continuation);
                return collect7 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect7 : zy11Var;
            case 9:
                Object collect8 = ((ha2) obj).collect(new ru.yandex.taxi.locationsdk.processor_select_source.b(vprVar), continuation);
                return collect8 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect8 : zy11Var;
            case 10:
                Object collect9 = ((o) obj).collect(new com.yandex.mob.datastore.b(vprVar), continuation);
                return collect9 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect9 : zy11Var;
            default:
                tpr[] tprVarArr = (tpr[]) obj;
                Object a = j.a(vprVar, new m49(tprVarArr, 9), new WorkConstraintsTracker$track$$inlined$combine$1$3(3, null), continuation, tprVarArr);
                return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11Var;
        }
    }
}
