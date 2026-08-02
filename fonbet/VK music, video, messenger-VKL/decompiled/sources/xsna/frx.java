package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.friends.groupinvite.impl.models.InviteFriendsTabIndex;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.erx;
import xsna.yrx;

/* compiled from: InviteFriendsMviStateExt.kt */
/* loaded from: classes14.dex */
public final class frx {
    public static final boolean a(erx erxVar, UserId userId) {
        Object obj;
        Iterator<T> it = c(erxVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((jis) obj).a.equals(userId)) {
                break;
            }
        }
        jis jisVar = (jis) obj;
        if (jisVar != null) {
            return jisVar.g;
        }
        return false;
    }

    public static final erx.c b(erx erxVar, izs<? super uyh0, uyh0> izsVar) {
        if (erxVar instanceof erx.c) {
            erx.c cVar = (erx.c) erxVar;
            return erx.c.a(cVar, null, izsVar.invoke(cVar.d), 3);
        }
        erx.c cVar2 = new erx.c((isx) null, (lps) null, 7);
        return erx.c.a(cVar2, null, izsVar.invoke(cVar2.d), 3);
    }

    public static final List<jis> c(erx erxVar) {
        return erxVar instanceof erx.c ? jsx.a(((erx.c) erxVar).b, InviteFriendsTabIndex.NOT_INVITED.h()) : EmptyList.b;
    }

    public static final List<UserId> d(erx erxVar) {
        return erxVar instanceof erx.c ? ((erx.c) erxVar).c.b : EmptyList.b;
    }

    public static final yrx e(erx erxVar, InviteFriendsTabIndex inviteFriendsTabIndex) {
        yrx yrxVar = (yrx) j5g.b0(inviteFriendsTabIndex.h(), h(erxVar).b);
        return yrxVar == null ? yrx.a.a(inviteFriendsTabIndex) : yrxVar;
    }

    public static final boolean f(erx erxVar) {
        List<jis> c = c(erxVar);
        boolean z = erxVar instanceof erx.c;
        List a = z ? jsx.a(((erx.c) erxVar).b, InviteFriendsTabIndex.SELECTED.h()) : EmptyList.b;
        lps lpsVar = z ? ((erx.c) erxVar).c : null;
        int i = lpsVar != null ? lpsVar.a : Integer.MAX_VALUE;
        return c.size() <= i ? a.size() == c.size() : a.size() == i;
    }

    public static final lps g(erx erxVar) {
        return erxVar instanceof erx.c ? ((erx.c) erxVar).c : new lps(0);
    }

    public static final isx h(erx erxVar) {
        return erxVar instanceof erx.c ? ((erx.c) erxVar).b : new isx(0);
    }

    public static final erx.c i(erx erxVar, List<jis> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((jis) obj).e) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((jis) it.next()).a);
        }
        isx h = h(erxVar);
        InviteFriendsTabIndex inviteFriendsTabIndex = InviteFriendsTabIndex.NOT_INVITED;
        List<yrx> list2 = h.b;
        yrx yrxVar = (yrx) j5g.b0(inviteFriendsTabIndex.h(), list2);
        if (yrxVar == null) {
            yrxVar = yrx.a.a(inviteFriendsTabIndex);
        }
        yrx a = zrx.a(yrxVar, list);
        ArrayList arrayList3 = new ArrayList(list2);
        if (j5g.b0(inviteFriendsTabIndex.h(), arrayList3) != null) {
            arrayList3.remove(inviteFriendsTabIndex.h());
        }
        arrayList3.add(inviteFriendsTabIndex.h(), a);
        isx a2 = isx.a(h, null, arrayList3, 1);
        List<yrx> list3 = a2.b;
        InviteFriendsTabIndex inviteFriendsTabIndex2 = InviteFriendsTabIndex.SELECTED;
        yrx yrxVar2 = (yrx) j5g.b0(inviteFriendsTabIndex2.h(), list3);
        if (yrxVar2 == null) {
            yrxVar2 = yrx.a.a(inviteFriendsTabIndex2);
        }
        yrx a3 = zrx.a(yrxVar2, arrayList);
        ArrayList arrayList4 = new ArrayList(list3);
        if (j5g.b0(inviteFriendsTabIndex2.h(), arrayList4) != null) {
            arrayList4.remove(inviteFriendsTabIndex2.h());
        }
        arrayList4.add(inviteFriendsTabIndex2.h(), a3);
        isx a4 = isx.a(a2, null, arrayList4, 1);
        int size = arrayList.size();
        List<yrx> list4 = a4.b;
        yrx yrxVar3 = (yrx) j5g.b0(inviteFriendsTabIndex2.h(), list4);
        if (yrxVar3 == null) {
            yrxVar3 = yrx.a.a(inviteFriendsTabIndex2);
        }
        yrx a5 = yrx.a(yrxVar3, size, null, 5);
        ArrayList arrayList5 = new ArrayList(list4);
        if (j5g.b0(inviteFriendsTabIndex2.h(), arrayList5) != null) {
            arrayList5.remove(inviteFriendsTabIndex2.h());
        }
        arrayList5.add(inviteFriendsTabIndex2.h(), a5);
        return new erx.c(isx.a(a4, null, arrayList5, 1), new lps(g(erxVar).a, arrayList2), 4);
    }
}
