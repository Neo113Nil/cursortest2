package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class r3g0 implements Runnable {
    public final /* synthetic */ ner0 b;
    public final /* synthetic */ u3g0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ r3g0(ner0 ner0Var, u3g0 u3g0Var, boolean z, boolean z2) {
        this.b = ner0Var;
        this.c = u3g0Var;
        this.d = z;
        this.e = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u1u0.b(this.b);
        m3g0 m3g0Var = this.c.c;
        if (m3g0Var != null) {
            m3g0Var.i1(this.d, this.e);
        }
    }
}
