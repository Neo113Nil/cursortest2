package xsna;

import com.vk.api.generated.notifications.dto.NotificationsGetRedesignSettingsResponseDto;

/* compiled from: NotificationSettingsData.kt */
/* loaded from: classes5.dex */
public final class gg70 {
    public final boolean a;
    public final NotificationsGetRedesignSettingsResponseDto b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final Integer g;

    public gg70(boolean z, NotificationsGetRedesignSettingsResponseDto notificationsGetRedesignSettingsResponseDto, boolean z2, boolean z3, boolean z4, int i, Integer num) {
        this.a = z;
        this.b = notificationsGetRedesignSettingsResponseDto;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = i;
        this.g = num;
    }

    public static gg70 a(gg70 gg70Var, boolean z, NotificationsGetRedesignSettingsResponseDto notificationsGetRedesignSettingsResponseDto, boolean z2, boolean z3, int i, Integer num, int i2) {
        if ((i2 & 1) != 0) {
            z = gg70Var.a;
        }
        boolean z4 = z;
        if ((i2 & 2) != 0) {
            notificationsGetRedesignSettingsResponseDto = gg70Var.b;
        }
        NotificationsGetRedesignSettingsResponseDto notificationsGetRedesignSettingsResponseDto2 = notificationsGetRedesignSettingsResponseDto;
        boolean z5 = gg70Var.c;
        if ((i2 & 8) != 0) {
            z2 = gg70Var.d;
        }
        boolean z6 = z2;
        if ((i2 & 16) != 0) {
            z3 = gg70Var.e;
        }
        boolean z7 = z3;
        if ((i2 & 32) != 0) {
            i = gg70Var.f;
        }
        int i3 = i;
        if ((i2 & 64) != 0) {
            num = gg70Var.g;
        }
        gg70Var.getClass();
        return new gg70(z4, notificationsGetRedesignSettingsResponseDto2, z5, z6, z7, i3, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gg70)) {
            return false;
        }
        gg70 gg70Var = (gg70) obj;
        return this.a == gg70Var.a && epx.f(this.b, gg70Var.b) && this.c == gg70Var.c && this.d == gg70Var.d && this.e == gg70Var.e && this.f == gg70Var.f && epx.f(this.g, gg70Var.g);
    }

    public final int hashCode() {
        int a = shy.a(this.f, qoy.b(qoy.b(qoy.b((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31);
        Integer num = this.g;
        return a + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationSettingsData(arePushesEnabled=");
        sb.append(this.a);
        sb.append(", sections=");
        sb.append(this.b);
        sb.append(", areMultiAccountSettingEnabled=");
        sb.append(this.c);
        sb.append(", areMultiAccountPushEnabled=");
        sb.append(this.d);
        sb.append(", isLEDEnabled=");
        sb.append(this.e);
        sb.append(", ledColor=");
        sb.append(this.f);
        sb.append(", dndUntil=");
        return uqi.b(sb, this.g, ')');
    }
}
