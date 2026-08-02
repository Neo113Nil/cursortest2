package xsna;

import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingRedesignDto;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.List;
import xsna.kb70;

/* compiled from: NotificationSettingState.kt */
/* loaded from: classes5.dex */
public final class jf70 implements km50 {
    public final boolean b;
    public final boolean c;
    public final String d;
    public final NotificationsNotificationSettingRedesignDto e;
    public final String f;
    public final kb70.d g;
    public final boolean h;
    public final List<UserProfile> i;
    public final List<Group> j;

    public jf70() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static jf70 a(jf70 jf70Var, boolean z, boolean z2, String str, NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto, String str2, kb70.d dVar, boolean z3, List list, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            z = jf70Var.b;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = jf70Var.c;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            str = jf70Var.d;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            notificationsNotificationSettingRedesignDto = jf70Var.e;
        }
        NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto2 = notificationsNotificationSettingRedesignDto;
        if ((i & 16) != 0) {
            jf70Var.getClass();
        }
        if ((i & 32) != 0) {
            str2 = jf70Var.f;
        }
        String str4 = str2;
        kb70.d dVar2 = (i & 64) != 0 ? jf70Var.g : dVar;
        jf70Var.getClass();
        boolean z6 = (i & 256) != 0 ? jf70Var.h : z3;
        List list2 = (i & 512) != 0 ? jf70Var.i : list;
        List list3 = (i & 1024) != 0 ? jf70Var.j : arrayList;
        jf70Var.getClass();
        return new jf70(z4, z5, str3, notificationsNotificationSettingRedesignDto2, str4, dVar2, z6, list2, list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf70)) {
            return false;
        }
        jf70 jf70Var = (jf70) obj;
        return this.b == jf70Var.b && this.c == jf70Var.c && epx.f(this.d, jf70Var.d) && epx.f(this.e, jf70Var.e) && epx.f(this.f, jf70Var.f) && epx.f(this.g, jf70Var.g) && this.h == jf70Var.h && epx.f(this.i, jf70Var.i) && epx.f(this.j, jf70Var.j);
    }

    public final int hashCode() {
        int b = qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto = this.e;
        int hashCode2 = (hashCode + (notificationsNotificationSettingRedesignDto == null ? 0 : notificationsNotificationSettingRedesignDto.hashCode())) * 961;
        String str2 = this.f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        kb70.d dVar = this.g;
        int b2 = qoy.b(qoy.b((hashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, false), 31, this.h);
        List<UserProfile> list = this.i;
        int hashCode4 = (b2 + (list == null ? 0 : list.hashCode())) * 31;
        List<Group> list2 = this.j;
        return hashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationSettingState(isLoading=");
        sb.append(this.b);
        sb.append(", isError=");
        sb.append(this.c);
        sb.append(", settingId=");
        sb.append(this.d);
        sb.append(", setting=");
        sb.append(this.e);
        sb.append(", localSetting=null, title=");
        sb.append(this.f);
        sb.append(", notification=");
        sb.append(this.g);
        sb.append(", soundSettingActive=false, isSourcesLoading=");
        sb.append(this.h);
        sb.append(", sources=");
        sb.append(this.i);
        sb.append(", groupSources=");
        return ms9.a(')', sb, this.j);
    }

    public /* synthetic */ jf70(int i) {
        this(false, false, null, null, null, null, false, null, null);
    }

    public jf70(boolean z, boolean z2, String str, NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto, String str2, kb70.d dVar, boolean z3, List list, List list2) {
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = notificationsNotificationSettingRedesignDto;
        this.f = str2;
        this.g = dVar;
        this.h = z3;
        this.i = list;
        this.j = list2;
    }
}
