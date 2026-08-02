package xsna;

import com.vk.api.generated.messages.dto.MessagesGetChatPreviewResponseDto;
import com.vk.api.generated.messages.dto.MessagesJoinChatByInviteLinkResponseDto;

/* compiled from: ChatsGetAndJoinByLinkCmd.kt */
/* loaded from: classes2.dex */
public final class rzb extends xl6<Long> {
    public final String b;

    public rzb(String str) {
        this.b = str;
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-chat-invite";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        long j;
        int intValue;
        tfx tfxVar = new tfx("messages.getChatPreview", new xr(23), new io.reactivex.rxjava3.processors.b(24));
        String str = this.b;
        if (str != null) {
            tfx.o(tfxVar, "link", str, 0, 0, 12);
        }
        dz2 x = yfb.x(tfxVar);
        x.n = true;
        Integer d = ((MessagesGetChatPreviewResponseDto) bz2.c(x, null)).d().d();
        if (d == null || d.intValue() == 0) {
            tfx tfxVar2 = new tfx("messages.joinChatByInviteLink", new com.vk.movika.sdk.base.model.history.b(22), new fq(22));
            tfx.o(tfxVar2, "link", str, 0, 0, 12);
            dz2 x2 = yfb.x(tfxVar2);
            x2.n = true;
            Integer d2 = ((MessagesJoinChatByInviteLinkResponseDto) bz2.c(x2, null)).d();
            if (d2 == null) {
                j = 0;
                return Long.valueOf(j);
            }
            intValue = d2.intValue();
        } else {
            intValue = d.intValue();
        }
        j = intValue;
        return Long.valueOf(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rzb) && epx.f(this.b, ((rzb) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return ho8.a(new StringBuilder("ChatsGetAndJoinByLinkCmd(link="), this.b, ')');
    }
}
