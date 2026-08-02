package xsna;

import java.util.concurrent.Executor;
import xsna.e9y0;

/* loaded from: classes13.dex */
public final class pyy0<TResult> implements b3q<TResult> {
    public final cc80<TResult> a;
    public final Executor b;
    public final Object c = new Object();

    public pyy0(e9y0.a aVar, cc80 cc80Var) {
        this.a = cc80Var;
        this.b = aVar;
    }

    @Override // xsna.b3q
    public final void a(szy0 szy0Var) {
        if (szy0Var.f()) {
            this.b.execute(new iyy0(this, szy0Var));
        }
    }
}
