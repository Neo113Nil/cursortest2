package com.yandex.go.navigator.events;

import com.yandex.mapkit.road_events_layer.RoadEventSignificance;
import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.k4o;
import defpackage.tb50;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lcom/yandex/go/navigator/events/NavigatorTag;", "", "", "priority", CA20Status.STATUS_USER_I, "a", "()I", "", "Lcom/yandex/mapkit/road_events_layer/RoadEventSignificance;", "significanceToZoomMin", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "POLICE", "ACCIDENT", "RECONSTRUCTION", "OTHER", "CHAT", "LOCAL_CHAT", "DANGER", "CLOSED", "DRAWBRIDGE", "SCHOOL", "OVERTAKING_DANGER", "CROSS_ROAD_DANGER", "PEDESTRIAN_DANGER", "MOBILE_CONTROL", "SPEED_CONTROL", "CROSS_ROAD_CONTROL", "LANE_CONTROL", "ROAD_MARKING_CONTROL", "NO_STOPPING_CONTROL", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NavigatorTag {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NavigatorTag[] $VALUES;
    public static final NavigatorTag ACCIDENT;
    public static final NavigatorTag CHAT;
    public static final NavigatorTag CLOSED;
    public static final NavigatorTag CROSS_ROAD_CONTROL;
    public static final NavigatorTag CROSS_ROAD_DANGER;
    public static final NavigatorTag DANGER;
    public static final NavigatorTag DRAWBRIDGE;
    public static final NavigatorTag LANE_CONTROL;
    public static final NavigatorTag LOCAL_CHAT;
    public static final NavigatorTag MOBILE_CONTROL;
    public static final NavigatorTag NO_STOPPING_CONTROL;
    public static final NavigatorTag OTHER;
    public static final NavigatorTag OVERTAKING_DANGER;
    public static final NavigatorTag PEDESTRIAN_DANGER;
    public static final NavigatorTag POLICE;
    public static final NavigatorTag RECONSTRUCTION;
    public static final NavigatorTag ROAD_MARKING_CONTROL;
    public static final NavigatorTag SCHOOL;
    public static final NavigatorTag SPEED_CONTROL;
    private final int priority;
    private final Map<RoadEventSignificance, Integer> significanceToZoomMin;

    static {
        LinkedHashMap linkedHashMap = tb50.d;
        NavigatorTag navigatorTag = new NavigatorTag("POLICE", 0, 100, linkedHashMap);
        POLICE = navigatorTag;
        NavigatorTag navigatorTag2 = new NavigatorTag("ACCIDENT", 1, 50, linkedHashMap);
        ACCIDENT = navigatorTag2;
        NavigatorTag navigatorTag3 = new NavigatorTag("RECONSTRUCTION", 2, 10, linkedHashMap);
        RECONSTRUCTION = navigatorTag3;
        LinkedHashMap linkedHashMap2 = tb50.a;
        NavigatorTag navigatorTag4 = new NavigatorTag("OTHER", 3, 10, linkedHashMap2);
        OTHER = navigatorTag4;
        NavigatorTag navigatorTag5 = new NavigatorTag("CHAT", 4, 30, linkedHashMap2);
        CHAT = navigatorTag5;
        NavigatorTag navigatorTag6 = new NavigatorTag("LOCAL_CHAT", 5, 30, linkedHashMap2);
        LOCAL_CHAT = navigatorTag6;
        LinkedHashMap linkedHashMap3 = tb50.b;
        NavigatorTag navigatorTag7 = new NavigatorTag("DANGER", 6, 40, linkedHashMap3);
        DANGER = navigatorTag7;
        NavigatorTag navigatorTag8 = new NavigatorTag("CLOSED", 7, 80, tb50.e);
        CLOSED = navigatorTag8;
        NavigatorTag navigatorTag9 = new NavigatorTag("DRAWBRIDGE", 8, 70, linkedHashMap);
        DRAWBRIDGE = navigatorTag9;
        NavigatorTag navigatorTag10 = new NavigatorTag("SCHOOL", 9, 70, linkedHashMap3);
        SCHOOL = navigatorTag10;
        NavigatorTag navigatorTag11 = new NavigatorTag("OVERTAKING_DANGER", 10, 70, linkedHashMap3);
        OVERTAKING_DANGER = navigatorTag11;
        NavigatorTag navigatorTag12 = new NavigatorTag("CROSS_ROAD_DANGER", 11, 70, linkedHashMap3);
        CROSS_ROAD_DANGER = navigatorTag12;
        NavigatorTag navigatorTag13 = new NavigatorTag("PEDESTRIAN_DANGER", 12, 70, linkedHashMap3);
        PEDESTRIAN_DANGER = navigatorTag13;
        NavigatorTag navigatorTag14 = new NavigatorTag("MOBILE_CONTROL", 13, 100, linkedHashMap);
        MOBILE_CONTROL = navigatorTag14;
        LinkedHashMap linkedHashMap4 = tb50.c;
        NavigatorTag navigatorTag15 = new NavigatorTag("SPEED_CONTROL", 14, PollMessageDraft.MAX_ANSWER_LENGTH, linkedHashMap4);
        SPEED_CONTROL = navigatorTag15;
        NavigatorTag navigatorTag16 = new NavigatorTag("CROSS_ROAD_CONTROL", 15, 130, linkedHashMap4);
        CROSS_ROAD_CONTROL = navigatorTag16;
        NavigatorTag navigatorTag17 = new NavigatorTag("LANE_CONTROL", 16, 130, linkedHashMap4);
        LANE_CONTROL = navigatorTag17;
        NavigatorTag navigatorTag18 = new NavigatorTag("ROAD_MARKING_CONTROL", 17, 110, linkedHashMap4);
        ROAD_MARKING_CONTROL = navigatorTag18;
        NavigatorTag navigatorTag19 = new NavigatorTag("NO_STOPPING_CONTROL", 18, 100, linkedHashMap4);
        NO_STOPPING_CONTROL = navigatorTag19;
        NavigatorTag[] navigatorTagArr = {navigatorTag, navigatorTag2, navigatorTag3, navigatorTag4, navigatorTag5, navigatorTag6, navigatorTag7, navigatorTag8, navigatorTag9, navigatorTag10, navigatorTag11, navigatorTag12, navigatorTag13, navigatorTag14, navigatorTag15, navigatorTag16, navigatorTag17, navigatorTag18, navigatorTag19};
        $VALUES = navigatorTagArr;
        $ENTRIES = kotlin.enums.a.a(navigatorTagArr);
    }

    public NavigatorTag(String str, int i, int i2, Map map) {
        this.priority = i2;
        this.significanceToZoomMin = map;
    }

    public static NavigatorTag valueOf(String str) {
        return (NavigatorTag) Enum.valueOf(NavigatorTag.class, str);
    }

    public static NavigatorTag[] values() {
        return (NavigatorTag[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    /* renamed from: b, reason: from getter */
    public final Map getSignificanceToZoomMin() {
        return this.significanceToZoomMin;
    }
}
