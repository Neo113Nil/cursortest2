package xsna;

import com.vk.channels.api.ChannelFilter;

/* compiled from: ChannelsHistoryMetaStorageModel.kt */
/* loaded from: classes2.dex */
public final class wfb {
    public final ChannelFilter a;
    public final vcb b;
    public final boolean c;
    public final int d;

    public wfb(ChannelFilter channelFilter, vcb vcbVar, boolean z, int i) {
        this.a = channelFilter;
        this.b = vcbVar;
        this.c = z;
        this.d = i;
    }

    public static wfb a(wfb wfbVar, vcb vcbVar, int i) {
        ChannelFilter channelFilter = wfbVar.a;
        if ((i & 2) != 0) {
            vcbVar = wfbVar.b;
        }
        boolean z = (i & 4) != 0 ? wfbVar.c : false;
        int i2 = wfbVar.d;
        wfbVar.getClass();
        return new wfb(channelFilter, vcbVar, z, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfb)) {
            return false;
        }
        wfb wfbVar = (wfb) obj;
        return this.a == wfbVar.a && epx.f(this.b, wfbVar.b) && this.c == wfbVar.c && this.d == wfbVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsHistoryMetaStorageModel(filter=");
        sb.append(this.a);
        sb.append(", oldestSortId=");
        sb.append(this.b);
        sb.append(", fullyFetched=");
        sb.append(this.c);
        sb.append(", phaseId=");
        return vu5.b(sb, this.d, ')');
    }
}
