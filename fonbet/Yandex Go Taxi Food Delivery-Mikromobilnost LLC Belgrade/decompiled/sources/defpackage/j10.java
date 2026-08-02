package defpackage;

import androidx.room.RoomDatabase;
import com.yandex.mob.domain.b;
import com.yandex.mob.domain.c;
import com.yandex.quark.webchat.dialogcontext.a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.o;
import ru.yandex.taxi.locationsdk.core.processor_controller.internal.d;

/* loaded from: classes8.dex */
public final class j10 implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ tpr b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ j10(tpr tprVar, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = tprVar;
        this.c = obj;
        this.w = obj2;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.w;
        Object obj2 = this.c;
        tpr tprVar = this.b;
        switch (i) {
            case 0:
                Object collect = tprVar.collect(new a(vprVar, (k10) obj2, (zwf0) obj), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            case 1:
                Object collect2 = tprVar.collect(new ru.yandex.taxi.locationsdk.locationprovider.android.impl.a(vprVar, (la2) obj2, (sls) obj), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
            case 2:
                Object collect3 = ((o) tprVar).collect(new b(vprVar, (c) obj2, (ha4) obj), continuation);
                return collect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect3 : zy11Var;
            case 3:
                Object collect4 = tprVar.collect(new androidx.room.coroutines.b(vprVar, (RoomDatabase) obj2, (tls) obj), continuation);
                return collect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect4 : zy11Var;
            case 4:
                Object collect5 = ((euh) tprVar).collect(new ru.yandex.taxi.locationsdk.core.processor_controller.internal.b(vprVar, (d) obj2, obj), continuation);
                return collect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect5 : zy11Var;
            default:
                Object collect6 = tprVar.collect(new com.yandex.quark.contracts.internal.alice.a(vprVar, (va90) obj2, (bg3) obj), continuation);
                return collect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect6 : zy11Var;
        }
    }
}
