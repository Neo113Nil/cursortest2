package defpackage;

/* loaded from: classes14.dex */
public abstract class k09 implements q09 {
    public final xz4 a;
    public yx01 b;
    public i09 c;
    public i09 d;

    public k09(xz4 xz4Var) {
        this.a = xz4Var;
    }

    @Override // defpackage.q09
    public final xz4 a() {
        return this.a;
    }

    public void d() {
        yx01 yx01Var = this.b;
        if (yx01Var != null) {
            yx01Var.b = true;
            yx01Var.a().cancel();
            yx01Var.b = false;
        }
    }

    public abstract yx01 e();

    public void f() {
        yx01 e = e();
        this.b = e;
        final int i = 0;
        e.d.add(new Runnable(this) { // from class: j09
            public final /* synthetic */ k09 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                k09 k09Var = this.b;
                switch (i2) {
                    case 0:
                        i09 i09Var = k09Var.c;
                        if (i09Var != null) {
                            i09Var.run();
                            break;
                        }
                        break;
                    default:
                        i09 i09Var2 = k09Var.d;
                        if (i09Var2 != null) {
                            i09Var2.run();
                            break;
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        e.e.add(new Runnable(this) { // from class: j09
            public final /* synthetic */ k09 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                k09 k09Var = this.b;
                switch (i22) {
                    case 0:
                        i09 i09Var = k09Var.c;
                        if (i09Var != null) {
                            i09Var.run();
                            break;
                        }
                        break;
                    default:
                        i09 i09Var2 = k09Var.d;
                        if (i09Var2 != null) {
                            i09Var2.run();
                            break;
                        }
                        break;
                }
            }
        });
        e.a().start();
    }
}
