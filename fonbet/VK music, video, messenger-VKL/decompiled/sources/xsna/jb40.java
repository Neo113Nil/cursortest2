package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class jb40 implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jb40(int i, izs izsVar, boolean z) {
        this.c = z;
        this.d = izsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                ((lb40) this.d).f(this.c, (androidx.compose.runtime.a) obj, I);
                break;
            default:
                izs izsVar = (izs) this.d;
                ((Integer) obj2).getClass();
                x8u0.i(ne7.I(1), (androidx.compose.runtime.a) obj, izsVar, this.c);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ jb40(lb40 lb40Var, boolean z, int i) {
        this.d = lb40Var;
        this.c = z;
    }
}
