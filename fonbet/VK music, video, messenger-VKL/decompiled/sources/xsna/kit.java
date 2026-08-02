package xsna;

/* compiled from: GeneratedSuperappApi.kt */
/* loaded from: classes6.dex */
public final class kit implements gfn0 {
    @Override // xsna.gfn0
    public final io.reactivex.rxjava3.internal.operators.observable.i2 a(int i) {
        ufx ufxVar = new ufx("goodsOrders.getOrder", new uq(14), new vq(16));
        ufx.k(ufxVar, "order_id", i, 0, 8);
        return rdx0.B(e370.e(ufxVar));
    }

    @Override // xsna.gfn0
    public final io.reactivex.rxjava3.internal.operators.observable.i2 b(long j, String str) {
        ufx ufxVar = new ufx("goodsOrders.getItemData", new sq(12), new tq(13));
        ufx.k(ufxVar, "app_id", (int) j, 0, 8);
        ufx.n(ufxVar, "item_id", str, 0, 12);
        return rdx0.B(e370.e(ufxVar));
    }

    @Override // xsna.gfn0
    public final io.reactivex.rxjava3.internal.operators.observable.i2 c(long j, String str) {
        ufx ufxVar = new ufx("goodsOrders.createOrder", new wq(17), new xq(16));
        ufx.k(ufxVar, "app_id", (int) j, 0, 8);
        ufx.n(ufxVar, "item_id", str, 0, 12);
        return rdx0.B(e370.e(ufxVar));
    }
}
