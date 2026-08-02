package xsna;

import com.vk.toggle.b;

/* compiled from: BooleanFeatureHolder.kt */
/* loaded from: classes.dex */
public final class e18 extends hwy<Boolean> {
    public final b.a g;
    public final izs<b.a, b.a> h;
    public final epf i;

    public e18(b.a aVar, izs izsVar, gpf gpfVar, epf epfVar) {
        super(epfVar, gpfVar);
        this.g = aVar;
        this.h = izsVar;
        this.i = epfVar;
    }

    @Override // xsna.hwy
    public final Boolean a() {
        return Boolean.valueOf(this.i.d() ? puq.c(this.g, 3) : false);
    }
}
