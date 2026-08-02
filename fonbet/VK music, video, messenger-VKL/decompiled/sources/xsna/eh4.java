package xsna;

import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class eh4 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ eh4(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                if (!((nd4) obj).a) {
                    break;
                } else {
                    r5v0 r5v0Var = k840.a.h;
                    if (r5v0Var == null) {
                        r5v0Var = null;
                    }
                    r5v0Var.b(yo50.a);
                    r5v0 r5v0Var2 = k840.a.h;
                    (r5v0Var2 != null ? r5v0Var2 : null).b(new zj4(this.c));
                    break;
                }
            case 1:
                break;
            case 2:
                tso.n((tgi0) obj, this.c);
                break;
            default:
                tgi0 tgi0Var = (tgi0) obj;
                StringBuilder sb = new StringBuilder("PostingChipsItem#");
                int i = this.c;
                sb.append(i);
                qgi0.r(tgi0Var, sb.toString());
                qgi0.v(tgi0Var, i);
                break;
        }
        return s3q0.a;
    }
}
