package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.im_item.ImItemType;
import com.vk.im.engine.models.messages.Msg;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: ImItemListMerger.kt */
/* loaded from: classes2.dex */
public final class g6w implements i920<n5w, wy1> {
    public final a b = new a();

    /* compiled from: ImItemListMerger.kt */
    public static final class a {
        public final AtomicBoolean a = new AtomicBoolean();

        /* compiled from: ImItemListMerger.kt */
        /* renamed from: xsna.g6w$a$a, reason: collision with other inner class name */
        public static final class C2916a extends IllegalStateException {
        }
    }

    public static Set b(d5w d5wVar, List list) {
        return rli0.C(new ulp0(rli0.j(new i5g(list), new zqh(d5wVar, 20)), new vt1(29)));
    }

    public static LinkedHashMap c(d5w d5wVar, List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((a5w) it.next()).t3());
        }
        Map<b5w, Msg> map = d5wVar.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<b5w, Msg> entry : map.entrySet()) {
            if (arrayList.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static boolean d(d5w d5wVar, b5w b5wVar) {
        Object obj;
        Iterator<T> it = d5wVar.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((a5w) obj).t3(), b5wVar)) {
                break;
            }
        }
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v15, types: [kotlin.collections.EmptyList] */
    public static d5w e(d5w d5wVar, d5w d5wVar2, x7w x7wVar) {
        List list;
        Collection arrayList;
        List<a5w> list2 = d5wVar2.a;
        boolean z = d5wVar2.d;
        boolean z2 = d5wVar2.f;
        boolean z3 = d5wVar2.g;
        boolean z4 = d5wVar2.e;
        Set<b5w> set = d5wVar2.c;
        Map<b5w, Msg> map = d5wVar2.b;
        x7w y9 = list2.isEmpty() ? x7w.f : ((a5w) j5g.i0(list2)).y9();
        List<a5w> list3 = d5wVar.a;
        if (!list3.isEmpty()) {
            x7w y92 = ((a5w) j5g.Y(list3)).y9();
            x7w y93 = ((a5w) j5g.i0(list3)).y9();
            if (x7wVar.compareTo(y92) < 0 || y9.compareTo(y93) > 0) {
                if (!list3.isEmpty()) {
                    x7w y94 = ((a5w) j5g.Y(list3)).y9();
                    x7w y95 = ((a5w) j5g.i0(list3)).y9();
                    if (x7wVar.compareTo(y94) >= 0 && y9.compareTo(y95) > 0) {
                        L l = L.a;
                        l.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l, L.LogType.d, new Object[]{"IM_ITEMS_LOADER ImItemListMerger mergeFreshCoverSinceAfterTillMiddle"});
                        }
                        if (!z3 || !z2) {
                            return d5w.a(d5wVar2, null, null, null, false, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : list3) {
                            a5w a5wVar = (a5w) obj;
                            if (a5wVar.y9().compareTo(y9) < 0 && !d(d5wVar2, a5wVar.t3())) {
                                arrayList2.add(obj);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            return d5w.a(d5wVar2, null, null, null, false, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
                        }
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.addAll(list2);
                        arrayList3.addAll(arrayList2);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.putAll(map);
                        linkedHashMap.putAll(c(d5wVar, arrayList2));
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        linkedHashSet.addAll(set);
                        linkedHashSet.addAll(b(d5wVar, arrayList2));
                        s3q0 s3q0Var = s3q0.a;
                        return new d5w(arrayList3, linkedHashMap, linkedHashSet, d5wVar2.d, d5wVar2.e, d5wVar.f, d5wVar.g, d5wVar2.h, false);
                    }
                }
                if (!list3.isEmpty()) {
                    x7w y96 = ((a5w) j5g.Y(list3)).y9();
                    x7w y97 = ((a5w) j5g.i0(list3)).y9();
                    if (x7wVar.compareTo(y96) < 0 && y9.compareTo(y97) <= 0) {
                        L l2 = L.a;
                        l2.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l2, L.LogType.d, new Object[]{"IM_ITEMS_LOADER ImItemListMerger mergeFreshCoverSinceMiddleTillBefore"});
                        }
                        if (!z4 || !z) {
                            return d5w.a(d5wVar2, null, null, null, false, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj2 : list3) {
                            a5w a5wVar2 = (a5w) obj2;
                            if (a5wVar2.y9().compareTo(x7wVar) > 0 && !d(d5wVar2, a5wVar2.t3())) {
                                arrayList4.add(obj2);
                            }
                        }
                        if (arrayList4.isEmpty()) {
                            return d5w.a(d5wVar2, null, null, null, false, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
                        }
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.addAll(list2);
                        arrayList5.addAll(0, arrayList4);
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        linkedHashMap2.putAll(map);
                        linkedHashMap2.putAll(c(d5wVar, arrayList4));
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                        linkedHashSet2.addAll(set);
                        linkedHashSet2.addAll(b(d5wVar, arrayList4));
                        s3q0 s3q0Var2 = s3q0.a;
                        return new d5w(arrayList5, linkedHashMap2, linkedHashSet2, d5wVar.d, d5wVar.e, d5wVar2.f, d5wVar2.g, d5wVar2.h, false);
                    }
                }
                if (!list3.isEmpty()) {
                    x7w y98 = ((a5w) j5g.Y(list3)).y9();
                    x7w y99 = ((a5w) j5g.i0(list3)).y9();
                    if (x7wVar.compareTo(y98) < 0 && y9.compareTo(y99) > 0) {
                        L l3 = L.a;
                        l3.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l3, L.LogType.d, new Object[]{"IM_ITEMS_LOADER ImItemListMerger mergeFreshInsideAllExists"});
                        }
                        boolean z5 = (z4 && z) ? false : true;
                        boolean z6 = (z3 && z2) ? false : true;
                        if (z6 && z5) {
                            return d5w.a(d5wVar2, null, null, null, false, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
                        }
                        if (z5) {
                            list = EmptyList.b;
                        } else {
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj3 : list3) {
                                a5w a5wVar3 = (a5w) obj3;
                                List<a5w> list4 = list2;
                                if (a5wVar3.y9().compareTo(x7wVar) > 0 && !d(d5wVar2, a5wVar3.t3())) {
                                    arrayList6.add(obj3);
                                }
                                list2 = list4;
                            }
                            list = arrayList6;
                        }
                        List<a5w> list5 = list2;
                        if (z6) {
                            arrayList = EmptyList.b;
                        } else {
                            arrayList = new ArrayList();
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                a5w a5wVar4 = (a5w) next;
                                Iterator it2 = it;
                                if (a5wVar4.y9().compareTo(y9) < 0 && !d(d5wVar2, a5wVar4.t3())) {
                                    arrayList.add(next);
                                }
                                it = it2;
                            }
                        }
                        boolean z7 = z5 || list.isEmpty();
                        boolean z8 = z6 || arrayList.isEmpty();
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.addAll(list5);
                        arrayList7.addAll(0, list);
                        arrayList7.addAll(arrayList);
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        linkedHashMap3.putAll(map);
                        linkedHashMap3.putAll(c(d5wVar, list));
                        linkedHashMap3.putAll(c(d5wVar, arrayList));
                        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                        linkedHashSet3.addAll(set);
                        linkedHashSet3.addAll(b(d5wVar, list));
                        linkedHashSet3.addAll(b(d5wVar, arrayList));
                        s3q0 s3q0Var3 = s3q0.a;
                        if (!z7) {
                            z = d5wVar.d;
                        }
                        boolean z9 = z;
                        if (!z7) {
                            z4 = d5wVar.e;
                        }
                        boolean z10 = z4;
                        if (!z8) {
                            z2 = d5wVar.f;
                        }
                        boolean z11 = z2;
                        if (!z8) {
                            z3 = d5wVar.g;
                        }
                        return new d5w(arrayList7, linkedHashMap3, linkedHashSet3, z9, z10, z11, z3, d5wVar2.h, false);
                    }
                }
                L l4 = L.a;
                l4.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l4, L.LogType.d, new Object[]{"IM_ITEMS_LOADER ImItemListMerger mergeFreshNotIntersectsExists"});
                }
                return d5w.a(d5wVar2, null, null, null, false, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
            }
        }
        L l5 = L.a;
        l5.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l5, L.LogType.d, new Object[]{"IM_ITEMS_LOADER ImItemListMerger mergeFreshCoverAllExists"});
        }
        return d5w.a(d5wVar2, null, null, null, false, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
    }

    public static d5w f(d5w d5wVar, ImItemType imItemType) {
        List<a5w> list = d5wVar.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((a5w) obj).M8() == imItemType) {
                arrayList.add(obj);
            }
        }
        Map<b5w, Msg> map = d5wVar.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<b5w, Msg> entry : map.entrySet()) {
            if (entry.getKey().b == imItemType) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set<b5w> set = d5wVar.c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : set) {
            if (((b5w) obj2).b == imItemType) {
                arrayList2.add(obj2);
            }
        }
        return new d5w(arrayList, linkedHashMap, j5g.S0(arrayList2), d5wVar.d, d5wVar.e, d5wVar.f, d5wVar.g, d5wVar.h, false);
    }

    @Override // xsna.i920
    public final n5w a(n5w n5wVar, n5w n5wVar2, wy1 wy1Var) {
        Set j;
        n5w n5wVar3 = n5wVar;
        n5w n5wVar4 = n5wVar2;
        wy1 wy1Var2 = wy1Var;
        d5w d5wVar = n5wVar3.b;
        ImItemType imItemType = ImItemType.DIALOG;
        d5w f = f(d5wVar, imItemType);
        ImItemType imItemType2 = ImItemType.CHANNEL;
        d5w f2 = f(d5wVar, imItemType2);
        d5w d5wVar2 = n5wVar4.b;
        d5w f3 = f(d5wVar2, imItemType);
        d5w f4 = f(d5wVar2, imItemType2);
        d5w e = e(f, f3, wy1Var2.a);
        d5w e2 = e(f2, f4, wy1Var2.b);
        List<a5w> list = e.a;
        List D0 = j5g.D0(new h6w(), j5g.u0(e2.a, list));
        Serializer.c<ProfilesInfo> cVar = ProfilesInfo.CREATOR;
        ProfilesInfo profilesInfo = n5wVar3.c;
        ProfilesInfo profilesInfo2 = n5wVar4.c;
        ProfilesInfo profilesInfo3 = new ProfilesInfo(profilesInfo);
        profilesInfo3.Hb(profilesInfo2);
        boolean z = d5wVar2.i;
        if (z) {
            j = EmptySet.b;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                a5w a5wVar = (a5w) obj;
                if ((a5wVar instanceof Dialog) && ((Dialog) a5wVar).Kb().d()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((a5w) it.next()).t3());
            }
            j = izi0.j(d5w.a(e, null, null, izi0.g(e.c, arrayList2), false, 507).c, e2.c);
        }
        d5w d5wVar3 = new d5w(D0, pn00.n(e.b, e2.b), j, e.d || e2.d, e.e || e2.e, e.f || e2.f, e.g || e2.g, d5wVar2.h, false);
        if (z && !this.b.a.getAndSet(true)) {
            List<a5w> list2 = d5wVar.a;
            ArrayList arrayList3 = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(Long.valueOf(((a5w) it2.next()).t3().a));
            }
            List<a5w> list3 = d5wVar2.a;
            ArrayList arrayList4 = new ArrayList(c5g.u(list3, 10));
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(Long.valueOf(((a5w) it3.next()).t3().a));
            }
            List<a5w> list4 = d5wVar3.a;
            ArrayList arrayList5 = new ArrayList(c5g.u(list4, 10));
            Iterator<T> it4 = list4.iterator();
            while (it4.hasNext()) {
                arrayList5.add(Long.valueOf(((a5w) it4.next()).t3().a));
            }
            Set<b5w> set = d5wVar.c;
            ArrayList arrayList6 = new ArrayList(c5g.u(set, 10));
            Iterator<T> it5 = set.iterator();
            while (it5.hasNext()) {
                arrayList6.add(Long.valueOf(((b5w) it5.next()).a));
            }
            Set<b5w> set2 = d5wVar2.c;
            ArrayList arrayList7 = new ArrayList(c5g.u(set2, 10));
            Iterator<T> it6 = set2.iterator();
            while (it6.hasNext()) {
                arrayList7.add(Long.valueOf(((b5w) it6.next()).a));
            }
            String str = "OldItemsIds: " + arrayList3 + " <> NewItemsIds: " + arrayList4 + " <> OldExpired: " + arrayList6 + " <> NewExpired: " + arrayList7 + " <> MergedItemIds: " + arrayList5;
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.i, new Object[]{"MergeTracker", str});
            }
            com.vk.metrics.eventtracking.b.a.q(new a.C2916a(str));
        }
        L.d(new qfj(d5wVar3, this));
        return new n5w(d5wVar3, profilesInfo3);
    }
}
