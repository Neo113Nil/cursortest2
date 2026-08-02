package xsna;

import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes5.dex */
public final class kg70 implements izs<Integer, Object> {
    public final /* synthetic */ aki b;
    public final /* synthetic */ List c;

    public kg70(aki akiVar, List list) {
        this.b = akiVar;
        this.c = list;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        int intValue = num.intValue();
        return this.b.invoke(Integer.valueOf(intValue), this.c.get(intValue));
    }
}
