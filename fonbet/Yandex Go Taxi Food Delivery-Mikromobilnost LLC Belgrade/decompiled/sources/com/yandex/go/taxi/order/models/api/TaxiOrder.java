package com.yandex.go.taxi.order.models.api;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.cost_center.CostCenterRideStatus;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderSelectedTipsChoiceState;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderTipsState;
import com.yandex.go.taxi.order.models.api.objects.FeedbackChoices;
import com.yandex.go.taxi.order.models.api.objects.MapObject;
import com.yandex.go.taxi.order.models.api.objects.MapObjectAction$OpenPointAAlternative;
import com.yandex.go.taxi.order.models.api.objects.MapRouteParametersDto;
import com.yandex.go.taxi.order.models.api.objects.OriginalRequest;
import com.yandex.go.taxi.order.models.api.objects.RouteInfo;
import com.yandex.go.taxi.order.models.api.objects.Tariff;
import com.yandex.go.taxi.order.models.api.objects.TaxiOrderAdditionalData;
import com.yandex.go.taxi.order.models.api.objects.TipsType;
import com.yandex.go.taxi.order.models.api.objects.UserActions;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.order.models.api.preorder.SelectedTariffInfo;
import com.yandex.go.taxi.order.models.api.request.OrderStatusParam;
import com.yandex.go.taxi.order.models.api.response.AllowedChange;
import com.yandex.go.taxi.order.models.api.response.FeedbackDto;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.models.api.response.ScreenParameters;
import com.yandex.go.taxi.order.models.api.response.StateInfoTranslations;
import com.yandex.go.taxi.order.models.api.response.TipsDto;
import com.yandex.go.zone.model.Zone;
import defpackage.a3y0;
import defpackage.a78;
import defpackage.d0l0;
import defpackage.diz0;
import defpackage.e4a0;
import defpackage.evu0;
import defpackage.gsq0;
import defpackage.gyt0;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.lv90;
import defpackage.npb;
import defpackage.sls;
import defpackage.txx0;
import defpackage.v780;
import defpackage.z81;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "", "Companion", "com/yandex/go/taxi/order/models/api/f", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TaxiOrder {
    public static final f Companion = new f();
    public static final a3y0 m = new a3y0(TaxiOrderLogGroup.CORE.getTag(), "TaxiOrder");
    public final String a;
    public final Preorder b;
    public final long c;
    public volatile v780 d;
    public volatile UserActions e;
    public volatile OrderStatusParam.OrderContact f;
    public a78 g;
    public volatile TaxiOrderOverrides h;
    public volatile TaxiOrderPendingChanges i;
    public volatile TaxiOrderAdditionalData j;
    public Long k;
    public volatile TaxiOrderLocalData l;

    public /* synthetic */ TaxiOrder(int i, String str, Preorder preorder, long j, v780 v780Var, UserActions userActions, OrderStatusParam.OrderContact orderContact, a78 a78Var, TaxiOrderOverrides taxiOrderOverrides, TaxiOrderPendingChanges taxiOrderPendingChanges, TaxiOrderAdditionalData taxiOrderAdditionalData, Long l, TaxiOrderLocalData taxiOrderLocalData) {
        this.a = (i & 1) == 0 ? "preorder" : str;
        int i2 = 0;
        if ((i & 2) == 0) {
            this.b = new Preorder(0);
        } else {
            this.b = preorder;
        }
        if ((i & 4) == 0) {
            this.c = System.currentTimeMillis();
        } else {
            this.c = j;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = v780Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = userActions;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = orderContact;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = a78Var;
        }
        if ((i & 128) == 0) {
            this.h = new TaxiOrderOverrides(i2);
        } else {
            this.h = taxiOrderOverrides;
        }
        if ((i & 256) == 0) {
            this.i = new TaxiOrderPendingChanges(0);
        } else {
            this.i = taxiOrderPendingChanges;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = taxiOrderAdditionalData;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = l;
        }
        if ((i & 2048) == 0) {
            this.l = new TaxiOrderLocalData(0);
        } else {
            this.l = taxiOrderLocalData;
        }
    }

    public final TipsType A() {
        Float f;
        TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType v = this.l.v();
        if (v != null) {
            return diz0.h(v);
        }
        TipsDto tipsDto = V().n;
        try {
            f = Float.valueOf(Float.parseFloat((tipsDto == null || !tipsDto.getC()) ? "" : tipsDto.getB()));
        } catch (NumberFormatException unused) {
            f = null;
        }
        if (f == null || f.floatValue() <= 0.0f) {
            return V().E.b();
        }
        TipsDto tipsDto2 = V().n;
        if (tipsDto2 == null || !tipsDto2.getC()) {
            return TipsType.PERCENT;
        }
        TipsType a = tipsDto2.getA();
        return a == null ? TipsType.PERCENT : a;
    }

    public final boolean B() {
        if (V().s.isEmpty()) {
            return false;
        }
        Iterator it = V().s.iterator();
        while (it.hasNext()) {
            if (!this.l.getB0().contains(((MapObject) it.next()).getA())) {
                return true;
            }
        }
        return false;
    }

    public final boolean C() {
        String c = this.h.getC();
        return (c == null || c.length() == 0) ? false : true;
    }

    public final boolean D() {
        return I() || V().M;
    }

    public final boolean E() {
        if (V().F == OrderStatusInfo.CancelledBy.TIMEOUT) {
            return false;
        }
        return this.l.getE() || V().F == OrderStatusInfo.CancelledBy.USER;
    }

    public final boolean F() {
        return diz0.f(this.l.getW().getG());
    }

    public final boolean G() {
        int i = txx0.a[this.h.getB().ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4;
    }

    public final boolean H() {
        return this.l.getB() || V().G;
    }

    public final boolean I() {
        return this.h.getB() == DriveState.PREORDER;
    }

    public final boolean J() {
        if (this.d == null) {
            return true;
        }
        v780 v780Var = this.d;
        return (v780Var != null ? v780Var.a() : null) == OrderStatusInfo.y0;
    }

    public final boolean K() {
        return jl40.l(this.a, "preorder");
    }

    public final void L(e eVar) {
        synchronized (this) {
            this.i = this.i.h(eVar);
        }
    }

    public final Zone M() {
        ZoneAddress zoneAddress = t().a;
        if (zoneAddress != null) {
            return zoneAddress.b;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.util.TimeZone] */
    public final TimeZone N() {
        Zone M = M();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        T t = M != null ? M.f : 0;
        ref$ObjectRef.element = t;
        if (t != 0) {
            synchronized (this) {
                this.l = this.l.U((TimeZone) ref$ObjectRef.element);
            }
        } else {
            ref$ObjectRef.element = this.l.getI();
        }
        return (TimeZone) ref$ObjectRef.element;
    }

    public final void O(boolean z) {
        synchronized (this) {
            this.l = this.l.A(z);
        }
    }

    public final void P(FeedbackDto feedbackDto) {
        List a;
        List e;
        FeedbackChoices feedbackChoices = feedbackDto.c;
        EmptyList emptyList = EmptyList.a;
        Y(new npb(this, feedbackDto, (feedbackChoices == null || (e = feedbackChoices.getE()) == null) ? emptyList : e, (feedbackChoices == null || (a = feedbackChoices.getA()) == null) ? emptyList : a, feedbackChoices, 11));
    }

    public final void Q(d0l0 d0l0Var) {
        this.b.l(d0l0Var);
        Z(this.b.G);
    }

    public final void R(List list) {
        synchronized (this) {
            this.l = this.l.S(list);
        }
    }

    public final void S(TaxiOrderSelectedTipsChoiceState taxiOrderSelectedTipsChoiceState) {
        synchronized (this) {
            this.l = this.l.T(taxiOrderSelectedTipsChoiceState);
        }
    }

    public final void T(DriveState driveState) {
        if (driveState != null) {
            DriveState b = this.h.getB();
            synchronized (this) {
                this.l = this.l.Q(b);
            }
            gyt0 gyt0Var = new gyt0(27, this, driveState);
            synchronized (this) {
                this.h = (TaxiOrderOverrides) gyt0Var.invoke();
            }
        }
    }

    public final void U(String str, TipsType tipsType) {
        TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType g = diz0.g(tipsType);
        synchronized (this) {
            this.l = this.l.T(diz0.b(g, str));
        }
    }

    public final OrderStatusInfo V() {
        OrderStatusInfo a;
        v780 v780Var = this.d;
        return (v780Var == null || (a = v780Var.a()) == null) ? OrderStatusInfo.y0 : a;
    }

    public final Preorder W() {
        Preorder clone = this.b.clone();
        Address h = clone.G.h();
        if (h != null) {
            h.O1(this.l.q(h.B(), this.h.getB()));
        }
        Address b = clone.G.b();
        if (b != null) {
            b.O1(this.l.i(b.B(), this.h.getB()));
        }
        return clone;
    }

    public final void X(v780 v780Var) {
        String p = V().g.getP();
        OrderStatusInfo a = v780Var.a();
        if (!jl40.l(p, a.g.getP())) {
            this.j = b().b(null);
        }
        this.d = v780Var;
        this.e = null;
        OriginalRequest originalRequest = a.f;
        if (originalRequest != null) {
            Preorder preorder = this.b;
            d0l0 d0l0Var = preorder.G;
            List d = originalRequest.d();
            if (!d.isEmpty()) {
                Address address = (Address) d.get(0);
                ZoneAddress zoneAddress = d0l0Var.a;
                List list = d0l0Var.b;
                ZoneAddress zoneAddress2 = zoneAddress != null ? new ZoneAddress(z81.l(zoneAddress.a, address), zoneAddress.b) : new ZoneAddress(address, (Zone) null);
                int size = d.size() - 1;
                ArrayList arrayList = new ArrayList(size);
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    Address address2 = (Address) d.get(i2);
                    if (i < list.size()) {
                        arrayList.add(z81.l((Address) list.get(i), address2));
                    } else {
                        arrayList.add(address2);
                    }
                    i = i2;
                }
                d0l0Var = new d0l0(zoneAddress2, arrayList, d0l0Var.c);
            }
            if (preorder.a(d0l0Var)) {
                Z(this.b.G);
            }
            Preorder preorder2 = this.b;
            preorder2.z = originalRequest.getA();
            preorder2.A = null;
        }
        if (this.b.h() == e4a0.R3) {
            this.b.i(a.I);
        }
        if (a.e != null && this.b.O.b.isEmpty()) {
            Preorder preorder3 = this.b;
            com.yandex.go.taxi.order.models.api.preorder.c cVar = SelectedTariffInfo.Companion;
            String a2 = a.e.getA();
            cVar.getClass();
            preorder3.m(new SelectedTariffInfo(a2, Collections.singleton(a2), false));
            this.b.P = TariffOrderFlow.TAXI_FLOW;
        }
        synchronized (this) {
            this.l = this.l.O(false);
        }
        synchronized (this) {
            this.h = this.h.d(a.L);
        }
        synchronized (this) {
            this.h = this.h.e(a.a);
        }
        T(a.i);
        TipsDto tipsDto = a.n;
        if (tipsDto == null || !tipsDto.getC()) {
            synchronized (this) {
                this.l = this.l.T(null);
            }
        }
        synchronized (this) {
            this.i = this.i.j(null);
        }
        Date date = a.p0;
        if (date != null) {
            this.k = Long.valueOf(Math.min(date.getTime(), System.currentTimeMillis()));
        }
    }

    public final synchronized void Y(sls slsVar) {
        this.l = (TaxiOrderLocalData) slsVar.invoke();
    }

    public final void Z(d0l0 d0l0Var) {
        Address h = d0l0Var.h();
        com.yandex.go.analytics.e analyticsData = h != null ? h.getAnalyticsData() : null;
        if (analyticsData != null) {
            synchronized (this) {
                this.l = this.l.P(analyticsData);
            }
        }
        Address b = d0l0Var.b();
        com.yandex.go.analytics.e analyticsData2 = b != null ? b.getAnalyticsData() : null;
        if (analyticsData2 != null) {
            synchronized (this) {
                this.l = this.l.F(analyticsData2);
            }
        }
    }

    public final void a(e eVar) {
        synchronized (this) {
            this.i = this.i.a(eVar);
        }
    }

    public final TaxiOrderAdditionalData b() {
        TaxiOrderAdditionalData taxiOrderAdditionalData = this.j;
        return taxiOrderAdditionalData == null ? TaxiOrderAdditionalData.c : taxiOrderAdditionalData;
    }

    public final Set c() {
        List list = V().C;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AllowedChange allowedChange = (AllowedChange) it.next();
                if ("payment".equals(allowedChange.getA())) {
                    jsq0 b = allowedChange.getB();
                    if (b != null) {
                        HashSet hashSet = new HashSet();
                        kotlin.collections.a.N(b, hashSet);
                        return hashSet;
                    }
                }
            }
        }
        return EmptySet.a;
    }

    public final MapObject d() {
        Object obj;
        Iterator it = V().s.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            MapObject mapObject = (MapObject) obj;
            if ((mapObject.getF() instanceof MapObjectAction$OpenPointAAlternative) && !this.l.getB0().contains(mapObject.getA())) {
                break;
            }
        }
        return (MapObject) obj;
    }

    public final String e() {
        ScreenParameters a;
        StateInfoTranslations f = V().Z.getF();
        if (f == null || (a = f.getA()) == null) {
            return null;
        }
        return a.getB();
    }

    public final String f() {
        ScreenParameters a;
        StateInfoTranslations f = V().Z.getF();
        if (f == null || (a = f.getA()) == null) {
            return null;
        }
        return a.getA();
    }

    public final String g() {
        OrderStatusInfo V = V();
        String str = V.w;
        return (str == null || evu0.J(str)) ? V.m : str;
    }

    public final List h() {
        List c = this.i.getC();
        if (c != null) {
            return c;
        }
        OriginalRequest originalRequest = V().f;
        CostCenterRideStatus g = originalRequest != null ? originalRequest.getG() : null;
        if (g != null) {
            return g.getB();
        }
        return null;
    }

    public final String i() {
        OrderStatusInfo.CancelReasonDescription cancelReasonDescription = V().F == OrderStatusInfo.CancelledBy.TIMEOUT ? V().Q : null;
        if (cancelReasonDescription == null) {
            return null;
        }
        return cancelReasonDescription.getC();
    }

    public final String j() {
        OrderStatusInfo.CancelReasonDescription cancelReasonDescription = V().F == OrderStatusInfo.CancelledBy.TIMEOUT ? V().Q : null;
        return cancelReasonDescription != null ? cancelReasonDescription.getB() : V().x;
    }

    public final FeedbackDto k() {
        TaxiOrderFeedback w = this.l.getW();
        TaxiOrderFeedback.Companion.getClass();
        return w != g.a() ? g.b(w) : V().h();
    }

    public final Address l() {
        return t().b();
    }

    public final zzs m() {
        Address l = l();
        if (l != null) {
            return l.B();
        }
        return null;
    }

    public final Calendar n() {
        Calendar b;
        OriginalRequest originalRequest = V().f;
        return (originalRequest == null || (b = originalRequest.getB()) == null) ? this.b.g() : b;
    }

    public final MapRouteParametersDto o() {
        RouteInfo routeInfo = V().r;
        if (routeInfo != null) {
            return routeInfo.getE();
        }
        return null;
    }

    public final String p() {
        String l = this.l.getL();
        return l == null ? this.a : l;
    }

    public final lv90 q() {
        lv90 a = this.i.getA();
        lv90 lv90Var = lv90.g;
        if (!a.equals(lv90Var)) {
            return a;
        }
        lv90 lv90Var2 = V().I;
        return !lv90Var2.equals(lv90Var) ? lv90Var2 : this.b.c();
    }

    public final e4a0 r() {
        return q().a();
    }

    public final int s() {
        Integer a = this.l.getW().getA();
        if (a != null) {
            return a.intValue();
        }
        return 0;
    }

    public final d0l0 t() {
        d0l0 b = this.i.getB();
        return b != null ? b : this.b.G;
    }

    public final Address u() {
        return t().h();
    }

    public final zzs v() {
        Address u = u();
        if (u != null) {
            return u.B();
        }
        return null;
    }

    public final String w() {
        Address h = t().h();
        if (h != null) {
            return h.getZoneName();
        }
        return null;
    }

    public final String x() {
        Tariff tariff = V().e;
        String str = this.b.O.a;
        if (str == null) {
            str = "";
        }
        if (tariff == null) {
            return str;
        }
        String a = tariff.getA();
        return a.length() == 0 ? str : a;
    }

    public final TaxiOrderTipsState y() {
        return this.l.getW().getG();
    }

    public final String z() {
        String u = this.l.u();
        if (u != null && u.length() != 0) {
            return u;
        }
        TipsDto tipsDto = V().n;
        return (tipsDto == null || !tipsDto.getC()) ? "" : tipsDto.getB();
    }

    public TaxiOrder() {
        this(null, null, 0L, 4095);
    }

    public TaxiOrder(String str, Preorder preorder, long j, int i) {
        str = (i & 1) != 0 ? "preorder" : str;
        int i2 = 0;
        preorder = (i & 2) != 0 ? new Preorder(0) : preorder;
        j = (i & 4) != 0 ? System.currentTimeMillis() : j;
        TaxiOrderOverrides taxiOrderOverrides = new TaxiOrderOverrides(i2);
        TaxiOrderPendingChanges taxiOrderPendingChanges = new TaxiOrderPendingChanges(0);
        TaxiOrderLocalData taxiOrderLocalData = new TaxiOrderLocalData(0);
        this.a = str;
        this.b = preorder;
        this.c = j;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = taxiOrderOverrides;
        this.i = taxiOrderPendingChanges;
        this.j = null;
        this.k = null;
        this.l = taxiOrderLocalData;
    }
}
