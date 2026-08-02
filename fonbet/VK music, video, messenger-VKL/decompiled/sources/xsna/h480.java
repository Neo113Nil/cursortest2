package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;

/* compiled from: OnDialogMsgRequestSentEvent.kt */
/* loaded from: classes2.dex */
public final class h480 extends sxp {
    public final long b;
    public final Peer c;
    public final ProfilesInfo d;

    public h480(long j, Peer peer, ProfilesInfo profilesInfo) {
        this.b = j;
        this.c = peer;
        this.d = profilesInfo;
    }

    @Override // xsna.sxp
    public final Object a() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnDialogMsgRequestSentEvent(dialogId=");
        sb.append(this.b);
        sb.append(", member=");
        return eq.a(sb, this.c, ')');
    }
}
