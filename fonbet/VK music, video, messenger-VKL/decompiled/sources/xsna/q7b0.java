package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class q7b0 implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q7b0(int i, izs izsVar, boolean z) {
        this.c = z;
        this.e = izsVar;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                izs izsVar = (izs) this.e;
                ((Integer) obj2).getClass();
                v7b0.b(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, izsVar, this.c);
                break;
            default:
                ((Integer) obj2).intValue();
                int I = ne7.I(this.d | 1);
                ((plo0) this.e).m(this.c, (androidx.compose.runtime.a) obj, I);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ q7b0(plo0 plo0Var, boolean z, int i) {
        this.e = plo0Var;
        this.c = z;
        this.d = i;
    }
}
