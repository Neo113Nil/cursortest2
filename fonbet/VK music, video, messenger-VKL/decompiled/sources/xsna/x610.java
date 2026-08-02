package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: MarketLinkedContentPatch.kt */
/* loaded from: classes18.dex */
public final class x610 implements u610 {
    public final long a;
    public final UserId b;
    public final int c;
    public final boolean d;

    public x610(int i, long j, UserId userId, boolean z) {
        this.a = j;
        this.b = userId;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x610)) {
            return false;
        }
        x610 x610Var = (x610) obj;
        return this.a == x610Var.a && epx.f(this.b, x610Var.b) && this.c == x610Var.c && this.d == x610Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + qoy.b(shy.a(this.c, bh10.a(Long.hashCode(this.a) * 31, 31, this.b.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartLoading(itemId=");
        sb.append(this.a);
        sb.append(", ownerId=");
        sb.append(this.b);
        sb.append(", offset=");
        sb.append(this.c);
        sb.append(", isForce=");
        return n23.b(sb, this.d, ", isRefresh=false)");
    }
}
