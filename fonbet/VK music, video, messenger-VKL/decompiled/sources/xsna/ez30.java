package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.messages.MsgSyncState;
import com.vk.im.engine.internal.merge.messages.WeightStrategy;
import com.vk.im.engine.models.messages.Msg;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ez30 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ MsgSyncState c;
    public final /* synthetic */ WeightStrategy d;
    public final /* synthetic */ w2w e;
    public final /* synthetic */ AttachSyncState f;

    public /* synthetic */ ez30(int i, MsgSyncState msgSyncState, WeightStrategy weightStrategy, w2w w2wVar, AttachSyncState attachSyncState) {
        this.b = i;
        this.c = msgSyncState;
        this.d = weightStrategy;
        this.e = w2wVar;
        this.f = attachSyncState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List<Attach> K0;
        d040 o = ((xgl0) obj).o();
        int i = this.b;
        Msg L = o.L(i);
        if (L == 0) {
            throw new IllegalArgumentException(tgw.b(i, "Msg with localId = ", " not exist"));
        }
        xuo0.a.getClass();
        L.g = xuo0.a();
        L.o = this.c;
        com.vk.im.engine.models.messages.a aVar = L instanceof com.vk.im.engine.models.messages.a ? (com.vk.im.engine.models.messages.a) L : null;
        if (aVar != null && (K0 = aVar.K0()) != null) {
            for (Attach attach : K0) {
                if (attach.G0() != AttachSyncState.DONE) {
                    attach.S2(this.f);
                }
            }
        }
        boolean H6 = L.H6();
        w2w w2wVar = this.e;
        return H6 ? (List) new oj30(L, this.d).o(w2wVar) : (List) new com.vk.im.engine.internal.merge.messages.b(L).o(w2wVar);
    }
}
