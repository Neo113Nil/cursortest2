package xsna;

import xsna.p920;

/* compiled from: MessageFromChannelHolder.kt */
/* loaded from: classes16.dex */
public final class o920 implements p920.a {
    public final String a;
    public final String b;
    public final long c;

    public o920(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o920)) {
            return false;
        }
        o920 o920Var = (o920) obj;
        return epx.f(this.a, o920Var.a) && epx.f(this.b, o920Var.b) && this.c == o920Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NeedToSubscribe(snippet=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", channelId=");
        return vu5.a(')', this.c, sb);
    }
}
