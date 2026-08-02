package xsna;

import com.vk.api.generated.groups.dto.GroupsGetMembersFilterDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.EntitySyncState;
import com.vk.dto.common.Peer;
import com.vk.im.engine.exceptions.ApiAccessDeniedException;
import com.vk.im.engine.models.ProfilesInfo;
import java.util.List;

/* compiled from: FriendsMutualGetFromNetworkCmd.kt */
/* loaded from: classes2.dex */
public final class hrs extends xl6<ers> {
    public final Peer b;
    public final boolean c;

    public hrs(Peer peer, boolean z) {
        this.b = peer;
        this.c = z;
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-mutual-friends-load-network";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        Peer peer = this.b;
        try {
            peer.getClass();
            boolean Ab = peer.Ab(Peer.Type.GROUP);
            boolean z = this.c;
            List<? extends Peer> list = (List) bz2.c(Ab ? new zpu(peer, GroupsGetMembersFilterDto.FRIENDS, z) : new qos(w2wVar.H0(), peer, z), null);
            long f1 = w2wVar.f1();
            w2wVar.I0().d().n(peer, list, f1);
            return new ers(list, EntitySyncState.ACTUAL, f1, true, new ProfilesInfo(), 32, 0);
        } catch (VKApiExecutionException e) {
            if (!e.J()) {
                throw e;
            }
            com.vk.metrics.eventtracking.b.a.a(e);
            throw new ApiAccessDeniedException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hrs)) {
            return false;
        }
        hrs hrsVar = (hrs) obj;
        return epx.f(this.b, hrsVar.b) && this.c == hrsVar.c;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Long.hashCode(this.b.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsMutualGetFromNetworkCmd(targetPeer=");
        sb.append(this.b);
        sb.append(", isAwaitNetwork=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
