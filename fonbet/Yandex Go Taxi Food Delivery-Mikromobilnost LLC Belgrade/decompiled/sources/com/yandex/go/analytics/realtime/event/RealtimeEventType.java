package com.yandex.go.analytics.realtime.event;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/go/analytics/realtime/event/RealtimeEventType;", "", "", "eventName", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Shown", "PartialShown", "Clicked", "Received", "ReceivedTech", "PriorityFiltered", "Closed", "MissedSeen", "Like", "Dislike", "go-client-android.features.analytics:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RealtimeEventType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RealtimeEventType[] $VALUES;
    public static final RealtimeEventType Clicked;
    public static final RealtimeEventType Closed;
    public static final RealtimeEventType Dislike;
    public static final RealtimeEventType Like;
    public static final RealtimeEventType MissedSeen;
    public static final RealtimeEventType PartialShown;
    public static final RealtimeEventType PriorityFiltered;
    public static final RealtimeEventType Received;
    public static final RealtimeEventType ReceivedTech;
    public static final RealtimeEventType Shown;
    private final String eventName;

    static {
        RealtimeEventType realtimeEventType = new RealtimeEventType("Shown", 0, "Seen");
        Shown = realtimeEventType;
        RealtimeEventType realtimeEventType2 = new RealtimeEventType("PartialShown", 1, "SeenPartial");
        PartialShown = realtimeEventType2;
        RealtimeEventType realtimeEventType3 = new RealtimeEventType("Clicked", 2, "Clicked");
        Clicked = realtimeEventType3;
        RealtimeEventType realtimeEventType4 = new RealtimeEventType("Received", 3, "Received");
        Received = realtimeEventType4;
        RealtimeEventType realtimeEventType5 = new RealtimeEventType("ReceivedTech", 4, "ReceivedTech");
        ReceivedTech = realtimeEventType5;
        RealtimeEventType realtimeEventType6 = new RealtimeEventType("PriorityFiltered", 5, "AppFilteredPriority");
        PriorityFiltered = realtimeEventType6;
        RealtimeEventType realtimeEventType7 = new RealtimeEventType("Closed", 6, "Closed");
        Closed = realtimeEventType7;
        RealtimeEventType realtimeEventType8 = new RealtimeEventType("MissedSeen", 7, "MissedSeen");
        MissedSeen = realtimeEventType8;
        RealtimeEventType realtimeEventType9 = new RealtimeEventType("Like", 8, "Like");
        Like = realtimeEventType9;
        RealtimeEventType realtimeEventType10 = new RealtimeEventType("Dislike", 9, "Dislike");
        Dislike = realtimeEventType10;
        RealtimeEventType[] realtimeEventTypeArr = {realtimeEventType, realtimeEventType2, realtimeEventType3, realtimeEventType4, realtimeEventType5, realtimeEventType6, realtimeEventType7, realtimeEventType8, realtimeEventType9, realtimeEventType10};
        $VALUES = realtimeEventTypeArr;
        $ENTRIES = a.a(realtimeEventTypeArr);
    }

    public RealtimeEventType(String str, int i, String str2) {
        this.eventName = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static RealtimeEventType valueOf(String str) {
        return (RealtimeEventType) Enum.valueOf(RealtimeEventType.class, str);
    }

    public static RealtimeEventType[] values() {
        return (RealtimeEventType[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }
}
