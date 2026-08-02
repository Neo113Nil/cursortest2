package xsna;

import com.vk.api.generated.messages.dto.MessagesConversationBarCallbackSourceDto;
import com.vk.dto.common.Peer;

/* compiled from: DialogInfoBarCallbackCmd.kt */
/* loaded from: classes2.dex */
public final class nfm extends le6<Boolean> {
    public final Peer b;
    public final String c;
    public final String d;
    public final MessagesConversationBarCallbackSourceDto e;
    public final boolean f;
    public final Object g;

    public nfm(Peer peer, String str, String str2, MessagesConversationBarCallbackSourceDto messagesConversationBarCallbackSourceDto, boolean z, Object obj) {
        this.b = peer;
        this.c = str;
        this.d = str2;
        this.e = messagesConversationBarCallbackSourceDto;
        this.f = z;
        this.g = obj;
        if (peer.Ab(Peer.Type.UNKNOWN)) {
            throw new IllegalStateException(yq.b(peer, "Invalid peer ").toString());
        }
    }

    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        return (Boolean) bz2.c(new mfm(this.b, this.d, this.e, this.f), null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfm)) {
            return false;
        }
        nfm nfmVar = (nfm) obj;
        return epx.f(this.b, nfmVar.b) && epx.f(this.c, nfmVar.c) && epx.f(this.d, nfmVar.d) && this.e == nfmVar.e && this.f == nfmVar.f && epx.f(this.g, nfmVar.g);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int a = urd0.a(urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d);
        MessagesConversationBarCallbackSourceDto messagesConversationBarCallbackSourceDto = this.e;
        int b = qoy.b((a + (messagesConversationBarCallbackSourceDto == null ? 0 : messagesConversationBarCallbackSourceDto.hashCode())) * 31, 31, this.f);
        Object obj = this.g;
        return b + (obj != null ? obj.hashCode() : 0);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogInfoBarCallbackCmd(peer=");
        sb.append(this.b);
        sb.append(", barName=");
        sb.append(this.c);
        sb.append(", callbackData=");
        sb.append(this.d);
        sb.append(", source=");
        sb.append(this.e);
        sb.append(", isAwaitNetwork=");
        sb.append(this.f);
        sb.append(", changerTag=");
        return k73.c(sb, this.g, ')');
    }
}
