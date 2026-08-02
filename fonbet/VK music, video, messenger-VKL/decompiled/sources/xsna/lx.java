package xsna;

import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes4.dex */
public final class lx implements izs<Integer, Object> {
    public final /* synthetic */ md b;
    public final /* synthetic */ List c;

    public lx(md mdVar, List list) {
        this.b = mdVar;
        this.c = list;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        return this.b.invoke(this.c.get(num.intValue()));
    }
}
