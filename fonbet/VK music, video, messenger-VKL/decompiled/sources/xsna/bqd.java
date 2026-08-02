package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes17.dex */
public final class bqd implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;

    public /* synthetic */ bqd(List list, int i) {
        this.b = i;
        this.c = list;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                break;
            case 1:
                ((wow) this.c).get(((Number) obj).intValue());
                break;
            default:
                ((ArrayList) this.c).get(((Number) obj).intValue());
                break;
        }
        return null;
    }
}
