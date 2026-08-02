package xsna;

import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class idd0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;

    public /* synthetic */ idd0(List list, int i) {
        this.b = i;
        this.c = list;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.get(((Number) obj).intValue());
                break;
            case 1:
                this.c.get(((Number) obj).intValue());
                break;
            default:
                ((wow) this.c).get(((Number) obj).intValue());
                break;
        }
        return null;
    }
}
