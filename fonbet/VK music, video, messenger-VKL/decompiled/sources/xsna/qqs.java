package xsna;

import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes14.dex */
public final class qqs implements izs<Integer, Object> {
    public final /* synthetic */ rv4 b;
    public final /* synthetic */ List c;

    public qqs(rv4 rv4Var, List list) {
        this.b = rv4Var;
        this.c = list;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        int intValue = num.intValue();
        return this.b.invoke(Integer.valueOf(intValue), this.c.get(intValue));
    }
}
