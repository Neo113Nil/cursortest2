package xsna;

import xsna.rma0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class od00 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ od00(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke(((tho0) obj).a.c);
                break;
            default:
                String i = ((l2v0) obj).i();
                if (i != null) {
                    this.c.invoke(new rma0.b(i));
                }
                break;
        }
        return s3q0.a;
    }
}
