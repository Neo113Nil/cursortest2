package xsna;

/* compiled from: FailedChannel.kt */
/* loaded from: classes2.dex */
public final class cjq {
    public final long a;
    public final djq b;

    public cjq(long j, djq djqVar) {
        this.a = j;
        this.b = djqVar;
    }

    public final long a() {
        return this.a;
    }

    public final djq b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjq)) {
            return false;
        }
        cjq cjqVar = (cjq) obj;
        return this.a == cjqVar.a && epx.f(this.b, cjqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "FailedChannel(channelId=" + this.a + ", error=" + this.b + ')';
    }
}
