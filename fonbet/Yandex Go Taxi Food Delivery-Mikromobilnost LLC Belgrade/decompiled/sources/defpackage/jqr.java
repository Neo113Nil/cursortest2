package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.i0;
import kotlinx.coroutines.flow.s;
import kotlinx.coroutines.flow.y;
import kotlinx.coroutines.flow.z;

/* loaded from: classes9.dex */
public final class jqr implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ tpr b;
    public final /* synthetic */ wls c;

    public /* synthetic */ jqr(tpr tprVar, wls wlsVar, int i) {
        this.a = i;
        this.b = tprVar;
        this.c = wlsVar;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        wls wlsVar = this.c;
        tpr tprVar = this.b;
        switch (i) {
            case 0:
                Object collect = tprVar.collect(new s(new Ref$BooleanRef(), vprVar, wlsVar), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            case 1:
                Object collect2 = tprVar.collect(new y(vprVar, wlsVar), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
            case 2:
                Object collect3 = tprVar.collect(new z(vprVar, wlsVar), continuation);
                return collect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect3 : zy11Var;
            default:
                Object collect4 = tprVar.collect(new i0(vprVar, wlsVar), continuation);
                return collect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect4 : zy11Var;
        }
    }
}
