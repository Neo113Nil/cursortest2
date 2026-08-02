package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: DeletedMarketItemComment.kt */
/* loaded from: classes17.dex */
public final class rvl {
    public final int a;
    public final UserId b;
    public final boolean c;

    public rvl(int i, UserId userId, boolean z) {
        this.a = i;
        this.b = userId;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvl)) {
            return false;
        }
        rvl rvlVar = (rvl) obj;
        return this.a == rvlVar.a && epx.f(this.b, rvlVar.b) && this.c == rvlVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + bh10.a(Integer.hashCode(this.a) * 31, 31, this.b.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeletedMarketItemComment(id=");
        sb.append(this.a);
        sb.append(", userId=");
        sb.append(this.b);
        sb.append(", isEnabled=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
