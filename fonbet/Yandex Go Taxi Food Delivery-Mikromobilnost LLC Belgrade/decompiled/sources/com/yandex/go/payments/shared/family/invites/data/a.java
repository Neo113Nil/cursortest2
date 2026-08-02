package com.yandex.go.payments.shared.family.invites.data;

import defpackage.bvf0;
import defpackage.cne0;
import defpackage.dne0;
import defpackage.ebp;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.ny61;
import defpackage.owx;
import defpackage.tcc;
import defpackage.xbp;
import defpackage.y9p;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class a {
    public final ebp a;
    public final b b;
    public final cne0 c;
    public volatile List d = EmptyList.a;
    public final kotlinx.coroutines.sync.a e = gtq0.a();
    public final r0 f;
    public final m0 g;

    public a(ebp ebpVar, b bVar, xbp xbpVar, dne0 dne0Var) {
        this.a = ebpVar;
        this.b = bVar;
        this.c = dne0Var.a("SHOWN_INVITES_PREFS");
        owx.c.Companion.getClass();
        r0 c = bvf0.c(owx.c.g);
        this.f = c;
        this.g = new m0(e.d(c), xbpVar.b, new FamilyInvitesRepository$invitesFlow$1(3, null));
    }

    public final void a() {
        boolean isEmpty = this.d.isEmpty();
        r0 r0Var = this.f;
        if (!isEmpty) {
            r0Var.l(kotlin.collections.a.P(this.d));
            return;
        }
        owx.c.Companion.getClass();
        owx.c cVar = owx.c.g;
        r0Var.getClass();
        r0Var.m(null, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0071, code lost:
    
        if (r12.a(r0) == r1) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0123 A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:13:0x003a, B:15:0x0112, B:16:0x011d, B:18:0x0123, B:21:0x0135, B:26:0x0139, B:34:0x0050, B:35:0x008b, B:36:0x009c, B:38:0x00a2, B:40:0x00ae, B:41:0x00c2, B:43:0x00c8, B:45:0x00d4, B:47:0x00da, B:49:0x00ec, B:50:0x00f1), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2 A[Catch: all -> 0x003f, LOOP:1: B:36:0x009c->B:38:0x00a2, LOOP_END, TryCatch #1 {all -> 0x003f, blocks: (B:13:0x003a, B:15:0x0112, B:16:0x011d, B:18:0x0123, B:21:0x0135, B:26:0x0139, B:34:0x0050, B:35:0x008b, B:36:0x009c, B:38:0x00a2, B:40:0x00ae, B:41:0x00c2, B:43:0x00c8, B:45:0x00d4, B:47:0x00da, B:49:0x00ec, B:50:0x00f1), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8 A[Catch: all -> 0x003f, LOOP:2: B:41:0x00c2->B:43:0x00c8, LOOP_END, TryCatch #1 {all -> 0x003f, blocks: (B:13:0x003a, B:15:0x0112, B:16:0x011d, B:18:0x0123, B:21:0x0135, B:26:0x0139, B:34:0x0050, B:35:0x008b, B:36:0x009c, B:38:0x00a2, B:40:0x00ae, B:41:0x00c2, B:43:0x00c8, B:45:0x00d4, B:47:0x00da, B:49:0x00ec, B:50:0x00f1), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00da A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:13:0x003a, B:15:0x0112, B:16:0x011d, B:18:0x0123, B:21:0x0135, B:26:0x0139, B:34:0x0050, B:35:0x008b, B:36:0x009c, B:38:0x00a2, B:40:0x00ae, B:41:0x00c2, B:43:0x00c8, B:45:0x00d4, B:47:0x00da, B:49:0x00ec, B:50:0x00f1), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10, types: [g050] */
    /* JADX WARN: Type inference failed for: r11v2, types: [g050] */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, ContinuationImpl continuationImpl) {
        FamilyInvitesRepository$setInvites$1 familyInvitesRepository$setInvites$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        kotlinx.coroutines.sync.a aVar;
        List list2;
        Object a;
        List list3;
        Object obj;
        Iterator it;
        Set N0;
        ArrayList arrayList;
        Iterator it2;
        List list4;
        Object obj2;
        try {
            try {
                if (continuationImpl instanceof FamilyInvitesRepository$setInvites$1) {
                    familyInvitesRepository$setInvites$1 = (FamilyInvitesRepository$setInvites$1) continuationImpl;
                    int i2 = familyInvitesRepository$setInvites$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        familyInvitesRepository$setInvites$1.label = i2 - Integer.MIN_VALUE;
                        Object obj3 = familyInvitesRepository$setInvites$1.result;
                        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = familyInvitesRepository$setInvites$1.label;
                        if (i != 0) {
                            kotlin.b.b(obj3);
                            aVar = this.e;
                            familyInvitesRepository$setInvites$1.L$0 = list;
                            familyInvitesRepository$setInvites$1.L$1 = aVar;
                            familyInvitesRepository$setInvites$1.label = 1;
                            list2 = list;
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    Object obj4 = (g050) familyInvitesRepository$setInvites$1.L$1;
                                    list4 = (List) familyInvitesRepository$setInvites$1.L$0;
                                    kotlin.b.b(obj3);
                                    obj2 = obj4;
                                    list3 = list4;
                                    list = obj2;
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj5 : list3) {
                                        if (!this.c.g(((owx.c) obj5).a, false)) {
                                            arrayList2.add(obj5);
                                        }
                                    }
                                    this.d = new ArrayList(arrayList2);
                                    a();
                                    list.d(null);
                                    return zy11.a;
                                }
                                Object obj6 = (g050) familyInvitesRepository$setInvites$1.L$1;
                                list3 = (List) familyInvitesRepository$setInvites$1.L$0;
                                kotlin.b.b(obj3);
                                obj = obj6;
                                Iterable iterable = (Iterable) obj3;
                                ArrayList arrayList3 = new ArrayList(tcc.n(iterable, 10));
                                it = iterable.iterator();
                                while (it.hasNext()) {
                                    arrayList3.add(((owx.c) it.next()).a);
                                }
                                N0 = kotlin.collections.a.N0(arrayList3);
                                List list5 = list3;
                                arrayList = new ArrayList(tcc.n(list5, 10));
                                it2 = list5.iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(((owx.c) it2.next()).a);
                                }
                                list = obj;
                                if (!N0.containsAll(arrayList)) {
                                    y9p y9pVar = this.a.a;
                                    String obj7 = arrayList.toString();
                                    y9pVar.getClass();
                                    HashMap hashMap = new HashMap();
                                    if (obj7 != null) {
                                        hashMap.put("invites_list", obj7);
                                    }
                                    y9pVar.a.a("FamilyAccount.Invite.UpdatedInvitesList", hashMap, 1, new HashMap());
                                    b bVar = this.b;
                                    familyInvitesRepository$setInvites$1.L$0 = list3;
                                    familyInvitesRepository$setInvites$1.L$1 = obj;
                                    familyInvitesRepository$setInvites$1.L$2 = null;
                                    familyInvitesRepository$setInvites$1.L$3 = null;
                                    familyInvitesRepository$setInvites$1.label = 3;
                                    if (bVar.a(list3, familyInvitesRepository$setInvites$1) != coroutineSingletons) {
                                        list4 = list3;
                                        obj2 = obj;
                                        list3 = list4;
                                        list = obj2;
                                    }
                                    return coroutineSingletons;
                                }
                                ArrayList arrayList22 = new ArrayList();
                                while (r0.hasNext()) {
                                }
                                this.d = new ArrayList(arrayList22);
                                a();
                                list.d(null);
                                return zy11.a;
                            }
                            ?? r11 = (g050) familyInvitesRepository$setInvites$1.L$1;
                            List list6 = (List) familyInvitesRepository$setInvites$1.L$0;
                            kotlin.b.b(obj3);
                            aVar = r11;
                            list2 = list6;
                        }
                        b bVar2 = this.b;
                        familyInvitesRepository$setInvites$1.L$0 = list2;
                        familyInvitesRepository$setInvites$1.L$1 = aVar;
                        familyInvitesRepository$setInvites$1.label = 2;
                        a = bVar2.a.a(familyInvitesRepository$setInvites$1);
                        if (a != coroutineSingletons) {
                            list3 = list2;
                            obj = aVar;
                            obj3 = a;
                            Iterable iterable2 = (Iterable) obj3;
                            ArrayList arrayList32 = new ArrayList(tcc.n(iterable2, 10));
                            it = iterable2.iterator();
                            while (it.hasNext()) {
                            }
                            N0 = kotlin.collections.a.N0(arrayList32);
                            List list52 = list3;
                            arrayList = new ArrayList(tcc.n(list52, 10));
                            it2 = list52.iterator();
                            while (it2.hasNext()) {
                            }
                            list = obj;
                            if (!N0.containsAll(arrayList)) {
                            }
                            ArrayList arrayList222 = new ArrayList();
                            while (r0.hasNext()) {
                            }
                            this.d = new ArrayList(arrayList222);
                            a();
                            list.d(null);
                            return zy11.a;
                        }
                        return coroutineSingletons;
                    }
                }
                b bVar22 = this.b;
                familyInvitesRepository$setInvites$1.L$0 = list2;
                familyInvitesRepository$setInvites$1.L$1 = aVar;
                familyInvitesRepository$setInvites$1.label = 2;
                a = bVar22.a.a(familyInvitesRepository$setInvites$1);
                if (a != coroutineSingletons) {
                }
                return coroutineSingletons;
            } catch (Throwable th) {
                th = th;
                list = aVar;
                list.d(null);
                throw th;
            }
            if (i != 0) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        familyInvitesRepository$setInvites$1 = new FamilyInvitesRepository$setInvites$1(this, continuationImpl);
        Object obj32 = familyInvitesRepository$setInvites$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = familyInvitesRepository$setInvites$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056 A[Catch: all -> 0x006c, TryCatch #0 {all -> 0x006c, blocks: (B:11:0x0043, B:12:0x0050, B:14:0x0056, B:17:0x0068, B:22:0x006e), top: B:10:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        FamilyInvitesRepository$update$1 familyInvitesRepository$update$1;
        int i;
        g050 g050Var;
        try {
            if (continuationImpl instanceof FamilyInvitesRepository$update$1) {
                familyInvitesRepository$update$1 = (FamilyInvitesRepository$update$1) continuationImpl;
                int i2 = familyInvitesRepository$update$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    familyInvitesRepository$update$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = familyInvitesRepository$update$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = familyInvitesRepository$update$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        kotlinx.coroutines.sync.a aVar = this.e;
                        familyInvitesRepository$update$1.L$0 = aVar;
                        familyInvitesRepository$update$1.label = 1;
                        if (aVar.a(familyInvitesRepository$update$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) familyInvitesRepository$update$1.L$0;
                        kotlin.b.b(obj);
                    }
                    List list = this.d;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (!this.c.g(((owx.c) obj2).a, false)) {
                            arrayList.add(obj2);
                        }
                    }
                    this.d = arrayList;
                    a();
                    g050Var.d(null);
                    return zy11.a;
                }
            }
            List list2 = this.d;
            ArrayList arrayList2 = new ArrayList();
            while (r8.hasNext()) {
            }
            this.d = arrayList2;
            a();
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
        familyInvitesRepository$update$1 = new FamilyInvitesRepository$update$1(this, continuationImpl);
        Object obj3 = familyInvitesRepository$update$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = familyInvitesRepository$update$1.label;
        if (i != 0) {
        }
    }
}
