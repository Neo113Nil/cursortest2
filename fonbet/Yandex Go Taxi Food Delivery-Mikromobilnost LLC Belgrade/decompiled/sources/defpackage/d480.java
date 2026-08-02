package defpackage;

import com.yandex.go.coroutines.b;
import com.yandex.go.taxi.order.promotions.interactor.OrderPopupPromotionInteractor$dataFlow$$inlined$flatMapLatest$1;
import com.yandex.go.taxi.order.promotions.interactor.OrderPopupPromotionInteractor$dataFlow$$inlined$start$1;
import com.yandex.go.taxi.order.promotions.mapper.a;
import kotlinx.coroutines.flow.e;

/* loaded from: classes14.dex */
public final class d480 implements z3y0 {
    public final a480 a;
    public final wc80 b;
    public final a c;

    public d480(a480 a480Var, wc80 wc80Var, a aVar) {
        this.a = a480Var;
        this.b = wc80Var;
        this.c = aVar;
    }

    @Override // defpackage.z3y0
    public final tpr a() {
        return b.d(new com.yandex.go.taxi.order.promotions.interactor.b(e.X(e.d(this.a.a), new OrderPopupPromotionInteractor$dataFlow$$inlined$flatMapLatest$1(null, this)), this), new OrderPopupPromotionInteractor$dataFlow$$inlined$start$1(m4y0.a, null));
    }
}
