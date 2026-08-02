package defpackage;

/* loaded from: classes8.dex */
public abstract class nlu {
    public final v820 a;

    public nlu(long j, v820 v820Var) {
        this.a = v820Var;
        long j2 = v820Var.a;
        if (j2 != 0) {
            int i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
        }
        if (j2 == 0) {
            v820Var.a = j;
        }
    }

    public final void a(nlu nluVar) {
        v820 v820Var = nluVar.a;
        d(v820Var.d.get(), v820Var.b.get(), v820Var.c.get());
        b(nluVar.e(), 0);
    }

    public abstract boolean b(pyl0 pyl0Var, int i);

    public abstract int c();

    public final void d(int i, long j, long j2) {
        v820 v820Var = this.a;
        v820Var.b.getAndAdd(j);
        v820Var.c.getAndAdd(j2);
        v820Var.d.getAndAdd(i);
    }

    public abstract pyl0 e();
}
