package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class k1w implements izs {
    public final /* synthetic */ long b;
    public final /* synthetic */ a1w c;
    public final /* synthetic */ rmw0 d;

    public /* synthetic */ k1w(long j, a1w a1wVar, rmw0 rmw0Var) {
        this.b = j;
        this.c = a1wVar;
        this.d = rmw0Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return this.c.C(this.d, new tqm(Peer.a.b(this.b), Source.CACHE)).w();
    }
}
