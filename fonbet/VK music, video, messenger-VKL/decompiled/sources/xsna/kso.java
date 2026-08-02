package xsna;

import java.util.List;
import xsna.e4u0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class kso implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ kso(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                tso.n((tgi0) obj, this.c);
                return s3q0.a;
            default:
                nc20 nc20Var = (nc20) obj;
                int i = nc20Var.a;
                List<qtd0> list = nc20Var.b;
                return new utk(new e4u0.b(i, list), list.size() + this.c < nc20Var.a);
        }
    }
}
