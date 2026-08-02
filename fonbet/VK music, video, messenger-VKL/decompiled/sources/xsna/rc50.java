package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class rc50 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rc50(Object obj, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = q630Var;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                sc50.a((sb50) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                ((qb90) this.d).f(this.c, this.e, (androidx.compose.runtime.a) obj, I);
                break;
            default:
                ((Integer) obj2).getClass();
                ndt0.g((pdt0) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ rc50(qb90 qb90Var, int i, Object obj, int i2) {
        this.b = 1;
        this.d = qb90Var;
        this.c = i;
        this.e = obj;
    }
}
