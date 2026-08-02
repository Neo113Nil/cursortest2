package xsna;

import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes16.dex */
public final class sqz implements izs<Integer, Object> {
    public final /* synthetic */ List b;

    public sqz(pqz pqzVar, List list) {
        this.b = list;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        return ((tmd) this.b.get(num.intValue())).a;
    }
}
