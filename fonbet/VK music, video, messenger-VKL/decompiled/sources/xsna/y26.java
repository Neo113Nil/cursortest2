package xsna;

import xsna.k36;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class y26 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ y26(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.setValue((k36.b) obj);
                break;
            case 1:
                this.c.setValue(obj);
                break;
            default:
                this.c.setValue(Boolean.FALSE);
                break;
        }
        return s3q0.a;
    }
}
