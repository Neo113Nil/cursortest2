package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class fjj implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fjj(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                ojj.f((pkj) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((gwo) this.d).b((q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                moj0.a((foj0) this.d, (gzs) this.e, this.c, (androidx.compose.runtime.a) obj, I);
                break;
            default:
                ((Integer) obj2).intValue();
                kuo0.f((tuo0) this.d, (yto0) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ fjj(foj0 foj0Var, gzs gzsVar, int i, int i2) {
        this.b = 2;
        this.d = foj0Var;
        this.e = gzsVar;
        this.c = i;
    }
}
