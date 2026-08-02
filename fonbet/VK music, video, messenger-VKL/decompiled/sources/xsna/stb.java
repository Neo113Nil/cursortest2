package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import java.util.List;

/* compiled from: ChatMessageRequestModel.kt */
/* loaded from: classes2.dex */
public final class stb {
    public final Dialog a;
    public final List<Peer> b;
    public final int c;
    public final ProfilesInfo d;
    public final Peer e;
    public final Peer f;

    /* JADX WARN: Multi-variable type inference failed */
    public stb(Dialog dialog, List<? extends Peer> list, int i, ProfilesInfo profilesInfo, Peer peer, Peer peer2) {
        this.a = dialog;
        this.b = list;
        this.c = i;
        this.d = profilesInfo;
        this.e = peer;
        this.f = peer2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stb)) {
            return false;
        }
        stb stbVar = (stb) obj;
        return epx.f(this.a, stbVar.a) && epx.f(this.b, stbVar.b) && this.c == stbVar.c && epx.f(this.d, stbVar.d) && epx.f(this.e, stbVar.e) && epx.f(this.f, stbVar.f);
    }

    public final int hashCode() {
        int a = bh10.a(ur.b(this.d, shy.a(this.c, fw3.a(this.a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e.b);
        Peer peer = this.f;
        return a + (peer == null ? 0 : Long.hashCode(peer.b));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatMessageRequestModel(dialog=");
        sb.append(this.a);
        sb.append(", membersActive=");
        sb.append(this.b);
        sb.append(", membersCount=");
        sb.append(this.c);
        sb.append(", profilesInfo=");
        sb.append(this.d);
        sb.append(", currentMember=");
        sb.append(this.e);
        sb.append(", inviter=");
        return eq.a(sb, this.f, ')');
    }
}
