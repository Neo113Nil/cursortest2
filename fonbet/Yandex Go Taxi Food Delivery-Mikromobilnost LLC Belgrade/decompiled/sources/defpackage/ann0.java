package defpackage;

import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class ann0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ wmn0 b;

    public /* synthetic */ ann0(wmn0 wmn0Var, int i) {
        this.a = i;
        this.b = wmn0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        wmn0 wmn0Var = this.b;
        switch (i) {
            case 0:
                wmn0Var.J9((amn0) obj);
                break;
            case 1:
                Pair pair = (Pair) obj;
                cln0 cln0Var = (cln0) pair.getFirst();
                xmn0 xmn0Var = (xmn0) pair.getSecond();
                wmn0Var.d6(cln0Var);
                if (xmn0Var != null) {
                    wmn0Var.n7(xmn0Var);
                    break;
                }
                break;
            default:
                wmn0Var.T5((onn0) obj);
                break;
        }
        return zy11Var;
    }
}
