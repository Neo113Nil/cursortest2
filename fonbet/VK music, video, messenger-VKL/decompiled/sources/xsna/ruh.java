package xsna;

import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import xsna.xrh;

/* compiled from: CommunityProfileUserPermabanMapper.kt */
/* loaded from: classes5.dex */
public final class ruh extends kph {
    public final ctg c;
    public final bfh d;

    public ruh(ctg ctgVar, bfh bfhVar) {
        this.c = ctgVar;
        this.d = bfhVar;
    }

    @Override // xsna.s770
    public final List<r4h> h(kn00 kn00Var) {
        ExtendedCommunityProfile extendedCommunityProfile = kn00Var.a;
        LinkedList linkedList = new LinkedList();
        pvn pvnVar = new pvn(null);
        LinkedList linkedList2 = (LinkedList) pvnVar.b;
        this.d.s(pvnVar, kn00Var);
        ArrayList a = this.c.a(extendedCommunityProfile);
        if (!a.isEmpty()) {
            xrh xrhVar = kn00Var.c;
            pvnVar.g(new gpg(extendedCommunityProfile.a.c, a, extendedCommunityProfile.a1, extendedCommunityProfile.Y, extendedCommunityProfile.Z, w2h.a(extendedCommunityProfile), xrhVar instanceof xrh.d.a ? (xrh.d.a) xrhVar : null));
        }
        ((s4h) linkedList2.getLast()).a = true;
        if (!linkedList2.isEmpty()) {
            linkedList.add(new r4h(linkedList2, null));
        }
        ExtendedUserProfile.e eVar = extendedCommunityProfile.k1;
        if (eVar == null) {
            return linkedList;
        }
        LinkedList linkedList3 = new LinkedList();
        linkedList3.add(new psg(eVar));
        linkedList.add(new r4h(linkedList3, null));
        return linkedList;
    }
}
