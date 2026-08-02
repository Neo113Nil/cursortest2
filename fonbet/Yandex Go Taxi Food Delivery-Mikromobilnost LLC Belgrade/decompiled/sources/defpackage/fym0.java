package defpackage;

import android.content.Context;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.SubpolylineHelper;
import com.yandex.mapkit.transport.masstransit.Line;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.mapkit.transport.masstransit.Section;
import com.yandex.mapkit.transport.masstransit.Transport;
import com.yandex.mapkit.transport.masstransit.TransportContour;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.overlay.ScootersRouteInfoView;
import ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.overlay.a;

/* loaded from: classes6.dex */
public final class fym0 implements y4p0 {
    public final /* synthetic */ a a;

    public fym0(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.y4p0
    public final void ef(Route route) {
        Object obj;
        TransportContour.Style style;
        a aVar = this.a;
        ah00 ah00Var = (ah00) aVar.b;
        if (route == null) {
            xm00 xm00Var = aVar.A;
            if (xm00Var != null) {
                ((gh00) ah00Var).i.o(xm00Var);
            }
            aVar.A = null;
            return;
        }
        xm00 xm00Var2 = aVar.A;
        if (xm00Var2 != null) {
            ((gh00) ah00Var).i.o(xm00Var2);
        }
        xm00 p = ((gh00) ah00Var).i.p();
        aVar.A = p;
        b6p0 b6p0Var = (b6p0) aVar.D.getValue();
        Context context = b6p0Var.a;
        Polyline geometry = route.getGeometry();
        for (Section section : route.getSections()) {
            List<Transport> transports = section.getMetadata().getData().getTransports();
            List<Transport> list = transports;
            if (list != null && !list.isEmpty()) {
                Polyline subpolyline = SubpolylineHelper.subpolyline(geometry, section.getGeometry());
                List<Point> points = subpolyline.getPoints();
                if (points.size() >= 2) {
                    Transport transport = (Transport) kotlin.collections.a.P(transports);
                    Iterator<T> it = transport.getTransportContours().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((TransportContour) obj).getName().length() > 0) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    TransportContour transportContour = (TransportContour) obj;
                    Integer mainColor = (transportContour == null || (style = transportContour.getStyle()) == null) ? null : style.getMainColor();
                    Line.Style style2 = transport.getLine().getStyle();
                    Integer color = style2 != null ? style2.getColor() : null;
                    if (mainColor == null) {
                        mainColor = color;
                    }
                    int intValue = mainColor != null ? mainColor.intValue() | ModalContentViewContainer.BASE_SHADOW_COLOR : qje.t(xng0.textMinor, context);
                    w4e0 s = p.s(subpolyline);
                    s.p(3.0f);
                    s.v(false);
                    s.y(qje.t(xng0.bgMain, context));
                    s.z(2.0f);
                    s.B(points.size() - 1, intValue);
                    b6p0Var.a(p, (Point) kotlin.collections.a.P(points), intValue);
                    b6p0Var.a(p, (Point) kotlin.collections.a.Z(points), intValue);
                }
            }
        }
        Point point = (Point) kotlin.collections.a.R(geometry.getPoints());
        if (point != null) {
            p.r(point).x(ffx.d0(tje.y(f1h0.route_end_point, context), 0, 0, 7));
        }
        Point point2 = (Point) kotlin.collections.a.b0(geometry.getPoints());
        if (point2 != null) {
            p.r(point2).x(ffx.d0(tje.y(f1h0.route_selected_dest_point, context), 0, 0, 7));
        }
    }

    @Override // defpackage.y4p0
    public final void k9(x33 x33Var) {
        xm00 xm00Var;
        a aVar = this.a;
        ah00 ah00Var = (ah00) aVar.b;
        Route route = x33Var.b;
        if (route == null) {
            aVar.Hg();
            return;
        }
        w33 w33Var = x33Var.a;
        if (w33Var.b) {
            f4c0 f4c0Var = aVar.B;
            if (f4c0Var != null && (xm00Var = aVar.y) != null) {
                xm00Var.o(f4c0Var);
            }
            aVar.B = null;
        } else {
            Point d = cwa1.d(w33Var.a);
            f4c0 f4c0Var2 = aVar.B;
            if (f4c0Var2 == null) {
                xm00 xm00Var2 = aVar.y;
                if (xm00Var2 == null) {
                    xm00Var2 = ((gh00) ah00Var).i.p();
                    aVar.y = xm00Var2;
                }
                f4c0 r = xm00Var2.r(d);
                aVar.B = r;
                r.x(ffx.d0(aVar.F, 0, 0, 7));
            } else {
                f4c0Var2.o(d);
            }
        }
        Context context = aVar.c;
        w4e0 w4e0Var = aVar.z;
        if (w4e0Var == null) {
            xm00 xm00Var3 = aVar.y;
            if (xm00Var3 == null) {
                xm00Var3 = ((gh00) ah00Var).i.p();
                aVar.y = xm00Var3;
            }
            w4e0 s = xm00Var3.s(route.getGeometry());
            s.C(Integer.valueOf(context.getColor(mqg0.component_green_toxic)));
            s.p(context.getResources().getDimensionPixelSize(qrg0.scooters_route_line_width));
            s.v(false);
            aVar.z = s;
        } else {
            w4e0Var.o(route.getGeometry());
        }
        String text = route.getMetadata().getWeight().getTime().getText();
        Polyline geometry = route.getGeometry();
        ScootersRouteInfoView scootersRouteInfoView = aVar.E;
        f4c0 f4c0Var3 = aVar.C;
        Point n = ru.yandex.taxi.map.utils.a.n(geometry);
        if (n == null) {
            return;
        }
        scootersRouteInfoView.setText(text);
        if (f4c0Var3 != null) {
            f4c0Var3.o(n);
            f4c0Var3.x(scootersRouteInfoView.asBitmap());
            return;
        }
        xm00 xm00Var4 = aVar.y;
        if (xm00Var4 == null) {
            xm00Var4 = ((gh00) ah00Var).i.p();
            aVar.y = xm00Var4;
        }
        f4c0 r2 = xm00Var4.r(n);
        r2.x(scootersRouteInfoView.asBitmap());
        aVar.C = r2;
    }
}
