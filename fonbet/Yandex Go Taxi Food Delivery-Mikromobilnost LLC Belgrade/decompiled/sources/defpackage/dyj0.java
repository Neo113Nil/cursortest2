package defpackage;

/* loaded from: classes15.dex */
public final class dyj0 implements e1k {
    public j5b a;
    public txj0 b;
    public final /* synthetic */ eyj0 c;

    public dyj0(eyj0 eyj0Var, j5b j5bVar) {
        this.c = eyj0Var;
        tje.e();
        this.a = j5bVar;
        eyj0Var.a.post(new byj0(this, 0));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        tje.e();
        if (this.a != null) {
            this.a = null;
            tje.e();
            txj0 txj0Var = this.b;
            if (txj0Var != null) {
                txj0Var.close();
            }
            this.b = null;
            this.c.a.post(new byj0(this, 1));
        }
    }
}
