package com.yandex.mapkit.navigation.transport.layer.balloons;

import com.yandex.mapkit.navigation.balloons.BalloonAnchor;
import com.yandex.mapkit.transport.masstransit.Route;

/* loaded from: classes15.dex */
public interface BalloonView {
    BalloonAnchor getAnchor();

    Balloon getBalloon();

    Route getHostRoute();

    boolean isIsEnabled();

    boolean isIsVisible();

    boolean isValid();

    void setIsEnabled(boolean z);
}
