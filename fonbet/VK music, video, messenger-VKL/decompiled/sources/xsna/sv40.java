package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.qv40;
import xsna.tv40;

/* compiled from: MusicPlayerAdvertisingReducer.kt */
/* loaded from: classes3.dex */
public final class sv40 extends dm50<uv40, qv40, tv40> {
    @Override // xsna.dm50
    public final tv40 c(tv40 tv40Var, qv40 qv40Var) {
        tv40 tv40Var2;
        tv40 tv40Var3 = tv40Var;
        qv40 qv40Var2 = qv40Var;
        if (qv40Var2 instanceof qv40.a) {
            qv40.a aVar = (qv40.a) qv40Var2;
            tv40Var2 = new tv40.a(aVar.b, aVar.c);
        } else if (qv40Var2.equals(qv40.b.b)) {
            tv40Var2 = tv40.b.d;
        } else if (qv40Var2.equals(qv40.d.b)) {
            tv40Var2 = tv40.b.d;
        } else {
            if (qv40Var2 instanceof qv40.c) {
                tv40Var3.c = ((qv40.c) qv40Var2).b;
            } else {
                if (!(qv40Var2 instanceof qv40.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                tv40Var3.b = ((qv40.e) qv40Var2).b;
            }
            tv40Var2 = tv40Var3;
        }
        tv40Var2.c = tv40Var3.c;
        tv40Var2.b = tv40Var3.b;
        return tv40Var2;
    }

    @Override // xsna.dm50
    public final uv40 d() {
        return new uv40(e(new pqz(7)));
    }

    @Override // xsna.dm50
    public final void h(tv40 tv40Var, uv40 uv40Var) {
        f(uv40Var.a, tv40Var);
    }
}
