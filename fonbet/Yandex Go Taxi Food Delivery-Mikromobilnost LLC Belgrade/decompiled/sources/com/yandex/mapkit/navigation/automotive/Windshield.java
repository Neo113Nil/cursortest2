package com.yandex.mapkit.navigation.automotive;

import com.yandex.mapkit.directions.driving.Lane;
import java.util.List;

/* loaded from: classes15.dex */
public interface Windshield {
    void addListener(WindshieldListener windshieldListener);

    List<UpcomingDirectionSign> getDirectionSigns();

    List<UpcomingLaneSign> getLaneSigns();

    List<UpcomingManoeuvre> getManoeuvres();

    List<Lane> getNearestLanes();

    List<UpcomingRoadEvent> getRoadEvents();

    List<UpcomingTrafficLightWithSignal> getTrafficLightsWithSignal();

    boolean isValid();

    void removeListener(WindshieldListener windshieldListener);
}
