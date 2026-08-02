package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.unit.LayoutDirection;
import xsna.tok0;

/* compiled from: LazyStaggeredGridDsl.kt */
/* loaded from: classes11.dex */
public final class rxy implements yry {
    public final xce a;
    public long b = s6j.b(0, 0, 0, 0, 15);
    public float c;
    public sxy d;

    public rxy(xce xceVar) {
        this.a = xceVar;
    }

    @Override // xsna.yry
    public final sxy a(qty qtyVar, long j) {
        ztm0 ztm0Var = qtyVar.c;
        if (this.d != null && o6j.c(this.b, j) && this.c == ztm0Var.getDensity()) {
            return this.d;
        }
        this.b = j;
        this.c = ztm0Var.getDensity();
        xce xceVar = this.a;
        u890 u890Var = (u890) xceVar.c;
        tok0.a aVar = (tok0.a) xceVar.d;
        a.e eVar = (a.e) xceVar.e;
        if (o6j.i(j) == Integer.MAX_VALUE) {
            xzw.a("LazyVerticalStaggeredGrid's width should be bound by parent.");
        }
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        int i = o6j.i(j) - qtyVar.r0(s200.r(u890Var, layoutDirection) + s200.s(u890Var, layoutDirection));
        int[] a = aVar.a(qtyVar, i, qtyVar.r0(eVar.a()));
        int[] iArr = new int[a.length];
        eVar.b(qtyVar, i, a, layoutDirection, iArr);
        sxy sxyVar = new sxy(iArr, a);
        this.d = sxyVar;
        return sxyVar;
    }
}
