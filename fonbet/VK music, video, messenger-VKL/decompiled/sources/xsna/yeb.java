package xsna;

import com.vk.channels.api.Channel;
import com.vk.im.engine.models.ProfilesInfo;

/* compiled from: ChannelsExt.kt */
/* loaded from: classes16.dex */
public final class yeb {
    public final wpp<Long, Channel> a;
    public final ProfilesInfo b;

    public yeb(wpp<Long, Channel> wppVar, ProfilesInfo profilesInfo) {
        this.a = wppVar;
        this.b = profilesInfo;
    }

    public final pya a(long j) {
        return new pya(this.a.e(Long.valueOf(j)), this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yeb)) {
            return false;
        }
        yeb yebVar = (yeb) obj;
        return epx.f(this.a, yebVar.a) && epx.f(this.b, yebVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsExt(channels=");
        sb.append(this.a);
        sb.append(", profiles=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.c(sb, this.b, ')');
    }
}
