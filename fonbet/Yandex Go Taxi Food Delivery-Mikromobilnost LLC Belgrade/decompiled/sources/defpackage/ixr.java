package defpackage;

import com.yandex.messaging.domain.folders.GetChatIdsByFolderIdUseCase$handleMainFolder$lambda$4$lambda$3$$inlined$combine$1$3;
import com.yandex.messaging.domain.folders.d;
import com.yandex.messaging.internal.storage.folders.b;
import com.yandex.messaging.internal.storage.folders.c;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.j;

/* loaded from: classes15.dex */
public final class ixr implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;

    public /* synthetic */ ixr(Object obj, long j, int i) {
        this.a = i;
        this.b = obj;
        this.c = j;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        long j = this.c;
        Object obj = this.b;
        switch (i) {
            case 0:
                Object collect = ((tpr) obj).collect(new b(vprVar, j), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            case 1:
                Object collect2 = ((tpr) obj).collect(new c(vprVar, j), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
            case 2:
                Object collect3 = ((tpr) obj).collect(new d(vprVar, j), continuation);
                return collect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect3 : zy11Var;
            default:
                tpr[] tprVarArr = (tpr[]) obj;
                Object a = j.a(vprVar, new v10(tprVarArr, 22), new GetChatIdsByFolderIdUseCase$handleMainFolder$lambda$4$lambda$3$$inlined$combine$1$3(null, j), continuation, tprVarArr);
                return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11Var;
        }
    }
}
