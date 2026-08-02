package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class wwl implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wwl(int i, q630 q630Var, int i2) {
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
                bxl.b(this.c, I, (androidx.compose.runtime.a) obj, q630Var);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((mfp) this.d).a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
            default:
                ((Integer) obj2).intValue();
                y830.a((izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ wwl(mfp mfpVar, int i) {
        this.d = mfpVar;
        this.c = i;
    }

    public /* synthetic */ wwl(izs izsVar, int i) {
        this.d = izsVar;
        this.c = i;
    }
}
