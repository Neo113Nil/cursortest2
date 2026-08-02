package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: InviteFriendsAction.kt */
/* loaded from: classes14.dex */
public final class iqx implements gqx {
    public final UserId b;
    public final String c;
    public final String d;

    public iqx(UserId userId, String str, String str2) {
        this.b = userId;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqx)) {
            return false;
        }
        iqx iqxVar = (iqx) obj;
        return epx.f(this.b, iqxVar.b) && epx.f(this.c, iqxVar.c) && epx.f(this.d, iqxVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RevokeInviteClicked(userId=");
        sb.append(this.b);
        sb.append(", userName=");
        sb.append(this.c);
        sb.append(", userPhotoUrl=");
        return ho8.a(sb, this.d, ')');
    }
}
