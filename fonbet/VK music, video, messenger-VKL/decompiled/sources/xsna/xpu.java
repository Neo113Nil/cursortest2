package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.users.User;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ij20;

/* compiled from: GroupsGetMembersApiCmd.kt */
/* loaded from: classes2.dex */
public final class xpu extends nx2<List<? extends User>> {
    public final Peer b;
    public final int c;
    public final int d;
    public final String e;

    public xpu(int i, int i2, Peer peer, String str) {
        this.b = peer;
        this.c = i;
        this.d = i2;
        this.e = str;
        if (!peer.Ab(Peer.Type.GROUP)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // xsna.nx2
    public final List<? extends User> f(l7r0 l7r0Var) {
        ij20.a aVar = new ij20.a();
        aVar.d = l7r0Var.a.g;
        aVar.c = "groups.getMembers";
        aVar.f.put("group_id", Long.valueOf(this.b.d).toString());
        aVar.f.put(SignalingProtocol.KEY_OFFSET, Integer.valueOf(this.c).toString());
        aVar.f.put("count", Integer.valueOf(this.d).toString());
        aVar.b("filter", this.e);
        aVar.b("fields", ky2.b);
        return (List) l7r0Var.d(new ij20(aVar), wpu.b);
    }
}
