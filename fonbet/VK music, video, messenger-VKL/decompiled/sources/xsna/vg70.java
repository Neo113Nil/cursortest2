package xsna;

import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingsSectionRedesignDto;

/* compiled from: NotificationSettingsPatch.kt */
/* loaded from: classes5.dex */
public final class vg70 implements ug70 {
    public final NotificationsNotificationSettingsSectionRedesignDto b;
    public final boolean c;

    public vg70(NotificationsNotificationSettingsSectionRedesignDto notificationsNotificationSettingsSectionRedesignDto, boolean z) {
        this.b = notificationsNotificationSettingsSectionRedesignDto;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vg70)) {
            return false;
        }
        vg70 vg70Var = (vg70) obj;
        return epx.f(this.b, vg70Var.b) && this.c == vg70Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataLoaded(section=");
        sb.append(this.b);
        sb.append(", headsetNotificationEnabled=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
