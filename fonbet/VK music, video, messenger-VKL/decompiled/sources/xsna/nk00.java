package xsna;

import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes17.dex */
public final class nk00 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ xzs c;
    public final /* synthetic */ List d;

    public /* synthetic */ nk00(xzs xzsVar, List list, int i) {
        this.b = i;
        this.c = xzsVar;
        this.d = list;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                int intValue = ((Number) obj).intValue();
                return ((ek00) this.c).invoke(Integer.valueOf(intValue), this.d.get(intValue));
            default:
                return ((ulz) this.c).invoke(((wow) this.d).b.get(((Number) obj).intValue()));
        }
    }
}
