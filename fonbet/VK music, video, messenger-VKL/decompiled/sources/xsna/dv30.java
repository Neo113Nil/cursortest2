package xsna;

import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.BusinessNotifyInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.messages.Msg;

/* compiled from: MsgPushInfo.kt */
/* loaded from: classes5.dex */
public final class dv30 {
    public final long a;
    public final Dialog b;
    public final Msg c;
    public final BusinessNotifyInfo d;
    public final ProfilesSimpleInfo e;
    public final boolean f;

    public dv30(long j, Dialog dialog, Msg msg, BusinessNotifyInfo businessNotifyInfo, ProfilesSimpleInfo profilesSimpleInfo, boolean z) {
        this.a = j;
        this.b = dialog;
        this.c = msg;
        this.d = businessNotifyInfo;
        this.e = profilesSimpleInfo;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv30)) {
            return false;
        }
        dv30 dv30Var = (dv30) obj;
        return this.a == dv30Var.a && epx.f(this.b, dv30Var.b) && epx.f(this.c, dv30Var.c) && epx.f(this.d, dv30Var.d) && epx.f(this.e, dv30Var.e) && this.f == dv30Var.f;
    }

    public final int hashCode() {
        int a = pn.a(this.c, (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31);
        BusinessNotifyInfo businessNotifyInfo = this.d;
        return Boolean.hashCode(this.f) + io.reactivex.rxjava3.subjects.c.a(this.e, (a + (businessNotifyInfo == null ? 0 : businessNotifyInfo.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPushInfo(ownerId=");
        sb.append(this.a);
        sb.append(", dialog=");
        sb.append(this.b.Sb().longValue());
        sb.append(", msg=");
        sb.append(this.c.d);
        sb.append(", businessNotifyInfo=");
        sb.append(this.d);
        sb.append(", profiles=");
        ProfilesSimpleInfo profilesSimpleInfo = this.e;
        sb.append(new f1e0(profilesSimpleInfo.b.keySet(), profilesSimpleInfo.c.keySet(), profilesSimpleInfo.d.keySet(), profilesSimpleInfo.e.keySet(), profilesSimpleInfo.f.keySet()));
        sb.append(", isEduScheduleSilentModeEnabled=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
