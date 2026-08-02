package xsna;

import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class au6 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ au6(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        wh50 wh50Var = this.c;
        List list = (List) obj;
        switch (i) {
            case 0:
                if (wh50Var != null) {
                    wh50Var.setValue(list);
                }
                break;
            default:
                int i2 = dbi0.r1;
                wh50Var.setValue(list);
                break;
        }
        return s3q0.a;
    }
}
