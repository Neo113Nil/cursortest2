package com.yandex.mapkit.navigation.transport.layer;

import com.yandex.mapkit.navigation.transport.layer.balloons.BalloonImageProvider;

/* loaded from: classes15.dex */
public interface StyleProvider {
    BalloonImageProvider balloonImageProvider();

    ConstructionStyleProvider constructionStyleProvider();

    RequestPointStyleProvider requestPointStyleProvider();

    RouteViewStyleProvider routeViewStyleProvider();

    UserLocationStyleProvider userLocationStyleProvider();
}
