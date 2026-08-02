package xsna;

import xsna.hm3;
import xsna.k36;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class dm3 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ dm3(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        wh50 wh50Var = this.c;
        switch (i) {
            case 0:
                wh50Var.setValue((hm3.a) obj);
                break;
            case 1:
                wh50Var.setValue((k36.e) obj);
                break;
            case 2:
                tgi0 tgi0Var = (tgi0) obj;
                if (!drm0.N((CharSequence) wh50Var.getValue())) {
                    String str = (String) wh50Var.getValue();
                    qcy<Object>[] qcyVarArr = qgi0.a;
                    tgi0Var.a(ngi0.M, str);
                }
                break;
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                wh50Var.setValue(bool);
                break;
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                wh50Var.setValue(bool2);
                break;
        }
        return s3q0.a;
    }
}
