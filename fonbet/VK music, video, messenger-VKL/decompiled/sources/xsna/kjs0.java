package xsna;

import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes2.dex */
public final class kjs0 implements izs<Integer, Object> {
    public final /* synthetic */ ltl0 b;
    public final /* synthetic */ List c;

    public kjs0(ltl0 ltl0Var, List list) {
        this.b = ltl0Var;
        this.c = list;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        return this.b.invoke(this.c.get(num.intValue()));
    }
}
