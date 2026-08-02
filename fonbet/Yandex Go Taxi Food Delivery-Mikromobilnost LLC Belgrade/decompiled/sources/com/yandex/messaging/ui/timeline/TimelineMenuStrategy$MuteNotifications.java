package com.yandex.messaging.ui.timeline;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/messaging/ui/timeline/TimelineMenuStrategy$MuteNotifications", "", "Lcom/yandex/messaging/ui/timeline/TimelineMenuStrategy$MuteNotifications;", "NOT_SHOW_ITEM", "ENABLE_NOTIFICATIONS", "DISABLE_NOTIFICATIONS", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TimelineMenuStrategy$MuteNotifications {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TimelineMenuStrategy$MuteNotifications[] $VALUES;
    public static final TimelineMenuStrategy$MuteNotifications DISABLE_NOTIFICATIONS;
    public static final TimelineMenuStrategy$MuteNotifications ENABLE_NOTIFICATIONS;
    public static final TimelineMenuStrategy$MuteNotifications NOT_SHOW_ITEM;

    static {
        TimelineMenuStrategy$MuteNotifications timelineMenuStrategy$MuteNotifications = new TimelineMenuStrategy$MuteNotifications("NOT_SHOW_ITEM", 0);
        NOT_SHOW_ITEM = timelineMenuStrategy$MuteNotifications;
        TimelineMenuStrategy$MuteNotifications timelineMenuStrategy$MuteNotifications2 = new TimelineMenuStrategy$MuteNotifications("ENABLE_NOTIFICATIONS", 1);
        ENABLE_NOTIFICATIONS = timelineMenuStrategy$MuteNotifications2;
        TimelineMenuStrategy$MuteNotifications timelineMenuStrategy$MuteNotifications3 = new TimelineMenuStrategy$MuteNotifications("DISABLE_NOTIFICATIONS", 2);
        DISABLE_NOTIFICATIONS = timelineMenuStrategy$MuteNotifications3;
        TimelineMenuStrategy$MuteNotifications[] timelineMenuStrategy$MuteNotificationsArr = {timelineMenuStrategy$MuteNotifications, timelineMenuStrategy$MuteNotifications2, timelineMenuStrategy$MuteNotifications3};
        $VALUES = timelineMenuStrategy$MuteNotificationsArr;
        $ENTRIES = kotlin.enums.a.a(timelineMenuStrategy$MuteNotificationsArr);
    }

    public static TimelineMenuStrategy$MuteNotifications valueOf(String str) {
        return (TimelineMenuStrategy$MuteNotifications) Enum.valueOf(TimelineMenuStrategy$MuteNotifications.class, str);
    }

    public static TimelineMenuStrategy$MuteNotifications[] values() {
        return (TimelineMenuStrategy$MuteNotifications[]) $VALUES.clone();
    }
}
