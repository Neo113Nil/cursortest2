package xsna;

import xsna.d4k0;
import xsna.fd70;
import xsna.ha70;
import xsna.hbz;
import xsna.u0;
import xsna.ymt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class u2 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ u2(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        izs izsVar = this.c;
        switch (i) {
            case 0:
                izsVar.invoke(u0.g.b);
                break;
            case 1:
                izsVar.invoke(ymt.b.a);
                break;
            case 2:
                izsVar.invoke(hbz.c.b);
                break;
            case 3:
                izsVar.invoke(ha70.e.a);
                break;
            case 4:
                if (!jjc.d().a()) {
                    izsVar.invoke(fd70.e.b);
                    s3q0 s3q0Var = s3q0.a;
                }
                break;
            default:
                izsVar.invoke(d4k0.j.b);
                break;
        }
        return s3q0.a;
    }
}
