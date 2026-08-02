package com.yandex.mapkit.road_events_layer;

import com.yandex.mapkit.road_events.EventTag;
import java.util.List;

/* loaded from: classes15.dex */
public interface RoadEventStylingProperties {
    List<EventTag> getTags();

    boolean hasSignificanceGreaterOrEqual(RoadEventSignificance roadEventSignificance);

    boolean isInFuture();

    boolean isOnRoute();

    boolean isSelected();

    boolean isUserEvent();

    boolean isValid();
}
