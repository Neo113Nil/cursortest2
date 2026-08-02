package defpackage;

import android.content.Context;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes14.dex */
public final class mh7 {
    public final i3y a;
    public String b;
    public int c;

    public mh7(Context context) {
        this.a = a.b(LazyThreadSafetyMode.NONE, new n5(context, 11));
        this.b = context.getString(kyh0.common_remove);
        this.c = 2;
    }

    public mh7(TaxiOrder taxiOrder) {
        taxiOrder.getClass();
        this.a = a.a(new lh7(taxiOrder, 0));
        this.b = "";
        this.c = -1;
    }
}
