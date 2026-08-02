package xsna;

import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes4.dex */
public final class lbi0 implements izs<Integer, Object> {
    public final /* synthetic */ a9b b;
    public final /* synthetic */ List c;

    public lbi0(a9b a9bVar, List list) {
        this.b = a9bVar;
        this.c = list;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        int intValue = num.intValue();
        return this.b.invoke(Integer.valueOf(intValue), this.c.get(intValue));
    }
}
