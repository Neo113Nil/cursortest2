package defpackage;

/* loaded from: classes.dex */
public abstract class c751 {
    public final n751 a;
    public u1w[] b;

    public c751() {
        this(new n751((n751) null));
    }

    public final void a() {
        u1w[] u1wVarArr = this.b;
        if (u1wVarArr != null) {
            u1w u1wVar = u1wVarArr[0];
            u1w u1wVar2 = u1wVarArr[1];
            n751 n751Var = this.a;
            if (u1wVar2 == null) {
                u1wVar2 = n751Var.a.g(2);
            }
            if (u1wVar == null) {
                u1wVar = n751Var.a.g(1);
            }
            f(u1w.a(u1wVar, u1wVar2));
            u1w u1wVar3 = this.b[kp50.z(16)];
            if (u1wVar3 != null) {
                e(u1wVar3);
            }
            u1w u1wVar4 = this.b[kp50.z(32)];
            if (u1wVar4 != null) {
                d(u1wVar4);
            }
            u1w u1wVar5 = this.b[kp50.z(64)];
            if (u1wVar5 != null) {
                g(u1wVar5);
            }
        }
    }

    public void b(int i, u1w u1wVar) {
        if (this.b == null) {
            this.b = new u1w[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[kp50.z(i2)] = u1wVar;
            }
        }
    }

    public void c(int i, u1w u1wVar) {
        if (i != 8) {
            return;
        }
        ny61.g("Ignoring visibility inset not available for IME");
    }

    public abstract void d(u1w u1wVar);

    public abstract void e(u1w u1wVar);

    public abstract void f(u1w u1wVar);

    public abstract void g(u1w u1wVar);

    public c751(n751 n751Var) {
        this.a = n751Var;
    }
}
