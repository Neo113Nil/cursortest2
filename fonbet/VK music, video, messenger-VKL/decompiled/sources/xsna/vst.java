package xsna;

import com.vk.api.generated.messages.dto.MessagesGetReactedPeersResponseDto;
import com.vk.api.generated.messages.dto.MessagesReactionCounterResponseItemDto;
import com.vk.api.generated.messages.dto.MessagesReactionResponseItemDto;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.ProfilesInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.g1e0;

/* compiled from: GetMsgReactedPeersCmd.kt */
/* loaded from: classes2.dex */
public final class vst extends le6<eze0> {
    public final long b;
    public final int c;

    public vst(long j, int i) {
        this.b = j;
        this.c = i;
    }

    @Override // xsna.le6
    public final eze0 e(w2w w2wVar) {
        UserId userId = new UserId(this.b);
        UserId d = fto0.d(mq9.a(w2wVar));
        tfx tfxVar = new tfx("messages.getReactedPeers", new xq(25), new yq(22));
        tfx.n(tfxVar, "peer_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "cmid", this.c, 0, 0, 8);
        if (d != null) {
            tfx.n(tfxVar, "group_id", d, 0L, 0L, 8);
        }
        MessagesGetReactedPeersResponseDto messagesGetReactedPeersResponseDto = (MessagesGetReactedPeersResponseDto) bz2.c(bz2.n(tfxVar, new ak(24)), "GetMsgReactedPeersCmd.messagesGetReactedPeers");
        g1e0.a aVar = new g1e0.a();
        List<MessagesReactionResponseItemDto> e = messagesGetReactedPeersResponseDto.e();
        ArrayList arrayList = new ArrayList(c5g.u(e, 10));
        Iterator<T> it = e.iterator();
        while (it.hasNext()) {
            arrayList.add(com.vk.dto.common.a.a(((MessagesReactionResponseItemDto) it.next()).getUserId()));
        }
        aVar.h(arrayList);
        aVar.b = Source.ACTUAL;
        aVar.d = this;
        aVar.c = true;
        ProfilesInfo profilesInfo = (ProfilesInfo) w2wVar.L0(this, new d1e0(new g1e0(aVar)));
        List<MessagesReactionResponseItemDto> e2 = messagesGetReactedPeersResponseDto.e();
        ArrayList arrayList2 = new ArrayList(c5g.u(e2, 10));
        for (MessagesReactionResponseItemDto messagesReactionResponseItemDto : e2) {
            arrayList2.add(new hv30(messagesReactionResponseItemDto.d(), profilesInfo.Bb(com.vk.dto.common.a.a(messagesReactionResponseItemDto.getUserId()))));
        }
        List<MessagesReactionCounterResponseItemDto> d2 = messagesGetReactedPeersResponseDto.d();
        ArrayList arrayList3 = new ArrayList(c5g.u(d2, 10));
        for (MessagesReactionCounterResponseItemDto messagesReactionCounterResponseItemDto : d2) {
            arrayList3.add(new dze0(messagesReactionCounterResponseItemDto.getCount(), messagesReactionCounterResponseItemDto.d()));
        }
        return new eze0(arrayList2, arrayList3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vst)) {
            return false;
        }
        vst vstVar = (vst) obj;
        return this.b == vstVar.b && this.c == vstVar.c;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("GetMsgReactedPeersCmd(dialogId=");
        sb.append(this.b);
        sb.append(", cnvMsgId=");
        return vu5.b(sb, this.c, ')');
    }
}
