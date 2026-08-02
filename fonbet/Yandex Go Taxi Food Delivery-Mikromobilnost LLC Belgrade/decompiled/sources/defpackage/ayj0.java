package defpackage;

/* loaded from: classes15.dex */
public final class ayj0 implements e1k {
    public final xen a;
    public final String b;
    public final /* synthetic */ eyj0 c;

    public ayj0(eyj0 eyj0Var, String str, xen xenVar) {
        this.c = eyj0Var;
        tje.e();
        this.a = xenVar;
        this.b = str;
        eyj0Var.a.post(new zxj0(this, 0));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        tje.e();
        this.c.a.post(new zxj0(this, 1));
    }
}
