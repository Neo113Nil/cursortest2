package defpackage;

import android.content.Context;
import android.graphics.PointF;
import com.yandex.go.navigator.domain.v;
import com.yandex.mapkit.directions.driving.Flags;
import com.yandex.mapkit.navigation.automotive.layer.NavigationLayerMode;
import com.yandex.mapkit.navigation.automotive.layer.styling.JamStyle;
import com.yandex.mapkit.navigation.automotive.layer.styling.RouteStyle;
import com.yandex.mapkit.navigation.automotive.layer.styling.RouteViewStyleProvider;
import com.yandex.mapkit.styling.ArrowStyle;
import com.yandex.mapkit.styling.LinearZoomFunctionPoints;
import com.yandex.mapkit.styling.PolylineStyle;
import com.yandex.mapkit.styling.ProportionFunction;
import java.util.List;

/* loaded from: classes12.dex */
public final class fa50 implements RouteViewStyleProvider {
    public final /* synthetic */ ga50 a;

    public fa50(ga50 ga50Var) {
        this.a = ga50Var;
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.RouteViewStyleProvider
    public final void provideJamStyle(Flags flags, boolean z, boolean z2, NavigationLayerMode navigationLayerMode, JamStyle jamStyle) {
        this.a.a().routeViewStyleProvider().provideJamStyle(flags, z, z2, navigationLayerMode, jamStyle);
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.RouteViewStyleProvider
    public final void provideManoeuvreStyle(Flags flags, boolean z, boolean z2, NavigationLayerMode navigationLayerMode, ArrowStyle arrowStyle) {
        this.a.a().routeViewStyleProvider().provideManoeuvreStyle(flags, z, z2, navigationLayerMode, arrowStyle);
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.RouteViewStyleProvider
    public final void providePolylineStyle(Flags flags, boolean z, boolean z2, NavigationLayerMode navigationLayerMode, PolylineStyle polylineStyle) {
        ga50 ga50Var = this.a;
        Context context = ga50Var.a;
        ga50Var.a().routeViewStyleProvider().providePolylineStyle(flags, z, z2, navigationLayerMode, polylineStyle);
        polylineStyle.setStrokeWidth(ProportionFunction.fromZoomFunction(new LinearZoomFunctionPoints((List<PointF>) scc.g(new PointF(12.0f, 8.0f), new PointF(16.0f, 12.0f)))));
        if (navigationLayerMode == NavigationLayerMode.ROUTE_SELECTION) {
            int color = (z && jl40.l(ga50Var.b.c.getValue(), n901.a)) ? context.getColor(vog0.route_selected) : context.getColor(vog0.route_not_selected);
            polylineStyle.setOutlineColor(z ? context.getColor(vog0.route_not_selected) : context.getColor(vog0.icons_primary));
            polylineStyle.setStrokeColor(color);
        } else {
            if (z) {
                return;
            }
            int color2 = context.getColor(vog0.route_not_selected);
            polylineStyle.setOutlineColor(context.getColor(vog0.icons_primary));
            polylineStyle.setStrokeColor(color2);
        }
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.RouteViewStyleProvider
    public final void provideRouteStyle(Flags flags, boolean z, boolean z2, NavigationLayerMode navigationLayerMode, RouteStyle routeStyle) {
        ga50 ga50Var = this.a;
        ga50Var.a().routeViewStyleProvider().provideRouteStyle(flags, z, z2, navigationLayerMode, routeStyle);
        v vVar = ga50Var.f;
        oc50 oc50Var = ga50Var.d;
        routeStyle.setShowRoute(!vVar.a());
        routeStyle.setShowJams(!vVar.a());
        routeStyle.setShowCheckpoints(!vVar.a());
        routeStyle.setShowRestrictedEntries(!vVar.a());
        routeStyle.setShowRoadsInPoorCondition(!vVar.a());
        routeStyle.setShowRailwayCrossings(!vVar.a());
        z950 z950Var = ga50Var.g;
        routeStyle.setShowTrafficLights(((y950) z950Var.a.getValue()).a && oc50Var.a() && z && !vVar.a());
        routeStyle.setShowRoadEvents(((y950) z950Var.a.getValue()).b && z && !vVar.a());
        routeStyle.setShowBalloons(((y950) z950Var.a.getValue()).c && !vVar.a());
        routeStyle.setShowManoeuvres(((y950) z950Var.a.getValue()).d && oc50Var.a() && z && !vVar.a());
        routeStyle.setShowJams(z);
    }
}
