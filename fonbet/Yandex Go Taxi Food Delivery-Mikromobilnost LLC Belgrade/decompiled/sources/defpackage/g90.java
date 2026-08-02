package defpackage;

import java.util.function.Consumer;

/* loaded from: classes8.dex */
public final class g90 {
    public final m90 a;

    public g90(m90 m90Var) {
        this.a = m90Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [f90] */
    /* JADX WARN: Type inference failed for: r3v3, types: [f90] */
    public final a90 a(ka0 ka0Var, Consumer consumer) {
        m2v m2vVar = new m2v(ka0Var);
        final int i = 0;
        m2vVar.y(new e90(i, this, consumer));
        m2vVar.w(new Runnable(this) { // from class: f90
            public final /* synthetic */ g90 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                g90 g90Var = this.b;
                switch (i2) {
                    case 0:
                        g90Var.a.a();
                        break;
                    default:
                        g90Var.a.c();
                        break;
                }
            }
        });
        final int i2 = 1;
        m2vVar.x(new Runnable(this) { // from class: f90
            public final /* synthetic */ g90 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                g90 g90Var = this.b;
                switch (i22) {
                    case 0:
                        g90Var.a.a();
                        break;
                    default:
                        g90Var.a.c();
                        break;
                }
            }
        });
        return m2vVar.e();
    }
}
