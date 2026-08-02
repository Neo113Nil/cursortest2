package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.exceptions.ApiAccessDeniedException;

/* compiled from: MessagesAddChatUserApiCmd.kt */
/* loaded from: classes2.dex */
public final class kd20 extends nx2<Boolean> {
    public final Peer b;
    public final Peer c;
    public final int d;
    public final boolean e;

    public kd20(Peer peer, Peer peer2, int i, boolean z) {
        this.b = peer;
        this.c = peer2;
        this.d = i;
        this.e = z;
        if (!peer.zb()) {
            throw new IllegalStateException("Check failed.");
        }
        if (!peer2.Ab(Peer.Type.USER) && !peer2.Ab(Peer.Type.CONTACT)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // xsna.nx2
    public final Boolean f(l7r0 l7r0Var) {
        try {
            vg20 vg20Var = new vg20();
            int i = (int) this.b.d;
            UserId b = com.vk.dto.common.a.b(this.c);
            int i2 = this.d;
            Integer valueOf = Integer.valueOf(i2);
            if (i2 <= 0) {
                valueOf = null;
            }
            return Boolean.TRUE;
        } catch (VKApiExecutionException e) {
            if (!e.J()) {
                throw e;
            }
            com.vk.metrics.eventtracking.b.a.a(e);
            throw new ApiAccessDeniedException(e);
        }
    }
}
