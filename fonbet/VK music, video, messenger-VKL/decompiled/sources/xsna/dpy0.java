package xsna;

import java.util.concurrent.Executor;
import xsna.e9y0;

/* loaded from: classes13.dex */
public final class dpy0<TResult> implements b3q<TResult> {
    public final d380<TResult> a;
    public final Executor b;
    public final Object c = new Object();

    public dpy0(e9y0.a aVar, d380 d380Var) {
        this.a = d380Var;
        this.b = aVar;
    }

    @Override // xsna.b3q
    public final void a(szy0 szy0Var) {
        this.b.execute(new foy0(this, szy0Var));
    }
}
