package com.yandex.mob.domain;

import com.yandex.mob.reporting.MobNotificationsTrimReason;
import defpackage.gw00;
import defpackage.jl40;
import defpackage.np20;
import defpackage.ny61;
import defpackage.qp20;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tk60;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class p {
    /* JADX WARN: Code restructure failed: missing block: B:33:0x014a, code lost:
    
        if (r0 == r3) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x014a -> B:26:0x014e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(l lVar, long j, List list, List list2, ContinuationImpl continuationImpl) {
        NotificationsApplier$apply$1 notificationsApplier$apply$1;
        p pVar;
        int i;
        Iterator it;
        NotificationsApplier$apply$1 notificationsApplier$apply$12;
        Collection collection;
        Collection collection2;
        int i2;
        int i3;
        l lVar2;
        long j2;
        List list3;
        List list4;
        List list5;
        Iterable iterable;
        ?? r3;
        List list6;
        Object obj;
        int size;
        Pair pair;
        if (continuationImpl instanceof NotificationsApplier$apply$1) {
            notificationsApplier$apply$1 = (NotificationsApplier$apply$1) continuationImpl;
            int i4 = notificationsApplier$apply$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                notificationsApplier$apply$1.label = i4 - Integer.MIN_VALUE;
                pVar = this;
                Object obj2 = notificationsApplier$apply$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = notificationsApplier$apply$1.label;
                Object obj3 = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list7 = list2;
                    int d = gw00.d(tcc.n(list7, 10));
                    if (d < 16) {
                        d = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                    for (Object obj4 : list7) {
                        linkedHashMap.put(((np20) obj4).a, obj4);
                    }
                    Set entrySet = linkedHashMap.entrySet();
                    ArrayList arrayList = new ArrayList(tcc.n(entrySet, 10));
                    Iterator it2 = entrySet.iterator();
                    while (it2.hasNext()) {
                        arrayList.add((np20) ((Map.Entry) it2.next()).getValue());
                    }
                    ArrayList arrayList2 = new ArrayList();
                    it = list.iterator();
                    notificationsApplier$apply$12 = notificationsApplier$apply$1;
                    collection = arrayList;
                    collection2 = arrayList2;
                    i2 = 0;
                    i3 = 0;
                    lVar2 = lVar;
                    j2 = j;
                    list3 = list;
                    if (it.hasNext()) {
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    iterable = (Iterable) notificationsApplier$apply$1.L$8;
                    List list8 = (List) notificationsApplier$apply$1.L$7;
                    list6 = (List) notificationsApplier$apply$1.L$5;
                    list4 = (List) notificationsApplier$apply$1.L$4;
                    list5 = (List) notificationsApplier$apply$1.L$1;
                    kotlin.b.b(obj2);
                    r3 = list8;
                    List A0 = kotlin.collections.a.A0(iterable, ((Number) obj2).intValue());
                    size = list5.size() - list4.size();
                    int size2 = r3.size() - A0.size();
                    if (size <= 0 && size2 > 0) {
                        pair = new Pair(scc.g(MobNotificationsTrimReason.ExpirationInterval, MobNotificationsTrimReason.CountLimit), new Integer(size2 + size));
                    } else if (size <= 0) {
                        pair = new Pair(Collections.singletonList(MobNotificationsTrimReason.ExpirationInterval), new Integer(size));
                    } else if (size2 > 0) {
                        pair = new Pair(Collections.singletonList(MobNotificationsTrimReason.CountLimit), new Integer(size2));
                    } else {
                        pair = new Pair(EmptyList.a, new Integer(0));
                    }
                    return new tk60(((Number) pair.getSecond()).intValue(), (List) pair.getFirst(), A0, list6);
                }
                int i5 = notificationsApplier$apply$1.I$1;
                int i6 = notificationsApplier$apply$1.I$0;
                long j3 = notificationsApplier$apply$1.J$0;
                Object next = notificationsApplier$apply$1.L$8;
                it = (Iterator) notificationsApplier$apply$1.L$7;
                collection2 = (Collection) notificationsApplier$apply$1.L$6;
                Collection collection3 = (List) notificationsApplier$apply$1.L$3;
                List list9 = (List) notificationsApplier$apply$1.L$1;
                l lVar3 = (l) notificationsApplier$apply$1.L$0;
                kotlin.b.b(obj2);
                notificationsApplier$apply$12 = notificationsApplier$apply$1;
                list3 = list9;
                l lVar4 = lVar3;
                i2 = i5;
                collection = collection3;
                j2 = j3;
                i3 = i6;
                if (!((Boolean) obj2).booleanValue()) {
                    collection2.add(next);
                }
                lVar2 = lVar4;
                obj3 = null;
                pVar = this;
                if (it.hasNext()) {
                    l lVar5 = lVar2;
                    List list10 = (List) collection2;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj5 : collection) {
                        np20 np20Var = (np20) obj5;
                        Iterator it3 = list3.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it3.next();
                            if (jl40.l(((qp20) obj).a, np20Var.a)) {
                                break;
                            }
                        }
                        if (obj == null) {
                            arrayList3.add(obj5);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(new qp20(((np20) it4.next()).a, j2));
                    }
                    ArrayList m0 = kotlin.collections.a.m0(list10, arrayList4);
                    notificationsApplier$apply$12.L$0 = null;
                    notificationsApplier$apply$12.L$1 = list3;
                    notificationsApplier$apply$12.L$2 = null;
                    notificationsApplier$apply$12.L$3 = null;
                    notificationsApplier$apply$12.L$4 = list10;
                    notificationsApplier$apply$12.L$5 = arrayList3;
                    notificationsApplier$apply$12.L$6 = null;
                    notificationsApplier$apply$12.L$7 = m0;
                    notificationsApplier$apply$12.L$8 = m0;
                    notificationsApplier$apply$12.L$9 = null;
                    notificationsApplier$apply$12.J$0 = j2;
                    notificationsApplier$apply$12.label = 2;
                    Object i7 = lVar5.i(notificationsApplier$apply$12);
                    if (i7 != coroutineSingletons) {
                        list4 = list10;
                        list5 = list3;
                        obj2 = i7;
                        iterable = m0;
                        r3 = iterable;
                        list6 = arrayList3;
                        List A02 = kotlin.collections.a.A0(iterable, ((Number) obj2).intValue());
                        size = list5.size() - list4.size();
                        int size22 = r3.size() - A02.size();
                        if (size <= 0) {
                        }
                        if (size <= 0) {
                        }
                        return new tk60(((Number) pair.getSecond()).intValue(), (List) pair.getFirst(), A02, list6);
                    }
                } else {
                    next = it.next();
                    notificationsApplier$apply$12.L$0 = lVar2;
                    notificationsApplier$apply$12.L$1 = list3;
                    notificationsApplier$apply$12.L$2 = obj3;
                    notificationsApplier$apply$12.L$3 = collection;
                    notificationsApplier$apply$12.L$4 = obj3;
                    notificationsApplier$apply$12.L$5 = obj3;
                    notificationsApplier$apply$12.L$6 = collection2;
                    notificationsApplier$apply$12.L$7 = it;
                    notificationsApplier$apply$12.L$8 = next;
                    notificationsApplier$apply$12.L$9 = obj3;
                    notificationsApplier$apply$12.J$0 = j2;
                    notificationsApplier$apply$12.I$0 = i3;
                    notificationsApplier$apply$12.I$1 = i2;
                    notificationsApplier$apply$12.I$2 = 0;
                    notificationsApplier$apply$12.label = 1;
                    l lVar6 = lVar2;
                    obj2 = pVar.b(lVar6, j2, (qp20) next, notificationsApplier$apply$12);
                    lVar4 = lVar6;
                }
                return coroutineSingletons;
            }
        }
        pVar = this;
        notificationsApplier$apply$1 = new NotificationsApplier$apply$1(pVar, continuationImpl);
        Object obj22 = notificationsApplier$apply$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = notificationsApplier$apply$1.label;
        Object obj32 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(l lVar, long j, qp20 qp20Var, ContinuationImpl continuationImpl) {
        NotificationsApplier$notificationTtlExpired$1 notificationsApplier$notificationTtlExpired$1;
        int i;
        long j2;
        if (continuationImpl instanceof NotificationsApplier$notificationTtlExpired$1) {
            notificationsApplier$notificationTtlExpired$1 = (NotificationsApplier$notificationTtlExpired$1) continuationImpl;
            int i2 = notificationsApplier$notificationTtlExpired$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                notificationsApplier$notificationTtlExpired$1.label = i2 - Integer.MIN_VALUE;
                Object obj = notificationsApplier$notificationTtlExpired$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = notificationsApplier$notificationTtlExpired$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    long j3 = j - qp20Var.b;
                    notificationsApplier$notificationTtlExpired$1.L$0 = null;
                    notificationsApplier$notificationTtlExpired$1.L$1 = null;
                    notificationsApplier$notificationTtlExpired$1.J$0 = j;
                    notificationsApplier$notificationTtlExpired$1.J$1 = j3;
                    notificationsApplier$notificationTtlExpired$1.label = 1;
                    obj = lVar.j(notificationsApplier$notificationTtlExpired$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                    j2 = j3;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2 = notificationsApplier$notificationTtlExpired$1.J$1;
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(j2 > ((long) ((Number) obj).intValue()));
            }
        }
        notificationsApplier$notificationTtlExpired$1 = new NotificationsApplier$notificationTtlExpired$1(this, continuationImpl);
        Object obj3 = notificationsApplier$notificationTtlExpired$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = notificationsApplier$notificationTtlExpired$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(j2 > ((long) ((Number) obj3).intValue()));
    }
}
