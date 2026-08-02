package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class u5g implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ u5g(long j, nmo0 nmo0Var, wzs wzsVar, int i) {
        this.c = j;
        this.e = nmo0Var;
        this.f = wzsVar;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                v5g v5gVar = (v5g) this.e;
                q630 q630Var = (q630) this.f;
                ((Integer) obj2).intValue();
                v5gVar.a(ne7.I(this.d | 1), this.c, (androidx.compose.runtime.a) obj, q630Var);
                break;
            default:
                ((Integer) obj2).getClass();
                fgo0.b(this.c, (nmo0) this.e, (wzs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ u5g(v5g v5gVar, long j, q630 q630Var, int i) {
        this.e = v5gVar;
        this.c = j;
        this.f = q630Var;
        this.d = i;
    }
}
