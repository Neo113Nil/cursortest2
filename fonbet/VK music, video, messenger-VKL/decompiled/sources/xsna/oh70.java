package xsna;

import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingsSectionRedesignDto;

/* compiled from: NotificationSettingsState.kt */
/* loaded from: classes5.dex */
public final class oh70 implements km50 {
    public final boolean b;
    public final boolean c;
    public final gg70 d;
    public final boolean e;
    public final String f;
    public final String g;
    public final NotificationsNotificationSettingsSectionRedesignDto h;
    public final boolean i;
    public final sh20 j;

    public oh70() {
        this(0);
    }

    public static oh70 a(oh70 oh70Var, boolean z, boolean z2, gg70 gg70Var, boolean z3, String str, String str2, NotificationsNotificationSettingsSectionRedesignDto notificationsNotificationSettingsSectionRedesignDto, boolean z4, sh20 sh20Var, int i) {
        if ((i & 1) != 0) {
            z = oh70Var.b;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = oh70Var.c;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            gg70Var = oh70Var.d;
        }
        gg70 gg70Var2 = gg70Var;
        if ((i & 8) != 0) {
            z3 = oh70Var.e;
        }
        boolean z7 = z3;
        if ((i & 16) != 0) {
            str = oh70Var.f;
        }
        String str3 = str;
        String str4 = (i & 32) != 0 ? oh70Var.g : str2;
        NotificationsNotificationSettingsSectionRedesignDto notificationsNotificationSettingsSectionRedesignDto2 = (i & 64) != 0 ? oh70Var.h : notificationsNotificationSettingsSectionRedesignDto;
        boolean z8 = (i & 128) != 0 ? oh70Var.i : z4;
        sh20 sh20Var2 = (i & 256) != 0 ? oh70Var.j : sh20Var;
        oh70Var.getClass();
        return new oh70(z5, z6, gg70Var2, z7, str3, str4, notificationsNotificationSettingsSectionRedesignDto2, z8, sh20Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh70)) {
            return false;
        }
        oh70 oh70Var = (oh70) obj;
        return this.b == oh70Var.b && this.c == oh70Var.c && epx.f(this.d, oh70Var.d) && this.e == oh70Var.e && epx.f(this.f, oh70Var.f) && epx.f(this.g, oh70Var.g) && epx.f(this.h, oh70Var.h) && this.i == oh70Var.i && epx.f(this.j, oh70Var.j);
    }

    public final int hashCode() {
        int b = qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
        gg70 gg70Var = this.d;
        int b2 = qoy.b((b + (gg70Var == null ? 0 : gg70Var.hashCode())) * 31, 31, this.e);
        String str = this.f;
        int hashCode = (b2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        NotificationsNotificationSettingsSectionRedesignDto notificationsNotificationSettingsSectionRedesignDto = this.h;
        int b3 = qoy.b((hashCode2 + (notificationsNotificationSettingsSectionRedesignDto == null ? 0 : notificationsNotificationSettingsSectionRedesignDto.hashCode())) * 31, 31, this.i);
        if (this.j == null) {
            return b3;
        }
        Boolean.hashCode(false);
        throw null;
    }

    public final String toString() {
        return "NotificationSettingsState(isLoading=" + this.b + ", isError=" + this.c + ", data=" + this.d + ", isLEDDialogShown=" + this.e + ", sectionId=" + this.f + ", sectionTitle=" + this.g + ", section=" + this.h + ", headphoneEnabled=" + this.i + ", messengerData=" + this.j + ')';
    }

    public /* synthetic */ oh70(int i) {
        this(false, false, null, false, null, null, null, false, null);
    }

    public oh70(boolean z, boolean z2, gg70 gg70Var, boolean z3, String str, String str2, NotificationsNotificationSettingsSectionRedesignDto notificationsNotificationSettingsSectionRedesignDto, boolean z4, sh20 sh20Var) {
        this.b = z;
        this.c = z2;
        this.d = gg70Var;
        this.e = z3;
        this.f = str;
        this.g = str2;
        this.h = notificationsNotificationSettingsSectionRedesignDto;
        this.i = z4;
        this.j = sh20Var;
    }
}
