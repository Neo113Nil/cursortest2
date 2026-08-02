package yads;

/* loaded from: classes10.dex */
public final class pi1 implements Runnable {
    public final long b;
    public final dt c;
    public final /* synthetic */ qi1 d;

    public pi1(qi1 qi1Var, long j, yx1 yx1Var) {
        this.d = qi1Var;
        this.b = j;
        this.c = yx1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dt dtVar = this.c;
        if (dtVar.b == ct.b) {
            ((yx1) dtVar).run();
            this.d.a.postDelayed(this, this.b);
        }
    }
}
