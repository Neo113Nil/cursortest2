package com.yandex.mapkit.navigation.automotive.layer;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import java.util.List;

/* loaded from: classes7.dex */
public interface RouteView {
    List<BalloonView> getBalloonViews();

    DrivingRoute getRoute();

    boolean isValid();
}
