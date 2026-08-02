package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.reactions.ItemReactions;
import com.vk.dto.reactions.ReactionSet;
import com.vk.dto.user.ReactionUserProfile;

/* compiled from: GetReactedUsers.kt */
/* loaded from: classes15.dex */
public final class rtt {
    public final a a;
    public final a b;
    public final a c;
    public final ReactionSet d;
    public final ItemReactions e;

    /* compiled from: GetReactedUsers.kt */
    public static final class a {
        public final VKList<ReactionUserProfile> a;
        public final int b;
        public final int c;

        public a(VKList<ReactionUserProfile> vKList, int i, int i2) {
            this.a = vKList;
            this.b = i;
            this.c = i2;
        }

        public final VKList<ReactionUserProfile> a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TabResult(list=");
            sb.append(this.a);
            sb.append(", offset=");
            sb.append(this.b);
            sb.append(", total=");
            return vu5.b(sb, this.c, ')');
        }
    }

    public rtt(a aVar, a aVar2, a aVar3, ReactionSet reactionSet, ItemReactions itemReactions) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = reactionSet;
        this.e = itemReactions;
    }

    public final a a() {
        return this.a;
    }

    public final a b() {
        return this.b;
    }

    public final ReactionSet c() {
        return this.d;
    }

    public final ItemReactions d() {
        return this.e;
    }

    public final a e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rtt)) {
            return false;
        }
        rtt rttVar = (rtt) obj;
        return epx.f(this.a, rttVar.a) && epx.f(this.b, rttVar.b) && epx.f(this.c, rttVar.c) && epx.f(this.d, rttVar.d) && epx.f(this.e, rttVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a aVar = this.b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.c;
        int hashCode3 = (hashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        ReactionSet reactionSet = this.d;
        int hashCode4 = (hashCode3 + (reactionSet == null ? 0 : reactionSet.hashCode())) * 31;
        ItemReactions itemReactions = this.e;
        return hashCode4 + (itemReactions != null ? itemReactions.hashCode() : 0);
    }

    public final String toString() {
        return "GetReactedUserResponse(all=" + this.a + ", friends=" + this.b + ", shares=" + this.c + ", reactionSet=" + this.d + ", reactions=" + this.e + ')';
    }
}
