package xsna;

import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class em3 implements izs<Integer, Object> {
    public final /* synthetic */ pe1 b;
    public final /* synthetic */ List c;

    public em3(pe1 pe1Var, List list) {
        this.b = pe1Var;
        this.c = list;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        return this.b.invoke(this.c.get(num.intValue()));
    }
}
