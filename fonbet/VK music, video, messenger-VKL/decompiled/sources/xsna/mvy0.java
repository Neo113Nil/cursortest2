package xsna;

import java.util.concurrent.Executor;
import xsna.e9y0;

/* loaded from: classes13.dex */
public final class mvy0<TResult> implements b3q<TResult> {
    public final c680 a;
    public final Executor b;
    public final Object c = new Object();

    public mvy0(e9y0.a aVar, c680 c680Var) {
        this.a = c680Var;
        this.b = aVar;
    }

    @Override // xsna.b3q
    public final void a(szy0 szy0Var) {
        if (szy0Var.f()) {
            return;
        }
        this.b.execute(new cvy0(0, this, szy0Var));
    }
}
