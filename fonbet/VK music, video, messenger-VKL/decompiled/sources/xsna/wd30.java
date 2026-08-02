package xsna;

import xsna.msm;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class wd30 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ wd30(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                tny tnyVar = (tny) obj;
                this.c.invoke(jgz.p(tnyVar).z(tnyVar, true));
                break;
            default:
                this.c.invoke(msm.b.a);
                break;
        }
        return s3q0.a;
    }
}
