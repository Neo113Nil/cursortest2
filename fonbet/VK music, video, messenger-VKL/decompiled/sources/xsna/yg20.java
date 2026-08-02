package xsna;

import com.vk.dto.common.Direction;
import com.vk.dto.common.Peer;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MessagesSpaceCalculatorImpl.kt */
/* loaded from: classes2.dex */
public final class yg20 {
    public final jod a;
    public final FunctionReferenceImpl b;
    public final zzs<Peer, gkx0, Direction, Integer, List<lj30>> c;
    public final izs<Peer, yj30> d;

    /* JADX WARN: Multi-variable type inference failed */
    public yg20(jod jodVar, gzs gzsVar, zzs zzsVar, izs izsVar) {
        this.a = jodVar;
        this.b = (FunctionReferenceImpl) gzsVar;
        this.c = zzsVar;
        this.d = izsVar;
    }

    public final xgk0 a(Peer peer, gkx0 gkx0Var) {
        return (xgk0) this.a.d(new defpackage.g0(this, peer, gkx0Var, 3));
    }

    public final boolean b(Peer peer, gkx0 gkx0Var) {
        return ((Boolean) this.a.d(new hgq(this, peer, gkx0Var, 3))).booleanValue();
    }

    public final boolean c(Peer peer, gkx0 gkx0Var) {
        return ((Boolean) this.a.d(new wj9(this, peer, gkx0Var, 1))).booleanValue();
    }

    public final boolean d(int i, Peer peer) {
        yj30 invoke = this.d.invoke(peer);
        return invoke != null && invoke.b && invoke.c == i;
    }
}
