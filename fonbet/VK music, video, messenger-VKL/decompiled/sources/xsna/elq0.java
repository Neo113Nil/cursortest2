package xsna;

import com.vk.dto.common.Peer;

/* compiled from: UserOnlineInvalidateLpEvent.kt */
/* loaded from: classes2.dex */
public final class elq0 implements e900 {
    public final Peer a;

    public elq0(Peer peer) {
        this.a = peer;
        if (!peer.Ab(Peer.Type.USER)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
