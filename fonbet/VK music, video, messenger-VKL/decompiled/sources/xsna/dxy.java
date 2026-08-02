package xsna;

import java.util.List;

/* compiled from: LazyStaggeredGridMeasure.kt */
/* loaded from: classes11.dex */
public final class dxy extends kxy {
    public final /* synthetic */ exy h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxy(exy exyVar, boolean z, uwy uwyVar, qty qtyVar, sxy sxyVar) {
        super(z, uwyVar, qtyVar, sxyVar);
        this.h = exyVar;
    }

    @Override // xsna.kxy
    public final nxy w0(int i, int i2, int i3, Object obj, Object obj2, List<? extends tra0> list, long j) {
        exy exyVar = this.h;
        return new nxy(i, obj, list, exyVar.f, exyVar.l, i2, i3, exyVar.j, exyVar.k, obj2, exyVar.a.t, j);
    }
}
