package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class kk40 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ ik40 b;

    public /* synthetic */ kk40(ik40 ik40Var, int i) {
        this.a = i;
        this.b = ik40Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ik40 ik40Var = this.b;
        switch (i) {
            case 0:
                ik40Var.render((nk40) obj);
                break;
            default:
                Pair pair = (Pair) obj;
                ik40Var.wf((List) pair.getFirst(), (Map) pair.getSecond());
                break;
        }
        return zy11Var;
    }
}
