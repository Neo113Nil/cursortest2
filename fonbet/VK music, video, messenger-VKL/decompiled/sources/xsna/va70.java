package xsna;

import core.NotificationBannerScheduleRepeat;
import java.util.List;

/* compiled from: NotificationListConfig.kt */
/* loaded from: classes8.dex */
public final class va70 {
    public final List<Integer> a;
    public final NotificationBannerScheduleRepeat b;

    public va70() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof va70)) {
            return false;
        }
        va70 va70Var = (va70) obj;
        return epx.f(this.a, va70Var.a) && this.b == va70Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NotificationListConfig(notificationListResubscribeBannerShowIntervalInDays=" + this.a + ", notificationListResubscribeBannerRepeat=" + this.b + ')';
    }

    public va70(List<Integer> list, NotificationBannerScheduleRepeat notificationBannerScheduleRepeat) {
        this.a = list;
        this.b = notificationBannerScheduleRepeat;
    }

    public /* synthetic */ va70(int i) {
        this(e43.l(0, 1, 3, 10, 30, 60, 90), NotificationBannerScheduleRepeat.STOP);
    }
}
