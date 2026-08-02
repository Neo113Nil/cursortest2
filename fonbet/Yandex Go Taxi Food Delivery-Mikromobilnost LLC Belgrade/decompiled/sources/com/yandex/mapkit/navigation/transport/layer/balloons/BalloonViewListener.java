package com.yandex.mapkit.navigation.transport.layer.balloons;

import com.yandex.mapkit.navigation.transport.layer.RouteView;

/* loaded from: classes7.dex */
public interface BalloonViewListener {
    void onBalloonContentChanged(BalloonView balloonView);

    void onBalloonViewTap(BalloonView balloonView);

    void onBalloonViewsChanged(RouteView routeView);

    void onBalloonVisibilityChanged(BalloonView balloonView);
}
