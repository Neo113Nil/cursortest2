package xsna;

import xsna.aup0;
import xsna.o5s;

/* compiled from: CallbackWrapper.java */
/* loaded from: classes11.dex */
public final class yb9 {
    public final aup0.a a;
    public final q7g0 b;

    public yb9(aup0.a aVar, q7g0 q7g0Var) {
        this.a = aVar;
        this.b = q7g0Var;
    }

    public final void a(o5s.a aVar) {
        int i = aVar.b;
        q7g0 q7g0Var = this.b;
        aup0.a aVar2 = this.a;
        if (i == 0) {
            q7g0Var.execute(new wb9(aVar2, aVar.a));
        } else {
            q7g0Var.execute(new xb9(aVar2, i));
        }
    }
}
