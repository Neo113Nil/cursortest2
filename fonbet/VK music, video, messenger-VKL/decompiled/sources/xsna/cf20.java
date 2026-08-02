package xsna;

import com.vk.api.generated.messages.dto.MessagesGetInviteLinkResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.exceptions.ApiAccessDeniedException;

/* compiled from: MessagesGetInviteLinkApiCmd.kt */
/* loaded from: classes2.dex */
public final class cf20 extends nx2<String> {
    public final Peer b;
    public final boolean c;
    public final boolean d;
    public final Peer e;
    public final int f;

    public cf20(Peer peer, boolean z, boolean z2, Peer peer2, int i) {
        this.b = peer;
        this.c = z;
        this.d = z2;
        this.e = peer2;
        this.f = i;
    }

    @Override // xsna.nx2
    public final String f(l7r0 l7r0Var) {
        Peer peer = this.e;
        try {
            vg20 vg20Var = new vg20();
            long j = this.b.b;
            Boolean valueOf = Boolean.valueOf(this.c);
            peer.getClass();
            UserId userId = peer.Ab(Peer.Type.GROUP) ? new UserId(peer.d) : null;
            int i = this.f;
            String d = ((MessagesGetInviteLinkResponseDto) bz2.l(sg20.b(vg20Var, j, valueOf, userId, i > 0 ? Integer.valueOf(i) : null, 8), this.d)).d();
            return d == null ? "" : d;
        } catch (VKApiExecutionException e) {
            if (e.s() != 919) {
                throw e;
            }
            com.vk.metrics.eventtracking.b.a.a(e);
            throw new ApiAccessDeniedException(e);
        }
    }
}
