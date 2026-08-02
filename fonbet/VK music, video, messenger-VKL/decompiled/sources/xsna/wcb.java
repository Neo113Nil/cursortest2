package xsna;

import com.vk.dto.common.Peer;

/* compiled from: ChannelSortIdChangeLpEvent.kt */
/* loaded from: classes2.dex */
public final class wcb implements e900 {
    public final Peer a;
    public final Integer b;
    public final Integer c;

    public wcb(Peer peer, Integer num, Integer num2) {
        this.a = peer;
        this.b = num;
        this.c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wcb)) {
            return false;
        }
        wcb wcbVar = (wcb) obj;
        return epx.f(this.a, wcbVar.a) && epx.f(this.b, wcbVar.b) && epx.f(this.c, wcbVar.c);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a.b) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelSortIdChangeLpEvent(channel=");
        sb.append(this.a);
        sb.append(", sortMajorId=");
        sb.append(this.b);
        sb.append(", sortMinorId=");
        return uqi.b(sb, this.c, ')');
    }
}
