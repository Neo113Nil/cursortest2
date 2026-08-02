package xsna;

import xsna.oa70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class uc70 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;

    public /* synthetic */ uc70(int i, int i2, izs izsVar) {
        this.b = i2;
        this.c = izsVar;
        this.d = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((izs) this.c).invoke(new oa70.f(this.d, 28));
                break;
            case 1:
                ((izs) this.c).invoke(Integer.valueOf(this.d));
                break;
            default:
                ((rg50) this.c).C(this.d);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ uc70(int i, rg50 rg50Var) {
        this.b = 2;
        this.d = i;
        this.c = rg50Var;
    }
}
