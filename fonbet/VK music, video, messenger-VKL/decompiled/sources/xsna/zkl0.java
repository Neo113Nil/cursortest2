package xsna;

import java.util.List;

/* compiled from: LazyGridDsl.kt */
/* loaded from: classes18.dex */
public final class zkl0 implements izs<Integer, Object> {
    public final /* synthetic */ List b;

    public zkl0(List list) {
        this.b = list;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        this.b.get(num.intValue());
        return null;
    }
}
