package defpackage;

import android.app.Activity;
import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.order.api.change.destination.RouteChangeType;
import com.yandex.go.taxi.order.change.route.RouteChangeWarning;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.response.AllowedChange;
import com.yandex.go.taxi.order.models.api.response.AllowedDestinationPointChanges;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.provider.w;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.widget.dialog.AlertDialog;

/* loaded from: classes14.dex */
public final class k1l0 extends h55 {
    public final Activity D;
    public final yze0 E;
    public final y0l0 F;
    public final w G;
    public final ci70 H;
    public final w030 I;
    public final gpx0 J;
    public final yvf0 K;
    public final yvf0 L;
    public final opw M;
    public final a3y0 N;

    public k1l0(Activity activity, yze0 yze0Var, y0l0 y0l0Var, w wVar, ci70 ci70Var, w030 w030Var, gpx0 gpx0Var, yvf0 yvf0Var, yvf0 yvf0Var2, opw opwVar) {
        super(null);
        this.D = activity;
        this.E = yze0Var;
        this.F = y0l0Var;
        this.G = wVar;
        this.H = ci70Var;
        this.I = w030Var;
        this.J = gpx0Var;
        this.K = yvf0Var;
        this.L = yvf0Var2;
        this.M = opwVar;
        this.N = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "RouteChangeRouter");
    }

    public static final void P(int i, k1l0 k1l0Var, o2y0 o2y0Var, ArrayList arrayList) {
        m950 m950Var = (m950) k1l0Var.K.get();
        String string = k1l0Var.D.getString(kyh0.select_address_to);
        jvd0 jvd0Var = PointType.Companion;
        k1l0Var.A(m950Var, new wg20(string), new g1l0(i, k1l0Var, o2y0Var, arrayList));
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        RouteChangeType routeChangeType;
        d1l0 d1l0Var = (d1l0) obj;
        RouteChangeWarning routeChangeWarning = d1l0Var.b;
        o2y0 o2y0Var = d1l0Var.a;
        this.M.getClass();
        int i = e1l0.a[routeChangeWarning.ordinal()];
        if (i == 1) {
            routeChangeType = RouteChangeType.CHANGE_DESTINATION;
        } else if (i == 2) {
            routeChangeType = RouteChangeType.ADD_MID_POINT;
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            routeChangeType = RouteChangeType.CHANGE_MID_POINT;
        }
        RouteChangeType routeChangeType2 = routeChangeType;
        int i2 = 9;
        if (routeChangeWarning != RouteChangeWarning.CHANGE_ROUTE_POINT) {
            if (this.E.d().b) {
                r(new u50(this, o2y0Var, routeChangeWarning, d1l0Var, routeChangeType2, 19));
                return;
            }
            AlertDialog alertDialog = new AlertDialog(this.D);
            alertDialog.setTitle(routeChangeWarning.getTitle());
            alertDialog.setMessage(routeChangeWarning.getMessage());
            alertDialog.setPositiveButton(kyh0.dialog_common_ok, new hxj0(9, alertDialog));
            alertDialog.setNegativeButton(kyh0.common_cancel);
            alertDialog.setDismissListener(new te5(alertDialog, this, o2y0Var, routeChangeType2, routeChangeWarning, 2));
            alertDialog.show();
            return;
        }
        d0l0 t = o2y0Var.b().t();
        this.G.getClass();
        wh70 wh70Var = new wh70(o2y0Var.b());
        LinkedHashMap linkedHashMap = wh70Var.a;
        AllowedChange allowedChange = (AllowedChange) linkedHashMap.get("destination_changes");
        List list = allowedChange != null ? allowedChange.c : null;
        if (list == null) {
            list = EmptyList.a;
        }
        linkedHashMap.get("destinations");
        wh70Var.b();
        OrderStatusInfo V = o2y0Var.b().V();
        V.getClass();
        if (V.f(SimpleBooleanExperiment.MULTIPLE_POINT_CHANGE)) {
            Q(t.b, o2y0Var);
            return;
        }
        if (t.a().size() != 3) {
            a3y0.d(this.N, "onLaunch", null, new wzk0(t, 2), 2);
            r(new qu(i2));
            return;
        }
        Address address = t.a().size() == 3 ? (Address) t.a().get(1) : null;
        String D1 = address != null ? address.D1() : null;
        AllowedDestinationPointChanges allowedDestinationPointChanges = list.size() != 2 ? null : (AllowedDestinationPointChanges) list.get(0);
        boolean z = allowedDestinationPointChanges != null && allowedDestinationPointChanges.a;
        AllowedDestinationPointChanges allowedDestinationPointChanges2 = list.size() == 2 ? (AllowedDestinationPointChanges) list.get(0) : null;
        A(new b1l0(this, this.I), new mnn(D1, z, allowedDestinationPointChanges2 != null && allowedDestinationPointChanges2.b), new i1l0(this, o2y0Var));
    }

    public final void Q(List list, o2y0 o2y0Var) {
        A((m950) this.J.get(), new pyx0(list, o2y0Var), new j1l0(this, o2y0Var));
    }
}
