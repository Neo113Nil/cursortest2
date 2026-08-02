package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class so0 implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ so0(int i, int i2, String str, q630 q630Var, boolean z) {
        this.c = q630Var;
        this.g = str;
        this.d = z;
        this.e = i;
        this.f = i2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                izs izsVar = (izs) this.g;
                ((Integer) obj2).getClass();
                uo0.a(ne7.I(this.e | 1), this.f, (androidx.compose.runtime.a) obj, izsVar, this.c, this.d);
                break;
            default:
                String str = (String) this.g;
                ((Integer) obj2).getClass();
                wju.a(ne7.I(this.e | 1), this.f, (androidx.compose.runtime.a) obj, str, this.c, this.d);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ so0(int i, int i2, izs izsVar, q630 q630Var, boolean z) {
        this.d = z;
        this.g = izsVar;
        this.c = q630Var;
        this.e = i;
        this.f = i2;
    }
}
