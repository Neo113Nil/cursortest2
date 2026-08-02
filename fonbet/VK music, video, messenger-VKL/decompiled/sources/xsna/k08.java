package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: BookmarksManager.kt */
/* loaded from: classes18.dex */
public final class k08 {
    public final long a;
    public final UserId b;
    public final boolean c;

    public k08(long j, UserId userId, boolean z) {
        this.a = j;
        this.b = userId;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k08)) {
            return false;
        }
        k08 k08Var = (k08) obj;
        return this.a == k08Var.a && epx.f(this.b, k08Var.b) && this.c == k08Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + bh10.a(Long.hashCode(this.a) * 31, 31, this.b.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BookmarksEvent(goodId=");
        sb.append(this.a);
        sb.append(", ownerId=");
        sb.append(this.b);
        sb.append(", isFave=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
