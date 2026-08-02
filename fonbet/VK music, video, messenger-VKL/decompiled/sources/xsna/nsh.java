package xsna;

import xsna.x2v;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class nsh implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ nsh(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke((Throwable) obj);
                return s3q0.a;
            case 1:
                ((Boolean) obj).booleanValue();
                this.c.invoke(x2v.b.b);
                return s3q0.a;
            default:
                return (nw80) this.c.invoke((dw80) obj);
        }
    }
}
