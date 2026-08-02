package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class e74 implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ e74(int i, String str, String str2, izs izsVar, boolean z) {
        this.c = z;
        this.e = str;
        this.f = str2;
        this.g = izsVar;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                String str = (String) this.e;
                String str2 = (String) this.f;
                izs izsVar = (izs) this.g;
                ((Integer) obj2).intValue();
                p74.d(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, str, str2, izsVar, this.c);
                break;
            default:
                qw1 qw1Var = (qw1) this.e;
                q630 q630Var = (q630) this.f;
                yto0 yto0Var = (yto0) this.g;
                ((Integer) obj2).getClass();
                kuo0.o(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, qw1Var, q630Var, yto0Var, this.c);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ e74(int i, qw1 qw1Var, q630 q630Var, yto0 yto0Var, boolean z) {
        this.e = qw1Var;
        this.f = q630Var;
        this.g = yto0Var;
        this.c = z;
        this.d = i;
    }
}
