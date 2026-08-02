package com.yandex.go.summary.interactor.expanded.state.content.tariffcard;

import defpackage.cfl0;
import defpackage.d1h0;
import defpackage.eel0;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.l5l0;
import defpackage.l8v;
import defpackage.ny61;
import defpackage.o68;
import defpackage.q68;
import defpackage.s78;
import defpackage.scc;
import defpackage.tcc;
import defpackage.xo40;
import defpackage.ycc;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class d {
    public final ru.yandex.taxi.preorder.source.cars.a a;
    public final kotlinx.coroutines.sync.a b = gtq0.a();
    public ArrayList c;

    public d(ru.yandex.taxi.preorder.source.cars.a aVar) {
        this.a = aVar;
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            arrayList.add(null);
        }
        this.c = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.yandex.go.summary.interactor.expanded.state.content.tariffcard.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Set set, List list, boolean z, l8v l8vVar, ContinuationImpl continuationImpl) {
        MulticlassMapUiStateInteractor$createMapUiState$1 multiclassMapUiStateInteractor$createMapUiState$1;
        int i;
        Throwable th;
        l8v l8vVar2;
        int i2;
        ListIterator listIterator;
        int i3;
        ?? r13;
        Object obj;
        if (continuationImpl instanceof MulticlassMapUiStateInteractor$createMapUiState$1) {
            multiclassMapUiStateInteractor$createMapUiState$1 = (MulticlassMapUiStateInteractor$createMapUiState$1) continuationImpl;
            int i4 = multiclassMapUiStateInteractor$createMapUiState$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                multiclassMapUiStateInteractor$createMapUiState$1.label = i4 - Integer.MIN_VALUE;
                Object obj2 = multiclassMapUiStateInteractor$createMapUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multiclassMapUiStateInteractor$createMapUiState$1.label;
                EmptyList emptyList = EmptyList.a;
                ru.yandex.taxi.preorder.source.cars.a aVar = this.a;
                int i5 = 0;
                int i6 = 10;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    int i7 = z ? d1h0.bg_multiclass_map_dark : d1h0.bg_multiclass_map;
                    if (set.isEmpty()) {
                        List list2 = eel0.a;
                        l5l0 l5l0Var = z ? eel0.c : eel0.b;
                        List a = l5l0Var.a();
                        ArrayList arrayList = new ArrayList(tcc.n(a, 10));
                        for (Object obj3 : a) {
                            int i8 = i5 + 1;
                            if (i5 < 0) {
                                scc.m();
                                throw null;
                            }
                            o68 o68Var = (o68) obj3;
                            arrayList.add(new q68(aVar.b((String) ((i5 < 0 || i5 >= list.size()) ? "econom" : list.get(i5))), new s78(o68Var.a, o68Var.b, o68Var.c)));
                            i5 = i8;
                        }
                        return new xo40(i7, l8vVar, emptyList, Collections.singletonList(new cfl0(l5l0Var.c())), arrayList);
                    }
                    th = null;
                    multiclassMapUiStateInteractor$createMapUiState$1.L$0 = null;
                    multiclassMapUiStateInteractor$createMapUiState$1.L$1 = null;
                    l8vVar2 = l8vVar;
                    multiclassMapUiStateInteractor$createMapUiState$1.L$2 = l8vVar2;
                    multiclassMapUiStateInteractor$createMapUiState$1.Z$0 = z;
                    multiclassMapUiStateInteractor$createMapUiState$1.I$0 = i7;
                    multiclassMapUiStateInteractor$createMapUiState$1.label = 1;
                    Serializable b = b(set, multiclassMapUiStateInteractor$createMapUiState$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    int i9 = i7;
                    obj2 = b;
                    i2 = i9;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = multiclassMapUiStateInteractor$createMapUiState$1.I$0;
                    l8v l8vVar3 = (l8v) multiclassMapUiStateInteractor$createMapUiState$1.L$2;
                    kotlin.b.b(obj2);
                    th = null;
                    l8vVar2 = l8vVar3;
                }
                List list3 = (List) obj2;
                List list4 = eel0.a;
                listIterator = list3.listIterator(list3.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        i3 = -1;
                        break;
                    }
                    if (((String) listIterator.previous()) != null) {
                        i3 = listIterator.nextIndex();
                        break;
                    }
                }
                List list5 = list3;
                List A0 = kotlin.collections.a.A0(list5, list4.size());
                ArrayList arrayList2 = new ArrayList();
                int i10 = 0;
                for (Object obj4 : A0) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        scc.m();
                        throw th;
                    }
                    if (((String) obj4) != null) {
                        l5l0 l5l0Var2 = (l5l0) list4.get(i10);
                        obj = new cfl0(i10 == i3 ? l5l0Var2.b() : l5l0Var2.c());
                    } else {
                        obj = th;
                    }
                    if (obj != null) {
                        arrayList2.add(obj);
                    }
                    i10 = i11;
                }
                List A02 = kotlin.collections.a.A0(list5, list4.size());
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : A02) {
                    int i12 = i5 + 1;
                    if (i5 < 0) {
                        Throwable th2 = th;
                        scc.m();
                        throw th2;
                    }
                    String str = (String) obj5;
                    if (str != null) {
                        List<o68> a2 = ((l5l0) list4.get(i5)).a();
                        r13 = new ArrayList(tcc.n(a2, i6));
                        for (o68 o68Var2 : a2) {
                            r13.add(new q68(aVar.b(str), new s78(o68Var2.a, o68Var2.b, o68Var2.c)));
                            list4 = list4;
                            i2 = i2;
                            th = th;
                        }
                    } else {
                        r13 = emptyList;
                    }
                    int i13 = i2;
                    List list6 = list4;
                    Throwable th3 = th;
                    ycc.r((Iterable) r13, arrayList3);
                    list4 = list6;
                    i2 = i13;
                    th = th3;
                    i5 = i12;
                    i6 = 10;
                }
                return new xo40(i2, l8vVar2, arrayList2, emptyList, arrayList3);
            }
        }
        multiclassMapUiStateInteractor$createMapUiState$1 = new MulticlassMapUiStateInteractor$createMapUiState$1(this, continuationImpl);
        Object obj22 = multiclassMapUiStateInteractor$createMapUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multiclassMapUiStateInteractor$createMapUiState$1.label;
        EmptyList emptyList2 = EmptyList.a;
        ru.yandex.taxi.preorder.source.cars.a aVar2 = this.a;
        int i52 = 0;
        int i62 = 10;
        if (i != 0) {
        }
        List list32 = (List) obj22;
        List list42 = eel0.a;
        listIterator = list32.listIterator(list32.size());
        while (true) {
            if (listIterator.hasPrevious()) {
            }
        }
        List list52 = list32;
        List A03 = kotlin.collections.a.A0(list52, list42.size());
        ArrayList arrayList22 = new ArrayList();
        int i102 = 0;
        while (r4.hasNext()) {
        }
        List A022 = kotlin.collections.a.A0(list52, list42.size());
        ArrayList arrayList32 = new ArrayList();
        while (r2.hasNext()) {
        }
        return new xo40(i2, l8vVar2, arrayList22, emptyList2, arrayList32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:11:0x004a, B:12:0x005a, B:14:0x0060, B:17:0x0069, B:20:0x006f, B:26:0x0075, B:27:0x0079, B:29:0x0080, B:32:0x008c, B:37:0x0090, B:38:0x009b, B:40:0x00a1, B:43:0x00ae, B:48:0x00b2, B:49:0x00b6, B:51:0x00bc, B:53:0x00c8, B:55:0x00cc), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:11:0x004a, B:12:0x005a, B:14:0x0060, B:17:0x0069, B:20:0x006f, B:26:0x0075, B:27:0x0079, B:29:0x0080, B:32:0x008c, B:37:0x0090, B:38:0x009b, B:40:0x00a1, B:43:0x00ae, B:48:0x00b2, B:49:0x00b6, B:51:0x00bc, B:53:0x00c8, B:55:0x00cc), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:11:0x004a, B:12:0x005a, B:14:0x0060, B:17:0x0069, B:20:0x006f, B:26:0x0075, B:27:0x0079, B:29:0x0080, B:32:0x008c, B:37:0x0090, B:38:0x009b, B:40:0x00a1, B:43:0x00ae, B:48:0x00b2, B:49:0x00b6, B:51:0x00bc, B:53:0x00c8, B:55:0x00cc), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bc A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:11:0x004a, B:12:0x005a, B:14:0x0060, B:17:0x0069, B:20:0x006f, B:26:0x0075, B:27:0x0079, B:29:0x0080, B:32:0x008c, B:37:0x0090, B:38:0x009b, B:40:0x00a1, B:43:0x00ae, B:48:0x00b2, B:49:0x00b6, B:51:0x00bc, B:53:0x00c8, B:55:0x00cc), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r7v6, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(Set set, ContinuationImpl continuationImpl) {
        MulticlassMapUiStateInteractor$updateAndGet$1 multiclassMapUiStateInteractor$updateAndGet$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        Iterator it;
        Iterator it2;
        Iterator it3;
        try {
            if (continuationImpl instanceof MulticlassMapUiStateInteractor$updateAndGet$1) {
                multiclassMapUiStateInteractor$updateAndGet$1 = (MulticlassMapUiStateInteractor$updateAndGet$1) continuationImpl;
                int i2 = multiclassMapUiStateInteractor$updateAndGet$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    multiclassMapUiStateInteractor$updateAndGet$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = multiclassMapUiStateInteractor$updateAndGet$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = multiclassMapUiStateInteractor$updateAndGet$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        multiclassMapUiStateInteractor$updateAndGet$1.L$0 = set;
                        aVar = this.b;
                        multiclassMapUiStateInteractor$updateAndGet$1.L$1 = aVar;
                        multiclassMapUiStateInteractor$updateAndGet$1.label = 1;
                        if (aVar.a(multiclassMapUiStateInteractor$updateAndGet$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r7 = (g050) multiclassMapUiStateInteractor$updateAndGet$1.L$1;
                        Set set2 = (Set) multiclassMapUiStateInteractor$updateAndGet$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r7;
                        set = set2;
                    }
                    ArrayList arrayList = new ArrayList(this.c);
                    ArrayList arrayList2 = new ArrayList();
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        String str = (String) next;
                        if (str != null && !set.contains(str)) {
                            arrayList2.add(next);
                        }
                    }
                    it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        int indexOf = arrayList.indexOf((String) it2.next());
                        if (indexOf != -1) {
                            arrayList.set(indexOf, null);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : set) {
                        if (!arrayList.contains((String) obj2)) {
                            arrayList3.add(obj2);
                        }
                    }
                    it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        String str2 = (String) it3.next();
                        int indexOf2 = arrayList.indexOf(null);
                        if (indexOf2 == -1) {
                            break;
                        }
                        arrayList.set(indexOf2, str2);
                    }
                    this.c = arrayList;
                    aVar.d(null);
                    return arrayList;
                }
            }
            ArrayList arrayList4 = new ArrayList(this.c);
            ArrayList arrayList22 = new ArrayList();
            it = arrayList4.iterator();
            while (it.hasNext()) {
            }
            it2 = arrayList22.iterator();
            while (it2.hasNext()) {
            }
            ArrayList arrayList32 = new ArrayList();
            while (r7.hasNext()) {
            }
            it3 = arrayList32.iterator();
            while (it3.hasNext()) {
            }
            this.c = arrayList4;
            aVar.d(null);
            return arrayList4;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        multiclassMapUiStateInteractor$updateAndGet$1 = new MulticlassMapUiStateInteractor$updateAndGet$1(this, continuationImpl);
        Object obj3 = multiclassMapUiStateInteractor$updateAndGet$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multiclassMapUiStateInteractor$updateAndGet$1.label;
        if (i != 0) {
        }
    }
}
