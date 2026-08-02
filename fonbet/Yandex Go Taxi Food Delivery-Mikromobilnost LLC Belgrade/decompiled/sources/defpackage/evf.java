package defpackage;

import com.yandex.payment.divkit.select.n;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class evf implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ evf(n nVar, int i) {
        this.a = i;
        this.b = nVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Object a0;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        n nVar = this.b;
        switch (i) {
            case 0:
                Object o = nVar.L.o(vpv.a, continuation);
                return o == CoroutineSingletons.COROUTINE_SUSPENDED ? o : zy11Var;
            case 1:
                cq4 cq4Var = (cq4) obj;
                if (cq4Var instanceof zp4) {
                    a0 = nVar.M.emit(new aeq0(tyh0.paymentsdk_error, tyh0.paymentsdk_error_top_up), continuation);
                    if (a0 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return zy11Var;
                    }
                } else if (!(cq4Var instanceof aq4) || (a0 = n.a0(nVar, continuation)) != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return zy11Var;
                }
                return a0;
            default:
                qyj0 qyj0Var = (qyj0) obj;
                if (qyj0Var instanceof hyj0) {
                    r0 r0Var = nVar.J;
                    eeq0 eeq0Var = new eeq0(((hyj0) qyj0Var).a);
                    r0Var.getClass();
                    r0Var.m(null, eeq0Var);
                    return zy11Var;
                }
                if (qyj0Var instanceof kyj0) {
                    n.Y(nVar, (sm0) ((kyj0) qyj0Var).a);
                    return zy11Var;
                }
                w511.b();
                return null;
        }
    }
}
