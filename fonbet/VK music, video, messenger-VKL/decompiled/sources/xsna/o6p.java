package xsna;

import com.vk.dto.common.Peer;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: EduOrganizationMediator.kt */
/* loaded from: classes2.dex */
public final class o6p implements n6p {
    public final ArrayList a = new ArrayList();
    public final LinkedHashMap b = new LinkedHashMap();

    @Override // xsna.n6p
    public final void a(vur0 vur0Var) {
        this.a.add(vur0Var);
    }

    @Override // xsna.n6p
    public final CharSequence b(Peer peer) {
        return (CharSequence) this.b.get(peer);
    }

    @Override // xsna.n6p
    public final void c(vur0 vur0Var) {
        this.a.remove(vur0Var);
    }
}
