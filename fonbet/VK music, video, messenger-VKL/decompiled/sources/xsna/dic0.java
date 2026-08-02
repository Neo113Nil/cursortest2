package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: PostingOwnerData.kt */
/* loaded from: classes3.dex */
public final class dic0 {
    public final UserId a;
    public final String b;
    public final String c;

    public dic0(UserId userId, String str, String str2) {
        this.a = userId;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dic0)) {
            return false;
        }
        dic0 dic0Var = (dic0) obj;
        return epx.f(this.a, dic0Var.a) && epx.f(this.b, dic0Var.b) && epx.f(this.c, dic0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostingOwnerData(ownerId=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", photoUrl=");
        return ho8.a(sb, this.c, ')');
    }
}
