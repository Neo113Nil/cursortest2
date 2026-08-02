package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.attaches.AttachWithId;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.MsgSyncState;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.im.engine.models.messages.MsgFromChannel;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: ChannelMsgSendViaBgCmd.kt */
/* loaded from: classes2.dex */
public final class m6b extends le6<s3q0> {
    public final Peer b;
    public final String c;
    public final MsgFromChannel d;
    public final ChannelMsgSendConfig e;

    public m6b(Peer peer, ChannelMsgSendConfig channelMsgSendConfig, MsgFromChannel msgFromChannel, String str) {
        this.b = peer;
        this.c = str;
        this.d = msgFromChannel;
        this.e = channelMsgSendConfig;
        if (peer.Ab(Peer.Type.UNKNOWN)) {
            throw new IllegalStateException("Illegal peer value");
        }
        zir0.a(msgFromChannel.E);
        boolean N = drm0.N(msgFromChannel.I.a);
        boolean isEmpty = msgFromChannel.E.isEmpty();
        if (N && isEmpty) {
            throw new IllegalArgumentException("Post content is absent");
        }
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        MsgFromChannel msgFromChannel = this.d;
        int i = msgFromChannel.b;
        if (i == 0) {
            msgFromChannel.b = w2wVar.d1();
        }
        msgFromChannel.E = new ArrayList(ph30.b(msgFromChannel.E, w2wVar));
        MsgSyncState msgSyncState = MsgSyncState.SENDING;
        msgFromChannel.g = qni0.a();
        msgFromChannel.o = msgSyncState;
        for (Attach attach : msgFromChannel.E) {
            if (msgSyncState == MsgSyncState.SENDING || msgSyncState == MsgSyncState.ERROR) {
                attach.S2(((attach instanceof AttachWithId) && ((AttachWithId) attach).M()) ? AttachSyncState.UPLOAD_REQUIRED : AttachSyncState.DONE);
            }
        }
        String str = this.c;
        ChannelMsgSendConfig channelMsgSendConfig = this.e;
        Peer peer = this.b;
        v4b v4bVar = new v4b(peer, channelMsgSendConfig, msgFromChannel, str);
        long j = peer.b;
        MsgFromChannel msgFromChannel2 = (MsgFromChannel) v4bVar.o(w2wVar);
        if (msgFromChannel2 == null) {
            throw new IllegalStateException("Merge message with local unsuccessful");
        }
        d6b d6bVar = d6b.a;
        if (i != 0) {
            w2wVar.e1(d6bVar, new o280("ChannelMsgSendViaBgCmd", j, i));
            w2wVar.S0().H(j);
        } else {
            if (msgFromChannel2.L) {
                w2wVar.e1(d6bVar, new i280("ChannelMsgSendViaBgCmd", j, Collections.singletonList(Integer.valueOf(msgFromChannel2.b))));
            } else {
                w2wVar.e1(d6bVar, new n280(j, Collections.singletonList(msgFromChannel2)));
            }
            w2wVar.S0().H(j);
        }
        d6b.c(w2wVar, msgFromChannel2);
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6b)) {
            return false;
        }
        m6b m6bVar = (m6b) obj;
        return epx.f(this.b, m6bVar.b) && epx.f(this.c, m6bVar.c) && epx.f(this.d, m6bVar.d) && epx.f(this.e, m6bVar.e);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.e.hashCode() + ((this.d.hashCode() + urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c)) * 31)) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelMsgSendViaBgCmd (peer=");
        sb.append(this.b);
        sb.append(", text='");
        BuildInfo.Client client = BuildInfo.a;
        MsgFromChannel msgFromChannel = this.d;
        sb.append(BuildInfo.d(msgFromChannel.I.a));
        sb.append("', guid = ");
        sb.append(this.c);
        sb.append(", textFormat = '");
        sb.append(BuildInfo.d(msgFromChannel.T.toString()));
        sb.append("', config=");
        sb.append(this.e);
        sb.append(" awaitJobExecution=false)");
        return sb.toString();
    }
}
