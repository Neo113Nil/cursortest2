package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.friends.groupinvite.impl.models.FriendInvitationState;
import com.vk.friends.groupinvite.impl.models.InviteFriendsTabIndex;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.asx;
import xsna.erx;
import xsna.orx;
import xsna.uyh0;
import xsna.yrx;

/* compiled from: InviteFriendsReducer.kt */
/* loaded from: classes14.dex */
public final class prx extends dm50<lsx, orx, erx> {
    @Override // xsna.dm50
    public final erx c(erx erxVar, orx orxVar) {
        Object obj;
        asx aVar;
        isx a;
        erx erxVar2 = erxVar;
        orx orxVar2 = orxVar;
        if (orxVar2 instanceof orx.a) {
            return new erx.a();
        }
        if (orxVar2 instanceof orx.b) {
            return erx.b.b;
        }
        if (!(orxVar2 instanceof orx.c)) {
            if (!(orxVar2 instanceof orx.d)) {
                throw new NoWhenBranchMatchedException();
            }
            orx.d dVar = (orx.d) orxVar2;
            if (dVar instanceof orx.d.f) {
                return frx.b(erxVar2, new bjk((orx.d.f) dVar, 14));
            }
            if (dVar instanceof orx.d.g) {
                orx.d.g gVar = (orx.d.g) dVar;
                List<jis> list = gVar.c;
                return frx.b(erxVar2, new yl0(12, gVar, list.isEmpty() ? uyh0.a.b.a : new uyh0.a.c(list, gVar.d)));
            }
            if (dVar instanceof orx.d.h) {
                if (erxVar2 instanceof erx.c) {
                    erx.c cVar = (erx.c) erxVar2;
                    return erx.c.a(cVar, null, uyh0.a(cVar.d, true, false, null, null, 14), 3);
                }
                erx.c cVar2 = new erx.c((isx) null, (lps) null, 7);
                return erx.c.a(cVar2, null, uyh0.a(cVar2.d, true, false, null, null, 14), 3);
            }
            boolean z = dVar instanceof orx.d.c;
            uyh0.a.C3855a c3855a = uyh0.a.C3855a.a;
            if (z) {
                if (erxVar2 instanceof erx.c) {
                    erx.c cVar3 = (erx.c) erxVar2;
                    return erx.c.a(cVar3, null, uyh0.a(cVar3.d, false, false, "", c3855a, 2), 3);
                }
                erx.c cVar4 = new erx.c((isx) null, (lps) null, 7);
                return erx.c.a(cVar4, null, uyh0.a(cVar4.d, false, false, "", c3855a, 2), 3);
            }
            if (dVar instanceof orx.d.b) {
                if (erxVar2 instanceof erx.c) {
                    erx.c cVar5 = (erx.c) erxVar2;
                    return erx.c.a(cVar5, null, uyh0.a(cVar5.d, false, false, "", null, 11), 3);
                }
                erx.c cVar6 = new erx.c((isx) null, (lps) null, 7);
                return erx.c.a(cVar6, null, uyh0.a(cVar6.d, false, false, "", null, 11), 3);
            }
            if (dVar instanceof orx.d.C3468d) {
                return frx.b(erxVar2, new udo((orx.d.C3468d) dVar, 19));
            }
            if (!(dVar instanceof orx.d.i)) {
                if (dVar instanceof orx.d.e) {
                    return frx.b(erxVar2, new vfk((orx.d.e) dVar, 18));
                }
                if (!(dVar instanceof orx.d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                orx.d.a aVar2 = (orx.d.a) dVar;
                List<jis> list2 = aVar2.b;
                String str = aVar2.c;
                return erxVar2 instanceof erx.c ? frx.b((erx.c) erxVar2, new com.vk.movika.sdk.base.logic.interactor.i(list2, str)) : frx.b(new erx.c((isx) null, (lps) null, 7), new com.vk.movika.sdk.base.logic.interactor.i(list2, str));
            }
            jis jisVar = ((orx.d.i) dVar).b;
            UserId userId = jisVar.a;
            boolean contains = frx.d(erxVar2).contains(userId);
            ArrayList arrayList = new ArrayList(frx.d(erxVar2));
            if (contains) {
                arrayList.remove(userId);
            } else {
                arrayList.add(0, userId);
            }
            List<jis> c = frx.c(erxVar2);
            UserId userId2 = jisVar.a;
            List<jis> list3 = c;
            ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList2.add(((jis) it.next()).a);
            }
            if (arrayList2.contains(userId2)) {
                Iterator<jis> it2 = c.iterator();
                int i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (it2.next().a.equals(userId2)) {
                        break;
                    }
                    i++;
                }
                Integer valueOf = Integer.valueOf(i);
                if (i <= 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    jis jisVar2 = (jis) j5g.b0(intValue, c);
                    if (jisVar2 != null) {
                        ArrayList arrayList3 = new ArrayList(c);
                        arrayList3.remove(intValue);
                        arrayList3.add(0, jisVar2);
                        c = arrayList3;
                    }
                }
            } else {
                ArrayList arrayList4 = new ArrayList(c);
                arrayList4.add(0, jisVar);
                c = arrayList4;
            }
            ArrayList i2 = s101.i(c, arrayList);
            int size = arrayList.size();
            lps lpsVar = erxVar2 instanceof erx.c ? ((erx.c) erxVar2).c : null;
            erx.c i3 = frx.i(erxVar2, s101.j(size, lpsVar != null ? Integer.valueOf(lpsVar.a) : null, i2));
            return erx.c.a(i3, null, uyh0.a(i3.d, false, false, "", c3855a, 2), 3);
        }
        orx.c cVar7 = (orx.c) orxVar2;
        if (cVar7 instanceof orx.c.a) {
            List<jis> c2 = frx.c(erxVar2);
            List<UserId> list4 = ((orx.c.a) cVar7).b;
            ArrayList i4 = s101.i(c2, list4);
            int size2 = list4.size();
            lps lpsVar2 = erxVar2 instanceof erx.c ? ((erx.c) erxVar2).c : null;
            return frx.i(erxVar2, s101.j(size2, lpsVar2 != null ? Integer.valueOf(lpsVar2.a) : null, i4));
        }
        if (cVar7 instanceof orx.c.b) {
            return new erx.c(isx.a(frx.h(erxVar2), ((orx.c.b) cVar7).b, null, 2), frx.g(erxVar2), 4);
        }
        if (cVar7 instanceof orx.c.C3467c) {
            orx.c.C3467c c3467c = (orx.c.C3467c) cVar7;
            isx h = frx.h(erxVar2);
            InviteFriendsTabIndex inviteFriendsTabIndex = c3467c.b;
            yrx yrxVar = (yrx) j5g.b0(inviteFriendsTabIndex.h(), h.b);
            if (yrxVar == null) {
                yrxVar = yrx.a.a(inviteFriendsTabIndex);
            }
            yrx a2 = yrx.a(yrxVar, 0, c3467c.c, 3);
            ArrayList arrayList5 = new ArrayList(h.b);
            if (j5g.b0(inviteFriendsTabIndex.h(), arrayList5) != null) {
                arrayList5.remove(inviteFriendsTabIndex.h());
            }
            arrayList5.add(inviteFriendsTabIndex.h(), a2);
            return new erx.c(isx.a(h, null, arrayList5, 1), frx.g(erxVar2), 4);
        }
        if (cVar7 instanceof orx.c.e) {
            orx.c.e eVar = (orx.c.e) cVar7;
            lps lpsVar3 = eVar.e;
            isx h2 = frx.h(erxVar2);
            InviteFriendsTabIndex inviteFriendsTabIndex2 = InviteFriendsTabIndex.NOT_INVITED;
            if (((yrx) j5g.b0(inviteFriendsTabIndex2.h(), h2.b)) == null) {
                yrx.a.a(inviteFriendsTabIndex2);
            }
            yrx yrxVar2 = eVar.b;
            ArrayList arrayList6 = new ArrayList(h2.b);
            if (j5g.b0(inviteFriendsTabIndex2.h(), arrayList6) != null) {
                arrayList6.remove(inviteFriendsTabIndex2.h());
            }
            arrayList6.add(inviteFriendsTabIndex2.h(), yrxVar2);
            isx a3 = isx.a(h2, null, arrayList6, 1);
            List<yrx> list5 = a3.b;
            InviteFriendsTabIndex inviteFriendsTabIndex3 = InviteFriendsTabIndex.SELECTED;
            if (((yrx) j5g.b0(inviteFriendsTabIndex3.h(), list5)) == null) {
                yrx.a.a(inviteFriendsTabIndex3);
            }
            yrx yrxVar3 = eVar.c;
            ArrayList arrayList7 = new ArrayList(list5);
            if (j5g.b0(inviteFriendsTabIndex3.h(), arrayList7) != null) {
                arrayList7.remove(inviteFriendsTabIndex3.h());
            }
            arrayList7.add(inviteFriendsTabIndex3.h(), yrxVar3);
            isx a4 = isx.a(a3, null, arrayList7, 1);
            List<yrx> list6 = a4.b;
            InviteFriendsTabIndex inviteFriendsTabIndex4 = InviteFriendsTabIndex.INVITED;
            yrx yrxVar4 = (yrx) j5g.b0(inviteFriendsTabIndex4.h(), list6);
            yrx yrxVar5 = eVar.d;
            if (yrxVar5 == null) {
                ArrayList arrayList8 = new ArrayList(list6);
                if (yrxVar4 != null) {
                    arrayList8.remove(inviteFriendsTabIndex4.h());
                }
                a = isx.a(a4, null, arrayList8, 1);
            } else {
                if (((yrx) j5g.b0(inviteFriendsTabIndex4.h(), list6)) == null) {
                    yrx.a.a(inviteFriendsTabIndex4);
                }
                ArrayList arrayList9 = new ArrayList(list6);
                if (j5g.b0(inviteFriendsTabIndex4.h(), arrayList9) != null) {
                    arrayList9.remove(inviteFriendsTabIndex4.h());
                }
                arrayList9.add(inviteFriendsTabIndex4.h(), yrxVar5);
                a = isx.a(a4, null, arrayList9, 1);
            }
            return new erx.c(a, lpsVar3, 4);
        }
        if (!(cVar7 instanceof orx.c.d)) {
            throw new NoWhenBranchMatchedException();
        }
        orx.c.d dVar2 = (orx.c.d) cVar7;
        Iterator it3 = (erxVar2 instanceof erx.c ? jsx.a(((erx.c) erxVar2).b, InviteFriendsTabIndex.INVITED.h()) : EmptyList.b).iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            }
            obj = it3.next();
            if (((jis) obj).a.equals(dVar2.b)) {
                break;
            }
        }
        jis jisVar3 = (jis) obj;
        if (jisVar3 == null) {
            return erxVar2;
        }
        jis a5 = jis.a(jisVar3, FriendInvitationState.NOT_INVITED, false, false, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
        isx h3 = frx.h(erxVar2);
        InviteFriendsTabIndex inviteFriendsTabIndex5 = InviteFriendsTabIndex.NOT_INVITED;
        yrx yrxVar6 = (yrx) j5g.b0(inviteFriendsTabIndex5.h(), h3.b);
        if (yrxVar6 == null) {
            yrxVar6 = yrx.a.a(inviteFriendsTabIndex5);
        }
        List singletonList = Collections.singletonList(a5);
        if (!singletonList.isEmpty()) {
            int size3 = singletonList.size() + yrxVar6.b;
            asx asxVar = yrxVar6.c;
            if (asxVar instanceof asx.a) {
                asx.a aVar3 = (asx.a) asxVar;
                aVar = asx.a.a(aVar3, j5g.u0(singletonList, aVar3.a));
            } else {
                aVar = singletonList.isEmpty() ? asx.c.a : new asx.a(singletonList, null);
            }
            yrxVar6 = yrx.a(yrxVar6, size3, aVar, 1);
        }
        ArrayList arrayList10 = new ArrayList(h3.b);
        if (j5g.b0(inviteFriendsTabIndex5.h(), arrayList10) != null) {
            arrayList10.remove(inviteFriendsTabIndex5.h());
        }
        arrayList10.add(inviteFriendsTabIndex5.h(), yrxVar6);
        isx a6 = isx.a(h3, null, arrayList10, 1);
        List<yrx> list7 = a6.b;
        InviteFriendsTabIndex inviteFriendsTabIndex6 = InviteFriendsTabIndex.INVITED;
        yrx yrxVar7 = (yrx) j5g.b0(inviteFriendsTabIndex6.h(), list7);
        if (yrxVar7 == null) {
            yrxVar7 = yrx.a.a(inviteFriendsTabIndex6);
        }
        List singletonList2 = Collections.singletonList(a5);
        if (!singletonList2.isEmpty()) {
            int size4 = yrxVar7.b - singletonList2.size();
            asx asxVar2 = yrxVar7.c;
            if (asxVar2 instanceof asx.a) {
                List list8 = singletonList2;
                ArrayList arrayList11 = new ArrayList(c5g.u(list8, 10));
                Iterator it4 = list8.iterator();
                while (it4.hasNext()) {
                    arrayList11.add(((jis) it4.next()).a);
                }
                asx.a aVar4 = (asx.a) asxVar2;
                ArrayList arrayList12 = new ArrayList(aVar4.a);
                g5g.D(arrayList12, true, new adj(arrayList11, 1));
                asxVar2 = asx.a.a(aVar4, arrayList12);
            }
            yrxVar7 = yrx.a(yrxVar7, size4, asxVar2, 1);
        }
        ArrayList arrayList13 = new ArrayList(list7);
        if (j5g.b0(inviteFriendsTabIndex6.h(), arrayList13) != null) {
            arrayList13.remove(inviteFriendsTabIndex6.h());
        }
        arrayList13.add(inviteFriendsTabIndex6.h(), yrxVar7);
        isx a7 = isx.a(a6, null, arrayList13, 1);
        return erxVar2 instanceof erx.c ? erx.c.a((erx.c) erxVar2, a7, null, 6) : erx.c.a(new erx.c((isx) null, (lps) null, 7), a7, null, 6);
    }

    @Override // xsna.dm50
    public final lsx d() {
        return new lsx(e(new u4u(7)));
    }

    @Override // xsna.dm50
    public final void h(erx erxVar, lsx lsxVar) {
        f(lsxVar.a, erxVar);
    }
}
