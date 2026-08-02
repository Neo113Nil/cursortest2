package xsna;

import com.vk.api.generated.messages.dto.MessagesConversationBarHideSourceDto;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import java.util.NoSuchElementException;

/* compiled from: DialogInfoBarHideApiCmd.kt */
/* loaded from: classes2.dex */
public final class ofm extends nx2<Boolean> {
    public final Peer b;
    public final String c;
    public final String d;
    public final boolean e = true;

    public ofm(Peer peer, String str, String str2) {
        this.b = peer;
        this.c = str;
        this.d = str2;
    }

    @Override // xsna.nx2
    public final Boolean f(l7r0 l7r0Var) {
        Peer peer = this.b;
        UserId b = peer != null ? com.vk.dto.common.a.b(peer) : null;
        for (MessagesConversationBarHideSourceDto messagesConversationBarHideSourceDto : MessagesConversationBarHideSourceDto.values()) {
            if (brm0.w(messagesConversationBarHideSourceDto.i(), this.d, true)) {
                tfx tfxVar = new tfx("messages.conversationBarHide", new io.reactivex.rxjava3.internal.operators.observable.n0(28), new dr(23));
                String str = this.c;
                if (str != null) {
                    tfx.o(tfxVar, "name", str, 0, 0, 12);
                }
                if (b != null) {
                    tfx.n(tfxVar, "peer_id", b, 0L, 0L, 12);
                }
                tfx.o(tfxVar, "source", messagesConversationBarHideSourceDto.i(), 0, 0, 12);
                bz2.l(tfxVar, this.e);
                return Boolean.TRUE;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
