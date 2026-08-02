package xsna;

import com.vk.toggle.b;

/* compiled from: CustomFeatureHolder.kt */
/* loaded from: classes.dex */
public abstract class enk<T> extends hwy<T> {
    public final b.a g;
    public final izs<b.a, b.a> h;
    public final boolean i;
    public final epf j;

    /* JADX WARN: Multi-variable type inference failed */
    public enk(b.a aVar, izs<? super b.a, ? extends b.a> izsVar, gpf gpfVar, boolean z, epf epfVar) {
        super(epfVar, gpfVar);
        this.g = aVar;
        this.h = izsVar;
        this.i = z;
        this.j = epfVar;
    }

    @Override // xsna.hwy
    public final T a() {
        boolean d = this.j.d();
        b.a aVar = this.g;
        if (!d) {
            aVar = this.i ? this.h.invoke(aVar) : null;
        }
        return b(aVar);
    }

    public abstract T b(b.a aVar);
}
