package com.yandex.mapkit.styling.roadevents.internal;

import com.yandex.mapkit.road_events.EventTag;
import com.yandex.mapkit.road_events_layer.RoadEventSignificance;
import com.yandex.messaging.domain.poll.PollMessageDraft;
import java.util.EnumMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.b;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0000¨\u0006\u0004"}, d2 = {"createRoadEventsTagToStyle", "", "Lcom/yandex/mapkit/road_events/EventTag;", "Lcom/yandex/mapkit/styling/roadevents/internal/TagStyle;", "com.yandex.mapkit.styling.roadevents_internalRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RoadEventsTagUtilsKt {
    public static final Map<EventTag, TagStyle> createRoadEventsTagToStyle() {
        EnumMap enumMap = new EnumMap(EventTag.class);
        RoadEventSignificance roadEventSignificance = RoadEventSignificance.MAJOR;
        Pair pair = new Pair(roadEventSignificance, 15);
        RoadEventSignificance roadEventSignificance2 = RoadEventSignificance.MINOR;
        Map i = b.i(pair, new Pair(roadEventSignificance2, 16));
        enumMap.put((EnumMap) EventTag.OTHER, (EventTag) new TagStyle(10, "other", i));
        enumMap.put((EnumMap) EventTag.CHAT, (EventTag) new TagStyle(30, "chat", i));
        enumMap.put((EnumMap) EventTag.LOCAL_CHAT, (EventTag) new TagStyle(35, "chat", i));
        Map i2 = b.i(new Pair(roadEventSignificance, 14), new Pair(roadEventSignificance2, 16));
        enumMap.put((EnumMap) EventTag.POLICE, (EventTag) new TagStyle(20, "police", i2));
        enumMap.put((EnumMap) EventTag.DANGER, (EventTag) new TagStyle(40, "danger", i2));
        enumMap.put((EnumMap) EventTag.NO_STOPPING_CONTROL, (EventTag) new TagStyle(100, "no_stopping_control", i2));
        enumMap.put((EnumMap) EventTag.ROAD_MARKING_CONTROL, (EventTag) new TagStyle(110, "lane_control", i2));
        enumMap.put((EnumMap) EventTag.CROSS_ROAD_CONTROL, (EventTag) new TagStyle(120, "cross_road_control", i2));
        enumMap.put((EnumMap) EventTag.LANE_CONTROL, (EventTag) new TagStyle(130, "lane_control", i2));
        enumMap.put((EnumMap) EventTag.SCHOOL, (EventTag) new TagStyle(150, "school", i2));
        RoadEventSignificance roadEventSignificance3 = RoadEventSignificance.CRUCIAL;
        Map i3 = b.i(new Pair(roadEventSignificance3, 13), new Pair(roadEventSignificance, 14), new Pair(roadEventSignificance2, 16));
        enumMap.put((EnumMap) EventTag.MOBILE_CONTROL, (EventTag) new TagStyle(90, "mobile_control", i3));
        enumMap.put((EnumMap) EventTag.SPEED_CONTROL, (EventTag) new TagStyle(PollMessageDraft.MAX_ANSWER_LENGTH, "speed_control", i3));
        enumMap.put((EnumMap) EventTag.TRAFFIC_CONTROL, (EventTag) new TagStyle(141, "speed_control", i3));
        enumMap.put((EnumMap) EventTag.POLICE_PATROL, (EventTag) new TagStyle(142, "mobile_control", i3));
        Map i4 = b.i(new Pair(roadEventSignificance3, 9), new Pair(roadEventSignificance, 14), new Pair(roadEventSignificance2, 16));
        enumMap.put((EnumMap) EventTag.ACCIDENT, (EventTag) new TagStyle(50, "accident", i4));
        enumMap.put((EnumMap) EventTag.RECONSTRUCTION, (EventTag) new TagStyle(60, "reconstruction", i4));
        enumMap.put((EnumMap) EventTag.DRAWBRIDGE, (EventTag) new TagStyle(70, "drawbridge", i4));
        enumMap.put((EnumMap) EventTag.CLOSED, (EventTag) new TagStyle(80, "closed", b.i(new Pair(roadEventSignificance3, 8), new Pair(roadEventSignificance, 14), new Pair(roadEventSignificance2, 16))));
        return enumMap;
    }
}
