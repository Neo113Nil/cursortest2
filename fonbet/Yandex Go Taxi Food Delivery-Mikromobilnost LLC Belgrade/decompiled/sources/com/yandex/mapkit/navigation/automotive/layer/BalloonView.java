package com.yandex.mapkit.navigation.automotive.layer;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.navigation.balloons.BalloonAnchor;

/* loaded from: classes15.dex */
public interface BalloonView {
    BalloonAnchor getAnchor();

    Balloon getBalloon();

    DrivingRoute getHostRoute();

    boolean isIsEnabled();

    boolean isIsVisible();

    boolean isValid();

    void setIsEnabled(boolean z);
}
