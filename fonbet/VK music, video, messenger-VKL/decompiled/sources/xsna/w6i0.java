package xsna;

import com.vk.dto.common.Peer;

/* compiled from: SelectChannelViewAction.kt */
/* loaded from: classes16.dex */
public abstract class w6i0 implements kj50 {

    /* compiled from: SelectChannelViewAction.kt */
    public static final class a extends w6i0 {
        public final Peer b;

        public a(Peer peer) {
            this.b = peer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return eq.a(new StringBuilder("OnSelectPeerAction(peer="), this.b, ')');
        }
    }
}
