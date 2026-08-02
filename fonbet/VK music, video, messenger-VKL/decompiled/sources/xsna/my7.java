package xsna;

import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class my7 implements izs<Integer, Object> {
    public final /* synthetic */ oc0 b;
    public final /* synthetic */ List c;

    public my7(oc0 oc0Var, List list) {
        this.b = oc0Var;
        this.c = list;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        return this.b.invoke(this.c.get(num.intValue()));
    }
}
