package xsna;

import com.vk.channels.api.ChannelActionInProgress;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.groups.MemberStatus;
import xsna.z0b;

/* compiled from: ChannelLeaveCmd.kt */
/* loaded from: classes2.dex */
public final class z0b extends le6<s3q0> {
    public final Peer b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChannelLeaveCmd.kt */
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

    public z0b(Peer peer) {
        this.b = peer;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        Peer peer = this.b;
        final long j = peer.b;
        if (((a) w2wVar.I0().u(new izs() { // from class: xsna.y0b
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                Group group;
                xgl0 xgl0Var = (xgl0) obj;
                uib a2 = xgl0Var.a();
                long j2 = j;
                bdb c = a2.c(j2);
                if (c == null) {
                    return z0b.a.CANCELLED;
                }
                boolean z = c.m;
                ChannelActionInProgress channelActionInProgress = c.t;
                ChannelType channelType = c.v;
                Long l = c.w;
                ChannelType channelType2 = ChannelType.COMMUNITY_CHANNEL;
                if (channelType != channelType2 || l == null) {
                    group = null;
                } else {
                    bru n = xgl0Var.n();
                    long longValue = l.longValue();
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    group = n.b(Peer.a.d(longValue));
                }
                if (c.n) {
                    if (channelActionInProgress != ChannelActionInProgress.NONE) {
                        return z0b.a.CANCELLED;
                    }
                    a2.q(j2, ChannelActionInProgress.LEAVING, null);
                    return z0b.a.SUCCESS;
                }
                if (channelType == channelType2 && !z) {
                    MemberStatus.a aVar = MemberStatus.Companion;
                    Integer valueOf = group != null ? Integer.valueOf(group.p) : null;
                    aVar.getClass();
                    if (MemberStatus.a.a(valueOf) != MemberStatus.REQUEST_SENT) {
                        return z0b.a.CANCELLED;
                    }
                }
                if (channelType != channelType2 && !z) {
                    return z0b.a.CANCELLED;
                }
                if (channelActionInProgress != ChannelActionInProgress.NONE) {
                    return z0b.a.CANCELLED;
                }
                a2.q(j2, ChannelActionInProgress.LEAVING, null);
                return z0b.a.SUCCESS;
            }
        })) == a.SUCCESS) {
            w2wVar.S0().H(j);
            w2wVar.O0().a(new a1b(peer));
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0b) && epx.f(this.b, ((z0b) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Long.hashCode(this.b.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        return eq.a(new StringBuilder("ChannelLeaveCmd(channelPeer="), this.b, ')');
    }
}
