package defpackage;

import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class apr0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ bpr0 b;

    public /* synthetic */ apr0(bpr0 bpr0Var, int i) {
        this.a = i;
        this.b = bpr0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        bpr0 bpr0Var = this.b;
        switch (i) {
            case 0:
                ((Boolean) obj).getClass();
                bpr0Var.g.clear();
                break;
            default:
                CopyOnWriteArraySet copyOnWriteArraySet = bpr0Var.j;
                for (xnr0 xnr0Var : (List) obj) {
                    if (!copyOnWriteArraySet.contains(xnr0Var.a())) {
                        copyOnWriteArraySet.add(xnr0Var.a());
                        bpr0Var.g.addLast(xnr0Var);
                    }
                }
                if (bpr0Var.f) {
                    bpr0Var.h.postDelayed(bpr0Var.i, 500L);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
