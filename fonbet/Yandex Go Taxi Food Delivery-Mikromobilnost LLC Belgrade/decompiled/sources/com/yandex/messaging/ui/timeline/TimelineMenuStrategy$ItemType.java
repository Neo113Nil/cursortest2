package com.yandex.messaging.ui.timeline;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/yandex/messaging/ui/timeline/TimelineMenuStrategy$ItemType", "", "Lcom/yandex/messaging/ui/timeline/TimelineMenuStrategy$ItemType;", "NOT_SHOW_ITEM", "CHAT", "CHANNEL", "CHAT_WITH_PERSON", "THREAD", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TimelineMenuStrategy$ItemType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TimelineMenuStrategy$ItemType[] $VALUES;
    public static final TimelineMenuStrategy$ItemType CHANNEL;
    public static final TimelineMenuStrategy$ItemType CHAT;
    public static final TimelineMenuStrategy$ItemType CHAT_WITH_PERSON;
    public static final TimelineMenuStrategy$ItemType NOT_SHOW_ITEM;
    public static final TimelineMenuStrategy$ItemType THREAD;

    static {
        TimelineMenuStrategy$ItemType timelineMenuStrategy$ItemType = new TimelineMenuStrategy$ItemType("NOT_SHOW_ITEM", 0);
        NOT_SHOW_ITEM = timelineMenuStrategy$ItemType;
        TimelineMenuStrategy$ItemType timelineMenuStrategy$ItemType2 = new TimelineMenuStrategy$ItemType("CHAT", 1);
        CHAT = timelineMenuStrategy$ItemType2;
        TimelineMenuStrategy$ItemType timelineMenuStrategy$ItemType3 = new TimelineMenuStrategy$ItemType("CHANNEL", 2);
        CHANNEL = timelineMenuStrategy$ItemType3;
        TimelineMenuStrategy$ItemType timelineMenuStrategy$ItemType4 = new TimelineMenuStrategy$ItemType("CHAT_WITH_PERSON", 3);
        CHAT_WITH_PERSON = timelineMenuStrategy$ItemType4;
        TimelineMenuStrategy$ItemType timelineMenuStrategy$ItemType5 = new TimelineMenuStrategy$ItemType("THREAD", 4);
        THREAD = timelineMenuStrategy$ItemType5;
        TimelineMenuStrategy$ItemType[] timelineMenuStrategy$ItemTypeArr = {timelineMenuStrategy$ItemType, timelineMenuStrategy$ItemType2, timelineMenuStrategy$ItemType3, timelineMenuStrategy$ItemType4, timelineMenuStrategy$ItemType5};
        $VALUES = timelineMenuStrategy$ItemTypeArr;
        $ENTRIES = kotlin.enums.a.a(timelineMenuStrategy$ItemTypeArr);
    }

    public static TimelineMenuStrategy$ItemType valueOf(String str) {
        return (TimelineMenuStrategy$ItemType) Enum.valueOf(TimelineMenuStrategy$ItemType.class, str);
    }

    public static TimelineMenuStrategy$ItemType[] values() {
        return (TimelineMenuStrategy$ItemType[]) $VALUES.clone();
    }
}
