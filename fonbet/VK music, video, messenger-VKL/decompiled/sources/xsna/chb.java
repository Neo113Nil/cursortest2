package xsna;

import java.util.List;

/* compiled from: ChannelsLongPollApiCmd.kt */
/* loaded from: classes2.dex */
public final class chb {
    public final long a;
    public final Long b;
    public final List<e900> c;

    /* JADX WARN: Multi-variable type inference failed */
    public chb(long j, Long l, List<? extends e900> list) {
        this.a = j;
        this.b = l;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chb)) {
            return false;
        }
        chb chbVar = (chb) obj;
        return this.a == chbVar.a && epx.f(this.b, chbVar.b) && epx.f(this.c, chbVar.c);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        Long l = this.b;
        return this.c.hashCode() + ((hashCode + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(ts=");
        sb.append(this.a);
        sb.append(", oldTs=");
        sb.append(this.b);
        sb.append(", events=");
        return ms9.a(')', sb, this.c);
    }
}
