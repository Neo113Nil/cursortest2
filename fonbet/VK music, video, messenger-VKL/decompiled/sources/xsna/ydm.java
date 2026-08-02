package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.Peer;
import com.vk.im.engine.exceptions.ApiAccessDeniedException;
import com.vk.im.engine.models.attaches.MediaType;
import java.util.Collections;
import xsna.ye20;

/* compiled from: DialogGetAttachHistoryCmd.kt */
/* loaded from: classes2.dex */
public final class ydm extends le6<ye20.a> {
    public final Peer b;
    public final MediaType c;
    public final String d;
    public final int e = 100;
    public final String f;

    public ydm(Peer peer, MediaType mediaType, String str, String str2) {
        this.b = peer;
        this.c = mediaType;
        this.d = str;
        this.f = str2;
    }

    @Override // xsna.le6
    public final ye20.a e(w2w w2wVar) {
        if (!sn.c(w2wVar).K(Collections.singletonList(Long.valueOf(this.b.b))).isEmpty()) {
            throw new ApiAccessDeniedException((VKApiExecutionException) null);
        }
        return (ye20.a) fo50.v(new ye20(this.b, this.c, this.e, w2wVar.Q0(), this.d, this.f), w2wVar, "DialogGetAttachHistoryCmd.MessagesGetHistoryAttachmentsApiCmd", 2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ydm.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ydm ydmVar = (ydm) obj;
        return epx.f(this.b, ydmVar.b) && this.c == ydmVar.c && epx.f(this.d, ydmVar.d) && this.e == ydmVar.e;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (Long.hashCode(this.b.b) * 31)) * 31;
        String str = this.d;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.e;
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogGetAttachHistoryCmd(peer=");
        sb.append(this.b);
        sb.append(", startFrom=");
        return ho8.a(sb, this.d, ')');
    }
}
