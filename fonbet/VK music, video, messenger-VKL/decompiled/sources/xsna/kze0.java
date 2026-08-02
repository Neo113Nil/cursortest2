package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class kze0 implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ vpi e;
    public final /* synthetic */ xzs f;

    public /* synthetic */ kze0(mze0 mze0Var, int i, int i2, jai jaiVar, int i3) {
        this.e = mze0Var;
        this.c = i;
        this.d = i2;
        this.f = jaiVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(385);
                ((mze0) this.e).ho(this.c, this.d, (jai) this.f, (androidx.compose.runtime.a) obj, I);
                break;
            default:
                h1h0 h1h0Var = (h1h0) this.e;
                gzs gzsVar = (gzs) this.f;
                ((Integer) obj2).getClass();
                int I2 = ne7.I(this.d | 1);
                h1h0Var.eo(this.c, I2, (androidx.compose.runtime.a) obj, gzsVar);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ kze0(h1h0 h1h0Var, int i, gzs gzsVar, int i2) {
        this.e = h1h0Var;
        this.c = i;
        this.f = gzsVar;
        this.d = i2;
    }
}
