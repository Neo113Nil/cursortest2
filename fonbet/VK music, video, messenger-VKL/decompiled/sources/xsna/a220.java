package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.profile.community.members.api.CommunityMembersFilter;

/* compiled from: MembersStore.kt */
/* loaded from: classes5.dex */
public final class a220 {
    public final UserId a;
    public final CommunityMembersFilter b;
    public final hah c;
    public final fah d;
    public final boolean e;
    public final qwn f;

    public a220(UserId userId, CommunityMembersFilter communityMembersFilter, hah hahVar, fah fahVar, boolean z) {
        qwn qwnVar = new qwn(userId);
        this.a = userId;
        this.b = communityMembersFilter;
        this.c = hahVar;
        this.d = fahVar;
        this.e = z;
        this.f = qwnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a220)) {
            return false;
        }
        a220 a220Var = (a220) obj;
        return epx.f(this.a, a220Var.a) && this.b == a220Var.b && this.c.equals(a220Var.c) && this.d.equals(a220Var.d) && this.e == a220Var.e && this.f.equals(a220Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + qoy.b((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        return "MembersDeps(groupId=" + this.a + ", filter=" + this.b + ", membersInteractor=" + this.c + ", donutBannerInteractor=" + this.d + ", isDonVisibilityEnabled=" + this.e + ", donutBannerAnalytics=" + this.f + ')';
    }
}
