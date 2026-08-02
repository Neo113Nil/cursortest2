package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class i6l implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i6l(int i, tuo0 tuo0Var) {
        this.b = 2;
        this.c = i;
        this.d = tuo0Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((izs) this.d).invoke(Integer.valueOf(this.c));
                return s3q0.a;
            case 1:
                return Integer.valueOf(((jai0) this.d).f.b.d(this.c));
            default:
                tuo0 tuo0Var = (tuo0) this.d;
                int a = tuo0Var.a();
                int i = this.c;
                if (i != a) {
                    tuo0Var.d(i);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ i6l(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }
}
