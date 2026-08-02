package xsna;

import java.util.ArrayList;

/* compiled from: PostFromChannel.kt */
/* loaded from: classes6.dex */
public final class p3c0 {
    public final long a;
    public final long b;
    public final int c;
    public final String d;
    public final String e;
    public final ArrayList f;
    public final String g;

    public p3c0(long j, long j2, int i, String str, String str2, ArrayList arrayList, String str3) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = arrayList;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3c0)) {
            return false;
        }
        p3c0 p3c0Var = (p3c0) obj;
        return this.a == p3c0Var.a && this.b == p3c0Var.b && this.c == p3c0Var.c && epx.f(this.d, p3c0Var.d) && this.e.equals(p3c0Var.e) && this.f.equals(p3c0Var.f) && epx.f(this.g, p3c0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + qr.a(this.f, urd0.a(urd0.a(shy.a(this.c, bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostFromChannel(ownerId=");
        sb.append(this.a);
        sb.append(", channelId=");
        sb.append(this.b);
        sb.append(", messageId=");
        sb.append(this.c);
        sb.append(", channelName=");
        sb.append(this.d);
        sb.append(", channelAvatarUrl=");
        sb.append(this.e);
        sb.append(", attachments=");
        sb.append(this.f);
        sb.append(", messageBody=");
        return ho8.a(sb, this.g, ')');
    }
}
