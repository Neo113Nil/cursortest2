package xsna;

import com.vk.api.generated.messages.dto.MessagesConversationBarCallbackSourceDto;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;

/* compiled from: DialogInfoBarCallbackApiCmd.kt */
/* loaded from: classes2.dex */
public final class mfm extends nx2<Boolean> {
    public final Peer b;
    public final String c;
    public final MessagesConversationBarCallbackSourceDto d;
    public final boolean e;

    public mfm(Peer peer, String str, MessagesConversationBarCallbackSourceDto messagesConversationBarCallbackSourceDto, boolean z) {
        this.b = peer;
        this.c = str;
        this.d = messagesConversationBarCallbackSourceDto;
        this.e = z;
    }

    @Override // xsna.nx2
    public final Boolean f(l7r0 l7r0Var) {
        UserId b = com.vk.dto.common.a.b(this.b);
        tfx tfxVar = new tfx("messages.conversationBarCallback", new dt(18), new cq(20));
        tfx.o(tfxVar, "callback_data", this.c, 0, 1000, 4);
        tfx.n(tfxVar, "peer_id", b, 0L, 0L, 12);
        MessagesConversationBarCallbackSourceDto messagesConversationBarCallbackSourceDto = this.d;
        if (messagesConversationBarCallbackSourceDto != null) {
            tfx.o(tfxVar, "source", messagesConversationBarCallbackSourceDto.j(), 0, 0, 12);
        }
        bz2.l(tfxVar, this.e);
        return Boolean.TRUE;
    }
}
