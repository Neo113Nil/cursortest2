package xsna;

import java.util.List;

/* compiled from: LazyGridDsl.kt */
/* loaded from: classes2.dex */
public final class n1f0 implements izs<Integer, Object> {
    public final /* synthetic */ y160 b;
    public final /* synthetic */ List c;

    public n1f0(y160 y160Var, List list) {
        this.b = y160Var;
        this.c = list;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        return this.b.invoke(this.c.get(num.intValue()));
    }
}
