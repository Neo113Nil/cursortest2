package xsna;

import xsna.h3b0;
import xsna.lbf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class nif implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ nif(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((Boolean) obj).booleanValue();
                this.c.invoke(lbf.c.b.b);
                return s3q0.a;
            case 1:
                this.c.invoke((Throwable) obj);
                return s3q0.a;
            case 2:
                npp0 npp0Var = (npp0) obj;
                if (!(npp0Var instanceof oot)) {
                    throw new IllegalStateException("Node is not a GestureNode instance");
                }
                Boolean bool = (Boolean) this.c.invoke(((oot) npp0Var).p);
                bool.getClass();
                return bool;
            default:
                this.c.invoke(new h3b0.b(((Boolean) obj).booleanValue()));
                return s3q0.a;
        }
    }
}
