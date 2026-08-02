package xsna;

import com.vk.dto.common.Peer;

/* compiled from: CreateChannelUseCase.kt */
/* loaded from: classes2.dex */
public final class r6k {
    public final a1w a;
    public final v3q b;

    /* compiled from: CreateChannelUseCase.kt */
    public static final class a {
        public final Peer a;
        public final Throwable b;

        public a(Peer peer, Throwable th) {
            this.a = peer;
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.a.b) * 31;
            Throwable th = this.b;
            return hashCode + (th == null ? 0 : th.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Result(channelPeer=");
            sb.append(this.a);
            sb.append(", avatarError=");
            return oq.c(sb, this.b, ')');
        }
    }

    public r6k(a1w a1wVar, asu0 asu0Var) {
        this.a = a1wVar;
        this.b = asu0Var;
    }
}
