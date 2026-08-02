package xsna;

import com.vk.channels.api.Channel;
import com.vk.dto.common.Direction;
import com.vk.dto.messages.MsgIdType;
import kotlin.NoWhenBranchMatchedException;
import xsna.pdg0;

/* compiled from: ChannelHistoryBound.kt */
/* loaded from: classes16.dex */
public final class d0b implements g8v {
    public final long a;
    public final boolean b;
    public final a1w c;

    /* compiled from: ChannelHistoryBound.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.AFTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public d0b(long j, a1w a1wVar, boolean z) {
        this.a = j;
        this.b = z;
        this.c = a1wVar;
    }

    @Override // xsna.g8v
    public final boolean a(gj30 gj30Var, de deVar) {
        Object obj;
        boolean isEmpty = gj30Var.k().isEmpty();
        boolean z = this.b;
        if (isEmpty) {
            if (!gj30Var.o() || z) {
                return false;
            }
        } else if (deVar instanceof uj30) {
            if (gj30Var.e) {
                return false;
            }
        } else if (deVar instanceof sj30) {
            pdg0 n = this.c.n(this, new kza(this.a, true));
            if (n instanceof pdg0.a) {
                obj = null;
            } else {
                if (!(n instanceof pdg0.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                obj = ((pdg0.b) n).a;
            }
            Channel channel = (Channel) obj;
            if (channel == null || z) {
                return false;
            }
            if (channel.Ab()) {
                return gj30Var.s(channel.i);
            }
        } else if (deVar instanceof rj30) {
            rj30 rj30Var = (rj30) deVar;
            if (rj30Var.b == MsgIdType.CNV_ID) {
                return gj30Var.s(rj30Var.c);
            }
        }
        return true;
    }

    @Override // xsna.g8v
    public final gkx0 b(gj30 gj30Var, Direction direction) {
        int i = a.$EnumSwitchMapping$0[direction.ordinal()];
        if (i == 1) {
            return zq70.q(gj30Var);
        }
        if (i == 2) {
            return zq70.r(gj30Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
