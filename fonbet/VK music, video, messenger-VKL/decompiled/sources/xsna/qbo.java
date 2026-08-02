package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class qbo implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ qbo(int i, int i2, Object obj, Object obj2, Object obj3) {
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
                ybo.b((cco) this.e, (gzs) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 1:
                qhw qhwVar = (qhw) this.e;
                lg90 lg90Var = (lg90) this.f;
                q630 q630Var = (q630) this.c;
                ((Integer) obj2).getClass();
                qhwVar.c(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, q630Var, lg90Var);
                break;
            default:
                ((Integer) obj2).intValue();
                ((srs0) this.e).f((xrs0) this.f, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }
}
