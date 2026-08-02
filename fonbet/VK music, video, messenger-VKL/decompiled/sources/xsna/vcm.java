package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.ChatPermissions;

/* compiled from: DialogControlsChangeCmd.kt */
/* loaded from: classes2.dex */
public final class vcm extends le6<Boolean> {
    public final Peer b;
    public final ChatPermissions c;
    public final Boolean d;
    public final Boolean e;
    public final Boolean f;
    public final Boolean g;

    public vcm(Peer peer, ChatPermissions chatPermissions, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.b = peer;
        this.c = chatPermissions;
        this.d = bool;
        this.e = bool2;
        this.f = bool3;
        this.g = bool4;
    }

    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        Peer peer = this.b;
        if (peer.zb()) {
            bz2.c(new ce20(this.b, null, this.c, this.d, null, false, w2wVar.Q0(), this.e, this.f, this.g, 18), null);
            return Boolean.TRUE;
        }
        throw new IllegalArgumentException("Specified peer=" + peer + " is not a chat");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vcm)) {
            return false;
        }
        vcm vcmVar = (vcm) obj;
        return epx.f(this.b, vcmVar.b) && epx.f(this.c, vcmVar.c) && epx.f(this.d, vcmVar.d) && epx.f(this.e, vcmVar.e) && epx.f(this.f, vcmVar.f) && epx.f(this.g, vcmVar.g);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int hashCode = Long.hashCode(this.b.b) * 31;
        ChatPermissions chatPermissions = this.c;
        int hashCode2 = (hashCode + (chatPermissions == null ? 0 : chatPermissions.hashCode())) * 31;
        Boolean bool = this.d;
        int b = qoy.b((hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31, 31, false);
        Boolean bool2 = this.e;
        int hashCode3 = (b + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.g;
        return hashCode4 + (bool4 != null ? bool4.hashCode() : 0);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogControlsChangeCmd(peer=");
        sb.append(this.b);
        sb.append(", chatPermissions=");
        sb.append(this.c);
        sb.append(", isService=");
        sb.append(this.d);
        sb.append(", isAwaitNetwork=false, isDisableStickersPopupAutoplay=");
        sb.append(this.e);
        sb.append(", disableServiceMessages=");
        sb.append(this.f);
        sb.append(", disableForwarding=");
        return tn.a(sb, this.g, ')');
    }
}
