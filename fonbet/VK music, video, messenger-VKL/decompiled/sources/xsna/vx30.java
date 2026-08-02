package xsna;

import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.users.User;
import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;
import com.vk.im.ui.components.msg_search.analytics.ImSearchLocalRequestLoggingInfo;
import com.vk.im.ui.components.msg_search.analytics.ImSearchNetworkItemLoggingInfo;
import com.vk.im.ui.components.msg_search.domain.model.PeersSearchBlock;
import com.vk.im.ui.components.msg_search.domain.model.a;
import com.vk.lists.ListDataSet;
import com.vk.superapp.api.dto.user.WebUserShortInfo;
import com.vk.video.ui.discovery.recommendations.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.gcw;
import xsna.m5x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class vx30 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vx30(Object obj, boolean z, Object obj2, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
        this.e = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:232:0x051e, code lost:
    
        if (r15.v5() == null) goto L204;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0560  */
    /* JADX WARN: Type inference failed for: r1v11, types: [T, java.lang.Object, xsna.eu90] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v34, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v19, types: [com.vk.im.ui.components.msg_search.domain.model.a$b$a] */
    /* JADX WARN: Type inference failed for: r9v22, types: [com.vk.im.ui.components.msg_search.domain.model.a$b$a] */
    /* JADX WARN: Type inference failed for: r9v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v24, types: [com.vk.im.ui.components.msg_search.domain.model.a$b$b] */
    /* JADX WARN: Type inference failed for: r9v25, types: [com.vk.im.ui.components.msg_search.domain.model.a$b$b] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        Iterator it;
        Iterator it2;
        Object obj2;
        boolean z2;
        ?? r9;
        boolean z3;
        Long l;
        PeersSearchBlock eVar;
        PeersSearchBlock cVar;
        List<a.c> list;
        PeersSearchBlock aVar;
        Long l2;
        Object next;
        ArrayList arrayList;
        WebUserShortInfo webUserShortInfo;
        String d;
        int i = this.b;
        boolean z4 = this.c;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                xx30 xx30Var = (xx30) obj4;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj3;
                gcw gcwVar = (gcw) obj;
                xx30Var.e.getClass();
                Iterable singletonList = gcwVar instanceof gcw.g ? ((gcw.g) gcwVar).b : Collections.singletonList(gcwVar);
                int i2 = 2;
                List<inh0> l3 = z4 ? e43.l(new tqw(), new p9f0()) : e43.l(new jvm(), new lcj(), new o2u());
                ArrayList arrayList2 = new ArrayList(c5g.u(l3, 10));
                for (inh0 inh0Var : l3) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj5 : singletonList) {
                        if (inh0Var.d((gcw) obj5)) {
                            arrayList3.add(obj5);
                        }
                    }
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        inh0Var.a((gcw) it3.next());
                    }
                    arrayList2.add(inh0Var.c());
                }
                ArrayList arrayList4 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(((lnh0) it4.next()).a);
                }
                ArrayList arrayList5 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it5 = arrayList2.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(((lnh0) it5.next()).b);
                }
                Iterator it6 = arrayList5.iterator();
                if (!it6.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Object next2 = it6.next();
                while (it6.hasNext()) {
                    next2 = ((ProfilesSimpleInfo) next2).Ib((ProfilesSimpleInfo) it6.next());
                }
                ProfilesSimpleInfo profilesSimpleInfo = (ProfilesSimpleInfo) next2;
                Iterable iterable = singletonList;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it7 = iterable.iterator();
                    while (it7.hasNext()) {
                        ImSearchLocalRequestLoggingInfo imSearchLocalRequestLoggingInfo = ((gcw) it7.next()).a;
                        if (imSearchLocalRequestLoggingInfo == null || imSearchLocalRequestLoggingInfo.i) {
                            z = false;
                            fy30 fy30Var = xx30Var.d;
                            eu90 eu90Var = (eu90) ref$ObjectRef.element;
                            fy30Var.getClass();
                            ProfilesSimpleInfo profilesSimpleInfo2 = eu90Var.b;
                            List<PeersSearchBlock> list2 = eu90Var.a;
                            ArrayList arrayList6 = new ArrayList(c5g.u(arrayList4, 10));
                            it = arrayList4.iterator();
                            while (it.hasNext()) {
                                PeersSearchBlock peersSearchBlock = (PeersSearchBlock) it.next();
                                if (peersSearchBlock instanceof PeersSearchBlock.b) {
                                    aVar = new PeersSearchBlock.b(iw30.b(peersSearchBlock, PeersSearchBlock.b.class, new e420(i2), new z6u(6), eu90Var));
                                } else {
                                    int i3 = 11;
                                    if (peersSearchBlock instanceof PeersSearchBlock.c) {
                                        aVar = new PeersSearchBlock.c(iw30.b(peersSearchBlock, PeersSearchBlock.c.class, new s6x(i3), new z13(29), eu90Var));
                                    } else if (peersSearchBlock instanceof PeersSearchBlock.e) {
                                        aVar = new PeersSearchBlock.e(iw30.a(peersSearchBlock, PeersSearchBlock.e.class, new amp(15), new io3(28), eu90Var));
                                    } else if (peersSearchBlock instanceof PeersSearchBlock.d) {
                                        int i4 = 12;
                                        List b = iw30.b(peersSearchBlock, PeersSearchBlock.d.class, new tcu(i4), new ehu(i4), eu90Var);
                                        List a = iw30.a(peersSearchBlock, PeersSearchBlock.d.class, new byo(11), new u4u(14), eu90Var);
                                        ArrayList E = g5g.E(list2, PeersSearchBlock.d.class);
                                        ArrayList arrayList7 = new ArrayList(c5g.u(E, 10));
                                        Iterator it8 = E.iterator();
                                        while (it8.hasNext()) {
                                            arrayList7.add(g5g.E(((PeersSearchBlock.d) it8.next()).b, a.b.C1154b.class));
                                        }
                                        Iterator it9 = arrayList7.iterator();
                                        if (it9.hasNext()) {
                                            next = it9.next();
                                            while (it9.hasNext()) {
                                                next = j5g.u0((List) it9.next(), (List) next);
                                            }
                                        } else {
                                            next = null;
                                        }
                                        Collection collection = (List) next;
                                        if (collection == null) {
                                            collection = EmptyList.b;
                                        }
                                        aVar = new PeersSearchBlock.d(j5g.u0(iw30.c(j5g.u0(b, collection), a, profilesSimpleInfo2.Ib(profilesSimpleInfo)), b));
                                    } else {
                                        if (!(peersSearchBlock instanceof PeersSearchBlock.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        PeersSearchBlock peersSearchBlock2 = (PeersSearchBlock) j5g.a0(g5g.E(list2, PeersSearchBlock.a.class));
                                        if (peersSearchBlock2 == null) {
                                            list = ((PeersSearchBlock.a) peersSearchBlock).b;
                                        } else {
                                            List<a.c> list3 = ((PeersSearchBlock.a) peersSearchBlock2).b;
                                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                                            Iterator it10 = list3.iterator();
                                            while (it10.hasNext()) {
                                                linkedHashSet.add(((a.c) ((com.vk.im.ui.components.msg_search.domain.model.a) it10.next())).a.a.getId());
                                            }
                                            List<a.c> list4 = ((PeersSearchBlock.a) peersSearchBlock).b;
                                            ArrayList arrayList8 = new ArrayList();
                                            for (Object obj6 : list4) {
                                                if (!linkedHashSet.contains(((a.c) ((com.vk.im.ui.components.msg_search.domain.model.a) obj6)).a.a.getId())) {
                                                    arrayList8.add(obj6);
                                                }
                                            }
                                            list = arrayList8;
                                        }
                                        Iterator it11 = g5g.E(j5g.u0(arrayList4, list2), PeersSearchBlock.d.class).iterator();
                                        while (it11.hasNext()) {
                                            ArrayList<a.b> arrayList9 = ((PeersSearchBlock.d) it11.next()).b;
                                            HashSet hashSet = new HashSet();
                                            for (a.b bVar : arrayList9) {
                                                if (bVar instanceof a.b.C1154b) {
                                                    l2 = ((a.b.C1154b) bVar).a.a.Sb();
                                                } else {
                                                    if (!(bVar instanceof a.b.C1153a)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    q2a0 q2a0Var = ((a.b.C1153a) bVar).a.a;
                                                    Contact contact = q2a0Var instanceof Contact ? (Contact) q2a0Var : null;
                                                    l2 = contact != null ? contact.j : null;
                                                }
                                                if (l2 != null) {
                                                    hashSet.add(l2);
                                                }
                                            }
                                            ArrayList arrayList10 = new ArrayList();
                                            for (Object obj7 : list) {
                                                if (!hashSet.contains(Long.valueOf(((a.c) obj7).a.a.G3()))) {
                                                    arrayList10.add(obj7);
                                                }
                                            }
                                            list = arrayList10;
                                        }
                                        aVar = new PeersSearchBlock.a(list);
                                    }
                                }
                                arrayList6.add(aVar);
                                i2 = 2;
                            }
                            ArrayList arrayList11 = new ArrayList();
                            it2 = arrayList6.iterator();
                            while (it2.hasNext()) {
                                Object next3 = it2.next();
                                if (!((PeersSearchBlock) next3).a()) {
                                    arrayList11.add(next3);
                                }
                            }
                            for (Map.Entry entry : profilesSimpleInfo2.g.entrySet()) {
                                Map map = (Map) entry.getValue();
                                Map map2 = (Map) profilesSimpleInfo.g.get(entry.getKey());
                                if (map2 != null) {
                                    Iterator it12 = izi0.j(map.keySet(), map2.keySet()).iterator();
                                    while (it12.hasNext()) {
                                        long longValue = ((Number) it12.next()).longValue();
                                        qtd0 qtd0Var = (qtd0) map.get(Long.valueOf(longValue));
                                        ArrayList arrayList12 = arrayList11;
                                        qtd0 qtd0Var2 = (qtd0) map2.get(Long.valueOf(longValue));
                                        if (qtd0Var != null && qtd0Var2 != null) {
                                            if (qtd0Var2.v5() == null) {
                                                break;
                                            }
                                            qtd0Var = qtd0Var2;
                                        } else if (qtd0Var2 != null || qtd0Var == null) {
                                            if (qtd0Var != null || qtd0Var2 == null) {
                                                qtd0Var = null;
                                            }
                                            qtd0Var = qtd0Var2;
                                        }
                                        if (qtd0Var != null) {
                                            ((Map) entry.getValue()).put(Long.valueOf(longValue), qtd0Var);
                                        }
                                        arrayList11 = arrayList12;
                                    }
                                }
                                arrayList11 = arrayList11;
                            }
                            Collection collection2 = arrayList11;
                            List<PeersSearchBlock> list5 = list2;
                            ArrayList arrayList13 = new ArrayList(c5g.u(list5, 10));
                            Collection collection3 = collection2;
                            for (PeersSearchBlock peersSearchBlock3 : list5) {
                                Collection collection4 = collection3;
                                Iterator it13 = collection4.iterator();
                                while (true) {
                                    if (it13.hasNext()) {
                                        obj2 = it13.next();
                                        if (((PeersSearchBlock) obj2).a == peersSearchBlock3.a) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                ArrayList arrayList14 = new ArrayList();
                                for (Object obj8 : collection4) {
                                    if (((PeersSearchBlock) obj8).a != peersSearchBlock3.a) {
                                        arrayList14.add(obj8);
                                    }
                                }
                                Pair pair = new Pair(obj2, arrayList14);
                                PeersSearchBlock peersSearchBlock4 = (PeersSearchBlock) pair.d();
                                List list6 = (List) pair.g();
                                if (peersSearchBlock4 instanceof PeersSearchBlock.a) {
                                    eVar = new PeersSearchBlock.a(j5g.u0(((PeersSearchBlock.a) peersSearchBlock4).b, ((PeersSearchBlock.a) peersSearchBlock3).b));
                                } else {
                                    if (peersSearchBlock4 instanceof PeersSearchBlock.b) {
                                        PeersSearchBlock.b bVar2 = (PeersSearchBlock.b) peersSearchBlock3;
                                        List<a.d> list7 = ((PeersSearchBlock.b) peersSearchBlock4).b;
                                        ArrayList arrayList15 = new ArrayList(c5g.u(list7, 10));
                                        for (a.d dVar : list7) {
                                            arrayList15.add(new a.d(fy30.a(bVar2.b.size(), dVar.a), dVar.b));
                                        }
                                        cVar = new PeersSearchBlock.b(j5g.u0(arrayList15, bVar2.b));
                                    } else if (peersSearchBlock4 instanceof PeersSearchBlock.c) {
                                        PeersSearchBlock.c cVar2 = (PeersSearchBlock.c) peersSearchBlock3;
                                        List<a.b.C1154b> list8 = ((PeersSearchBlock.c) peersSearchBlock4).b;
                                        ArrayList arrayList16 = new ArrayList(c5g.u(list8, 10));
                                        for (a.b.C1154b c1154b : list8) {
                                            arrayList16.add(a.b.C1154b.a(c1154b, fy30.a(cVar2.b.size(), c1154b.a)));
                                        }
                                        cVar = new PeersSearchBlock.c(j5g.u0(arrayList16, cVar2.b));
                                    } else if (peersSearchBlock4 instanceof PeersSearchBlock.e) {
                                        eVar = new PeersSearchBlock.e(j5g.u0(((PeersSearchBlock.e) peersSearchBlock4).b, ((PeersSearchBlock.e) peersSearchBlock3).b));
                                    } else {
                                        if (peersSearchBlock4 instanceof PeersSearchBlock.d) {
                                            PeersSearchBlock.d dVar2 = (PeersSearchBlock.d) peersSearchBlock3;
                                            ArrayList arrayList17 = ((PeersSearchBlock.d) peersSearchBlock4).b;
                                            ArrayList E2 = g5g.E(arrayList17, a.b.C1154b.class);
                                            int e = on00.e(c5g.u(E2, 10));
                                            if (e < 16) {
                                                e = 16;
                                            }
                                            LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                                            Iterator it14 = E2.iterator();
                                            while (it14.hasNext()) {
                                                Object next4 = it14.next();
                                                linkedHashMap.put(((a.b.C1154b) next4).a.a.Zb(), next4);
                                            }
                                            ArrayList<com.vk.im.ui.components.msg_search.domain.model.a> arrayList18 = dVar2.b;
                                            ArrayList arrayList19 = new ArrayList(c5g.u(arrayList18, 10));
                                            for (com.vk.im.ui.components.msg_search.domain.model.a aVar2 : arrayList18) {
                                                if (aVar2 instanceof a.b.C1154b) {
                                                    z3 = z;
                                                } else {
                                                    if (!(aVar2 instanceof a.b.C1153a)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    a.b.C1153a c1153a = (a.b.C1153a) aVar2;
                                                    qtd0 qtd0Var3 = (q2a0) c1153a.a.a;
                                                    Contact contact2 = qtd0Var3 instanceof Contact ? (Contact) qtd0Var3 : null;
                                                    if (contact2 == null || (l = contact2.j) == null) {
                                                        z3 = z;
                                                    } else {
                                                        z3 = z;
                                                        qtd0 qtd0Var4 = (User) profilesSimpleInfo2.b.get(Long.valueOf(l.longValue()));
                                                        if (qtd0Var4 != null) {
                                                            qtd0Var3 = qtd0Var4;
                                                        }
                                                    }
                                                    a.b.C1154b c1154b2 = (a.b.C1154b) linkedHashMap.get(qtd0Var3.B7());
                                                    if (c1154b2 != null) {
                                                        aVar2 = a.b.C1154b.a(c1154b2, gyh0.a(c1154b2.a, c1153a.a.b));
                                                    }
                                                }
                                                arrayList19.add(aVar2);
                                                z = z3;
                                            }
                                            z2 = z;
                                            ArrayList E3 = g5g.E(j5g.u0(arrayList17, arrayList19), a.b.C1154b.class);
                                            HashSet hashSet2 = new HashSet();
                                            ArrayList arrayList20 = new ArrayList();
                                            Iterator it15 = E3.iterator();
                                            while (it15.hasNext()) {
                                                Object next5 = it15.next();
                                                if (hashSet2.add(((a.b.C1154b) next5).a.a.Sb())) {
                                                    arrayList20.add(next5);
                                                }
                                            }
                                            ArrayList u0 = j5g.u0(g5g.E(j5g.u0(arrayList17, arrayList19), a.b.C1153a.class), arrayList20);
                                            ArrayList arrayList21 = new ArrayList(c5g.u(u0, 10));
                                            Iterator it16 = u0.iterator();
                                            int i5 = 0;
                                            while (it16.hasNext()) {
                                                Object next6 = it16.next();
                                                int i6 = i5 + 1;
                                                if (i5 < 0) {
                                                    e43.t();
                                                    throw null;
                                                }
                                                a.b bVar3 = (a.b) next6;
                                                if (bVar3 instanceof a.b.C1154b) {
                                                    r9 = (a.b.C1154b) bVar3;
                                                    gyh0<Dialog> gyh0Var = r9.a;
                                                    ImSearchItemLoggingInfo imSearchItemLoggingInfo = gyh0Var.b;
                                                    if (imSearchItemLoggingInfo instanceof ImSearchNetworkItemLoggingInfo) {
                                                        r9 = a.b.C1154b.a(r9, gyh0.a(gyh0Var, ImSearchNetworkItemLoggingInfo.a((ImSearchNetworkItemLoggingInfo) imSearchItemLoggingInfo, Integer.valueOf(i6))));
                                                    }
                                                } else {
                                                    if (!(bVar3 instanceof a.b.C1153a)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    r9 = (a.b.C1153a) bVar3;
                                                    gyh0<q2a0> gyh0Var2 = r9.a;
                                                    ImSearchItemLoggingInfo imSearchItemLoggingInfo2 = gyh0Var2.b;
                                                    if (imSearchItemLoggingInfo2 instanceof ImSearchNetworkItemLoggingInfo) {
                                                        r9 = new a.b.C1153a(gyh0.a(gyh0Var2, ImSearchNetworkItemLoggingInfo.a((ImSearchNetworkItemLoggingInfo) imSearchItemLoggingInfo2, Integer.valueOf(i6))));
                                                    }
                                                }
                                                arrayList21.add(r9);
                                                i5 = i6;
                                            }
                                            peersSearchBlock3 = new PeersSearchBlock.d(arrayList21);
                                        } else {
                                            z2 = z;
                                            if (peersSearchBlock4 != null) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                        }
                                        Pair pair2 = new Pair(peersSearchBlock3, list6);
                                        PeersSearchBlock peersSearchBlock5 = (PeersSearchBlock) pair2.d();
                                        Collection collection5 = (List) pair2.g();
                                        arrayList13.add(peersSearchBlock5);
                                        collection3 = collection5;
                                        z = z2;
                                    }
                                    z2 = z;
                                    peersSearchBlock3 = cVar;
                                    Pair pair22 = new Pair(peersSearchBlock3, list6);
                                    PeersSearchBlock peersSearchBlock52 = (PeersSearchBlock) pair22.d();
                                    Collection collection52 = (List) pair22.g();
                                    arrayList13.add(peersSearchBlock52);
                                    collection3 = collection52;
                                    z = z2;
                                }
                                z2 = z;
                                peersSearchBlock3 = eVar;
                                Pair pair222 = new Pair(peersSearchBlock3, list6);
                                PeersSearchBlock peersSearchBlock522 = (PeersSearchBlock) pair222.d();
                                Collection collection522 = (List) pair222.g();
                                arrayList13.add(peersSearchBlock522);
                                collection3 = collection522;
                                z = z2;
                            }
                            ?? eu90Var2 = new eu90(j5g.u0(collection3, arrayList13), profilesSimpleInfo2, !eu90Var.c && z);
                            ref$ObjectRef.element = eu90Var2;
                            return eu90Var2;
                        }
                    }
                }
                z = true;
                fy30 fy30Var2 = xx30Var.d;
                eu90 eu90Var3 = (eu90) ref$ObjectRef.element;
                fy30Var2.getClass();
                ProfilesSimpleInfo profilesSimpleInfo22 = eu90Var3.b;
                List<PeersSearchBlock> list22 = eu90Var3.a;
                ArrayList arrayList62 = new ArrayList(c5g.u(arrayList4, 10));
                it = arrayList4.iterator();
                while (it.hasNext()) {
                }
                ArrayList arrayList112 = new ArrayList();
                it2 = arrayList62.iterator();
                while (it2.hasNext()) {
                }
                while (r2.hasNext()) {
                }
                Collection collection22 = arrayList112;
                List<PeersSearchBlock> list52 = list22;
                ArrayList arrayList132 = new ArrayList(c5g.u(list52, 10));
                Collection collection32 = collection22;
                while (r2.hasNext()) {
                }
                ?? eu90Var22 = new eu90(j5g.u0(collection32, arrayList132), profilesSimpleInfo22, !eu90Var3.c && z);
                ref$ObjectRef.element = eu90Var22;
                return eu90Var22;
            case 1:
                com.vk.video.ui.discovery.recommendations.b bVar4 = (com.vk.video.ui.discovery.recommendations.b) obj4;
                b.a aVar3 = (b.a) obj;
                bVar4.c(aVar3.c);
                bVar4.b(aVar3, z4, (com.vk.lists.c) obj3, false);
                return s3q0.a;
            case 2:
                iwu0 iwu0Var = (iwu0) obj4;
                com.vk.lists.c cVar3 = (com.vk.lists.c) obj3;
                List<WebUserShortInfo> list9 = (List) obj;
                if (z4) {
                    iwu0Var.g.clear();
                }
                ListDataSet<jtx> listDataSet = iwu0Var.g;
                if (iwu0Var.c != 0) {
                    List list10 = list9;
                    arrayList = new ArrayList(c5g.u(list10, 10));
                    Iterator it17 = list10.iterator();
                    while (it17.hasNext()) {
                        arrayList.add(new lkq0((WebUserShortInfo) it17.next()));
                    }
                } else {
                    ArrayList arrayList22 = new ArrayList();
                    Object k0 = j5g.k0(iwu0Var.g.d);
                    lkq0 lkq0Var = k0 instanceof lkq0 ? (lkq0) k0 : null;
                    Character y0 = (lkq0Var == null || (webUserShortInfo = lkq0Var.a) == null || (d = webUserShortInfo.d()) == null) ? null : erm0.y0(d);
                    for (WebUserShortInfo webUserShortInfo2 : list9) {
                        String d2 = webUserShortInfo2.d();
                        Character y02 = d2 != null ? erm0.y0(d2) : null;
                        if (!epx.f(y02, y0)) {
                            if (y02 != null) {
                                arrayList22.add(new i2z(y02.charValue()));
                            }
                            y0 = y02;
                        }
                        arrayList22.add(new lkq0(webUserShortInfo2));
                    }
                    arrayList = arrayList22;
                }
                listDataSet.n0(arrayList);
                cVar3.q(cVar3.k() + cVar3.i());
                cVar3.r(list9.size() >= cVar3.k());
                return s3q0.a;
            default:
                ((v5x0) obj4).C(new m5x0.h((w5w0) obj3, new String((byte[]) obj, emb.b), z4));
                return s3q0.a;
        }
    }

    public /* synthetic */ vx30(v5x0 v5x0Var, w5w0 w5w0Var, boolean z) {
        this.b = 3;
        this.d = v5x0Var;
        this.e = w5w0Var;
        this.c = z;
    }

    public /* synthetic */ vx30(boolean z, iwu0 iwu0Var, com.vk.lists.c cVar) {
        this.b = 2;
        this.c = z;
        this.d = iwu0Var;
        this.e = cVar;
    }
}
