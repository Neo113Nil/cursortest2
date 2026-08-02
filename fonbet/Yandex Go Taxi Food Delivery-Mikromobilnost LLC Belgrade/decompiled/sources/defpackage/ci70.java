package defpackage;

import com.yandex.go.accessibility.a;
import com.yandex.go.taxi.order.api.change.destination.RouteChangeType;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Regex;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.analytics.Events$Summary$SummaryState;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.net.taxi.dto.objects.Dialog;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes9.dex */
public final class ci70 implements a52, s86, xb80 {
    public final x770 A;
    public int D;
    public final lx4 a;
    public final do70 b;
    public final a c;
    public final as21 d;
    public final h3y e;
    public final yh70 f;
    public final rgz0 g;
    public final ctc h;
    public final fob i;
    public final afe j;
    public final the k;
    public final cby0 l;
    public final day0 m;
    public final kyc n;
    public final idr o;
    public final ycr p;
    public final qov q;
    public final pj0 r;
    public final v86 s;
    public final d3c t;
    public final kf00 u;
    public final nzi0 v;
    public final to31 w;
    public final exx0 x;
    public final eo70 y;
    public final fo70 z;
    public final w53 B = new w53();
    public final ConcurrentHashMap C = new ConcurrentHashMap();
    public Events$Summary$SummaryState E = Events$Summary$SummaryState.COLLAPSED;
    public final a3y0 F = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "OrderAnalyticsReporter");

    public ci70(lx4 lx4Var, do70 do70Var, a aVar, as21 as21Var, h3y h3yVar, yh70 yh70Var, rgz0 rgz0Var, ctc ctcVar, fob fobVar, afe afeVar, the theVar, cby0 cby0Var, day0 day0Var, kyc kycVar, idr idrVar, ycr ycrVar, qov qovVar, pj0 pj0Var, v86 v86Var, d3c d3cVar, kf00 kf00Var, nzi0 nzi0Var, to31 to31Var, exx0 exx0Var, eo70 eo70Var, fo70 fo70Var, x770 x770Var) {
        this.a = lx4Var;
        this.b = do70Var;
        this.c = aVar;
        this.d = as21Var;
        this.e = h3yVar;
        this.f = yh70Var;
        this.g = rgz0Var;
        this.h = ctcVar;
        this.i = fobVar;
        this.j = afeVar;
        this.k = theVar;
        this.l = cby0Var;
        this.m = day0Var;
        this.n = kycVar;
        this.o = idrVar;
        this.p = ycrVar;
        this.q = qovVar;
        this.r = pj0Var;
        this.s = v86Var;
        this.t = d3cVar;
        this.u = kf00Var;
        this.v = nzi0Var;
        this.w = to31Var;
        this.x = exx0Var;
        this.y = eo70Var;
        this.z = fo70Var;
        this.A = x770Var;
    }

    public final void a(String str, RouteChangeType routeChangeType) {
        int i = bi70.d[routeChangeType.ordinal()];
        this.y.a(str, i != 1 ? i != 2 ? i != 3 ? i != 4 ? "changeDestination" : "multiplePointChange" : "removeMidPoint" : "changeMidPoint" : "addMidPoint");
    }

    public final String b(String str) {
        return cta1.d((DriveState) this.B.get(str));
    }

    public final void c(String str) {
        the theVar = this.k;
        theVar.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("button_name", str);
        }
        theVar.a.a("ContentTaxi.Tapped", hashMap, 1, new HashMap());
    }

    public final void d(String str, Dialog.Action action) {
        String name;
        this.q.a(str, b(str), "close", (action == null || (name = action.name()) == null) ? null : name.toLowerCase(Locale.US));
    }

    public final void e(String str) {
        String b = b(str);
        yh70 yh70Var = this.f;
        yh70Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(MetaDataField.SCREEN_FIELD, b);
        HashMap hashMap2 = new HashMap();
        Regex regex = sho.a;
        yh70Var.a.a(sb2.q("${screen}.DidTapComment", hashMap), hashMap, 1, hashMap2);
    }

    public final void f(TaxiOrder taxiOrder) {
        DriveState b = taxiOrder.h.getB();
        int[] iArr = bi70.a;
        int i = iArr[b.ordinal()];
        if (i == 1) {
            String str = taxiOrder.a;
            if (str == null || evu0.J(str)) {
                a3y0 a3y0Var = this.F;
                String l = a3y0Var.l(new String[]{"handleSearchState"});
                hst hstVar = jst.e;
                String str2 = a3y0Var.a;
                ist m = hstVar.m(l);
                ke00 a = m.b.a();
                if (a != null && a.b(20)) {
                    a.a(20, str2, null, "Order without orderId on search state", m.a);
                }
            } else {
                OrderStatusInfo.SearchEstimates searchEstimates = taxiOrder.V().c0;
                ConcurrentHashMap concurrentHashMap = this.C;
                if (searchEstimates == null) {
                }
            }
        } else if (i == 2 || i == 3) {
            OrderStatusInfo.SearchEstimates searchEstimates2 = (OrderStatusInfo.SearchEstimates) this.C.remove(taxiOrder.a);
            if (searchEstimates2 != null) {
                DriveState b2 = taxiOrder.h.getB();
                Long valueOf = b2 == DriveState.DRIVING ? Long.valueOf((System.currentTimeMillis() - taxiOrder.c) / 1000) : null;
                day0 day0Var = this.m;
                int i2 = iArr[b2.ordinal()];
                day0Var.a(i2 != 2 ? i2 != 3 ? i2 != 8 ? "" : "assigned" : "cancelled" : "expired", searchEstimates2.a() / 1000, valueOf);
            }
        } else if (i != 4) {
            this.C.remove(taxiOrder.a);
        } else {
            idr idrVar = this.o;
            idrVar.getClass();
            idrVar.a.a("firstOrderEvent", new HashMap(), 1, new HashMap());
            lx4 lx4Var = this.a;
            ((na1) ((ma1) this.e.get())).getClass();
            ((j) lx4Var).v(as6.h());
            this.C.remove(taxiOrder.a);
        }
        a aVar = this.c;
        cug cugVar = aVar.d;
        boolean L = tje.L(aVar.a);
        cugVar.getClass();
        HashMap hashMap = new HashMap();
        cugVar.a.a("VoiceOver.OrderState", hashMap, 1, x4e.r(L, hashMap, "is_active"));
    }

    public final void g(String str, String str2, boolean z) {
        String b = b(str);
        if (str2 == null || evu0.J(str2)) {
            str2 = null;
        }
        yh70 yh70Var = this.f;
        yh70Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(MetaDataField.SCREEN_FIELD, b);
        hashMap.put(ClidProvider.APP_INACTIVE, Boolean.valueOf(z));
        if (str2 != null) {
            hashMap.put("title", str2);
        }
        HashMap hashMap2 = new HashMap();
        Regex regex = sho.a;
        yh70Var.a.a(sb2.q("${screen}.PhoneCall", hashMap), hashMap, 1, hashMap2);
    }

    public final void h(String str, String str2) {
        String concat = "TaxiOnTheWay.".concat(str2);
        j jVar = (j) this.a;
        jVar.getClass();
        new i(jVar, concat, str).m();
    }

    public final void i(String str, String str2) {
        afe afeVar = this.j;
        afeVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("order_id", str);
        hashMap.put(ClidProvider.STATE, str2);
        afeVar.a.a("ContentCard.WillMoveToState", hashMap, 1, new HashMap());
    }
}
