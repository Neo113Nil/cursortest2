package defpackage;

import com.yandex.go.preorder.lifecycle.p;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class oit0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ oit0(p pVar, int i) {
        this.a = i;
        this.b = pVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        p pVar = this.b;
        switch (i) {
            case 0:
                pVar.h.c(null);
                break;
            case 1:
                pVar.h.c(null);
                break;
            case 2:
                qmp0 qmp0Var = (qmp0) obj;
                ((pep0) pVar.f).f(new c2n0(2, (pmp0) pVar.d.get(), new gas0(20, qmp0Var), new ppr0(25, qmp0Var, pVar)), new rmp0(qmp0Var.a, qmp0Var.b, qmp0Var.c, qmp0Var.d, qmp0Var.e), hxx.a);
                qmp0Var.g.invoke();
                break;
            default:
                plp0 plp0Var = (plp0) obj;
                ((pep0) pVar.f).f(new c2n0(1, (olp0) pVar.e.get(), new lit0(plp0Var, 0), new lit0(plp0Var, 1)), plp0Var, hxx.a);
                break;
        }
        return zy11Var;
    }
}
