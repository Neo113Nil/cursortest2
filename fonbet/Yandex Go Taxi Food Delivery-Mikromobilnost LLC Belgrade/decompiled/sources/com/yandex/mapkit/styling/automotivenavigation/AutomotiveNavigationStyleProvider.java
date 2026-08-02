package com.yandex.mapkit.styling.automotivenavigation;

import android.content.Context;
import com.yandex.mapkit.navigation.automotive.layer.styling.BalloonImageProvider;
import com.yandex.mapkit.navigation.automotive.layer.styling.HighlightStyleProvider;
import com.yandex.mapkit.navigation.automotive.layer.styling.NavigationStyleProvider;
import com.yandex.mapkit.navigation.automotive.layer.styling.RequestPointStyleProvider;
import com.yandex.mapkit.navigation.automotive.layer.styling.RoutePinsStyleProvider;
import com.yandex.mapkit.navigation.automotive.layer.styling.RouteViewStyleProvider;
import com.yandex.mapkit.navigation.automotive.layer.styling.UserPlacemarkStyleProvider;
import com.yandex.mapkit.styling.automotivenavigation.balloons.DefaultBalloonImageProvider;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u000e\u001a\u00020\u0014H\u0016J\b\u0010\n\u001a\u00020\u0015H\u0016J\b\u0010\f\u001a\u00020\u0016H\u0016J\b\u0010\b\u001a\u00020\u0017H\u0016J\b\u0010\u0010\u001a\u00020\u0018H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/yandex/mapkit/styling/automotivenavigation/AutomotiveNavigationStyleProvider;", "Lcom/yandex/mapkit/navigation/automotive/layer/styling/NavigationStyleProvider;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "routeStyleProvider", "Lcom/yandex/mapkit/styling/automotivenavigation/DefaultRouteStyleProvider;", "routePinsStyleProvider", "Lcom/yandex/mapkit/styling/automotivenavigation/DefaultRoutePinsStyleProvider;", "requestPointStyleProvider", "Lcom/yandex/mapkit/styling/automotivenavigation/DefaultRequestPointStyleProvider;", "userPlacemarkStyleProvider", "Lcom/yandex/mapkit/styling/automotivenavigation/DefaultUserPlacemarkStyleProvider;", "balloonImageProvider", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/DefaultBalloonImageProvider;", "highlightStyleProvider", "Lcom/yandex/mapkit/styling/automotivenavigation/DefaultHighlightStyleProvider;", "routeViewStyleProvider", "Lcom/yandex/mapkit/navigation/automotive/layer/styling/RouteViewStyleProvider;", "Lcom/yandex/mapkit/navigation/automotive/layer/styling/BalloonImageProvider;", "Lcom/yandex/mapkit/navigation/automotive/layer/styling/RequestPointStyleProvider;", "Lcom/yandex/mapkit/navigation/automotive/layer/styling/UserPlacemarkStyleProvider;", "Lcom/yandex/mapkit/navigation/automotive/layer/styling/RoutePinsStyleProvider;", "Lcom/yandex/mapkit/navigation/automotive/layer/styling/HighlightStyleProvider;", "com.yandex.mapkit.styling.automotivenavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AutomotiveNavigationStyleProvider implements NavigationStyleProvider {
    private final DefaultBalloonImageProvider balloonImageProvider;
    private final DefaultHighlightStyleProvider highlightStyleProvider = new DefaultHighlightStyleProvider();
    private final DefaultRequestPointStyleProvider requestPointStyleProvider;
    private final DefaultRoutePinsStyleProvider routePinsStyleProvider;
    private final DefaultRouteStyleProvider routeStyleProvider;
    private final DefaultUserPlacemarkStyleProvider userPlacemarkStyleProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public AutomotiveNavigationStyleProvider(Context context) {
        this.routeStyleProvider = new DefaultRouteStyleProvider(context);
        this.routePinsStyleProvider = new DefaultRoutePinsStyleProvider(context);
        this.requestPointStyleProvider = new DefaultRequestPointStyleProvider(context);
        this.userPlacemarkStyleProvider = new DefaultUserPlacemarkStyleProvider(context);
        this.balloonImageProvider = new DefaultBalloonImageProvider(context, null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.NavigationStyleProvider
    public BalloonImageProvider balloonImageProvider() {
        return this.balloonImageProvider;
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.NavigationStyleProvider
    public HighlightStyleProvider highlightStyleProvider() {
        return this.highlightStyleProvider;
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.NavigationStyleProvider
    public RequestPointStyleProvider requestPointStyleProvider() {
        return this.requestPointStyleProvider;
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.NavigationStyleProvider
    public RoutePinsStyleProvider routePinsStyleProvider() {
        return this.routePinsStyleProvider;
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.NavigationStyleProvider
    public RouteViewStyleProvider routeViewStyleProvider() {
        return this.routeStyleProvider;
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.NavigationStyleProvider
    public UserPlacemarkStyleProvider userPlacemarkStyleProvider() {
        return this.userPlacemarkStyleProvider;
    }
}
