package xsna;

/* compiled from: ChannelsCountersApiModel.kt */
/* loaded from: classes2.dex */
public final class oeb {
    public final int a;
    public final int b;
    public final int c;

    public oeb() {
        this(0, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oeb)) {
            return false;
        }
        oeb oebVar = (oeb) obj;
        return this.a == oebVar.a && this.b == oebVar.b && this.c == oebVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsCountersApiModel(channelsUnread=");
        sb.append(this.a);
        sb.append(", channelsUnreadUnmuted=");
        sb.append(this.b);
        sb.append(", channelsArchived=");
        return vu5.b(sb, this.c, ')');
    }

    public oeb(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
