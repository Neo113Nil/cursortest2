package xsna;

import java.util.ArrayList;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class u3c implements izs<Integer, Object> {
    public final /* synthetic */ od3 b;
    public final /* synthetic */ ArrayList c;

    public u3c(od3 od3Var, ArrayList arrayList) {
        this.b = od3Var;
        this.c = arrayList;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        return this.b.invoke(this.c.get(num.intValue()));
    }
}
