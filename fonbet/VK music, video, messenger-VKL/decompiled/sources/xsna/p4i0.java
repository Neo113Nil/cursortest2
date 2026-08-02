package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class p4i0 implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ q630 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ p4i0(int i, izs izsVar, q630 q630Var, boolean z) {
        this.c = z;
        this.d = q630Var;
        this.f = izsVar;
        this.e = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((u4i0) this.f).b(ne7.I(this.e | 1), (androidx.compose.runtime.a) obj, this.d, this.c);
                break;
            default:
                izs izsVar = (izs) this.f;
                ((Integer) obj2).getClass();
                hol0.a(ne7.I(this.e | 1), (androidx.compose.runtime.a) obj, izsVar, this.d, this.c);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ p4i0(u4i0 u4i0Var, boolean z, q630 q630Var, int i) {
        this.f = u4i0Var;
        this.c = z;
        this.d = q630Var;
        this.e = i;
    }
}
