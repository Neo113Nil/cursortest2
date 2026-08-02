package xsna;

import xsna.k36;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class x26 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ x26(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.setValue((k36.c) obj);
                break;
            case 1:
                this.c.setValue(new q9x(((q9x) obj).a));
                break;
            default:
                int i = (int) (((q9x) obj).a >> 32);
                if (i != 0) {
                    this.c.setValue(Integer.valueOf(i));
                }
                break;
        }
        return s3q0.a;
    }
}
