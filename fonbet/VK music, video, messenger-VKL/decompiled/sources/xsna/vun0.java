package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class vun0 implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ q630 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ vun0(int i, int i2, String str, q630 q630Var, boolean z) {
        this.f = str;
        this.c = z;
        this.e = i;
        this.d = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                String str = (String) this.f;
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                wun0.a(this.e, I, (androidx.compose.runtime.a) obj, str, this.d, this.c);
                break;
            default:
                ((Integer) obj2).getClass();
                ((i9p0) this.f).d(ne7.I(this.e | 1), (androidx.compose.runtime.a) obj, this.d, this.c);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ vun0(i9p0 i9p0Var, boolean z, q630 q630Var, int i) {
        this.f = i9p0Var;
        this.c = z;
        this.d = q630Var;
        this.e = i;
    }
}
