package xsna;

import xsna.kq0;
import xsna.r2c;
import xsna.t44;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class uq0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ uq0(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke(new kq0.b(((Boolean) obj).booleanValue()));
                break;
            case 1:
                String i = ((l2v0) obj).i();
                if (i != null) {
                    this.c.invoke(new r2c.i(i));
                }
                break;
            default:
                this.c.invoke(t44.e.b.b);
                break;
        }
        return s3q0.a;
    }
}
