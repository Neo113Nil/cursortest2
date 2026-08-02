package xsna;

import com.vk.dto.common.EntitySyncState;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: FriendsMutualGetFromCacheCmd.kt */
/* loaded from: classes2.dex */
public final class grs extends le6<ers> {
    public final Peer b;

    public grs(Peer peer) {
        this.b = peer;
    }

    @Override // xsna.le6
    public final ers e(w2w w2wVar) {
        irs f = w2wVar.I0().d().f(this.b);
        List list = f != null ? f.a : EmptyList.b;
        long j = f != null ? f.b : 0L;
        return new ers(list, f == null ? EntitySyncState.MISSED : w2wVar.f1() - j > w2wVar.getConfig().y ? EntitySyncState.EXPIRED : EntitySyncState.ACTUAL, j, false, new ProfilesInfo(), 32, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof grs) && epx.f(this.b, ((grs) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Long.hashCode(this.b.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        return eq.a(new StringBuilder("FriendsMutualGetFromCacheCmd(targetPeer="), this.b, ')');
    }
}
