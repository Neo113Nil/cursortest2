package xsna;

import xsna.d4k0;
import xsna.fd70;
import xsna.q0j0;
import xsna.u0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class t2 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ t2(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        izs izsVar = this.c;
        switch (i) {
            case 0:
                izsVar.invoke(u0.a.b);
                break;
            case 1:
                if (!jjc.d().a()) {
                    izsVar.invoke(fd70.f.b);
                    s3q0 s3q0Var = s3q0.a;
                }
                break;
            case 2:
                izsVar.invoke(q0j0.i.b);
                break;
            default:
                izsVar.invoke(d4k0.k.b.b);
                break;
        }
        return s3q0.a;
    }
}
