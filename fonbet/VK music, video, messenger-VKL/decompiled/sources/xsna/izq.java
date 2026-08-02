package xsna;

import xsna.hjl0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class izq implements gzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ wh50 c;
    public final /* synthetic */ izs d;

    public /* synthetic */ izq(izs izsVar, wh50 wh50Var) {
        this.d = izsVar;
        this.c = wh50Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.d.invoke(xzq.h((tny) this.c.getValue()));
                break;
            default:
                this.c.setValue(Boolean.FALSE);
                this.d.invoke(new hjl0.a.r(false));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ izq(wh50 wh50Var, izs izsVar) {
        this.c = wh50Var;
        this.d = izsVar;
    }
}
