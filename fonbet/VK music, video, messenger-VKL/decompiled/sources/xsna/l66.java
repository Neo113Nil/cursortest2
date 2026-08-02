package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class l66 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l66(p66 p66Var, boolean z) {
        this.d = p66Var;
        this.c = z;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                p66 p66Var = (p66) this.d;
                p66Var.s0(p66Var.u - 1);
                if (this.c) {
                    p66Var.t0(p66Var.v - 1);
                    break;
                }
                break;
            default:
                ab40 ab40Var = (ab40) this.d;
                if (this.c) {
                    ab40Var.f.b(yf5.a);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ l66(boolean z, ab40 ab40Var) {
        this.c = z;
        this.d = ab40Var;
    }
}
