package xsna;

import com.vk.api.generated.calls.dto.CallsChatDto;
import com.vk.api.generated.messages.dto.MessagesConversationPeerDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;

/* compiled from: CallListChat.kt */
/* loaded from: classes7.dex */
public final class s49 {
    public final long a;
    public final String b;
    public final ImageList c;

    /* compiled from: CallListChat.kt */
    public static final class a {
        public static s49 a(CallsChatDto callsChatDto, MessagesConversationPeerDto messagesConversationPeerDto, String str, String str2) {
            if (callsChatDto == null) {
                if (str == null) {
                    str = "";
                }
                ImageList imageList = new ImageList(null, 1, null);
                if (str2 != null) {
                    imageList.zb(new Image(400, 400, str2, true));
                }
                s3q0 s3q0Var = s3q0.a;
                return new s49(0L, str, imageList);
            }
            Long valueOf = Long.valueOf(callsChatDto.d());
            if (epx.f(messagesConversationPeerDto != null ? messagesConversationPeerDto.d() : null, UserId.d)) {
                valueOf = null;
            }
            long longValue = valueOf != null ? valueOf.longValue() : 0L;
            String title = callsChatDto.getTitle();
            ImageList imageList2 = new ImageList(null, 1, null);
            imageList2.zb(new Image(400, 400, callsChatDto.e(), true));
            s3q0 s3q0Var2 = s3q0.a;
            return new s49(longValue, title, imageList2);
        }
    }

    public s49(long j, String str, ImageList imageList) {
        this.a = j;
        this.b = str;
        this.c = imageList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s49)) {
            return false;
        }
        s49 s49Var = (s49) obj;
        return this.a == s49Var.a && epx.f(this.b, s49Var.b) && epx.f(this.c, s49Var.c);
    }

    public final int hashCode() {
        return this.c.b.hashCode() + urd0.a(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "CallListChat(id=" + this.a + ", title=" + this.b + ", image=" + this.c + ')';
    }
}
