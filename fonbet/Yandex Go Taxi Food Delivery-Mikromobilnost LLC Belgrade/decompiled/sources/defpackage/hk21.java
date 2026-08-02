package defpackage;

import com.apollographql.apollo3.api.c;

/* loaded from: classes2.dex */
public final class hk21 implements ejg0 {
    public final String a;

    public hk21(String str) {
        this.a = str;
    }

    @Override // defpackage.fc70
    public final void a(bfx bfxVar, c cVar) {
        bfxVar.A1("id");
        foe foeVar = l80.a;
        bfxVar.r0(this.a);
    }

    @Override // defpackage.fc70
    public final ep60 adapter() {
        return l80.a(jk21.a);
    }

    @Override // defpackage.fc70
    public final String b() {
        return "query UserAvatar($id: ID!) { user(id: $id) { id avatar { __typename ...avatar } } }  fragment avatar on Avatar { empty passportAvatarId }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hk21) && jl40.l(this.a, ((hk21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.fc70
    public final String id() {
        return "f9e34192e3411f0da1b741ad6eedbfab9d843ee5b2efd88518d1e45811d17219";
    }

    @Override // defpackage.fc70
    public final String name() {
        return "UserAvatar";
    }

    public final String toString() {
        return b64.p(new StringBuilder("UserAvatarQuery(id="), this.a, ')');
    }
}
