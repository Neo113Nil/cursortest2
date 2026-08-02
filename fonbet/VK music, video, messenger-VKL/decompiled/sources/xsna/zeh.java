package xsna;

import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.LinkedList;
import java.util.List;

/* compiled from: CommunityProfileClosedMapper.kt */
/* loaded from: classes5.dex */
public final class zeh extends kph {
    public final bfh c;
    public final afh d;

    public zeh(bfh bfhVar, afh afhVar) {
        this.c = bfhVar;
        this.d = afhVar;
    }

    @Override // xsna.s770
    public final List<r4h> h(kn00 kn00Var) {
        ExtendedCommunityProfile extendedCommunityProfile = kn00Var.a;
        if (w2h.a(extendedCommunityProfile)) {
            return this.c.h(kn00Var);
        }
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        g5g.y(this.d.h(kn00Var), linkedList2);
        if (!linkedList2.isEmpty()) {
            linkedList.add(new r4h(linkedList2, null));
        }
        LinkedList linkedList3 = new LinkedList();
        t230 t230Var = extendedCommunityProfile.z1;
        linkedList3.add(t230Var != null ? new i6h(t230Var, extendedCommunityProfile.Y) : new fxg(bwd0.c(extendedCommunityProfile)));
        linkedList.add(new r4h(linkedList3, null));
        return linkedList;
    }
}
