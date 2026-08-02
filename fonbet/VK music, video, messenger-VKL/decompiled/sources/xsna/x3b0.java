package xsna;

import xsna.h3b0;
import xsna.q0j0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class x3b0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ x3b0(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i) {
            case 0:
                this.c.invoke(new h3b0.c(booleanValue));
                break;
            default:
                this.c.invoke(new q0j0.d(booleanValue));
                break;
        }
        return s3q0.a;
    }
}
