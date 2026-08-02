package xsna;

import java.util.concurrent.Executor;
import xsna.e57;
import xsna.o57;

/* compiled from: BiometricFragment.java */
/* loaded from: classes11.dex */
public final class s47 implements fr70<e57.b> {
    public final /* synthetic */ q47 b;

    public s47(q47 q47Var) {
        this.b = q47Var;
    }

    @Override // xsna.fr70
    public final void a(e57.b bVar) {
        e57.b bVar2 = bVar;
        if (bVar2 != null) {
            q47 q47Var = this.b;
            o57 o57Var = q47Var.i;
            if (o57Var.l) {
                o57Var.l = false;
                Executor executor = o57Var.b;
                if (executor == null) {
                    executor = new o57.b();
                }
                executor.execute(new z47(q47Var, bVar2));
            }
            q47Var.dismiss();
            o57 o57Var2 = q47Var.i;
            if (o57Var2.p == null) {
                o57Var2.p = new ug50<>();
            }
            o57.n(o57Var2.p, null);
        }
    }
}
