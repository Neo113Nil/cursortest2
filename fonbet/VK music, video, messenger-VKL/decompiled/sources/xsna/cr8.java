package xsna;

import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class cr8 implements izs<Integer, Object> {
    public final /* synthetic */ cj1 b;
    public final /* synthetic */ List c;

    public cr8(cj1 cj1Var, ListBuilder listBuilder) {
        this.b = cj1Var;
        this.c = listBuilder;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        return this.b.invoke(this.c.get(num.intValue()));
    }
}
