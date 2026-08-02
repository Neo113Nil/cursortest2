package xsna;

import com.vk.dto.common.Direction;
import com.vk.dto.common.Peer;
import java.util.List;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CnvMessagesSpaceCalculator.kt */
/* loaded from: classes2.dex */
public final class exf {
    public final /* synthetic */ yg20 a;
    public final xgl0 b;
    public final mf20 c;
    public final b2a0 d;

    /* compiled from: CnvMessagesSpaceCalculator.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<Integer> {
        @Override // xsna.gzs
        public final Integer invoke() {
            return Integer.valueOf(((b2a0) this.receiver).a());
        }
    }

    /* compiled from: CnvMessagesSpaceCalculator.kt */
    public static final /* synthetic */ class b extends AdaptedFunctionReference implements zzs<Peer, gkx0, Direction, Integer, List<? extends lj30>> {
        @Override // xsna.zzs
        public final List<? extends lj30> invoke(Peer peer, gkx0 gkx0Var, Direction direction, Integer num) {
            int intValue = num.intValue();
            return ((mf20) this.receiver).n(peer, gkx0Var, direction, intValue);
        }
    }

    /* compiled from: CnvMessagesSpaceCalculator.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Peer, yj30> {
        @Override // xsna.izs
        public final yj30 invoke(Peer peer) {
            return ((mf20) this.receiver).q(peer);
        }
    }

    public exf(xgl0 xgl0Var, mf20 mf20Var, b2a0 b2a0Var) {
        this.a = new yg20(new jod(xgl0Var), new a(0, b2a0Var, b2a0.class, "getPhaseId", "getPhaseId()I", 0), new b(4, mf20Var, mf20.class, "getHistory", "getHistory(Lcom/vk/dto/common/Peer;Lcom/vk/dto/messages/Weight;Lcom/vk/dto/common/Direction;II)Ljava/util/List;", 0), new c(1, mf20Var, mf20.class, "getHistoryIsEmptyValue", "getHistoryIsEmptyValue(Lcom/vk/dto/common/Peer;)Lcom/vk/im/engine/models/messages/MsgHistoryOnServerIsEmpty;", 0));
        this.b = xgl0Var;
        this.c = mf20Var;
        this.d = b2a0Var;
    }
}
