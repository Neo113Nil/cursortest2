package com.yandex.mapkit.styling.transportnavigation;

import android.content.Context;
import android.graphics.PointF;
import com.yandex.mapkit.navigation.transport.layer.BalloonTypes;
import com.yandex.mapkit.navigation.transport.layer.ColorGradient;
import com.yandex.mapkit.navigation.transport.layer.LevelSelection;
import com.yandex.mapkit.navigation.transport.layer.RouteLineStyle;
import com.yandex.mapkit.navigation.transport.layer.RouteStyle;
import com.yandex.mapkit.navigation.transport.layer.RouteViewStyleProvider;
import com.yandex.mapkit.styling.ArrowStyle;
import com.yandex.mapkit.styling.ConstantFunctionPoints;
import com.yandex.mapkit.styling.LinearTiltFunctionPoints;
import com.yandex.mapkit.styling.PlacemarkStyle;
import com.yandex.mapkit.styling.PolylineStyle;
import com.yandex.mapkit.styling.ProportionFunction;
import com.yandex.mapkit.transport.masstransit.ConstructionMask;
import com.yandex.mapkit.transport.masstransit.Line;
import com.yandex.mapkit.transport.masstransit.Pass;
import com.yandex.mapkit.transport.masstransit.TrafficTypeID;
import com.yandex.mapkit.transport.masstransit.TransportContour;
import com.yandex.mapkit.transport.masstransit.TransportType;
import com.yandex.runtime.image.ImageProvider;
import defpackage.scc;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\b\u0016\u0018\u0000 A2\u00020\u0001:\u0001AB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J?\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJU\u0010'\u001a\u00020\u000e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001f2\b\u0010\r\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u001aH\u0016¢\u0006\u0004\b'\u0010(J'\u0010+\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J'\u0010.\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J'\u00101\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\r\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107R\u0014\u00109\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00107R\u0014\u0010:\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00107R\u0014\u0010;\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00107R\u0014\u0010<\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00107R\u0014\u0010=\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00107R\u0014\u0010>\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00107R\u0014\u0010?\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00107R\u0014\u0010@\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00107¨\u0006B"}, d2 = {"Lcom/yandex/mapkit/styling/transportnavigation/DefaultRouteViewStyleProvider;", "Lcom/yandex/mapkit/navigation/transport/layer/RouteViewStyleProvider;", "Landroid/content/Context;", "defaultContext", "<init>", "(Landroid/content/Context;)V", "", "y1", "y2", "Lcom/yandex/mapkit/styling/ProportionFunction;", "createLerpTiltFunction", "(FF)Lcom/yandex/mapkit/styling/ProportionFunction;", "Lcom/yandex/mapkit/styling/PolylineStyle;", "style", "Lzy11;", "setAlternativeRouteStyle", "(Lcom/yandex/mapkit/styling/PolylineStyle;)V", "Lcom/yandex/mapkit/transport/masstransit/ConstructionMask;", "constructionMask", "Lcom/yandex/mapkit/transport/masstransit/TrafficTypeID;", "trafficTypeID", "", "selected", "isNightMode", "Lcom/yandex/mapkit/navigation/transport/layer/LevelSelection;", "levelSelection", "Lcom/yandex/mapkit/navigation/transport/layer/RouteLineStyle;", "provideFitnessPolylineStyle", "(Lcom/yandex/mapkit/transport/masstransit/ConstructionMask;Lcom/yandex/mapkit/transport/masstransit/TrafficTypeID;ZZLcom/yandex/mapkit/navigation/transport/layer/LevelSelection;Lcom/yandex/mapkit/navigation/transport/layer/RouteLineStyle;)V", "provideTransferPolylineStyle", "(ZZLcom/yandex/mapkit/navigation/transport/layer/RouteLineStyle;)V", "", "Lcom/yandex/mapkit/transport/masstransit/TransportContour;", "transportContours", "Lcom/yandex/mapkit/transport/masstransit/TransportType;", "transportTypes", "Lcom/yandex/mapkit/transport/masstransit/Line$Style;", "isGuidanceMode", "routeLineStyle", "provideTransportPolylineStyle", "(Ljava/util/List;Ljava/util/List;Lcom/yandex/mapkit/transport/masstransit/Line$Style;ZZZLcom/yandex/mapkit/navigation/transport/layer/RouteLineStyle;)V", "scaleFactor", "Lcom/yandex/mapkit/styling/PlacemarkStyle;", "provideTransportStopStyle", "(FZLcom/yandex/mapkit/styling/PlacemarkStyle;)V", "Lcom/yandex/mapkit/styling/ArrowStyle;", "provideManoeuvreStyle", "(ZZLcom/yandex/mapkit/styling/ArrowStyle;)V", "Lcom/yandex/mapkit/navigation/transport/layer/RouteStyle;", "provideRouteStyle", "(ZZLcom/yandex/mapkit/navigation/transport/layer/RouteStyle;)V", "context", "Landroid/content/Context;", "", "arrowColor", CA20Status.STATUS_USER_I, "arrowOutlineColor", "alternativeRouteColor", "fitnessColor", "fitnessUnderpassColor", "fitnessBindingColor", "fitnessAnotherLevelColor", "transferColor", "stopNightColor", "stopDayColor", "Companion", "com.yandex.mapkit.styling.transportnavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public class DefaultRouteViewStyleProvider implements RouteViewStyleProvider {
    private static final float ALTERNATIVE_ROUTE_WIDTH = 4.0f;
    private static final float ARROW_MAX_LENGTH = 90.0f;
    private static final float ARROW_MIN_LENGTH = 50.0f;
    private static final float ARROW_MIN_ZOOM_MANOEUVRES_VISIBLE = 13.0f;
    private static final float ARROW_OUTLINE_MAX_WIDTH = 1.9f;
    private static final float ARROW_OUTLINE_MIN_WIDTH = 0.8f;
    private static final float ARROW_TRIANGLE_HEIGHT_SCALE = 1.5f;
    private static final float DASH_GAP = 3.0f;
    private static final float DASH_LENGTH = 6.0f;
    private static final float DASH_ROUTE_WIDTH = 6.0f;
    private static final float GRADIENT_MAX_LENGHT = 1000.0f;
    private static final float ROUTE_WIDTH = 8.0f;
    private static final float TRANSPORT_STOP_MIN_ZOOM_VISIBLE = 12.0f;
    private static final float TRANSPORT_STOP_SIZE = 6.0f;
    private final int alternativeRouteColor;
    private final int arrowColor;
    private final int arrowOutlineColor;
    private final Context context;
    private final int fitnessAnotherLevelColor;
    private final int fitnessBindingColor;
    private final int fitnessColor;
    private final int fitnessUnderpassColor;
    private final int stopDayColor;
    private final int stopNightColor;
    private final int transferColor;

    public DefaultRouteViewStyleProvider(Context context) {
        Context localizedContext = LocalizedContextKt.localizedContext(context);
        this.context = localizedContext;
        this.arrowColor = localizedContext.getColor(R.color.mapkit_styling_transport_route_style_arrow_color);
        this.arrowOutlineColor = localizedContext.getColor(R.color.mapkit_styling_transport_route_style_arrow_outline_color);
        this.alternativeRouteColor = localizedContext.getColor(R.color.mapkit_styling_transport_alternative_route_style);
        this.fitnessColor = localizedContext.getColor(R.color.mapkit_styling_transport_fitness_style);
        this.fitnessUnderpassColor = localizedContext.getColor(R.color.mapkit_styling_transport_fitness_underpass_style);
        this.fitnessBindingColor = localizedContext.getColor(R.color.mapkit_styling_transport_fitness_binding_style);
        this.fitnessAnotherLevelColor = localizedContext.getColor(R.color.mapkit_styling_transport_fitness_another_level_style);
        this.transferColor = localizedContext.getColor(R.color.mapkit_styling_transport_transfer_style);
        this.stopNightColor = localizedContext.getColor(R.color.mapkit_styling_transport_masstransit_stop_night_color);
        this.stopDayColor = localizedContext.getColor(R.color.mapkit_styling_transport_masstransit_stop_day_color);
    }

    private final ProportionFunction createLerpTiltFunction(float y1, float y2) {
        return ProportionFunction.fromTiltFunction(new LinearTiltFunctionPoints((List<PointF>) scc.g(new PointF(0.0f, y1), new PointF(90.0f, y2))));
    }

    private final void setAlternativeRouteStyle(PolylineStyle style) {
        style.setStrokeWidth(ProportionFunction.fromConstantFunction(new ConstantFunctionPoints(4.0f)));
        style.setStrokeColor(this.alternativeRouteColor);
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteViewStyleProvider
    public void provideFitnessPolylineStyle(ConstructionMask constructionMask, TrafficTypeID trafficTypeID, boolean selected, boolean isNightMode, LevelSelection levelSelection, RouteLineStyle style) {
        if (!selected) {
            setAlternativeRouteStyle(style.getBase());
            return;
        }
        style.getBase().setStrokeWidth(ProportionFunction.fromConstantFunction(new ConstantFunctionPoints(6.0f)));
        if (constructionMask.getTransition() || constructionMask.getTunnel() || constructionMask.getPass() == Pass.UNDER) {
            style.getBase().setStrokeColor(this.fitnessUnderpassColor);
        } else if (constructionMask.getBinding()) {
            style.getBase().setStrokeColor(this.fitnessBindingColor);
        } else if (levelSelection == LevelSelection.CURRENT_TO_ANOTHER_LEVEL) {
            style.setBaseColorGradient(new ColorGradient(this.fitnessColor, this.fitnessAnotherLevelColor, GRADIENT_MAX_LENGHT));
        } else if (levelSelection == LevelSelection.ANOTHER_LEVEL || levelSelection == LevelSelection.ANOTHER_TO_CURRENT_LEVEL) {
            style.getBase().setStrokeColor(this.fitnessAnotherLevelColor);
        } else {
            style.getBase().setStrokeColor(this.fitnessColor);
        }
        style.getBase().setDashLength(6.0f);
        style.getBase().setGapLength(3.0f);
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteViewStyleProvider
    public void provideManoeuvreStyle(boolean selected, boolean isNightMode, ArrowStyle style) {
        style.setFillColor(this.arrowColor);
        style.setOutlineColor(this.arrowOutlineColor);
        style.setOutlineWidth(createLerpTiltFunction(0.8f, ARROW_OUTLINE_MAX_WIDTH));
        style.setLength(createLerpTiltFunction(ARROW_MIN_LENGTH, 90.0f));
        style.setTriangleHeight(createLerpTiltFunction(TRANSPORT_STOP_MIN_ZOOM_VISIBLE, TRANSPORT_STOP_MIN_ZOOM_VISIBLE));
        style.setMinZoomVisible(Float.valueOf(ARROW_MIN_ZOOM_MANOEUVRES_VISIBLE));
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteViewStyleProvider
    public void provideRouteStyle(boolean selected, boolean isNightMode, RouteStyle style) {
        style.setVisibleBalloonTypes(BalloonTypes.ALL.value);
        style.setShowRoute(true);
        style.setShowManoeuvres(false);
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteViewStyleProvider
    public void provideTransferPolylineStyle(boolean selected, boolean isNightMode, RouteLineStyle style) {
        if (!selected) {
            setAlternativeRouteStyle(style.getBase());
            return;
        }
        style.getBase().setStrokeWidth(ProportionFunction.fromConstantFunction(new ConstantFunctionPoints(6.0f)));
        style.getBase().setStrokeColor(this.transferColor);
        style.getBase().setDashLength(6.0f);
        style.getBase().setGapLength(3.0f);
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteViewStyleProvider
    public void provideTransportPolylineStyle(List<TransportContour> transportContours, List<TransportType> transportTypes, Line.Style style, boolean isGuidanceMode, boolean selected, boolean isNightMode, RouteLineStyle routeLineStyle) {
        if (!selected) {
            setAlternativeRouteStyle(routeLineStyle.getBase());
        } else {
            routeLineStyle.getBase().setStrokeWidth(ProportionFunction.fromConstantFunction(new ConstantFunctionPoints(8.0f)));
            routeLineStyle.getBase().setStrokeColor(LineColorKt.lineColor(this.context, transportTypes, transportContours, style, isGuidanceMode, isNightMode));
        }
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.RouteViewStyleProvider
    public void provideTransportStopStyle(float scaleFactor, boolean isNightMode, PlacemarkStyle style) {
        ImageProvider createTransportStop;
        createTransportStop = DefaultRouteViewStyleProviderKt.createTransportStop(isNightMode ? this.stopNightColor : this.stopDayColor, scaleFactor * 6.0f);
        style.setImage(createTransportStop);
        style.setMinZoomVisible(Float.valueOf(TRANSPORT_STOP_MIN_ZOOM_VISIBLE));
        style.setIconAnchor(new PointF(0.5f, 0.5f));
    }
}
