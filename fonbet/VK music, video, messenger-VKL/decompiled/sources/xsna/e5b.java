package xsna;

import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.MsgSyncState;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;

/* compiled from: ChannelMsgRetryViaBgCmd.kt */
/* loaded from: classes2.dex */
public final class e5b extends le6<s3q0> {
    public final int b;

    public e5b(int i) {
        this.b = i;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        r3b y = w2wVar.I0().y();
        Msg e = y.b.e(this.b);
        if (e == null) {
            throw new IllegalStateException("Local message absent for send retry");
        }
        MsgFromChannel msgFromChannel = (MsgFromChannel) e;
        Peer peer = msgFromChannel.h;
        peer.getClass();
        if (peer.Ab(Peer.Type.UNKNOWN)) {
            throw new IllegalStateException("Illegal peer value for channel message send retry");
        }
        zir0.a(msgFromChannel.E);
        String str = msgFromChannel.P;
        if (str == null) {
            throw new IllegalStateException("Channel message send retry. Parameter guid can't be null");
        }
        if (str.length() <= 0) {
            throw new IllegalStateException("Channel message send retry. Parameter guid can't be empty");
        }
        boolean N = drm0.N(msgFromChannel.I.a);
        boolean isEmpty = msgFromChannel.E.isEmpty();
        if (N && isEmpty) {
            throw new IllegalArgumentException("Post content is absent");
        }
        d6b.a.a(w2wVar, this.b, MsgSyncState.SENDING, AttachSyncState.UPLOAD_REQUIRED, "ChannelMsgRetryViaBgCmd");
        d6b.c(w2wVar, msgFromChannel);
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e5b) && this.b == ((e5b) obj).b;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(false) + (Integer.hashCode(this.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return h5s.c(this.b, ", awaitJobExecution=false)", new StringBuilder("ChannelMsgRetryViaBgCmd(msgLocalId="));
    }
}
