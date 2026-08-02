package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.internal.api_commands.friends.FriendsAddApiCmd;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.users.User;
import xsna.g1e0;

/* compiled from: FriendsAddCmd.kt */
/* loaded from: classes2.dex */
public final class zjs extends xl6<qtd0> {
    public final Peer b;
    public final boolean c;
    public final FriendsAddApiCmd.Source d;
    public final FriendsAddApiCmd.BlockType e;

    public zjs(Peer peer, FriendsAddApiCmd.Source source, FriendsAddApiCmd.BlockType blockType, int i) {
        boolean z = (i & 2) == 0;
        source = (i & 4) != 0 ? FriendsAddApiCmd.Source.NONE : source;
        blockType = (i & 8) != 0 ? FriendsAddApiCmd.BlockType.NONE : blockType;
        this.b = peer;
        this.c = z;
        this.d = source;
        this.e = blockType;
        if (!peer.Ab(Peer.Type.USER)) {
            throw new IllegalArgumentException("Expect only users as a peer");
        }
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-friends-management-network";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        FriendsAddApiCmd.Source source = this.d;
        FriendsAddApiCmd.BlockType blockType = this.e;
        Peer peer = this.b;
        boolean z = this.c;
        int intValue = ((Number) bz2.c(new FriendsAddApiCmd(peer, z, source, blockType), null)).intValue();
        g1e0.a aVar = new g1e0.a();
        aVar.a.c(peer);
        aVar.b = Source.NETWORK;
        aVar.c = z;
        qtd0 Bb = ((ProfilesInfo) w2wVar.L0(this, new d1e0(new g1e0(aVar)))).Bb(peer);
        if (Bb instanceof User) {
            return User.zb((User) Bb, null, null, null, false, null, false, intValue, null, false, null, -16777217);
        }
        if (Bb != null) {
            return Bb;
        }
        throw new IllegalStateException("Peer not found");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjs)) {
            return false;
        }
        zjs zjsVar = (zjs) obj;
        return epx.f(this.b, zjsVar.b) && this.c == zjsVar.c && this.d == zjsVar.d && this.e == zjsVar.e;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + qoy.b(Long.hashCode(this.b.b) * 31, 31, this.c)) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "FriendsAddCmd(peer=" + this.b + ", isAwaitNetwork=" + this.c + ", source=" + this.d + ", blockType=" + this.e + ')';
    }
}
