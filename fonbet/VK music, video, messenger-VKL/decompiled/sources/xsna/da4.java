package xsna;

import java.util.List;
import xsna.c2r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class da4 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ da4(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return j5g.O0((List) obj);
            case 1:
                return ((jon0) obj).a();
            case 2:
                return i5s.a(new StringBuilder(), ((zk10) obj).b().get(1), "=<HIDE>");
            case 3:
                cvk.w(((Throwable) obj).toString(), false);
                return s3q0.a;
            case 4:
                dx90 dx90Var = ow90.e;
                dx90Var.getClass();
                dx90Var.o = System.currentTimeMillis();
                dx90Var.u();
                return s3q0.a;
            default:
                c2r0.b bVar = (c2r0.b) obj;
                umu0 umu0Var = r55.g;
                if (umu0Var == null) {
                    umu0Var = null;
                }
                return Boolean.valueOf(umu0Var.o.contains(bVar.c()));
        }
    }
}
