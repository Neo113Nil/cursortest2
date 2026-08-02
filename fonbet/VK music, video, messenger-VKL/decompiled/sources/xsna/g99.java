package xsna;

import xsna.c99;
import xsna.d99;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class g99 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ m99 c;

    public /* synthetic */ g99(m99 m99Var, int i) {
        this.b = i;
        this.c = m99Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                m99 m99Var = this.c;
                if (booleanValue) {
                    m99Var.t(d99.d.a);
                } else {
                    m99Var.k(false);
                }
                break;
            default:
                this.c.b(new c99.c0(false, "ShareLinkFromMainMenu"));
                break;
        }
        return s3q0.a;
    }
}
