package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class t6c implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ xzs c;
    public final /* synthetic */ List d;

    public /* synthetic */ t6c(xzs xzsVar, List list, int i) {
        this.b = i;
        this.c = xzsVar;
        this.d = list;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return ((qm0) this.c).invoke(((ArrayList) this.d).get(((Number) obj).intValue()));
            default:
                int intValue = ((Number) obj).intValue();
                return ((xpd) this.c).invoke(Integer.valueOf(intValue), ((wow) this.d).b.get(intValue));
        }
    }
}
