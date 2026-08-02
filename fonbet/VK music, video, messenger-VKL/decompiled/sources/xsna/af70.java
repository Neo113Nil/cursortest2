package xsna;

import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes5.dex */
public final class af70 implements izs<Integer, Object> {
    public final /* synthetic */ List b;

    public af70(uuz uuzVar, List list) {
        this.b = list;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        return ((me70) this.b.get(num.intValue())).getClass();
    }
}
