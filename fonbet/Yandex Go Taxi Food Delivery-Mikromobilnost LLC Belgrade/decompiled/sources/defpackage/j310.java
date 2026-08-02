package defpackage;

import android.content.Context;
import com.yandex.go.masstransit.sdk.order.impl.orders.StorageData;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes8.dex */
public final class j310 {
    public final tb3 a;

    public j310(Context context, wnt wntVar) {
        this.a = new tb3(new jb7(context.getDatabasePath("masstransit_orders"), "active_orders"), new nfh(wntVar, StorageData.Companion.serializer(), new StorageData(0)));
    }

    public final List a() {
        jju0 a = this.a.a();
        if (a instanceof iju0) {
            return ((StorageData) ((iju0) a).b).a;
        }
        if (!(a instanceof hju0)) {
            w511.b();
            return null;
        }
        vby vbyVar = xby.d;
        ke00 a2 = vbyVar.b.a();
        if (a2 != null && a2.b(15)) {
            a2.a(15, null, null, "Error while reading orders storage data " + ((hju0) a).c, vbyVar.a);
        }
        return EmptyList.a;
    }

    public final String b() {
        jju0 a = this.a.a();
        if (a instanceof iju0) {
            return ((StorageData) ((iju0) a).b).b;
        }
        if (!(a instanceof hju0)) {
            w511.b();
            return null;
        }
        vby vbyVar = xby.d;
        ke00 a2 = vbyVar.b.a();
        if (a2 != null && a2.b(15)) {
            a2.a(15, null, null, "Error while reading orders storage data " + ((hju0) a).c, vbyVar.a);
        }
        return null;
    }
}
