package xsna;

import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.pgn0;
import xsna.usi0;

/* compiled from: SilentAuthProviderBridgeImpl.kt */
/* loaded from: classes.dex */
public final class cnj0 implements w8i {
    public final bpn0 b = new bpn0(new gb8(this, 6));

    public final List<UserId> a() {
        ArrayList e = ((mui0) this.b.getValue()).e();
        ArrayList arrayList = new ArrayList(c5g.u(e, 10));
        Iterator it = e.iterator();
        while (it.hasNext()) {
            arrayList.add(((usi0.a) it.next()).c().b());
        }
        boolean isEmpty = arrayList.isEmpty();
        Collection collection = arrayList;
        if (isEmpty) {
            wdx0 wdx0Var = e370.f;
            if (wdx0Var == null) {
                wdx0Var = null;
            }
            int i = pgn0.a.a;
            collection = Collections.singletonList(wdx0Var.c().b);
        }
        return (List) collection;
    }
}
