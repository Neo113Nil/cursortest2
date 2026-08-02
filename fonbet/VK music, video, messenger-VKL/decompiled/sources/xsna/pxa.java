package xsna;

import com.vk.channels.api.ChannelActionInProgress;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.events.channels.OnChannelsCacheInvalidateEvent;
import com.vk.im.engine.models.im_item.ImItemType;
import java.util.Collections;
import xsna.pxa;

/* compiled from: ChannelDeleteCmd.kt */
/* loaded from: classes2.dex */
public final class pxa extends le6<s3q0> {
    public final Peer b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChannelDeleteCmd.kt */
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

    public pxa(Peer peer) {
        this.b = peer;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        Peer peer = this.b;
        final long j = peer.b;
        if (((a) w2wVar.I0().u(new izs() { // from class: xsna.oxa
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                uib a2 = ((xgl0) obj).a();
                long j2 = j;
                bdb c = a2.c(j2);
                if (c == null) {
                    return pxa.a.CANCELLED;
                }
                if (!c.m) {
                    return pxa.a.CANCELLED;
                }
                if (c.t != ChannelActionInProgress.NONE) {
                    return pxa.a.CANCELLED;
                }
                a2.q(j2, ChannelActionInProgress.DELETING, null);
                return pxa.a.SUCCESS;
            }
        })) == a.SUCCESS) {
            w2wVar.S0().Q(this, OnChannelsCacheInvalidateEvent.Reason.COMPLICATED_DB_CHANGE);
            w2wVar.e1(this, new r680(this, Collections.singleton(new b5w(j, ImItemType.CHANNEL))));
            w2wVar.O0().a(new qxa(peer));
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pxa) && epx.f(this.b, ((pxa) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Long.hashCode(this.b.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        return eq.a(new StringBuilder("ChannelDeleteCmd(channel="), this.b, ')');
    }
}
