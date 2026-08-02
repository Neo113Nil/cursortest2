package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class tss implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tss(int i, q630 q630Var, int i2) {
        this.c = i;
        this.d = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                q630 q630Var = (q630) this.d;
                ((Integer) obj2).getClass();
                int I = ne7.I(49);
                uss.a(this.c, I, (androidx.compose.runtime.a) obj, q630Var);
                break;
            default:
                ((Integer) obj2).getClass();
                ((fxm0) this.d).a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ tss(fxm0 fxm0Var, int i) {
        this.d = fxm0Var;
        this.c = i;
    }
}
