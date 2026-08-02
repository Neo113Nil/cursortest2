package xsna;

import com.vk.channels.api.ChannelActionInProgress;
import com.vk.dto.common.Peer;
import com.vk.im.engine.ChannelSource;
import xsna.s0b;

/* compiled from: ChannelJoinCmd.kt */
/* loaded from: classes2.dex */
public final class s0b extends le6<s3q0> {
    public final Peer b;
    public final ChannelSource c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChannelJoinCmd.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a CANCELLED;
        public static final a SUCCESS;

        static {
            a aVar = new a("CANCELLED", 0);
            CANCELLED = aVar;
            a aVar2 = new a("SUCCESS", 1);
            SUCCESS = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public s0b(Peer peer, ChannelSource channelSource) {
        this.b = peer;
        this.c = channelSource;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        Peer peer = this.b;
        final long j = peer.b;
        if (((a) w2wVar.I0().u(new izs() { // from class: xsna.r0b
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                uib a2 = ((xgl0) obj).a();
                long j2 = j;
                bdb c = a2.c(j2);
                if (c == null) {
                    return s0b.a.CANCELLED;
                }
                ChannelActionInProgress channelActionInProgress = c.t;
                if (c.n) {
                    if (channelActionInProgress != ChannelActionInProgress.NONE) {
                        return s0b.a.CANCELLED;
                    }
                    a2.q(j2, ChannelActionInProgress.JOINING, null);
                    return s0b.a.SUCCESS;
                }
                if (c.m) {
                    return s0b.a.CANCELLED;
                }
                if (channelActionInProgress != ChannelActionInProgress.NONE) {
                    return s0b.a.CANCELLED;
                }
                a2.q(j2, ChannelActionInProgress.JOINING, null);
                return s0b.a.SUCCESS;
            }
        })) == a.SUCCESS) {
            w2wVar.S0().H(j);
            w2wVar.O0().a(new t0b(peer, this.c));
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0b)) {
            return false;
        }
        s0b s0bVar = (s0b) obj;
        return epx.f(this.b, s0bVar.b) && epx.f(this.c, s0bVar.c);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "ChannelJoinCmd(channelPeer=" + this.b + ", source=" + this.c + ')';
    }
}
