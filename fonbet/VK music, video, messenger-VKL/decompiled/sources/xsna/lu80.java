package xsna;

import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class lu80 implements izs<Integer, Object> {
    public final /* synthetic */ z7w b;
    public final /* synthetic */ List c;

    public lu80(z7w z7wVar, List list) {
        this.b = z7wVar;
        this.c = list;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        return this.b.invoke(this.c.get(num.intValue()));
    }
}
