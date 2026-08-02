package xsna;

import com.vk.channels.api.Channel;
import com.vk.im.engine.models.ProfilesInfo;

/* compiled from: ChannelExt.kt */
/* loaded from: classes16.dex */
public final class pya {
    public final xpp<Channel> a;
    public final ProfilesInfo b;

    public pya(xpp<Channel> xppVar, ProfilesInfo profilesInfo) {
        this.a = xppVar;
        this.b = profilesInfo;
    }

    public final xpp<Channel> a() {
        return this.a;
    }

    public final ProfilesInfo b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pya)) {
            return false;
        }
        pya pyaVar = (pya) obj;
        return epx.f(this.a, pyaVar.a) && epx.f(this.b, pyaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelExt(channel=");
        sb.append(this.a);
        sb.append(", profiles=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.c(sb, this.b, ')');
    }
}
