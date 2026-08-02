package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ReplyToData.kt */
/* loaded from: classes18.dex */
public final class o4g0 {
    public final UserId a;
    public final String b;
    public final String c;
    public final boolean d;

    public o4g0(UserId userId, boolean z, String str, String str2) {
        this.a = userId;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final UserId c() {
        return this.a;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4g0)) {
            return false;
        }
        o4g0 o4g0Var = (o4g0) obj;
        return epx.f(this.a, o4g0Var.a) && epx.f(this.b, o4g0Var.b) && epx.f(this.c, o4g0Var.c) && this.d == o4g0Var.d;
    }

    public final int hashCode() {
        UserId userId = this.a;
        return Boolean.hashCode(this.d) + urd0.a(urd0.a((userId == null ? 0 : Long.hashCode(userId.b)) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReplyToData(userId=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", nameDative=");
        sb.append(this.c);
        sb.append(", isReplyEditing=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
