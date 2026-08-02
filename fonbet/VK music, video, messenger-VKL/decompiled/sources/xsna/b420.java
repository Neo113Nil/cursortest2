package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: MentionModels.kt */
/* loaded from: classes17.dex */
public final class b420 {
    public final UserId a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    public b420(UserId userId, String str, String str2, String str3, String str4, boolean z) {
        this.a = userId;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b420)) {
            return false;
        }
        b420 b420Var = (b420) obj;
        return epx.f(this.a, b420Var.a) && epx.f(this.b, b420Var.b) && epx.f(this.c, b420Var.c) && epx.f(this.d, b420Var.d) && epx.f(this.e, b420Var.e) && this.f == b420Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + urd0.a(urd0.a(urd0.a(urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MentionProfile(id=");
        sb.append(this.a);
        sb.append(", fullName=");
        sb.append(this.b);
        sb.append(", mentionName=");
        sb.append(this.c);
        sb.append(", avatarUri=");
        sb.append(this.d);
        sb.append(", domain=");
        sb.append(this.e);
        sb.append(", avatarIsNft=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
