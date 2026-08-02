package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.zone.model.Zone;
import ru.yandex.taxi.order.f;

/* loaded from: classes14.dex */
public final class fp70 implements n721 {
    public final /* synthetic */ o2y0 a;
    public final /* synthetic */ f b;

    public fp70(o2y0 o2y0Var, f fVar) {
        this.a = o2y0Var;
        this.b = fVar;
    }

    @Override // defpackage.n721
    public final void a() {
        this.b.r(new nit(2, this.a));
    }

    @Override // defpackage.n721
    public final void onSuccess() {
        TaxiOrder b = this.a.b();
        Zone M = b.M();
        if (M == null || !M.h()) {
            a();
            return;
        }
        Preorder W = b.W();
        f fVar = this.b;
        fVar.r(new zl50(14, fVar.l0.b(null, null), W));
    }
}
