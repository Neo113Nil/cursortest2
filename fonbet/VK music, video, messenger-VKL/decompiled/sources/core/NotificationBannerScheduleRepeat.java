package core;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationBannerScheduleRepeat.kt */
/* loaded from: classes8.dex */
public final class NotificationBannerScheduleRepeat {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NotificationBannerScheduleRepeat[] $VALUES;
    public static final NotificationBannerScheduleRepeat CYCLE;
    public static final NotificationBannerScheduleRepeat REPEAT_LAST;
    public static final NotificationBannerScheduleRepeat STOP;

    static {
        NotificationBannerScheduleRepeat notificationBannerScheduleRepeat = new NotificationBannerScheduleRepeat("STOP", 0);
        STOP = notificationBannerScheduleRepeat;
        NotificationBannerScheduleRepeat notificationBannerScheduleRepeat2 = new NotificationBannerScheduleRepeat("REPEAT_LAST", 1);
        REPEAT_LAST = notificationBannerScheduleRepeat2;
        NotificationBannerScheduleRepeat notificationBannerScheduleRepeat3 = new NotificationBannerScheduleRepeat("CYCLE", 2);
        CYCLE = notificationBannerScheduleRepeat3;
        NotificationBannerScheduleRepeat[] notificationBannerScheduleRepeatArr = {notificationBannerScheduleRepeat, notificationBannerScheduleRepeat2, notificationBannerScheduleRepeat3};
        $VALUES = notificationBannerScheduleRepeatArr;
        $ENTRIES = new asp(notificationBannerScheduleRepeatArr);
    }

    public NotificationBannerScheduleRepeat() {
        throw null;
    }

    public static NotificationBannerScheduleRepeat valueOf(String str) {
        return (NotificationBannerScheduleRepeat) Enum.valueOf(NotificationBannerScheduleRepeat.class, str);
    }

    public static NotificationBannerScheduleRepeat[] values() {
        return (NotificationBannerScheduleRepeat[]) $VALUES.clone();
    }
}
