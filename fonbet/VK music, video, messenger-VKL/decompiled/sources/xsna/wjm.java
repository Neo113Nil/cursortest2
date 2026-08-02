package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogSortIdChangeLpEvent.kt */
/* loaded from: classes2.dex */
public final class wjm implements e900 {
    public final Peer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;

    public wjm(Peer peer, Integer num, Integer num2, Integer num3) {
        this.a = peer;
        this.b = num;
        this.c = num2;
        this.d = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wjm)) {
            return false;
        }
        wjm wjmVar = (wjm) obj;
        return epx.f(this.a, wjmVar.a) && epx.f(this.b, wjmVar.b) && epx.f(this.c, wjmVar.c) && epx.f(this.d, wjmVar.d);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a.b) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        return hashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogSortIdChangeLpEvent(dialog=");
        sb.append(this.a);
        sb.append(", sortMajorId=");
        sb.append(this.b);
        sb.append(", sortMinorId=");
        sb.append(this.c);
        sb.append(", timestamp=");
        return uqi.b(sb, this.d, ')');
    }
}
