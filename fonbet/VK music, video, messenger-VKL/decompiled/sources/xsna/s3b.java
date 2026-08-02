package xsna;

import com.vk.api.generated.channels.dto.ChannelsGetChannelMessagesCountersResponseDto;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: ChannelMessagesUpdateCountersApiCmd.kt */
/* loaded from: classes2.dex */
public final class s3b extends nx2<ChannelsGetChannelMessagesCountersResponseDto> {
    public final Peer b;
    public final List<Integer> c;

    public s3b(Peer peer, List list) {
        this.b = peer;
        this.c = list;
    }

    @Override // xsna.nx2
    public final ChannelsGetChannelMessagesCountersResponseDto f(l7r0 l7r0Var) {
        UserId b = com.vk.dto.common.a.b(this.b);
        tfx tfxVar = new tfx("channels.getChannelMessagesCounters", new lq(8), new mq(10));
        tfx.n(tfxVar, "channel_id", b, 0L, -1L, 4);
        List<Integer> list = this.c;
        if (list != null) {
            tfxVar.i("cmids", list);
        }
        return (ChannelsGetChannelMessagesCountersResponseDto) bz2.l(tfxVar, false);
    }
}
