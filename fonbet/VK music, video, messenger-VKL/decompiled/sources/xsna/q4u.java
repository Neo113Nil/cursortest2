package xsna;

import xsna.dzh;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class q4u implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;

    public /* synthetic */ q4u(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((izs) this.c).invoke(Integer.valueOf(this.d));
                break;
            case 1:
                ((izs) this.c).invoke(new sx40.n.e(this.d));
                break;
            default:
                ryh ryhVar = (ryh) this.c;
                ryhVar.b.c(new dzh.n.e(this.d));
                dw20 dw20Var = ryhVar.g;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                break;
        }
        return s3q0.a;
    }
}
