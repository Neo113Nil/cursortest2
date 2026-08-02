package xsna;

import xsna.gdn;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class fgk implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ fgk(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                tny tnyVar = (tny) obj;
                this.c.invoke(jgz.p(tnyVar).z(tnyVar, true));
                return s3q0.a;
            case 1:
                this.c.invoke(new gdn.c.f(((Boolean) obj).booleanValue()));
                return s3q0.a;
            default:
                return this.c.invoke(((Object[]) obj)[0]);
        }
    }
}
