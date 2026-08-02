package xsna;

import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes4.dex */
public final class vc5 implements izs<Integer, Object> {
    public final /* synthetic */ ug4 b;
    public final /* synthetic */ List c;

    public vc5(ug4 ug4Var, List list) {
        this.b = ug4Var;
        this.c = list;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        int intValue = num.intValue();
        return this.b.invoke(Integer.valueOf(intValue), this.c.get(intValue));
    }
}
