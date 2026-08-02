package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ManagedCommunity.kt */
/* loaded from: classes6.dex */
public final class sh00 {
    public final UserId a;
    public final String b;
    public final String c;

    public sh00(UserId userId, String str, String str2) {
        this.a = userId;
        this.b = str;
        this.c = str2;
    }

    public final UserId a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh00)) {
            return false;
        }
        sh00 sh00Var = (sh00) obj;
        return epx.f(this.a, sh00Var.a) && epx.f(this.b, sh00Var.b) && epx.f(this.c, sh00Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ManagedCommunity(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", photoUrl=");
        return ho8.a(sb, this.c, ')');
    }
}
