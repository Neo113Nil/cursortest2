package xsna;

import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes17.dex */
public final class y7d0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ xzs c;
    public final /* synthetic */ List d;

    public /* synthetic */ y7d0(xzs xzsVar, List list, int i) {
        this.b = i;
        this.c = xzsVar;
        this.d = list;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                int intValue = ((Number) obj).intValue();
                return ((whd) this.c).invoke(Integer.valueOf(intValue), ((wow) this.d).b.get(intValue));
            default:
                return ((z410) this.c).invoke(this.d.get(((Number) obj).intValue()));
        }
    }
}
