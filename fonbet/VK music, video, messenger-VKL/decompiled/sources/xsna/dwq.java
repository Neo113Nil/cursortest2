package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class dwq implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dwq(Object obj, long j, int i) {
        this.b = i;
        this.d = obj;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((iwq) this.d).m = this.c;
                break;
            default:
                q1d0 q1d0Var = (q1d0) this.d;
                q1d0Var.t = true;
                q1d0Var.v = this.c;
                q1d0Var.z = false;
                if (!q1d0Var.E()) {
                    q1d0Var.g = x1b0.c;
                    q1d0Var.r(null);
                    q1d0Var.C();
                    break;
                } else {
                    q1d0Var.l.b(q1d0Var);
                    q1d0Var.G();
                    q1d0Var.A = true;
                    break;
                }
        }
    }
}
