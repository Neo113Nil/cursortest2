package xsna;

import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes17.dex */
public final class t5l implements izs<Integer, Object> {
    public final /* synthetic */ i60 b;
    public final /* synthetic */ List c;

    public t5l(i60 i60Var, List list) {
        this.b = i60Var;
        this.c = list;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        int intValue = num.intValue();
        return this.b.invoke(Integer.valueOf(intValue), this.c.get(intValue));
    }
}
