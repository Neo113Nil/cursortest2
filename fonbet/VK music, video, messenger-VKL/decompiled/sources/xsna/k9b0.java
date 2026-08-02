package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class k9b0 implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ k9b0(rci0 rci0Var, boolean z, q630 q630Var, int i) {
        this.e = rci0Var;
        this.c = z;
        this.f = q630Var;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(this.d | 1);
                y9b0.c(this.c, (wzj) this.e, (String) this.f, (androidx.compose.runtime.a) obj, I);
                break;
            default:
                rci0 rci0Var = (rci0) this.e;
                q630 q630Var = (q630) this.f;
                ((Integer) obj2).intValue();
                rci0Var.a(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, q630Var, this.c);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ k9b0(boolean z, wzj wzjVar, String str, int i) {
        this.c = z;
        this.e = wzjVar;
        this.f = str;
        this.d = i;
    }
}
