package com.yandex.mapkit.road_events_layer.internal;

import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.road_events.EventTag;
import com.yandex.mapkit.road_events_layer.RoadEventsLayer;
import com.yandex.mapkit.road_events_layer.RoadEventsLayerListener;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;

/* loaded from: classes15.dex */
public class RoadEventsLayerBinding implements RoadEventsLayer {
    private final NativeObject nativeObject;
    protected Subscription<RoadEventsLayerListener> roadEventsLayerListenerSubscription = new Subscription<RoadEventsLayerListener>(this) { // from class: com.yandex.mapkit.road_events_layer.internal.RoadEventsLayerBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(RoadEventsLayerListener roadEventsLayerListener) {
            return RoadEventsLayerBinding.createRoadEventsLayerListener(roadEventsLayerListener);
        }
    };

    public RoadEventsLayerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createRoadEventsLayerListener(RoadEventsLayerListener roadEventsLayerListener);

    @Override // com.yandex.mapkit.road_events_layer.RoadEventsLayer
    public native void addListener(RoadEventsLayerListener roadEventsLayerListener);

    @Override // com.yandex.mapkit.road_events_layer.RoadEventsLayer
    public native void deselectRoadEvent();

    @Override // com.yandex.mapkit.road_events_layer.RoadEventsLayer
    public native void generateRoadEvents(int i, BoundingBox boundingBox);

    @Override // com.yandex.mapkit.road_events_layer.RoadEventsLayer
    public native Double getGeneratedRoadEventsInterval();

    @Override // com.yandex.mapkit.road_events_layer.RoadEventsLayer
    public native boolean isRoadEventVisible(EventTag eventTag);

    @Override // com.yandex.mapkit.road_events_layer.RoadEventsLayer
    public native boolean isValid();

    @Override // com.yandex.mapkit.road_events_layer.RoadEventsLayer
    public native void removeGeneratedRoadEvents();

    @Override // com.yandex.mapkit.road_events_layer.RoadEventsLayer
    public native void removeListener(RoadEventsLayerListener roadEventsLayerListener);

    @Override // com.yandex.mapkit.road_events_layer.RoadEventsLayer
    public native void selectRoadEvent(String str);

    @Override // com.yandex.mapkit.road_events_layer.RoadEventsLayer
    public native void setGeneratedRoadEventsInterval(Double d);

    @Override // com.yandex.mapkit.road_events_layer.RoadEventsLayer
    public native void setRoadEventVisible(EventTag eventTag, boolean z);
}
