package xsna;

import com.vk.im.engine.models.channels.ChannelBanInfo;
import com.vk.im.engine.models.channels.ChannelNotificationsSettings;
import com.vk.im.engine.models.groups.AdminLevel;

/* compiled from: ChannelApiModel.kt */
/* loaded from: classes2.dex */
public final class mzq0 {
    public final ChannelNotificationsSettings a;
    public final m7f0 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final ChannelBanInfo f;
    public final Boolean g;
    public final AdminLevel h;
    public final boolean i;
    public final boolean j;

    public mzq0(ChannelNotificationsSettings channelNotificationsSettings, m7f0 m7f0Var, boolean z, boolean z2, boolean z3, ChannelBanInfo channelBanInfo, Boolean bool, AdminLevel adminLevel, boolean z4, boolean z5) {
        this.a = channelNotificationsSettings;
        this.b = m7f0Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = channelBanInfo;
        this.g = bool;
        this.h = adminLevel;
        this.i = z4;
        this.j = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mzq0)) {
            return false;
        }
        mzq0 mzq0Var = (mzq0) obj;
        return epx.f(this.a, mzq0Var.a) && epx.f(this.b, mzq0Var.b) && this.c == mzq0Var.c && this.d == mzq0Var.d && this.e == mzq0Var.e && epx.f(this.f, mzq0Var.f) && epx.f(this.g, mzq0Var.g) && this.h == mzq0Var.h && this.i == mzq0Var.i && this.j == mzq0Var.j;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
        ChannelBanInfo channelBanInfo = this.f;
        int hashCode = (b + (channelBanInfo == null ? 0 : channelBanInfo.hashCode())) * 31;
        Boolean bool = this.g;
        return Boolean.hashCode(this.j) + qoy.b((this.h.hashCode() + ((hashCode + (bool != null ? bool.hashCode() : 0)) * 31)) * 31, 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserSpecific(pushSettings=");
        sb.append(this.a);
        sb.append(", readState=");
        sb.append(this.b);
        sb.append(", isArchived=");
        sb.append(this.c);
        sb.append(", isMember=");
        sb.append(this.d);
        sb.append(", isOwner=");
        sb.append(this.e);
        sb.append(", banInfo=");
        sb.append(this.f);
        sb.append(", canPost=");
        sb.append(this.g);
        sb.append(", adminLevel=");
        sb.append(this.h);
        sb.append(", isHiddenInAllFolder=");
        sb.append(this.i);
        sb.append(", canPostDonut=");
        return defpackage.q0.a(sb, this.j, ')');
    }
}
