package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: MultipleCoownershipItemUiDto.kt */
/* loaded from: classes3.dex */
public final class o740 {
    public final UserId a;
    public final String b;
    public final String c;

    public o740(UserId userId, String str, String str2) {
        this.a = userId;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o740)) {
            return false;
        }
        o740 o740Var = (o740) obj;
        return epx.f(this.a, o740Var.a) && epx.f(this.b, o740Var.b) && epx.f(this.c, o740Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultipleCoownershipItemUiDto(userId=");
        sb.append(this.a);
        sb.append(", photoUrl=");
        sb.append(this.b);
        sb.append(", title=");
        return ho8.a(sb, this.c, ')');
    }
}
