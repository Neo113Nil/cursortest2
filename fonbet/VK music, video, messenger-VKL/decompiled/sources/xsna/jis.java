package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.friends.groupinvite.impl.models.FriendInvitationState;

/* compiled from: FriendModel.kt */
/* loaded from: classes14.dex */
public final class jis {
    public final UserId a;
    public final String b;
    public final String c;
    public final FriendInvitationState d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public jis(UserId userId, String str, String str2, FriendInvitationState friendInvitationState, boolean z, boolean z2, boolean z3) {
        this.a = userId;
        this.b = str;
        this.c = str2;
        this.d = friendInvitationState;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public static jis a(jis jisVar, FriendInvitationState friendInvitationState, boolean z, boolean z2, int i) {
        UserId userId = jisVar.a;
        String str = jisVar.b;
        String str2 = jisVar.c;
        if ((i & 8) != 0) {
            friendInvitationState = jisVar.d;
        }
        FriendInvitationState friendInvitationState2 = friendInvitationState;
        if ((i & 16) != 0) {
            z = jisVar.e;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = jisVar.f;
        }
        return new jis(userId, str, str2, friendInvitationState2, z3, z2, jisVar.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jis)) {
            return false;
        }
        jis jisVar = (jis) obj;
        return epx.f(this.a, jisVar.a) && epx.f(this.b, jisVar.b) && epx.f(this.c, jisVar.c) && this.d == jisVar.d && this.e == jisVar.e && this.f == jisVar.f && this.g == jisVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + qoy.b(qoy.b((this.d.hashCode() + urd0.a(urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendModel(id=");
        sb.append(this.a);
        sb.append(", photoUrl=");
        sb.append(this.b);
        sb.append(", username=");
        sb.append(this.c);
        sb.append(", invitationState=");
        sb.append(this.d);
        sb.append(", isSelected=");
        sb.append(this.e);
        sb.append(", isEnabled=");
        sb.append(this.f);
        sb.append(", canBeInvited=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
