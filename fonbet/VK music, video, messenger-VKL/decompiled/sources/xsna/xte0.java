package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class xte0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ xte0(Object obj, Object obj2, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.f = obj2;
        this.c = q630Var;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                bue0 bue0Var = (bue0) this.e;
                izs izsVar = (izs) this.f;
                ((Integer) obj2).intValue();
                bue0Var.a(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, izsVar, this.c);
                break;
            default:
                ((Integer) obj2).getClass();
                int I = ne7.I(this.d | 1);
                ndt0.e((pdt0) this.e, (frv0) this.f, this.c, (androidx.compose.runtime.a) obj, I);
                break;
        }
        return s3q0.a;
    }
}
