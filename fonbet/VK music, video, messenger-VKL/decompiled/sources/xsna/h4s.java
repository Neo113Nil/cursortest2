package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class h4s implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ xzs e;

    public /* synthetic */ h4s(x430 x430Var, boolean z, izs izsVar, int i) {
        this.d = x430Var;
        this.c = z;
        this.e = izsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(65);
                j4s.a(this.c, (s8u0) this.d, (gzs) this.e, (androidx.compose.runtime.a) obj, I);
                break;
            default:
                x430 x430Var = (x430) this.d;
                izs izsVar = (izs) this.e;
                ((Integer) obj2).getClass();
                x430Var.h(ne7.I(513), (androidx.compose.runtime.a) obj, izsVar, this.c);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ h4s(boolean z, s8u0 s8u0Var, gzs gzsVar, int i) {
        this.c = z;
        this.d = s8u0Var;
        this.e = gzsVar;
    }
}
