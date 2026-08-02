package xsna;

import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes5.dex */
public final class ze70 implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ List c;

    public ze70(List list) {
        this.c = list;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return ((me70) this.c.get(((Number) obj).intValue())).getKey();
            default:
                this.c.get(((Number) obj).intValue());
                return null;
        }
    }

    public ze70(oi40 oi40Var, List list) {
        this.c = list;
    }
}
