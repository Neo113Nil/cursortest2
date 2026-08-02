package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.emails.Email;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;

/* compiled from: EmailsGetByIdApiCmd.kt */
@ozl
/* loaded from: classes2.dex */
public final class kcp extends nx2 {
    public final /* synthetic */ int b = 0;
    public final Object c;

    public kcp(List list) {
        this.c = list;
        com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("Email request is deprecated! Queried emails: " + j5g.g0(list, null, null, null, 3, null, 55)));
    }

    @Override // xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        switch (this.b) {
            case 0:
                List<Peer> list = (List) this.c;
                int e = on00.e(c5g.u(list, 10));
                if (e < 16) {
                    e = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                for (Peer peer : list) {
                    Pair pair = new Pair(Long.valueOf(peer.d), new Email(peer.d, "DELETED"));
                    linkedHashMap.put(pair.i(), pair.j());
                }
                return linkedHashMap;
            default:
                return ((az2) this.c).invoke(l7r0Var);
        }
    }

    public kcp(az2 az2Var) {
        this.c = az2Var;
    }
}
