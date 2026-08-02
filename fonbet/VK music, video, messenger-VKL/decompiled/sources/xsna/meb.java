package xsna;

/* compiled from: ChannelsCountChangeLpEvent.kt */
/* loaded from: classes2.dex */
public final class meb implements e900 {
    public final Integer a;
    public final Integer b;
    public final Integer c;

    public meb() {
        this(7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof meb)) {
            return false;
        }
        meb mebVar = (meb) obj;
        return epx.f(this.a, mebVar.a) && epx.f(this.b, mebVar.b) && epx.f(this.c, mebVar.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsCountChangeLpEvent(channelsUnread=");
        sb.append(this.a);
        sb.append(", channelsUnreadUnmuted=");
        sb.append(this.b);
        sb.append(", channelsArchived=");
        return uqi.b(sb, this.c, ')');
    }

    public /* synthetic */ meb(int i, Integer num) {
        this(null, null, (i & 4) != 0 ? null : num);
    }

    public meb(Integer num, Integer num2, Integer num3) {
        this.a = num;
        this.b = num2;
        this.c = num3;
    }
}
