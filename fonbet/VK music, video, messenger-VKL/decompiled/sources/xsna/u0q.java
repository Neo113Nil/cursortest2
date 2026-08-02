package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.reactions.ItemReactions;

/* compiled from: EventWallPostReposted.kt */
/* loaded from: classes18.dex */
public final class u0q {
    public final int a;
    public final UserId b;
    public final int c;
    public final int d;
    public final ItemReactions e;
    public final boolean f;
    public final boolean g;

    public u0q(int i, UserId userId, int i2, int i3, ItemReactions itemReactions, boolean z, boolean z2) {
        this.a = i;
        this.b = userId;
        this.c = i2;
        this.d = i3;
        this.e = itemReactions;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0q)) {
            return false;
        }
        u0q u0qVar = (u0q) obj;
        return this.a == u0qVar.a && epx.f(this.b, u0qVar.b) && this.c == u0qVar.c && this.d == u0qVar.d && epx.f(this.e, u0qVar.e) && this.f == u0qVar.f && this.g == u0qVar.g;
    }

    public final int hashCode() {
        int a = shy.a(this.d, shy.a(this.c, bh10.a(Integer.hashCode(this.a) * 31, 31, this.b.b), 31), 31);
        ItemReactions itemReactions = this.e;
        return Boolean.hashCode(this.g) + qoy.b((a + (itemReactions == null ? 0 : itemReactions.hashCode())) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventWallPostReposted(postId=");
        sb.append(this.a);
        sb.append(", ownerId=");
        sb.append(this.b);
        sb.append(", likes=");
        sb.append(this.c);
        sb.append(", reposts=");
        sb.append(this.d);
        sb.append(", reactions=");
        sb.append(this.e);
        sb.append(", isLikedByRepost=");
        sb.append(this.f);
        sb.append(", isReposted=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
