package xsna;

import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes5.dex */
public final class lg70 implements izs<Integer, Object> {
    public final /* synthetic */ List b;

    public lg70(List list) {
        this.b = list;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        return ((dg70) this.b.get(num.intValue())).getClass();
    }
}
