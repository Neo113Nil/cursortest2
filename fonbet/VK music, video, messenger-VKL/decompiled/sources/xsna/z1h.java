package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.user.deactivation.Deactivation;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: CommunityDonutMembersItemModel.kt */
/* loaded from: classes5.dex */
public final class z1h extends s4h {
    public static final z1h l = new z1h();
    public final boolean b;
    public final int c;
    public final boolean d;
    public final Deactivation e;
    public final a f;
    public final List<Pair<String, Boolean>> g;
    public final boolean h;
    public final UserId i;
    public final boolean j;
    public final boolean k;

    /* compiled from: CommunityDonutMembersItemModel.kt */
    public static final class a {
        public final int a;
        public final int b;
        public final int c;

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CommunityCounters(membersCount=");
            sb.append(this.a);
            sb.append(", friendsCount=");
            sb.append(this.b);
            sb.append(", donutFriendsPreviewCount=");
            return vu5.b(sb, this.c, ')');
        }
    }

    public z1h(boolean z, int i, boolean z2, Deactivation deactivation, a aVar, List list, boolean z3, UserId userId, boolean z4, boolean z5) {
        this.b = z;
        this.c = i;
        this.d = z2;
        this.e = deactivation;
        this.f = aVar;
        this.g = list;
        this.h = z3;
        this.i = userId;
        this.j = z4;
        this.k = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1h)) {
            return false;
        }
        z1h z1hVar = (z1h) obj;
        return this.b == z1hVar.b && this.c == z1hVar.c && this.d == z1hVar.d && epx.f(this.e, z1hVar.e) && epx.f(this.f, z1hVar.f) && epx.f(this.g, z1hVar.g) && this.h == z1hVar.h && epx.f(this.i, z1hVar.i) && this.j == z1hVar.j && this.k == z1hVar.k;
    }

    public final int hashCode() {
        int b = qoy.b(shy.a(this.c, Boolean.hashCode(this.b) * 31, 31), 31, this.d);
        Deactivation deactivation = this.e;
        return Boolean.hashCode(this.k) + qoy.b(bh10.a(qoy.b(fw3.a((this.f.hashCode() + ((b + (deactivation == null ? 0 : deactivation.hashCode())) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i.b), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityDonutMembersItemModel(isMember=");
        sb.append(this.b);
        sb.append(", groupType=");
        sb.append((Object) hr80.G(this.c));
        sb.append(", isHiddenFromFeed=");
        sb.append(this.d);
        sb.append(", ownerState=");
        sb.append(this.e);
        sb.append(", counters=");
        sb.append(this.f);
        sb.append(", donutFriendsAvatars=");
        sb.append(this.g);
        sb.append(", canSeeMembers=");
        sb.append(this.h);
        sb.append(", uid=");
        sb.append(this.i);
        sb.append(", canSeeFriends=");
        sb.append(this.j);
        sb.append(", shouldAddPadding=");
        return defpackage.q0.a(sb, this.k, ')');
    }

    public z1h() {
        this(false, 0, false, null, new a(0, 0, 0), EmptyList.b, false, new UserId(0L), false, false);
    }
}
