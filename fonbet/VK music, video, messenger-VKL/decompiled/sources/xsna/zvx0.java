package xsna;

import androidx.work.WorkerParameters;

/* compiled from: WorkLauncher.kt */
/* loaded from: classes.dex */
public final class zvx0 implements xvx0 {
    public final ohd0 a;
    public final r5o0 b;

    public zvx0(ohd0 ohd0Var, r5o0 r5o0Var) {
        this.a = ohd0Var;
        this.b = r5o0Var;
    }

    @Override // xsna.xvx0
    public final void b(tqk0 tqk0Var, int i) {
        this.b.b(new ggl0(this.a, tqk0Var, false, i));
    }

    public final void c(final tqk0 tqk0Var, final WorkerParameters.a aVar) {
        this.b.b(new Runnable() { // from class: xsna.yvx0
            @Override // java.lang.Runnable
            public final void run() {
                zvx0.this.a.g(tqk0Var, aVar);
            }
        });
    }
}
