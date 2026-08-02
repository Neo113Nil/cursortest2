package xsna;

import com.vk.channels.api.ChannelFilter;
import com.vk.dto.common.Source;

/* compiled from: ChannelsHistoryGetArgs.kt */
/* loaded from: classes2.dex */
public final class ufb {
    public final aeb a;
    public final ChannelFilter b;
    public final int c;
    public final Source d;
    public final boolean e;
    public final boolean f;

    public ufb() {
        this(null, null, 0, null, false, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufb)) {
            return false;
        }
        ufb ufbVar = (ufb) obj;
        return epx.f(this.a, ufbVar.a) && this.b == ufbVar.b && this.c == ufbVar.c && this.d == ufbVar.d && this.e == ufbVar.e && this.f == ufbVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + qoy.b(io.reactivex.rxjava3.internal.operators.mixed.k.c(shy.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31, this.d), 961, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsHistoryGetArgs(since=");
        sb.append(this.a);
        sb.append(", filter=");
        sb.append(this.b);
        sb.append(", limit=");
        sb.append(this.c);
        sb.append(", source=");
        sb.append(this.d);
        sb.append(", isAwaitNetwork=");
        sb.append(this.e);
        sb.append(", changerTag=null, needResult=");
        return defpackage.q0.a(sb, this.f, ')');
    }

    public ufb(aeb aebVar, ChannelFilter channelFilter, int i, Source source, boolean z, int i2) {
        aebVar = (i2 & 1) != 0 ? aeb.e : aebVar;
        channelFilter = (i2 & 2) != 0 ? ChannelFilter.ALL : channelFilter;
        i = (i2 & 4) != 0 ? 20 : i;
        source = (i2 & 8) != 0 ? Source.CACHE : source;
        boolean z2 = (i2 & 16) == 0;
        z = (i2 & 64) != 0 ? true : z;
        this.a = aebVar;
        this.b = channelFilter;
        this.c = i;
        this.d = source;
        this.e = z2;
        this.f = z;
    }
}
