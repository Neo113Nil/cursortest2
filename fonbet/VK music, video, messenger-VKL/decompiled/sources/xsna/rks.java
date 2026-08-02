package xsna;

import com.vk.friends.impl.friendsandfollowers.tabbedscreen.domain.FriendsAndFollowersTabType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.els;
import xsna.oks;

/* compiled from: FriendsAndFollowersReducer.kt */
/* loaded from: classes15.dex */
public final class rks extends dm50<tls, oks, xks> {
    @Override // xsna.dm50
    public final xks c(xks xksVar, oks oksVar) {
        xks xksVar2 = xksVar;
        oks oksVar2 = oksVar;
        els elsVar = xksVar2.c;
        els elsVar2 = xksVar2.c;
        FriendsAndFollowersTabType friendsAndFollowersTabType = xksVar2.b;
        if (oksVar2 instanceof oks.a) {
            oks.a aVar = (oks.a) oksVar2;
            FriendsAndFollowersTabType friendsAndFollowersTabType2 = aVar.b;
            els elsVar3 = aVar.c;
            return new xks(fls.a(friendsAndFollowersTabType2, elsVar3.d), elsVar3);
        }
        if (oksVar2 instanceof oks.c) {
            els elsVar4 = ((oks.c) oksVar2).b;
            return new xks(fls.a(friendsAndFollowersTabType, elsVar4.d), elsVar4);
        }
        if (!(oksVar2 instanceof oks.b)) {
            if (oksVar2 instanceof oks.d) {
                return new xks(fls.a(((oks.d) oksVar2).b, elsVar.d), elsVar2);
            }
            throw new NoWhenBranchMatchedException();
        }
        oks.b bVar = (oks.b) oksVar2;
        int i = bVar.c;
        FriendsAndFollowersTabType friendsAndFollowersTabType3 = bVar.b;
        List<els.a> list = elsVar.d;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (els.a aVar2 : list) {
            FriendsAndFollowersTabType friendsAndFollowersTabType4 = aVar2.b;
            if (friendsAndFollowersTabType4 == friendsAndFollowersTabType3) {
                aVar2 = new els.a(i, friendsAndFollowersTabType4);
            }
            arrayList.add(aVar2);
        }
        if (friendsAndFollowersTabType3 != FriendsAndFollowersTabType.ONLINE_FRIENDS || i > 0) {
            return new xks(friendsAndFollowersTabType, els.a(elsVar2, null, arrayList, 7));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((els.a) next).b != FriendsAndFollowersTabType.ONLINE_FRIENDS) {
                arrayList2.add(next);
            }
        }
        return new xks(fls.a(friendsAndFollowersTabType, arrayList2), els.a(elsVar2, null, arrayList2, 7));
    }

    @Override // xsna.dm50
    public final tls d() {
        return new tls(e(new jr3(18)));
    }

    @Override // xsna.dm50
    public final void h(xks xksVar, tls tlsVar) {
        f(tlsVar.a, xksVar);
    }
}
