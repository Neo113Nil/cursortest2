package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class mhf implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ mhf(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.e = obj;
        this.f = obj2;
        this.c = obj3;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                vhf.c((yhf) this.e, (izs) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 1:
                lg90 lg90Var = (lg90) this.e;
                String str = (String) this.f;
                q630 q630Var = (q630) this.c;
                ((Integer) obj2).getClass();
                ohp.a(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, str, q630Var, lg90Var);
                break;
            case 2:
                ((Integer) obj2).intValue();
                ((soc0) this.e).a((spg0) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((ofl0) this.e).g((yk8) this.f, (yk8) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }
}
