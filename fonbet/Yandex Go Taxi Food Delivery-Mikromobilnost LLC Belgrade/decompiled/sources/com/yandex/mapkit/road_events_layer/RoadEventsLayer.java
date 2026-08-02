package com.yandex.mapkit.road_events_layer;

import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.road_events.EventTag;

/* loaded from: classes15.dex */
public interface RoadEventsLayer {
    void addListener(RoadEventsLayerListener roadEventsLayerListener);

    void deselectRoadEvent();

    void generateRoadEvents(int i, BoundingBox boundingBox);

    Double getGeneratedRoadEventsInterval();

    boolean isRoadEventVisible(EventTag eventTag);

    boolean isValid();

    void removeGeneratedRoadEvents();

    void removeListener(RoadEventsLayerListener roadEventsLayerListener);

    void selectRoadEvent(String str);

    void setGeneratedRoadEventsInterval(Double d);

    void setRoadEventVisible(EventTag eventTag, boolean z);
}
