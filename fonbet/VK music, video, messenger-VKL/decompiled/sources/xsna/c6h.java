package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.profile.community.details.api.invitelink.data.dto.CommunityInviteLink;
import java.util.List;

/* compiled from: CommunityInviteLinkPreview.kt */
/* loaded from: classes5.dex */
public final class c6h {
    public final CommunityInviteLink a;
    public final int b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final String g;
    public final boolean h;
    public final UserId i;
    public final List<d6h> j;

    public c6h(CommunityInviteLink communityInviteLink, int i, String str, boolean z, boolean z2, String str2, String str3, boolean z3, UserId userId, List<d6h> list) {
        this.a = communityInviteLink;
        this.b = i;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = str2;
        this.g = str3;
        this.h = z3;
        this.i = userId;
        this.j = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6h)) {
            return false;
        }
        c6h c6hVar = (c6h) obj;
        return epx.f(this.a, c6hVar.a) && this.b == c6hVar.b && epx.f(this.c, c6hVar.c) && this.d == c6hVar.d && this.e == c6hVar.e && epx.f(this.f, c6hVar.f) && epx.f(this.g, c6hVar.g) && this.h == c6hVar.h && epx.f(this.i, c6hVar.i) && epx.f(this.j, c6hVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + bh10.a(qoy.b(urd0.a(urd0.a(qoy.b(qoy.b(urd0.a(shy.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityInviteLinkPreview(inviteLink=");
        sb.append(this.a);
        sb.append(", membersCount=");
        sb.append(this.b);
        sb.append(", groupActivity=");
        sb.append(this.c);
        sb.append(", hasBanInfo=");
        sb.append(this.d);
        sb.append(", isPrivateGroup=");
        sb.append(this.e);
        sb.append(", groupPhoto=");
        sb.append(this.f);
        sb.append(", groupName=");
        sb.append(this.g);
        sb.append(", isMember=");
        sb.append(this.h);
        sb.append(", groupId=");
        sb.append(this.i);
        sb.append(", profilesPhotos=");
        return ms9.a(')', sb, this.j);
    }
}
