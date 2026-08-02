package xsna;

import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.LinkedList;
import java.util.List;

/* compiled from: CommunityProfileDeactivatedItemsMapper.kt */
/* loaded from: classes5.dex */
public final class pmh extends kph {
    public final bfh c;

    public pmh(bfh bfhVar) {
        this.c = bfhVar;
    }

    @Override // xsna.s770
    public final List<r4h> h(kn00 kn00Var) {
        LinkedList linkedList = new LinkedList();
        pvn pvnVar = new pvn(null);
        ExtendedCommunityProfile extendedCommunityProfile = kn00Var.a;
        this.c.s(pvnVar, kn00Var);
        int i = extendedCommunityProfile.a1;
        if (i == 1 || i == 2 || i == 4) {
            pvnVar.g(new w4i(extendedCommunityProfile.Y, extendedCommunityProfile.m0, extendedCommunityProfile.q, extendedCommunityProfile.b("members")));
        }
        pvnVar.g(new btg(bwd0.f(extendedCommunityProfile), extendedCommunityProfile.q));
        LinkedList linkedList2 = (LinkedList) pvnVar.b;
        if (!linkedList2.isEmpty()) {
            linkedList.add(new r4h(linkedList2, null));
        }
        return linkedList;
    }
}
