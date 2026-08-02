package xsna;

import com.vk.dto.common.Direction;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.exceptions.ImEngineException;
import com.vk.im.engine.internal.api_commands.messages.MsgHistoryApiLoadMode;
import com.vk.im.engine.models.Order;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: RemoteMsgHistoryLoaderByCnvId.kt */
/* loaded from: classes2.dex */
public final class svf0 {
    public final qfu a;
    public final xj30 b;
    public final rvf0 c;
    public final mf20 d;
    public final g5q0 e;

    /* compiled from: RemoteMsgHistoryLoaderByCnvId.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MsgIdType.values().length];
            try {
                iArr[MsgIdType.LOCAL_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MsgIdType.CNV_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Direction.values().length];
            try {
                iArr2[Direction.BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Direction.AFTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public svf0(qfu qfuVar, xj30 xj30Var, rvf0 rvf0Var, mf20 mf20Var, g5q0 g5q0Var) {
        this.a = qfuVar;
        this.b = xj30Var;
        this.c = rvf0Var;
        this.d = mf20Var;
        this.e = g5q0Var;
    }

    public final int a(Peer peer, gkx0 gkx0Var, Direction direction) {
        Integer h = this.d.h(peer, gkx0Var);
        int intValue = h != null ? h.intValue() : 0;
        if (intValue > 0) {
            return intValue;
        }
        int i = a.$EnumSwitchMapping$1[direction.ordinal()];
        if (i == 1) {
            lj30 b = b(peer, gkx0Var, Direction.AFTER);
            lj30 b2 = b(peer, gkx0Var, Direction.BEFORE);
            if (b != null && !b.i) {
                return b.d;
            }
            if (b2 != null && !b2.j) {
                return b2.d;
            }
            if (b != null) {
                return b.d;
            }
            return Integer.MAX_VALUE;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        lj30 b3 = b(peer, gkx0Var, Direction.BEFORE);
        lj30 b4 = b(peer, gkx0Var, Direction.AFTER);
        if (b3 != null && !b3.j) {
            return b3.d;
        }
        if (b4 != null && !b4.i) {
            return b4.d;
        }
        if (b3 != null) {
            return b3.d;
        }
        return 0;
    }

    public final lj30 b(Peer peer, gkx0 gkx0Var, Direction direction) {
        Object obj;
        while (true) {
            ArrayList n = this.d.n(peer, gkx0Var, direction, 10);
            Iterator it = n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((lj30) obj).d > 0) {
                    break;
                }
            }
            lj30 lj30Var = (lj30) obj;
            if (lj30Var != null) {
                return lj30Var;
            }
            if (n.size() < 10) {
                return null;
            }
            gkx0Var = ((lj30) j5g.i0(n)).h;
        }
    }

    public final gj30 c(Peer peer, de deVar, int i, Order order) {
        zt90 d;
        int i2;
        if (deVar instanceof wj30) {
            wj30 wj30Var = (wj30) deVar;
            Direction direction = wj30Var.c;
            d = d(peer, a(peer, wj30Var.b, direction), direction, i);
        } else {
            boolean z = deVar instanceof tj30;
            rvf0 rvf0Var = this.c;
            if (z) {
                d = rvf0Var.a(peer, MsgHistoryApiLoadMode.AROUND, a(peer, null, Direction.AFTER), i);
            } else {
                boolean z2 = deVar instanceof vj30;
                gkx0 gkx0Var = gkx0.e;
                mf20 mf20Var = this.d;
                if (z2) {
                    vj30 vj30Var = (vj30) deVar;
                    int i3 = vj30Var.c;
                    MsgIdType msgIdType = vj30Var.b;
                    Direction direction2 = vj30Var.d;
                    int i4 = a.$EnumSwitchMapping$0[msgIdType.ordinal()];
                    if (i4 == 1) {
                        gkx0 J = mf20Var.J(i3);
                        if (J != null) {
                            gkx0Var = J;
                        }
                        d = d(peer, a(peer, gkx0Var, direction2), direction2, i);
                    } else {
                        if (i4 != 2) {
                            throw new ImEngineException("Unsupported id type " + msgIdType);
                        }
                        d = d(peer, i3, direction2, i);
                    }
                } else if (deVar instanceof rj30) {
                    rj30 rj30Var = (rj30) deVar;
                    int i5 = rj30Var.c;
                    MsgIdType msgIdType2 = rj30Var.b;
                    int i6 = a.$EnumSwitchMapping$0[msgIdType2.ordinal()];
                    if (i6 == 1) {
                        Direction direction3 = Direction.AFTER;
                        gkx0 J2 = mf20Var.J(i5);
                        if (J2 != null) {
                            gkx0Var = J2;
                        }
                        d = rvf0Var.a(peer, MsgHistoryApiLoadMode.AROUND, a(peer, gkx0Var, direction3), i);
                    } else {
                        if (i6 != 2) {
                            throw new ImEngineException("Unsupported id type " + msgIdType2);
                        }
                        d = rvf0Var.a(peer, MsgHistoryApiLoadMode.AROUND, i5, i);
                    }
                } else {
                    if (!(deVar instanceof sj30)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f5q0 b = this.e.b(peer);
                    if (b == null) {
                        throw new IllegalArgumentException(yq.b(peer, "Unknown unreadInfo = "));
                    }
                    d = (b.a <= 0 || (i2 = b.b) <= 0) ? d(peer, Integer.MAX_VALUE, Direction.BEFORE, i) : rvf0Var.a(peer, MsgHistoryApiLoadMode.AROUND, i2, i);
                }
            }
        }
        this.b.a(d);
        return this.a.a(peer, deVar, i, order);
    }

    public final zt90 d(Peer peer, int i, Direction direction, int i2) {
        return this.c.a(peer, a.$EnumSwitchMapping$1[direction.ordinal()] == 1 ? MsgHistoryApiLoadMode.BEFORE : MsgHistoryApiLoadMode.AFTER, i, i2);
    }
}
