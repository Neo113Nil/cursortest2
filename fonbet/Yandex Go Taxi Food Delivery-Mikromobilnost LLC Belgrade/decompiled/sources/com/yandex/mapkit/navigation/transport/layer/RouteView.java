package com.yandex.mapkit.navigation.transport.layer;

import com.yandex.mapkit.navigation.transport.layer.balloons.BalloonView;
import com.yandex.mapkit.transport.masstransit.Route;
import java.util.List;

/* loaded from: classes7.dex */
public interface RouteView {
    List<BalloonView> getBalloons();

    Route getRoute();

    boolean isValid();
}
