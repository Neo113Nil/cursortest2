package xsna;

import com.vk.api.generated.messages.dto.MessagesConversationPeerTypeDto;
import com.vk.dto.common.id.UserId;
import com.vk.sharing.core.view.TargetSendActionView;

/* compiled from: Dialog.kt */
/* loaded from: classes16.dex */
public final class s8m {
    public final UserId a;
    public final String b;
    public final String c;
    public final boolean d;
    public final MessagesConversationPeerTypeDto e;
    public final TargetSendActionView.State f;

    public s8m(UserId userId, String str, String str2, boolean z, MessagesConversationPeerTypeDto messagesConversationPeerTypeDto, TargetSendActionView.State state) {
        this.a = userId;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = messagesConversationPeerTypeDto;
        this.f = state;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8m)) {
            return false;
        }
        s8m s8mVar = (s8m) obj;
        return epx.f(this.a, s8mVar.a) && epx.f(this.b, s8mVar.b) && epx.f(this.c, s8mVar.c) && this.d == s8mVar.d && this.e == s8mVar.e && this.f == s8mVar.f;
    }

    public final int hashCode() {
        int a = urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b);
        String str = this.c;
        int b = qoy.b((a + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        MessagesConversationPeerTypeDto messagesConversationPeerTypeDto = this.e;
        return this.f.hashCode() + ((b + (messagesConversationPeerTypeDto != null ? messagesConversationPeerTypeDto.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Dialog(id=" + this.a + ", name=" + this.b + ", photoUrl=" + this.c + ", isSelfDialog=" + this.d + ", type=" + this.e + ", state=" + this.f + ')';
    }

    public /* synthetic */ s8m(UserId userId, String str, String str2, MessagesConversationPeerTypeDto messagesConversationPeerTypeDto, int i) {
        this(userId, str, (i & 4) != 0 ? null : str2, (i & 8) == 0, (i & 16) != 0 ? null : messagesConversationPeerTypeDto, TargetSendActionView.State.SEND);
    }
}
