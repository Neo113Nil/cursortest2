package xsna;

import kotlin.NoWhenBranchMatchedException;

/* compiled from: ActionButtonDisplayItemsFactory.kt */
/* loaded from: classes.dex */
public final class tu {
    public final Object a;

    public tu(a2o a2oVar) {
        this.a = a2oVar;
    }

    public gtk0 a() {
        return (gtk0) ((utk0) this.a).getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        if (r6.a > r2.a) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(gtk0 gtk0Var) {
        Object value;
        gtk0 gtk0Var2;
        utk0 utk0Var = (utk0) this.a;
        do {
            value = utk0Var.getValue();
            gtk0Var2 = (gtk0) value;
            if (!(gtk0Var2 instanceof f7f0 ? true : epx.f(gtk0Var2, j2q0.b))) {
                if (!(gtk0Var2 instanceof rtk)) {
                    if (!(gtk0Var2 instanceof qgr)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            gtk0Var2 = gtk0Var;
        } while (!utk0Var.compareAndSet(value, gtk0Var2));
    }

    public tu() {
        this.a = vtk0.a(j2q0.b);
    }
}
