package xsna;

import com.ironsource.C4504q2;
import com.vk.dto.common.Peer;
import com.vk.dto.user.Platform;
import java.util.Collection;
import java.util.Map;
import xsna.ij20;

/* compiled from: FriendsGetOnlineApiCmd.kt */
/* loaded from: classes2.dex */
public final class tos extends nx2<Map<Platform, ? extends Collection<? extends Long>>> {
    public final Peer b;
    public final int c = 100;
    public final boolean d = true;
    public final int e = 2;

    public tos(Peer peer) {
        this.b = peer;
        if (!peer.Ab(Peer.Type.USER)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // xsna.nx2
    public final Map<Platform, ? extends Collection<? extends Long>> f(l7r0 l7r0Var) {
        ij20.a aVar = new ij20.a();
        aVar.d = l7r0Var.a.g;
        aVar.c = "friends.getOnline";
        aVar.b(C4504q2.u, "hints");
        aVar.f.put("user_id", Long.valueOf(this.b.d).toString());
        Integer num = 1;
        aVar.f.put("online_mobile", num.toString());
        aVar.f.put("count", Integer.valueOf(this.c).toString());
        aVar.i = this.d;
        aVar.g = this.e;
        return (Map) l7r0Var.d(new ij20(aVar), sos.b);
    }
}
