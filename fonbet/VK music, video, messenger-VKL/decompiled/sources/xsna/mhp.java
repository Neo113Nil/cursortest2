package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class mhp implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ mhp(String str, q630 q630Var, s890 s890Var, int i) {
        this.e = str;
        this.c = q630Var;
        this.f = s890Var;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(this.d | 1);
                ohp.c((String) this.e, this.c, (s890) this.f, (androidx.compose.runtime.a) obj, I);
                break;
            default:
                ((Integer) obj2).intValue();
                int I2 = ne7.I(this.d | 1);
                ((uoc0) this.e).a((spg0) this.f, this.c, (androidx.compose.runtime.a) obj, I2);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ mhp(uoc0 uoc0Var, spg0 spg0Var, q630 q630Var, int i) {
        this.e = uoc0Var;
        this.f = spg0Var;
        this.c = q630Var;
        this.d = i;
    }
}
