package xsna;

/* compiled from: JsChatDelegate.kt */
/* loaded from: classes6.dex */
public final class w2y implements mpf0 {
    public static final int d = iah0.a(72);
    public final x6y a;
    public fvv0 b;
    public Boolean c;

    public w2y(x6y x6yVar, fvv0 fvv0Var) {
        this.a = x6yVar;
        this.b = fvv0Var;
    }

    @Override // xsna.mpf0
    public final void b(fvv0 fvv0Var) {
        this.b = fvv0Var;
    }

    @Override // xsna.mpf0
    public final void release() {
        this.b = null;
        this.c = null;
    }
}
