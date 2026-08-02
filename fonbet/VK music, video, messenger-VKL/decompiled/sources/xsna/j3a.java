package xsna;

/* compiled from: CatalogChannelEvents.kt */
/* loaded from: classes16.dex */
public final class j3a implements u0a {
    public final long a;
    public final boolean b;

    public j3a(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3a)) {
            return false;
        }
        j3a j3aVar = (j3a) obj;
        return this.a == j3aVar.a && this.b == j3aVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelMembershipChangedEvent(channelId=");
        sb.append(this.a);
        sb.append(", isMember=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
