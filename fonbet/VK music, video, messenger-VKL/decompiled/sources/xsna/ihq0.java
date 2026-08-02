package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: UserDetails.kt */
/* loaded from: classes.dex */
public final class ihq0 {
    public final UserId a;
    public final String b;
    public final String c;
    public final int d;
    public final long e;

    public ihq0(int i, long j, UserId userId, String str, String str2) {
        this.a = userId;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihq0)) {
            return false;
        }
        ihq0 ihq0Var = (ihq0) obj;
        return epx.f(this.a, ihq0Var.a) && epx.f(this.b, ihq0Var.b) && epx.f(this.c, ihq0Var.c) && this.d == ihq0Var.d && this.e == ihq0Var.e;
    }

    public final int hashCode() {
        int a = urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b);
        String str = this.c;
        return Long.hashCode(this.e) + shy.a(this.d, (a + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserDetails(userId=");
        sb.append(this.a);
        sb.append(", accessToken=");
        sb.append(this.b);
        sb.append(", secret=");
        sb.append(this.c);
        sb.append(", expiresInSec=");
        sb.append(this.d);
        sb.append(", createdMs=");
        return vu5.a(')', this.e, sb);
    }
}
