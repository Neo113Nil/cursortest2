package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import kotlin.Pair;
import xsna.d5v;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class x4w implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ x4w(Peer peer, int i, z4w z4wVar) {
        this.d = peer;
        this.c = i;
        this.e = z4wVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Peer peer = (Peer) this.d;
                int i = this.c;
                z4w z4wVar = (z4w) this.e;
                yg30 yg30Var = new yg30(peer, ((qtd0) obj).B7(), i, z4wVar);
                a1w a1wVar = q1w.a;
                if (a1wVar == null) {
                    a1wVar = null;
                }
                return a1wVar.C(z4wVar, yg30Var);
            default:
                iu50 iu50Var = (iu50) this.d;
                UserId userId = (UserId) this.e;
                int i2 = this.c;
                if (((Boolean) obj).booleanValue()) {
                    iu50Var.b.a(new Pair<>(userId, new d5v.c(i2)));
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ x4w(iu50 iu50Var, UserId userId, int i) {
        this.d = iu50Var;
        this.e = userId;
        this.c = i;
    }
}
