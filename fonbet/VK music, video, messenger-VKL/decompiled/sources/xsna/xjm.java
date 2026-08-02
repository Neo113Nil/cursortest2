package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class xjm implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ xjm(long j, int i) {
        this.b = i;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        long j = this.c;
        switch (i) {
            case 0:
                xgl0 xgl0Var = (xgl0) obj;
                int d = xgl0Var.system().d();
                Integer S = xgl0Var.b().e().S(j);
                return Boolean.valueOf(S != null && S.intValue() == d);
            default:
                ipm ipmVar = (ipm) obj;
                boolean c = ipmVar.a(j).d.c();
                if (!c) {
                    return io.reactivex.rxjava3.core.x.k(ipmVar);
                }
                if (!c) {
                    throw new NoWhenBranchMatchedException();
                }
                a1w a1wVar = q1w.a;
                if (a1wVar == null) {
                    a1wVar = null;
                }
                Serializer.c<Peer> cVar = Peer.CREATOR;
                return a1wVar.E("openChat", new uqm(Peer.a.b(j), Source.ACTUAL));
        }
    }
}
