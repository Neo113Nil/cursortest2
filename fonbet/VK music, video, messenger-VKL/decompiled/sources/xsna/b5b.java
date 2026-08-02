package xsna;

import com.vk.channels.api.Channel;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.Msg;

/* compiled from: ChannelMsgPushInfo.kt */
/* loaded from: classes5.dex */
public final class b5b {
    public final Channel a;
    public final Msg b;
    public final ProfilesSimpleInfo c;

    public b5b(Channel channel, Msg msg, ProfilesSimpleInfo profilesSimpleInfo) {
        this.a = channel;
        this.b = msg;
        this.c = profilesSimpleInfo;
    }

    public final Channel a() {
        return this.a;
    }

    public final Msg b() {
        return this.b;
    }

    public final ProfilesSimpleInfo c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5b)) {
            return false;
        }
        b5b b5bVar = (b5b) obj;
        return epx.f(this.a, b5bVar.a) && epx.f(this.b, b5bVar.b) && epx.f(this.c, b5bVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + pn.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ChannelMsgPushInfo(channel=" + this.a + ", msg=" + this.b + ", profiles=" + this.c + ')';
    }
}
