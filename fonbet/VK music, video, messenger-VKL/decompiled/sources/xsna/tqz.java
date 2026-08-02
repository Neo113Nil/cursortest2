package xsna;

import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes16.dex */
public final class tqz implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ List c;

    public tqz(List list) {
        this.c = list;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.get(((Number) obj).intValue());
                return null;
            default:
                return ((h8i0) this.c.get(((Number) obj).intValue())).a;
        }
    }

    public tqz(h2h0 h2h0Var, List list) {
        this.c = list;
    }
}
