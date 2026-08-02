package xsna;

import com.vk.dto.common.Peer;
import java.util.List;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class dzr implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzr c;
    public final /* synthetic */ long d;

    public /* synthetic */ dzr(int i, gzr gzrVar, long j) {
        this.b = i;
        this.c = gzrVar;
        this.d = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List A = rli0.A(new ulp0(rli0.y(new qli0(rli0.j(new i5g((Set) obj), new cjm(this.d, 1)), cgg0.b), this.b), new j0r(2)));
        gzr gzrVar = this.c;
        return gzrVar.b.C(gzrVar, new tqm((List<? extends Peer>) A, gzrVar.d));
    }
}
