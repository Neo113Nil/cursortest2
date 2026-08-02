package yads;

/* loaded from: classes10.dex */
public final class np2 implements Runnable {
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ qp2 d;

    public np2(qp2 qp2Var, String str, long j) {
        this.d = qp2Var;
        this.b = str;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.b.a(this.b, this.c);
        qp2 qp2Var = this.d;
        on3 on3Var = qp2Var.b;
        qp2Var.toString();
        on3Var.a();
    }
}
