package xsna;

import com.vk.api.generated.channels.dto.ChannelsGetChannelMessagesCountersResponseDto;
import com.vk.api.generated.channels.dto.ChannelsMessageCountersDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.log.L;
import java.util.List;
import kotlin.Result;

/* compiled from: ChannelMessagesUpdateCountersCmd.kt */
/* loaded from: classes2.dex */
public final class u3b extends xl6<s3q0> {
    public final long b;
    public final List<Integer> c;

    public u3b(long j, List<Integer> list) {
        this.b = j;
        this.c = list;
    }

    @Override // xsna.m2w
    public final String a() {
        return defpackage.k0.a(this.b, "im-channel-load-counters-from-network-");
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        Object failure;
        try {
            long j = this.b;
            Serializer.c<Peer> cVar = Peer.CREATOR;
            List<ChannelsMessageCountersDto> d = ((ChannelsGetChannelMessagesCountersResponseDto) bz2.c(new s3b(Peer.a.b(j), this.c), "ChannelMessagesUpdateCountersApiCmd")).d();
            if (d != null) {
                w2wVar.I0().u(new t3b(this, d, w2wVar, 0));
                failure = s3q0.a;
            } else {
                failure = null;
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            L.i(a);
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3b)) {
            return false;
        }
        u3b u3bVar = (u3b) obj;
        return this.b == u3bVar.b && epx.f(this.c, u3bVar.c);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelMessagesUpdateCountersCmd(channelId=");
        sb.append(this.b);
        sb.append(", msgIds=");
        return ms9.a(')', sb, this.c);
    }
}
