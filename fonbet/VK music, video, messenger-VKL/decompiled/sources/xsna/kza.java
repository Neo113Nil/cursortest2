package xsna;

import com.vk.channels.api.Channel;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import java.util.Collections;
import java.util.List;
import ru.mail.platform.libverify.sms.SmsRetrieverService;

/* compiled from: ChannelGetOrLoadCmd.kt */
/* loaded from: classes2.dex */
public final class kza extends xl6<Channel> {
    public final Peer b;
    public final boolean c;

    public kza(Peer peer, boolean z) {
        this.b = peer;
        this.c = z;
    }

    @Override // xsna.m2w
    public final String a() {
        return defpackage.k0.a(this.b.b, "im-channel-");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        Peer peer = this.b;
        xpp e = ((wpp) w2wVar.J0(this, new gfb((List<? extends Peer>) Collections.singletonList(peer), Source.CACHE, false, (Object) this)).await()).e(Long.valueOf(peer.b));
        if (!(this.c ? !e.c() : e.b())) {
            Object obj = ((wpp) w2wVar.J0(this, new gfb((List<? extends Peer>) Collections.singletonList(peer), Source.NETWORK, true, (Object) this)).await()).c.get(Long.valueOf(peer.b));
            if (obj != null) {
                return (Channel) obj;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        Channel channel = (Channel) e.b;
        if (channel != null && (!channel.o || channel.n)) {
            long f1 = w2wVar.f1();
            Long l = channel.y;
            if (l == null || l.longValue() + SmsRetrieverService.SMS_SAVE_STATE_TIMEOUT < f1) {
                w2wVar.J0(this, new cza(peer));
            }
        }
        if (channel != null) {
            return channel;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kza)) {
            return false;
        }
        kza kzaVar = (kza) obj;
        return epx.f(this.b, kzaVar.b) && this.c == kzaVar.c;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Long.hashCode(this.b.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelGetOrLoadCmd(channelId=");
        sb.append(this.b);
        sb.append(", ignoreExpiredCheck=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    public kza(long j, boolean z) {
        this(new Peer.Channel(j), z);
    }
}
