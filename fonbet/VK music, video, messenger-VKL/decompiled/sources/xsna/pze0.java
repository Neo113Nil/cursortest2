package xsna;

import java.util.ArrayList;

/* compiled from: LazyDsl.kt */
/* loaded from: classes2.dex */
public final class pze0 implements izs<Integer, Object> {
    public final /* synthetic */ adf b;
    public final /* synthetic */ ArrayList c;

    public pze0(adf adfVar, ArrayList arrayList) {
        this.b = adfVar;
        this.c = arrayList;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        int intValue = num.intValue();
        return this.b.invoke(Integer.valueOf(intValue), this.c.get(intValue));
    }
}
