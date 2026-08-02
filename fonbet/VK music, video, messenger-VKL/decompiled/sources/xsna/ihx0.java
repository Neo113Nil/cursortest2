package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: WebPostBoxData.kt */
/* loaded from: classes6.dex */
public final class ihx0 {
    public final UserId a;
    public final UserId b;
    public final int c;
    public final String d;
    public final boolean e;
    public final int f;
    public final int g;

    public ihx0(UserId userId, UserId userId2, int i, String str, boolean z, int i2, int i3) {
        this.a = userId;
        this.b = userId2;
        this.c = i;
        this.d = str;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    public final UserId a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihx0)) {
            return false;
        }
        ihx0 ihx0Var = (ihx0) obj;
        return epx.f(this.a, ihx0Var.a) && epx.f(this.b, ihx0Var.b) && this.c == ihx0Var.c && epx.f(this.d, ihx0Var.d) && this.e == ihx0Var.e && this.f == ihx0Var.f && this.g == ihx0Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + shy.a(this.f, qoy.b(urd0.a(shy.a(this.c, bh10.a(Long.hashCode(this.a.b) * 31, 31, this.b.b), 31), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebPostBoxData(ownerId=");
        sb.append(this.a);
        sb.append(", authorId=");
        sb.append(this.b);
        sb.append(", textLiveId=");
        sb.append(this.c);
        sb.append(", allowedAttachments=");
        sb.append(this.d);
        sb.append(", allowedCoauthors=");
        sb.append(this.e);
        sb.append(", characterLimit=");
        sb.append(this.f);
        sb.append(", situationalSuggestId=");
        return vu5.b(sb, this.g, ')');
    }
}
