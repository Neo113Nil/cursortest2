package defpackage;

import com.yandex.messaging.domain.folders.e;
import com.yandex.messaging.domain.folders.f;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class k7t implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ tpr b;
    public final /* synthetic */ l7t c;

    public /* synthetic */ k7t(tpr tprVar, l7t l7tVar, int i) {
        this.a = i;
        this.b = tprVar;
        this.c = l7tVar;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        l7t l7tVar = this.c;
        tpr tprVar = this.b;
        switch (i) {
            case 0:
                Object collect = tprVar.collect(new e(vprVar, l7tVar), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            default:
                Object collect2 = tprVar.collect(new f(vprVar, l7tVar), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
        }
    }
}
