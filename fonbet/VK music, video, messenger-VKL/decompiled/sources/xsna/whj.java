package xsna;

import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes16.dex */
public final class whj implements izs<Integer, Object> {
    public final /* synthetic */ woi b;
    public final /* synthetic */ List c;

    public whj(woi woiVar, List list) {
        this.b = woiVar;
        this.c = list;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        int intValue = num.intValue();
        return this.b.invoke(Integer.valueOf(intValue), this.c.get(intValue));
    }
}
