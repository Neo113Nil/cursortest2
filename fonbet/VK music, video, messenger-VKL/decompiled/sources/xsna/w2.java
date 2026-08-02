package xsna;

import xsna.fd70;
import xsna.hbz;
import xsna.mbf;
import xsna.r2c;
import xsna.u0;
import xsna.ymt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class w2 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ w2(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        izs izsVar = this.c;
        switch (i) {
            case 0:
                izsVar.invoke(u0.c.b);
                break;
            case 1:
                izsVar.invoke(r2c.t.b);
                break;
            case 2:
                izsVar.invoke(mbf.c.p.a);
                break;
            case 3:
                izsVar.invoke(s9t.b);
                break;
            case 4:
                izsVar.invoke(ymt.a.a);
                break;
            case 5:
                izsVar.invoke(hbz.a.b);
                break;
            case 6:
                if (!jjc.d().a()) {
                    izsVar.invoke(fd70.g.b);
                    s3q0 s3q0Var = s3q0.a;
                }
                break;
            default:
                izsVar.invoke(fyq0.b);
                break;
        }
        return s3q0.a;
    }
}
