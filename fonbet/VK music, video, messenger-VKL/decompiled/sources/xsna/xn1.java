package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class xn1 implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;

    public /* synthetic */ xn1(int i, int i2, izs izsVar, boolean z) {
        this.e = i;
        this.c = z;
        this.d = izsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                co1.b(this.e, this.c, (izs) this.d, (androidx.compose.runtime.a) obj, I);
                break;
            case 1:
                izs izsVar = (izs) this.d;
                ((Integer) obj2).getClass();
                u7b0.c(ne7.I(this.e | 1), (androidx.compose.runtime.a) obj, izsVar, this.c);
                break;
            default:
                ((Integer) obj2).intValue();
                int I2 = ne7.I(this.e | 1);
                ((plo0) this.d).o(this.c, (androidx.compose.runtime.a) obj, I2);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ xn1(int i, izs izsVar, boolean z) {
        this.c = z;
        this.d = izsVar;
        this.e = i;
    }

    public /* synthetic */ xn1(plo0 plo0Var, boolean z, int i) {
        this.d = plo0Var;
        this.c = z;
        this.e = i;
    }
}
