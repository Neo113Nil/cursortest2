package defpackage;

import android.content.Context;
import com.yandex.mapkit.navigation.transport.layer.BalloonTypes;
import com.yandex.mapkit.navigation.transport.layer.LevelSelection;
import com.yandex.mapkit.navigation.transport.layer.RouteLineStyle;
import com.yandex.mapkit.navigation.transport.layer.RouteStyle;
import com.yandex.mapkit.navigation.transport.layer.RouteViewStyleProvider;
import com.yandex.mapkit.styling.ArrowStyle;
import com.yandex.mapkit.styling.ConstantFunctionPoints;
import com.yandex.mapkit.styling.PlacemarkStyle;
import com.yandex.mapkit.styling.PolylineStyle;
import com.yandex.mapkit.styling.ProportionFunction;
import com.yandex.mapkit.transport.masstransit.ConstructionMask;
import com.yandex.mapkit.transport.masstransit.Line;
import com.yandex.mapkit.transport.masstransit.TrafficTypeID;
import java.util.List;
import kotlin.a;

/* loaded from: classes15.dex */
public final class juo0 implements RouteViewStyleProvider {
    public final Context a;
    public final i3y b = a.a(new ehn0(22, this));

    public juo0(Context context) {
        this.a = context;
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteViewStyleProvider
    public final void provideFitnessPolylineStyle(ConstructionMask constructionMask, TrafficTypeID trafficTypeID, boolean z, boolean z2, LevelSelection levelSelection, RouteLineStyle routeLineStyle) {
        provideTransferPolylineStyle(z, z2, routeLineStyle);
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteViewStyleProvider
    public final void provideManoeuvreStyle(boolean z, boolean z2, ArrowStyle arrowStyle) {
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteViewStyleProvider
    public final void provideRouteStyle(boolean z, boolean z2, RouteStyle routeStyle) {
        routeStyle.setVisibleBalloonTypes(BalloonTypes.NONE.value);
        routeStyle.setShowRoute(true);
        routeStyle.setShowManoeuvres(false);
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteViewStyleProvider
    public final void provideTransferPolylineStyle(boolean z, boolean z2, RouteLineStyle routeLineStyle) {
        PolylineStyle base = routeLineStyle.getBase();
        base.setStrokeWidth(ProportionFunction.fromConstantFunction(new ConstantFunctionPoints(8.0f)));
        base.setDashLength(0.0f);
        base.setGapLength(0.0f);
        base.setStrokeColor(this.a.getColor(vqg0.scooters_navigation_route_color));
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteViewStyleProvider
    public final void provideTransportPolylineStyle(List list, List list2, Line.Style style, boolean z, boolean z2, boolean z3, RouteLineStyle routeLineStyle) {
        provideTransferPolylineStyle(z2, z3, routeLineStyle);
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteViewStyleProvider
    public final void provideTransportStopStyle(float f, boolean z, PlacemarkStyle placemarkStyle) {
        ((RouteViewStyleProvider) this.b.getValue()).provideTransportStopStyle(f, z, placemarkStyle);
    }
}
