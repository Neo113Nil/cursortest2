package defpackage;

import android.view.View;
import com.yandex.go.tariffcard.ui.e;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.f;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import java.util.function.Supplier;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final /* synthetic */ class o58 implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o58(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((p58) obj2).c.a((String) obj).get$image();
            case 1:
                return new mey((iey) obj2, (View) obj);
            case 2:
                TaxiOrder taxiOrder = (TaxiOrder) obj2;
                return taxiOrder == null ? f.b(TaxiOrder.Companion, new Preorder(0), (String) obj, DriveState.SEARCH, System.currentTimeMillis(), 16) : taxiOrder;
            case 3:
                rvx rvxVar = (rvx) obj;
                ((bd80) obj2).getClass();
                return f.b(TaxiOrder.Companion, new Preorder(0), rvxVar.a, rvxVar.b, System.currentTimeMillis(), 16);
            default:
                return ((e) obj2).l.a((String) obj).get$image();
        }
    }
}
