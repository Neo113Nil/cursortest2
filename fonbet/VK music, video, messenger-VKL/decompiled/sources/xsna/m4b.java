package xsna;

import android.util.SparseArray;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.messages.Msg;

/* compiled from: ChannelMsgAddBatchLpEvent.kt */
/* loaded from: classes2.dex */
public final class m4b implements e900 {
    public final Peer a;
    public final SparseArray<Msg> b;
    public final boolean c;

    public m4b(Peer peer, SparseArray<Msg> sparseArray, boolean z) {
        this.a = peer;
        this.b = sparseArray;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4b)) {
            return false;
        }
        m4b m4bVar = (m4b) obj;
        return epx.f(this.a, m4bVar.a) && this.b.equals(m4bVar.b) && this.c == m4bVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelMsgAddBatchLpEvent(channelPeer=");
        sb.append(this.a);
        sb.append(", messagesByCnvId=");
        sb.append(this.b);
        sb.append(", isPostponedMessagesLp=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
