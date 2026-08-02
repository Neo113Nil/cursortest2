package xsna;

import xsna.yaf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class uif implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ int d;

    public /* synthetic */ uif(int i, int i2, izs izsVar) {
        this.b = i2;
        this.c = izsVar;
        this.d = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke(new yaf.b.C4088b(this.d));
                break;
            default:
                izs izsVar = this.c;
                if (izsVar != null) {
                    izsVar.invoke(Integer.valueOf(this.d));
                }
                break;
        }
        return s3q0.a;
    }
}
