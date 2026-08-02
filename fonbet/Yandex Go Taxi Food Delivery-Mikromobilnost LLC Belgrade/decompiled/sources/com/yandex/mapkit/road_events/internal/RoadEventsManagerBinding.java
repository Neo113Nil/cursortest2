package com.yandex.mapkit.road_events.internal;

import com.yandex.mapkit.GraphLevel;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.road_events.EntrySession;
import com.yandex.mapkit.road_events.EventInfoSession;
import com.yandex.mapkit.road_events.EventTag;
import com.yandex.mapkit.road_events.FeedSession;
import com.yandex.mapkit.road_events.FeedbackSession;
import com.yandex.mapkit.road_events.RoadEventSession;
import com.yandex.mapkit.road_events.RoadEventsManager;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class RoadEventsManagerBinding implements RoadEventsManager {
    private final NativeObject nativeObject;

    public RoadEventsManagerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.road_events.RoadEventsManager
    public native EntrySession addComment(String str, String str2, EntrySession.EntryListener entryListener);

    @Override // com.yandex.mapkit.road_events.RoadEventsManager
    public native RoadEventSession addEvent(EventTag eventTag, String str, Point point, GraphLevel graphLevel, RoadEventSession.RoadEventListener roadEventListener);

    @Override // com.yandex.mapkit.road_events.RoadEventsManager
    public native FeedSession comments(String str);

    @Override // com.yandex.mapkit.road_events.RoadEventsManager
    public native EventInfoSession requestEventInfo(String str, EventInfoSession.EventInfoListener eventInfoListener);

    @Override // com.yandex.mapkit.road_events.RoadEventsManager
    public native FeedbackSession voteDownComment(String str, String str2, FeedbackSession.FeedbackListener feedbackListener);

    @Override // com.yandex.mapkit.road_events.RoadEventsManager
    public native FeedbackSession voteDownEvent(String str, String str2, FeedbackSession.FeedbackListener feedbackListener);

    @Override // com.yandex.mapkit.road_events.RoadEventsManager
    public native FeedbackSession voteUpEvent(String str, FeedbackSession.FeedbackListener feedbackListener);
}
