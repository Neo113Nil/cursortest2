package xsna;

import com.vk.api.generated.notifications.dto.NotificationsEditRedesignPushSettingValueDto;

/* compiled from: ChangeManagedGroupNotificationStatusCmd.kt */
/* loaded from: classes2.dex */
public final class dsa extends le6<s3q0> {
    public final boolean b;
    public final boolean c = true;
    public final String d;

    public dsa(boolean z, String str) {
        this.b = z;
        this.d = str;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        String str;
        boolean z = this.c;
        boolean z2 = this.b;
        if (z) {
            bz2.c(new vh00(z2), null);
            if (z2 && !w2wVar.I0().l().a() && (str = this.d) != null) {
                bz2.d(new s101().y(str, "groups_messages_pushes", NotificationsEditRedesignPushSettingValueDto.ON));
            }
        } else {
            boolean z3 = !z2;
            w2wVar.I0().l().g(z3);
            w2wVar.e1(this, new e780(this, z3));
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsa)) {
            return false;
        }
        dsa dsaVar = (dsa) obj;
        dsaVar.getClass();
        return this.b == dsaVar.b && this.c == dsaVar.c && epx.f(this.d, dsaVar.d);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        throw null;
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeManagedGroupNotificationStatusCmd(group=null, turnOn=");
        sb.append(this.b);
        sb.append(", isUpdatedByUser=");
        sb.append(this.c);
        sb.append(", deviceId=");
        return ho8.a(sb, this.d, ')');
    }
}
