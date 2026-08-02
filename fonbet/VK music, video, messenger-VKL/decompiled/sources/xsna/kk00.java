package xsna;

import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes17.dex */
public final class kk00 implements izs<Integer, Object> {
    public final /* synthetic */ dk00 b;
    public final /* synthetic */ List c;

    public kk00(dk00 dk00Var, List list) {
        this.b = dk00Var;
        this.c = list;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        int intValue = num.intValue();
        return this.b.invoke(Integer.valueOf(intValue), this.c.get(intValue));
    }
}
