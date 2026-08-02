package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CommunityMembersItemModel.kt */
/* loaded from: classes5.dex */
public final class nah extends s4h {
    public final UserId b;
    public final int c;
    public final int d;
    public final boolean e;
    public final List<UserProfile> f;
    public final boolean g;
    public final boolean h;

    public nah(UserId userId, int i, int i2, boolean z, ArrayList arrayList, boolean z2, boolean z3) {
        this.b = userId;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = arrayList;
        this.g = z2;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nah)) {
            return false;
        }
        nah nahVar = (nah) obj;
        return epx.f(this.b, nahVar.b) && this.c == nahVar.c && this.d == nahVar.d && this.e == nahVar.e && epx.f(this.f, nahVar.f) && this.g == nahVar.g && this.h == nahVar.h;
    }

    public final int hashCode() {
        int b = qoy.b(shy.a(this.d, shy.a(this.c, Long.hashCode(this.b.b) * 31, 31), 31), 31, this.e);
        List<UserProfile> list = this.f;
        return Boolean.hashCode(this.h) + qoy.b((b + (list == null ? 0 : list.hashCode())) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityMembersItemModel(uid=");
        sb.append(this.b);
        sb.append(", friendsCount=");
        sb.append(this.c);
        sb.append(", membersCount=");
        sb.append(this.d);
        sb.append(", canSeeMembers=");
        sb.append(this.e);
        sb.append(", friends=");
        sb.append(this.f);
        sb.append(", canSeeFriends=");
        sb.append(this.g);
        sb.append(", shouldAddPadding=");
        return defpackage.q0.a(sb, this.h, ')');
    }
}
