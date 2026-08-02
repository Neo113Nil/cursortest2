package defpackage;

import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import com.yandex.go.taxi.order.models.api.objects.AutoReorder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.SearchProgressExperiment;
import com.yandex.go.taxi.order.repositories.c;
import com.yandex.go.taxi.order.repositories.n;
import com.yandex.go.taxi.order.titles.OrderTitlesController$ExperimentTitleType;
import java.util.Date;
import java.util.HashMap;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class d980 implements l980 {
    public final o2y0 a;
    public final u48 b;
    public final crg c;
    public final c d;
    public final jtq0 e;
    public final zuj0 f;
    public final s86 g;
    public final ysg h;
    public final ney i;
    public final n j;
    public final ru.yandex.taxi.widget.c k;
    public final onz l;
    public final e980 m;
    public final tt2 n;
    public hjz0 p;
    public String r;
    public String s;
    public q48 t;
    public TaxiOrder v;
    public CharSequence w;
    public volatile boolean x;
    public final ii30 y;
    public g18 z;
    public final a3y0 o = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "OrderTitlesController");
    public lez0 q = new lez0(0, 0, "", "", "$time$");
    public boolean u = true;

    public d980(o2y0 o2y0Var, u48 u48Var, crg crgVar, c cVar, jtq0 jtq0Var, zuj0 zuj0Var, s86 s86Var, ysg ysgVar, ney neyVar, n nVar, ru.yandex.taxi.widget.c cVar2, onz onzVar, e980 e980Var, tt2 tt2Var) {
        OrderStatusInfo.CashbackDetails cashbackDetails;
        FormattedText formattedText;
        this.a = o2y0Var;
        this.b = u48Var;
        this.c = crgVar;
        this.d = cVar;
        this.e = jtq0Var;
        this.f = zuj0Var;
        this.g = s86Var;
        this.h = ysgVar;
        this.i = neyVar;
        this.j = nVar;
        this.k = cVar2;
        this.l = onzVar;
        this.m = e980Var;
        this.n = tt2Var;
        OrderStatusInfo.CostMessageDetails costMessageDetails = b().V().T;
        this.w = ru.yandex.taxi.widget.c.f(cVar2, (costMessageDetails == null || (cashbackDetails = costMessageDetails.c) == null || (formattedText = cashbackDetails.b) == null) ? FormattedText.c : formattedText, false, null, 14);
        this.y = new ii30(9, this);
        this.z = g18.u1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x021e, code lost:
    
        if (r8 == null) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0229  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        OrderStatusInfo.MultiOrderInfo multiOrderInfo;
        OrderTitlesController$ExperimentTitleType orderTitlesController$ExperimentTitleType;
        String f;
        String str;
        String str2;
        b980 a;
        hjz0 hjz0Var = this.p;
        if (hjz0Var != null) {
            TaxiOrder b = b();
            long d = this.e.d();
            this.l.a.a();
            this.l.a.a();
            gnz gnzVar = gnz.e;
            String str3 = gnzVar.a;
            this.l.a.a();
            String str4 = gnzVar.b;
            String f2 = b.f();
            Date c = this.c.c(this.a.b().V().Z.e);
            long time = c != null ? c.getTime() : ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
            TaxiOrder b2 = b();
            if (!b2.l.w && f2 != null && f2.length() != 0 && time < d) {
                s86 s86Var = this.g;
                String str5 = b2.a;
                v86 v86Var = ((ci70) s86Var).s;
                v86Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("order_id", str5);
                v86Var.a.a("BookingTimer.Shown", hashMap, 1, new HashMap());
                synchronized (b2) {
                    TaxiOrderLocalData taxiOrderLocalData = b2.l;
                    taxiOrderLocalData.getClass();
                    b2.l = TaxiOrderLocalData.b(taxiOrderLocalData, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -4194305, 16777215);
                }
                this.h.g(b2);
            }
            e980 e980Var = this.m;
            boolean z = this.u;
            lez0 lez0Var = this.q;
            String str6 = this.r;
            if (str6 == null) {
                str6 = "";
            }
            String str7 = this.s;
            if (str7 == null) {
                str7 = "";
            }
            CharSequence charSequence = this.w;
            q48 q48Var = this.t;
            g980 g980Var = (g980) e980Var;
            g980Var.getClass();
            OrderStatusInfo.MultiOrderInfo multiOrderInfo2 = b.V().h0;
            String c2 = g980Var.c(b, d, str3, str6);
            String str8 = lez0Var.a;
            if (!evu0.J(lez0Var.e)) {
                c2 = cvu0.v(c2, lez0Var.e, str8, false);
                g980Var = g980Var;
            }
            String c3 = g980Var.c(b, d, str3, str6);
            String str9 = lez0Var.b;
            if (!evu0.J(lez0Var.e)) {
                c3 = cvu0.v(c3, lez0Var.e, str9, false);
            }
            String str10 = c3;
            OrderStatusInfo.CostMessageDetails costMessageDetails = b.V().T;
            b980 b980Var = null;
            OrderStatusInfo.CashbackDetails cashbackDetails = costMessageDetails != null ? costMessageDetails.c : null;
            if (cashbackDetails == null || charSequence == null || evu0.J(charSequence)) {
                multiOrderInfo = multiOrderInfo2;
            } else {
                String str11 = b.V().Z.c;
                String str12 = b.V().Z.d;
                OrderStatusInfo.CashbackDetails.Action action = cashbackDetails.a;
                String str13 = c2;
                multiOrderInfo = multiOrderInfo2;
                c2 = str13;
                b980Var = new b980(str13, g980Var.b(str11), charSequence, g980Var.b(str12), q48Var, b.h.b, (action != null ? action.a : null) == OrderStatusInfo.CashbackDetails.ActionType.BUY_PLUS && b.h.b == DriveState.COMPLETE, str10, 256);
            }
            if (b980Var != null) {
                a = g980Var.a(b980Var, b, z, str7);
            } else {
                String str14 = b.V().g.d;
                Date c4 = g980Var.d.c(b.V().Z.e);
                an91.i(b.h.b);
                OrderStatusInfo.SearchEstimates searchEstimates = b.V().c0;
                if (an91.i(b.h.b) && searchEstimates != null) {
                    if (searchEstimates.a() + b.c + 10000 < d) {
                        OrderStatusInfo V = b.V();
                        V.getClass();
                        SearchProgressExperiment.Companion.getClass();
                        qn11 qn11Var = SearchProgressExperiment.e;
                        qn11 b3 = V.b(SearchProgressExperiment.class);
                        if (b3 != null) {
                            qn11Var = b3;
                        }
                        if (((SearchProgressExperiment) qn11Var).b) {
                            orderTitlesController$ExperimentTitleType = OrderTitlesController$ExperimentTitleType.SEARCH_PROGRESS;
                            AutoReorder autoReorder = b.V().q;
                            f = b.f();
                            if (f != null || evu0.J(f)) {
                                OrderTitlesController$ExperimentTitleType orderTitlesController$ExperimentTitleType2 = orderTitlesController$ExperimentTitleType;
                                if (multiOrderInfo == null) {
                                    str = multiOrderInfo.b;
                                } else if (orderTitlesController$ExperimentTitleType2 == OrderTitlesController$ExperimentTitleType.LONG_SEARCH) {
                                    str2 = str4;
                                } else if (orderTitlesController$ExperimentTitleType2 == OrderTitlesController$ExperimentTitleType.SEARCH_PROGRESS) {
                                    OrderStatusInfo V2 = b.V();
                                    V2.getClass();
                                    SearchProgressExperiment.Companion.getClass();
                                    qn11 qn11Var2 = SearchProgressExperiment.e;
                                    qn11 b4 = V2.b(SearchProgressExperiment.class);
                                    if (b4 != null) {
                                        qn11Var2 = b4;
                                    }
                                    SearchProgressExperiment searchProgressExperiment = (SearchProgressExperiment) qn11Var2;
                                    searchProgressExperiment.getClass();
                                    str = d6z.Y(searchProgressExperiment, "search_time_exceeded");
                                } else {
                                    if (autoReorder != null) {
                                        str = autoReorder.a;
                                    }
                                    str2 = str7;
                                }
                                str2 = str;
                            } else {
                                str = t7s.h(g980Var.a, b.e(), str14, d, c4);
                            }
                            a = g980Var.a(new b980(c2, g980Var.b(b.V().Z.c), (CharSequence) str2, g980Var.b(b.V().Z.d), q48Var, b.h.b, false, str10, 256), b, z, str7);
                        }
                    }
                }
                orderTitlesController$ExperimentTitleType = OrderTitlesController$ExperimentTitleType.NONE;
                AutoReorder autoReorder2 = b.V().q;
                f = b.f();
                if (f != null) {
                }
                OrderTitlesController$ExperimentTitleType orderTitlesController$ExperimentTitleType22 = orderTitlesController$ExperimentTitleType;
                if (multiOrderInfo == null) {
                }
                str2 = str;
                a = g980Var.a(new b980(c2, g980Var.b(b.V().Z.c), (CharSequence) str2, g980Var.b(b.V().Z.d), q48Var, b.h.b, false, str10, 256), b, z, str7);
            }
            hjz0Var.a(a);
        }
    }

    public final TaxiOrder b() {
        if (this.v == null) {
            this.v = this.a.b();
        }
        TaxiOrder taxiOrder = this.v;
        if (taxiOrder != null) {
            return taxiOrder;
        }
        ny61.g("Required value was null.");
        return null;
    }

    public final void c(String str) {
        this.s = str;
        a();
    }

    public final void d(String str) {
        this.r = str;
        a();
    }

    public final void e() {
        this.x = false;
        this.p = null;
        qyy0.c(new op70(7, this));
    }
}
