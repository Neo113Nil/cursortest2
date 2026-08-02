package xsna;

import com.vk.im.engine.models.events.channels.OnChannelsCacheInvalidateEvent;
import com.vk.im.engine.models.groups.MemberStatus;

/* compiled from: GroupChangeMemberStatusCmd.kt */
/* loaded from: classes2.dex */
public final class mju extends le6<Boolean> {
    public final long b;
    public final MemberStatus c;

    public mju(long j, MemberStatus memberStatus) {
        this.b = j;
        this.c = memberStatus;
    }

    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        w2wVar.I0().n().h(-this.b, this.c);
        w2wVar.S0().Q("GroupChangeMemberStatusCmd", OnChannelsCacheInvalidateEvent.Reason.SUGGESTS_UPDATED);
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mju)) {
            return false;
        }
        mju mjuVar = (mju) obj;
        return this.b == mjuVar.b && this.c == mjuVar.c;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "GroupChangeMemberStatusCmd(groupId=" + this.b + ", memberStatus=" + this.c + ')';
    }
}
