package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class il4 implements gzs {
    public final /* synthetic */ ml4 b;
    public final /* synthetic */ int c;

    public /* synthetic */ il4(ml4 ml4Var, int i) {
        this.b = ml4Var;
        this.c = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        ml4 ml4Var = this.b;
        if (ml4Var.isInterrupted()) {
            ml4Var.quit();
            return s3q0.a;
        }
        ml4Var.g();
        ml4Var.m = this.c;
        ml4Var.a();
        return s3q0.a;
    }
}
