package xsna;

import com.vk.dto.common.Peer;

/* compiled from: ChannelMsgRangeArgs.kt */
/* loaded from: classes2.dex */
public abstract class c5b {
    public final Peer a;

    /* compiled from: ChannelMsgRangeArgs.kt */
    public static final class a extends c5b {
        public final boolean b;

        public a(Peer peer, boolean z) {
            super(peer);
            this.b = z;
        }
    }

    /* compiled from: ChannelMsgRangeArgs.kt */
    public static final class b extends c5b {
        public final int b;

        public b(int i, Peer peer) {
            super(peer);
            this.b = i;
        }
    }

    public c5b(Peer peer) {
        this.a = peer;
        peer.getClass();
        if (!peer.Ab(Peer.Type.GROUP)) {
            throw new IllegalArgumentException(yq.b(peer, "Channel peer is invalid, "));
        }
    }
}
