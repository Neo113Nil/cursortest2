package xsna;

import xsna.dv7;
import xsna.fpc;
import xsna.sv2;
import xsna.sx40;
import xsna.z7k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class sv7 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ sv7(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke(dv7.d.b);
                break;
            case 1:
                this.c.invoke(sx40.b.c.b);
                break;
            case 2:
                this.c.invoke(fpc.b.b);
                break;
            case 3:
                this.c.invoke(z7k.l.b);
                break;
            case 4:
                izs izsVar = this.c;
                if (izsVar != null) {
                    izsVar.invoke(0);
                }
                break;
            default:
                this.c.invoke(sv2.b.b);
                break;
        }
        return s3q0.a;
    }
}
