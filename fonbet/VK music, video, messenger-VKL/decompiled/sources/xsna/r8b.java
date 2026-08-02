package xsna;

/* compiled from: ChannelPostponedCountChangeLpEvent.kt */
/* loaded from: classes2.dex */
public final class r8b implements e900 {
    public final long a;
    public final int b;

    public r8b(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8b)) {
            return false;
        }
        r8b r8bVar = (r8b) obj;
        return this.a == r8bVar.a && this.b == r8bVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelPostponedCountChangeLpEvent(channelId=");
        sb.append(this.a);
        sb.append(", count=");
        return vu5.b(sb, this.b, ')');
    }
}
