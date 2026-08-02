package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class fqr implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ wls b;

    public /* synthetic */ fqr(wls wlsVar, int i) {
        this.a = i;
        this.b = wlsVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        wls wlsVar = this.b;
        switch (i) {
            case 0:
                Object invoke = wlsVar.invoke(obj, continuation);
                if (invoke == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                rsn rsnVar = (rsn) obj;
                wlsVar.invoke(rsnVar.a, rsnVar.b);
                break;
            case 2:
                rsn rsnVar2 = (rsn) obj;
                wlsVar.invoke(rsnVar2.a, rsnVar2.b);
                break;
            default:
                rsn rsnVar3 = (rsn) obj;
                wlsVar.invoke(rsnVar3.a, rsnVar3.b);
                break;
        }
        return zy11Var;
    }
}
