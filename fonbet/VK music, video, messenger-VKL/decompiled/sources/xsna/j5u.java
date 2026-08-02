package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: GoodItem.kt */
/* loaded from: classes18.dex */
public final class j5u {
    public final UserId a;
    public final String b;
    public final boolean c;

    public j5u(UserId userId, String str, boolean z) {
        this.a = userId;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5u)) {
            return false;
        }
        j5u j5uVar = (j5u) obj;
        return epx.f(this.a, j5uVar.a) && epx.f(this.b, j5uVar.b) && this.c == j5uVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GoodOwner(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", isVerified=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
