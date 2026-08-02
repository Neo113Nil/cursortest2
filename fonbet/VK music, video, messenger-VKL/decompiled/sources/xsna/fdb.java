package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.groups.Group;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ChannelSubscribersCountGetCmd.kt */
/* loaded from: classes2.dex */
public final class fdb extends le6<Integer> {
    public final Peer b;
    public final Source c;

    /* compiled from: ChannelSubscribersCountGetCmd.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Source.NETWORK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Source.ACTUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public fdb(Peer peer, Source source) {
        this.b = peer;
        this.c = source;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r5 > xsna.xuo0.a()) goto L18;
     */
    @Override // xsna.le6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Integer e(w2w w2wVar) {
        Group f;
        int i = a.$EnumSwitchMapping$0[this.c.ordinal()];
        Peer peer = this.b;
        if (i == 1) {
            f = f(w2wVar, peer, Source.CACHE);
        } else if (i == 2) {
            f = f(w2wVar, peer, Source.NETWORK);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f = f(w2wVar, peer, Source.CACHE);
            if (f != null) {
                long millis = TimeUnit.HOURS.toMillis(1L) + f.l;
                xuo0.a.getClass();
            }
            f = f(w2wVar, peer, Source.NETWORK);
        }
        return Integer.valueOf(f != null ? f.m : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdb)) {
            return false;
        }
        fdb fdbVar = (fdb) obj;
        return epx.f(this.b, fdbVar.b) && this.c == fdbVar.c;
    }

    public final Group f(w2w w2wVar, Peer peer, Source source) {
        return (Group) ((wpp) w2wVar.L0(this, new tpu(Collections.singletonList(this.b), source, source != Source.CACHE, 8))).c.get(Long.valueOf(peer.d));
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "ChannelSubscribersCountGetCmd(groupPeer=" + this.b + ", source=" + this.c + ')';
    }
}
