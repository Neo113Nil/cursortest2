package xsna;

import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class yfr implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;

    public /* synthetic */ yfr(int i, List list, izs izsVar) {
        this.b = i;
        this.c = list;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return ((dcr) this.c.get(((Number) obj).intValue())).a();
            default:
                return ((g6n0) this.c.get(((Number) obj).intValue())).getId();
        }
    }
}
