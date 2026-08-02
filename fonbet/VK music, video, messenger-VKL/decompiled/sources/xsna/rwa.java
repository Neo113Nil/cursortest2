package xsna;

/* compiled from: MessagesListComponentConfig.kt */
/* loaded from: classes16.dex */
public final class rwa {
    public final lya a;
    public final boolean b;
    public final com.vk.movika.sdk.base.data.converter.c c;
    public final boolean d;

    public rwa(lya lyaVar, boolean z, com.vk.movika.sdk.base.data.converter.c cVar, boolean z2) {
        this.a = lyaVar;
        this.b = z;
        this.c = cVar;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rwa)) {
            return false;
        }
        rwa rwaVar = (rwa) obj;
        return this.a.equals(rwaVar.a) && this.b == rwaVar.b && this.c.equals(rwaVar.c) && this.d == rwaVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelConfig(channelEmptyInteractor=");
        sb.append(this.a);
        sb.append(", isPostponed=");
        sb.append(this.b);
        sb.append(", adminLevelDataSource=");
        sb.append(this.c);
        sb.append(", isPaidReactionAvailable=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
