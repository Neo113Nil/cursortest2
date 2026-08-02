package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class v3c implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ List d;

    public /* synthetic */ v3c(int i, List list, izs izsVar) {
        this.b = i;
        this.c = izsVar;
        this.d = list;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return ((io3) this.c).invoke(((ArrayList) this.d).get(((Number) obj).intValue()));
            default:
                return this.c.invoke(((wow) this.d).b.get(((Number) obj).intValue()));
        }
    }
}
