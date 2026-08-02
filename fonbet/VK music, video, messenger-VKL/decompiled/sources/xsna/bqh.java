package xsna;

import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.LinkedList;
import java.util.List;

/* compiled from: CommunityProfileLegoInviteMapper.kt */
/* loaded from: classes5.dex */
public final class bqh extends kph {
    public final bfh c;

    public bqh(bfh bfhVar) {
        this.c = bfhVar;
    }

    @Override // xsna.s770
    public final List<r4h> h(kn00 kn00Var) {
        LinkedList linkedList = new LinkedList();
        pvn pvnVar = new pvn(null);
        LinkedList linkedList2 = (LinkedList) pvnVar.b;
        this.c.s(pvnVar, kn00Var);
        ExtendedCommunityProfile extendedCommunityProfile = kn00Var.a;
        pvnVar.g(new y7h(extendedCommunityProfile.z1, extendedCommunityProfile.Y));
        ((s4h) linkedList2.getLast()).a = true;
        if (!linkedList2.isEmpty()) {
            linkedList.add(new r4h(linkedList2, null));
        }
        return linkedList;
    }
}
