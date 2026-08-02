package xsna;

import java.util.List;

/* compiled from: LazyStaggeredGridDsl.kt */
/* loaded from: classes18.dex */
public final class srv implements izs<Integer, Object> {
    public final /* synthetic */ List b;

    public srv(List list) {
        this.b = list;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        this.b.get(num.intValue());
        return null;
    }
}
