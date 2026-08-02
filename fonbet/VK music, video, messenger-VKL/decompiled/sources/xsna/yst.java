package xsna;

import com.vk.api.generated.messages.dto.MessagesGetMessagesReactionsResponseDto;
import com.vk.api.generated.messages.dto.MessagesReactionCountersResponseItemDto;
import com.vk.dto.common.id.UserId;
import java.util.HashMap;
import java.util.List;

/* compiled from: GetMsgReactionsCmd.kt */
/* loaded from: classes2.dex */
public final class yst extends le6<s3q0> {
    public final long b;
    public final List<Integer> c;

    public yst(long j, List<Integer> list) {
        this.b = j;
        this.c = list;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        long j = this.b;
        UserId userId = new UserId(j);
        tfx tfxVar = new tfx("messages.getMessagesReactions", new er(25), new fr(25));
        tfx.n(tfxVar, "peer_id", userId, 0L, 0L, 12);
        List<Integer> list = this.c;
        tfxVar.i("cmids", list);
        List<MessagesReactionCountersResponseItemDto> d = ((MessagesGetMessagesReactionsResponseDto) bz2.c(bz2.n(tfxVar, new wq3(29)), "GetMsgReactionsCmd.messagesGetMessagesReactions")).d();
        c4r c4rVar = new c4r(7);
        HashMap hashMap = new HashMap(d.size());
        for (MessagesReactionCountersResponseItemDto messagesReactionCountersResponseItemDto : d) {
            hashMap.put(Integer.valueOf(messagesReactionCountersResponseItemDto.d()), c4rVar.invoke(messagesReactionCountersResponseItemDto));
        }
        w2wVar.I0().u(new yw5(this, w2wVar, hashMap, 4));
        w2wVar.e1(this, new p980(j, "GetMsgReactionsCmd", w2wVar.I0().o().v0(j, list)));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yst)) {
            return false;
        }
        yst ystVar = (yst) obj;
        return this.b == ystVar.b && epx.f(this.c, ystVar.c);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("GetMsgReactionsCmd(dialogId=");
        sb.append(this.b);
        sb.append(", cnvMsgIds=");
        return ms9.a(')', sb, this.c);
    }
}
