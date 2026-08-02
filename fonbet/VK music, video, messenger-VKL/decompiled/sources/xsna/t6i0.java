package xsna;

import com.vk.dto.common.Peer;

/* compiled from: SelectChannelNavigationEvent.kt */
/* loaded from: classes16.dex */
public abstract class t6i0 implements vl50 {

    /* compiled from: SelectChannelNavigationEvent.kt */
    public static final class a extends t6i0 {
        public final Peer a;

        public a(Peer peer) {
            this.a = peer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return eq.a(new StringBuilder("FinishWithSuccess(peer="), this.a, ')');
        }
    }
}
