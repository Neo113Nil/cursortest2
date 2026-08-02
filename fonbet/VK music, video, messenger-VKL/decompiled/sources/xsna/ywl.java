package xsna;

import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class ywl implements izs<Integer, Object> {
    public final /* synthetic */ tr0 b;
    public final /* synthetic */ List c;

    public ywl(tr0 tr0Var, List list) {
        this.b = tr0Var;
        this.c = list;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        return this.b.invoke(this.c.get(num.intValue()));
    }
}
