package xsna;

import com.vk.dto.common.Peer;

/* compiled from: ImScopeKey.kt */
/* loaded from: classes2.dex */
public abstract class acw extends uaj0 {
    public final boolean a;

    /* compiled from: ImScopeKey.kt */
    public static final class a extends acw {
        public final Peer b;

        public a(Peer peer) {
            super(true);
            this.b = peer;
        }

        @Override // xsna.pwj0
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        @Override // xsna.pwj0
        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return eq.a(new StringBuilder("GroupMessagesScopeKey(peer="), this.b, ')');
        }
    }

    /* compiled from: ImScopeKey.kt */
    public static final class b extends acw {
        public static final b b = new b(false);
    }

    public acw(boolean z) {
        this.a = z;
    }
}
