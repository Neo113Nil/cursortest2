package com.yandex.mapkit.styling.transportnavigation;

import android.content.Context;
import com.yandex.mapkit.navigation.transport.layer.ConstructionStyleProvider;
import com.yandex.mapkit.navigation.transport.layer.RequestPointStyleProvider;
import com.yandex.mapkit.navigation.transport.layer.RouteViewStyleProvider;
import com.yandex.mapkit.navigation.transport.layer.StyleProvider;
import com.yandex.mapkit.navigation.transport.layer.UserLocationStyleProvider;
import com.yandex.mapkit.navigation.transport.layer.balloons.BalloonImageProvider;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0010H\u0016J\b\u0010\u000e\u001a\u00020\u0011H\u0016J\b\u0010\b\u001a\u00020\u0012H\u0016J\b\u0010\f\u001a\u00020\u0013H\u0016J\b\u0010\n\u001a\u00020\u0014H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/yandex/mapkit/styling/transportnavigation/TransportNavigationStyleProvider;", "Lcom/yandex/mapkit/navigation/transport/layer/StyleProvider;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "routeViewStyleProvider", "Lcom/yandex/mapkit/styling/transportnavigation/DefaultRouteViewStyleProvider;", "requestPointStyleProvider", "Lcom/yandex/mapkit/styling/transportnavigation/DefaultRequestPointStyleProvider;", "constructionStyleProvider", "Lcom/yandex/mapkit/styling/transportnavigation/DefaultConstructionStyleProvider;", "userLocationStyleProvider", "Lcom/yandex/mapkit/styling/transportnavigation/DefaultUserLocationStyleProvider;", "balloonImageProvider", "Lcom/yandex/mapkit/styling/transportnavigation/DefaultBalloonImageProvider;", "Lcom/yandex/mapkit/navigation/transport/layer/RouteViewStyleProvider;", "Lcom/yandex/mapkit/navigation/transport/layer/balloons/BalloonImageProvider;", "Lcom/yandex/mapkit/navigation/transport/layer/RequestPointStyleProvider;", "Lcom/yandex/mapkit/navigation/transport/layer/UserLocationStyleProvider;", "Lcom/yandex/mapkit/navigation/transport/layer/ConstructionStyleProvider;", "com.yandex.mapkit.styling.transportnavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public class TransportNavigationStyleProvider implements StyleProvider {
    private final DefaultBalloonImageProvider balloonImageProvider;
    private final DefaultConstructionStyleProvider constructionStyleProvider;
    private final DefaultRequestPointStyleProvider requestPointStyleProvider;
    private final DefaultRouteViewStyleProvider routeViewStyleProvider;
    private final DefaultUserLocationStyleProvider userLocationStyleProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public TransportNavigationStyleProvider(Context context) {
        this.routeViewStyleProvider = new DefaultRouteViewStyleProvider(context);
        this.requestPointStyleProvider = new DefaultRequestPointStyleProvider(context);
        this.constructionStyleProvider = new DefaultConstructionStyleProvider(context);
        this.userLocationStyleProvider = new DefaultUserLocationStyleProvider(context);
        this.balloonImageProvider = new DefaultBalloonImageProvider(context, null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.StyleProvider
    public BalloonImageProvider balloonImageProvider() {
        return this.balloonImageProvider;
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.StyleProvider
    public ConstructionStyleProvider constructionStyleProvider() {
        return this.constructionStyleProvider;
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.StyleProvider
    public RequestPointStyleProvider requestPointStyleProvider() {
        return this.requestPointStyleProvider;
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.StyleProvider
    public RouteViewStyleProvider routeViewStyleProvider() {
        return this.routeViewStyleProvider;
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.StyleProvider
    public UserLocationStyleProvider userLocationStyleProvider() {
        return this.userLocationStyleProvider;
    }
}
