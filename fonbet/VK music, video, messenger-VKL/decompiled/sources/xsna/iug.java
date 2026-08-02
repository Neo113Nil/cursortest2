package xsna;

/* compiled from: CommunityChannelInfo.kt */
/* loaded from: classes5.dex */
public final class iug {
    public final boolean a;
    public final String b;

    public iug(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iug)) {
            return false;
        }
        iug iugVar = (iug) obj;
        return this.a == iugVar.a && epx.f(this.b, iugVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityChannelInfo(canPost=");
        sb.append(this.a);
        sb.append(", channelUrl=");
        return ho8.a(sb, this.b, ')');
    }
}
