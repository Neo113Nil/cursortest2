package xsna;

/* compiled from: LazyListIntervalContent.kt */
/* loaded from: classes11.dex */
public final class wuy extends androidx.compose.foundation.lazy.layout.a<tuy> implements nvy {
    public final p8v a = new p8v(1);
    public ng50 b;

    public wuy(izs<? super nvy, s3q0> izsVar) {
        izsVar.invoke(this);
    }

    @Override // xsna.nvy
    public final void b(final jai jaiVar) {
        ng50 ng50Var = this.b;
        if (ng50Var == null) {
            ng50Var = new ng50();
            this.b = ng50Var;
        }
        p8v p8vVar = this.a;
        ng50Var.c(p8vVar.b);
        final int i = p8vVar.b;
        h("header", null, new jai(-1588696110, new yzs() { // from class: xsna.uuy
            @Override // xsna.yzs
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                ksy ksyVar = (ksy) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(ksyVar) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1588696110, intValue, -1, "androidx.compose.foundation.lazy.LazyListIntervalContent.stickyHeader.<anonymous> (LazyListIntervalContent.kt:70)");
                    }
                    jaiVar.invoke(ksyVar, Integer.valueOf(i), aVar, Integer.valueOf(intValue & 14));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            }
        }, true));
    }

    @Override // xsna.nvy
    public final void e(int i, izs<? super Integer, ? extends Object> izsVar, izs<? super Integer, ? extends Object> izsVar2, zzs<? super ksy, ? super Integer, ? super androidx.compose.runtime.a, ? super Integer, s3q0> zzsVar) {
        this.a.a(i, new tuy(izsVar, izsVar2, zzsVar));
    }

    @Override // xsna.nvy
    public final void h(Object obj, Object obj2, yzs<? super ksy, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar) {
        this.a.a(1, new tuy(obj != null ? new iou(obj, 9) : null, new iou(obj2, 9), new jai(-857469575, new vuy(yzsVar, 0), true)));
    }

    @Override // androidx.compose.foundation.lazy.layout.a
    public final p8v l() {
        return this.a;
    }
}
