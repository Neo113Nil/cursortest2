package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class vs0 implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;

    public /* synthetic */ vs0(int i, izs izsVar, q630 q630Var, boolean z) {
        this.e = z;
        this.f = izsVar;
        this.c = q630Var;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                izs izsVar = (izs) this.f;
                ((Integer) obj2).getClass();
                bt0.h(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, izsVar, this.c, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                kuo0.d(this.c, (qw1) this.f, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ vs0(q630 q630Var, qw1 qw1Var, int i, boolean z, int i2) {
        this.c = q630Var;
        this.f = qw1Var;
        this.d = i;
        this.e = z;
    }
}
