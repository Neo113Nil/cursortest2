package com.yandex.mapkit.styling.automotivenavigation;

import android.content.Context;
import android.graphics.PointF;
import com.yandex.mapkit.navigation.automotive.layer.NavigationLayerMode;
import com.yandex.mapkit.navigation.automotive.layer.styling.RoutePinsStyleProvider;
import com.yandex.mapkit.styling.PlacemarkStyle;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0014\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0016\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J/\u0010\u0017\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0015J/\u0010\u0018\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0015J7\u0010\u001b\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ7\u0010\u001f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\u001cJ/\u0010 \u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010\u0015R\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/yandex/mapkit/styling/automotivenavigation/DefaultRoutePinsStyleProvider;", "Lcom/yandex/mapkit/navigation/automotive/layer/styling/RoutePinsStyleProvider;", "Landroid/content/Context;", "defaultContext", "<init>", "(Landroid/content/Context;)V", "", "imageId", "", "scaleFactor", "Lcom/yandex/mapkit/styling/PlacemarkStyle;", "style", "minVisibleZoom", "Lzy11;", "provideStyle", "(IFLcom/yandex/mapkit/styling/PlacemarkStyle;F)V", "", "isNightMode", "Lcom/yandex/mapkit/navigation/automotive/layer/NavigationLayerMode;", "navigationLayerMode", "provideTrafficLightStyle", "(FZLcom/yandex/mapkit/navigation/automotive/layer/NavigationLayerMode;Lcom/yandex/mapkit/styling/PlacemarkStyle;)V", "provideCheckpointStyle", "provideRailwayCrossingStyle", "provideSpeedBumpStyle", "roadInPoorConditionStartStyle", "roadInPoorConditionEndStyle", "provideRoadInPoorConditionStyle", "(FZLcom/yandex/mapkit/navigation/automotive/layer/NavigationLayerMode;Lcom/yandex/mapkit/styling/PlacemarkStyle;Lcom/yandex/mapkit/styling/PlacemarkStyle;)V", "tollRoadStartStyle", "tollRoadEndStyle", "provideTollRoadStyle", "provideRestrictedEntryStyle", "context", "Landroid/content/Context;", "com.yandex.mapkit.styling.automotivenavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public class DefaultRoutePinsStyleProvider implements RoutePinsStyleProvider {
    private final Context context;

    public DefaultRoutePinsStyleProvider(Context context) {
        this.context = LocalizedContextKt.localizedContext(context);
    }

    private final void provideStyle(int imageId, float scaleFactor, PlacemarkStyle style, float minVisibleZoom) {
        PointF pointF;
        style.setImage(DrawableUtils.createImageProvider(this.context, imageId, true, 1.0f, scaleFactor));
        pointF = DefaultRoutePinsStyleProviderKt.ANCHOR;
        style.setIconAnchor(pointF);
        style.setMinZoomVisible(Float.valueOf(minVisibleZoom));
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.RoutePinsStyleProvider
    public void provideCheckpointStyle(float scaleFactor, boolean isNightMode, NavigationLayerMode navigationLayerMode, PlacemarkStyle style) {
        provideStyle(R.drawable.mapkit_styling_automotive_route_checkpoint, scaleFactor, style, 8.0f);
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.RoutePinsStyleProvider
    public void provideRailwayCrossingStyle(float scaleFactor, boolean isNightMode, NavigationLayerMode navigationLayerMode, PlacemarkStyle style) {
        provideStyle(R.drawable.mapkit_styling_automotive_route_railway_crossing, scaleFactor, style, 8.0f);
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.RoutePinsStyleProvider
    public void provideRestrictedEntryStyle(float scaleFactor, boolean isNightMode, NavigationLayerMode navigationLayerMode, PlacemarkStyle style) {
        provideStyle(R.drawable.poi_alerts_barrier_24, scaleFactor, style, 16.0f);
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.RoutePinsStyleProvider
    public void provideRoadInPoorConditionStyle(float scaleFactor, boolean isNightMode, NavigationLayerMode navigationLayerMode, PlacemarkStyle roadInPoorConditionStartStyle, PlacemarkStyle roadInPoorConditionEndStyle) {
        provideStyle(R.drawable.mapkit_styling_automotive_route_rugged_road_start, scaleFactor, roadInPoorConditionStartStyle, 8.0f);
        provideStyle(R.drawable.mapkit_styling_automotive_route_rugged_road_end, scaleFactor, roadInPoorConditionEndStyle, 9.0f);
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.RoutePinsStyleProvider
    public void provideSpeedBumpStyle(float scaleFactor, boolean isNightMode, NavigationLayerMode navigationLayerMode, PlacemarkStyle style) {
        provideStyle(R.drawable.mapkit_styling_automotive_route_speed_bump, scaleFactor, style, 16.0f);
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.RoutePinsStyleProvider
    public void provideTollRoadStyle(float scaleFactor, boolean isNightMode, NavigationLayerMode navigationLayerMode, PlacemarkStyle tollRoadStartStyle, PlacemarkStyle tollRoadEndStyle) {
        provideStyle(isNightMode ? R.drawable.poi_alerts_pay_wd_24_night : R.drawable.poi_alerts_pay_wd_24, scaleFactor, tollRoadStartStyle, 8.0f);
        provideStyle(R.drawable.poi_alerts_pay_wd_end_24, scaleFactor, tollRoadEndStyle, 8.0f);
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.RoutePinsStyleProvider
    public void provideTrafficLightStyle(float scaleFactor, boolean isNightMode, NavigationLayerMode navigationLayerMode, PlacemarkStyle style) {
        provideStyle(isNightMode ? R.drawable.mapkit_styling_automotive_route_trafficlight_night : R.drawable.mapkit_styling_automotive_route_trafficlight_day, scaleFactor, style, 15.0f);
    }
}
