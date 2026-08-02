package defpackage;

import com.yandex.go.taxi.order.cancel.similar.interactor.h;
import com.yandex.go.taxi.order.models.api.cancel.CancelSimilarOrdersNotification;
import java.util.HashMap;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes14.dex */
public final class j08 extends ad5 {
    public final hh5 A;
    public final pwy0 B;
    public final i3y C;
    public final CancelSimilarOrdersNotification x;
    public final l08 y;
    public final h z;

    public j08(CancelSimilarOrdersNotification cancelSimilarOrdersNotification, l08 l08Var, h hVar, hh5 hh5Var, pwy0 pwy0Var) {
        super(e08.class);
        this.x = cancelSimilarOrdersNotification;
        this.y = l08Var;
        this.z = hVar;
        this.A = hh5Var;
        this.B = pwy0Var;
        this.C = a.b(LazyThreadSafetyMode.NONE, new ij7(14));
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        CancelSimilarOrdersNotification cancelSimilarOrdersNotification = this.x;
        String str = cancelSimilarOrdersNotification.b;
        List list = cancelSimilarOrdersNotification.c;
        co40 co40Var = (co40) this.A.b;
        co40Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("order_id", str);
        hashMap.put("other_order_ids", list);
        co40Var.a.a("MultiorderCancelModalCard.Closed", hashMap, 1, new HashMap());
    }
}
