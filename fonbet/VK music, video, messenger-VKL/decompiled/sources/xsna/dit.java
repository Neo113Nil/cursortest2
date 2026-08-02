package xsna;

import androidx.core.app.NotificationCompat;
import xsna.yen0;

/* compiled from: GeneratedSuperappApi.kt */
/* loaded from: classes6.dex */
public final class dit implements yen0 {
    @Override // xsna.yen0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 a(yen0.b bVar) {
        yen0.a aVar = bVar.a;
        String str = aVar.a;
        String str2 = bVar.b;
        if (str2 == null) {
            str2 = "";
        }
        Float f = bVar.c;
        String str3 = aVar.b;
        Long l = aVar.c;
        Integer valueOf = l != null ? Integer.valueOf((int) l.longValue()) : null;
        ufx ufxVar = new ufx("ads.conversionHit", new bt(1), new ct(1));
        ufx.n(ufxVar, "pixel_code", str, 0, 12);
        ufx.n(ufxVar, "conversion_event", str2, 0, 12);
        ufx.j(ufxVar, "conversion_value", f.floatValue());
        if (str3 != null) {
            ufx.n(ufxVar, "http_ref", str3, 0, 12);
        }
        if (valueOf != null) {
            ufx.k(ufxVar, "app_id", valueOf.intValue(), 0, 12);
        }
        return rdx0.u(e370.e(ufxVar)).U(new com.vk.movika.sdk.base.flow.binding.c(new wr0(18), 18));
    }

    @Override // xsna.yen0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 b(yen0.c cVar) {
        yen0.a aVar = cVar.a;
        String str = aVar.a;
        String str2 = cVar.b;
        Long l = cVar.c;
        Integer valueOf = l != null ? Integer.valueOf((int) l.longValue()) : null;
        Long l2 = cVar.d;
        Integer valueOf2 = l2 != null ? Integer.valueOf((int) l2.longValue()) : null;
        String str3 = cVar.e;
        String str4 = cVar.f;
        String str5 = aVar.b;
        Long l3 = aVar.c;
        Integer valueOf3 = l3 != null ? Integer.valueOf((int) l3.longValue()) : null;
        ufx ufxVar = new ufx("ads.retargetingHit", new w11(0), new at(1));
        ufx.n(ufxVar, "pixel_code", str, 0, 12);
        ufx.n(ufxVar, NotificationCompat.CATEGORY_EVENT, str2, 0, 12);
        if (valueOf != null) {
            ufx.k(ufxVar, "target_group_id", valueOf.intValue(), 0, 12);
        }
        if (valueOf2 != null) {
            ufx.k(ufxVar, "price_list_id", valueOf2.intValue(), 0, 12);
        }
        if (str3 != null) {
            ufx.n(ufxVar, "products_event", str3, 0, 12);
        }
        if (str4 != null) {
            ufx.n(ufxVar, "products_params", str4, 0, 12);
        }
        if (str5 != null) {
            ufx.n(ufxVar, "http_ref", str5, 0, 12);
        }
        if (valueOf3 != null) {
            ufx.k(ufxVar, "app_id", valueOf3.intValue(), 0, 12);
        }
        return rdx0.u(e370.e(ufxVar)).U(new y34(new sc(27), 18));
    }
}
