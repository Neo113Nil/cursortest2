package xsna;

import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.LinkedList;
import java.util.List;

/* compiled from: CommunityProfilePrivateMapper.kt */
/* loaded from: classes5.dex */
public final class xsh extends kph {
    public final kph c;
    public final afh d;

    public xsh(bfh bfhVar, afh afhVar) {
        this.c = bfhVar;
        this.d = afhVar;
    }

    @Override // xsna.s770
    public final List<r4h> h(kn00 kn00Var) {
        ExtendedCommunityProfile extendedCommunityProfile = kn00Var.a;
        if (w2h.a(extendedCommunityProfile)) {
            return this.c.h(kn00Var);
        }
        t230 t230Var = extendedCommunityProfile.z1;
        afh afhVar = this.d;
        if (t230Var == null) {
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            g5g.y(afhVar.h(kn00Var), linkedList2);
            linkedList2.add(new btg(bwd0.f(extendedCommunityProfile), extendedCommunityProfile.q));
            if (!linkedList2.isEmpty()) {
                linkedList.add(new r4h(linkedList2, null));
            }
            return linkedList;
        }
        LinkedList linkedList3 = new LinkedList();
        LinkedList linkedList4 = new LinkedList();
        g5g.y(afhVar.h(kn00Var), linkedList4);
        if (!linkedList4.isEmpty()) {
            linkedList3.add(new r4h(linkedList4, null));
        }
        LinkedList linkedList5 = new LinkedList();
        linkedList5.add(new i6h(extendedCommunityProfile.z1, extendedCommunityProfile.Y));
        linkedList3.add(new r4h(linkedList5, null));
        return linkedList3;
    }
}
