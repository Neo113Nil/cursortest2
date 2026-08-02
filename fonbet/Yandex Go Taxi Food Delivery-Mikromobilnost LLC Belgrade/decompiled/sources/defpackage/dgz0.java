package defpackage;

import ru.yandex.taxi.notifications.tips.TipsNotificationAnalytics$NotificationState;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class dgz0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TipsNotificationAnalytics$NotificationState.values().length];
        try {
            iArr[TipsNotificationAnalytics$NotificationState.HEADS_UP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TipsNotificationAnalytics$NotificationState.SMALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TipsNotificationAnalytics$NotificationState.BIG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
