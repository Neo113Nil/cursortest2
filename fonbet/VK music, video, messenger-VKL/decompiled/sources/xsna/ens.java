package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.ProfileDescription;
import java.util.List;

/* compiled from: FriendsCleanupListViewItem.kt */
/* loaded from: classes15.dex */
public final class ens implements hfz {
    public final UserId b;
    public final kr5 c;
    public final String d;
    public final String e;
    public final ProfileDescription f;
    public final OnlineInfo g;
    public final VerifyInfo h;
    public final a i;
    public final int j;

    /* compiled from: FriendsCleanupListViewItem.kt */
    public static final class a {
        public final int a;
        public final List<Image> b;

        public a(int i, List<Image> list) {
            this.a = i;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MutualFriendsInfo(count=");
            sb.append(this.a);
            sb.append(", images=");
            return ms9.a(')', sb, this.b);
        }
    }

    public ens(UserId userId, kr5 kr5Var, String str, String str2, ProfileDescription profileDescription, OnlineInfo onlineInfo, VerifyInfo verifyInfo, a aVar, int i) {
        this.b = userId;
        this.c = kr5Var;
        this.d = str;
        this.e = str2;
        this.f = profileDescription;
        this.g = onlineInfo;
        this.h = verifyInfo;
        this.i = aVar;
        this.j = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ens)) {
            return false;
        }
        ens ensVar = (ens) obj;
        return epx.f(this.b, ensVar.b) && epx.f(this.c, ensVar.c) && epx.f(this.d, ensVar.d) && epx.f(this.e, ensVar.e) && epx.f(this.f, ensVar.f) && epx.f(this.g, ensVar.g) && epx.f(this.h, ensVar.h) && epx.f(this.i, ensVar.i) && this.j == ensVar.j;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Long.valueOf(this.b.b);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a((this.c.hashCode() + (Long.hashCode(this.b.b) * 31)) * 31, 31, this.d), 31, this.e);
        ProfileDescription profileDescription = this.f;
        return Integer.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((a2 + (profileDescription == null ? 0 : profileDescription.hashCode())) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Profile(id=");
        sb.append(this.b);
        sb.append(", avatarImageConfig=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", subtitle=");
        sb.append(this.e);
        sb.append(", description=");
        sb.append(this.f);
        sb.append(", onlineInfo=");
        sb.append(this.g);
        sb.append(", verifyInfo=");
        sb.append(this.h);
        sb.append(", mutualFriendsInfo=");
        sb.append(this.i);
        sb.append(", actionButtonTextRes=");
        return vu5.b(sb, this.j, ')');
    }
}
