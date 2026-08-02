package com.yandex.mapkit.road_events;

import com.yandex.mapkit.GraphLevel;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.road_events.EntrySession;
import com.yandex.mapkit.road_events.EventInfoSession;
import com.yandex.mapkit.road_events.FeedbackSession;
import com.yandex.mapkit.road_events.RoadEventSession;

/* loaded from: classes15.dex */
public interface RoadEventsManager {
    EntrySession addComment(String str, String str2, EntrySession.EntryListener entryListener);

    RoadEventSession addEvent(EventTag eventTag, String str, Point point, GraphLevel graphLevel, RoadEventSession.RoadEventListener roadEventListener);

    FeedSession comments(String str);

    EventInfoSession requestEventInfo(String str, EventInfoSession.EventInfoListener eventInfoListener);

    FeedbackSession voteDownComment(String str, String str2, FeedbackSession.FeedbackListener feedbackListener);

    FeedbackSession voteDownEvent(String str, String str2, FeedbackSession.FeedbackListener feedbackListener);

    FeedbackSession voteUpEvent(String str, FeedbackSession.FeedbackListener feedbackListener);
}
