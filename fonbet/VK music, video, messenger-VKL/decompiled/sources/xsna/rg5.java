package xsna;

import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes15.dex */
public final class rg5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rg5(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((List) this.c).get(((Number) obj).intValue());
                return null;
            case 1:
                ((List) this.c).get(((Number) obj).intValue());
                return null;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                de50 de50Var = (de50) this.c;
                if (booleanValue) {
                    de50Var.s.setVisibility(4);
                } else {
                    de50Var.s.setVisibility(0);
                }
                return s3q0.a;
        }
    }
}
