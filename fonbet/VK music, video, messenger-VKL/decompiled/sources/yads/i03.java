package yads;

/* loaded from: classes10.dex */
public final class i03 extends b63 {
    public final /* synthetic */ j03 f;

    public i03(j03 j03Var) {
        this.f = j03Var;
    }

    @Override // yads.ua0
    public final void b() {
        j03 j03Var = this.f;
        synchronized (j03Var.b) {
            this.b = 0;
            this.d = null;
            ua0[] ua0VarArr = j03Var.f;
            int i = j03Var.h;
            j03Var.h = i + 1;
            ua0VarArr[i] = this;
            j03Var.f();
        }
    }
}
