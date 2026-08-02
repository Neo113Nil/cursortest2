package com.yandex.mob.domain;

import com.yandex.mob.model.MobNotificationType;
import com.yandex.mob.reporting.MobTrigger;
import defpackage.bvu0;
import defpackage.ep20;
import defpackage.gp20;
import defpackage.jr20;
import defpackage.ll20;
import defpackage.np20;
import defpackage.npt;
import defpackage.ny61;
import defpackage.qke;
import defpackage.qp20;
import defpackage.rot;
import defpackage.rq20;
import defpackage.tk60;
import defpackage.tl20;
import defpackage.vl20;
import defpackage.w511;
import defpackage.wl20;
import defpackage.xl20;
import defpackage.zk60;
import defpackage.zp20;
import defpackage.zy11;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class q {
    public final com.yandex.mob.okhttp.b a;
    public final com.yandex.mob.datastore.d b;
    public final npt c;
    public final m d;
    public final u e;
    public final d f;
    public final l g;
    public final gp20 h;
    public final com.yandex.mob.cron.a i;
    public final com.yandex.mob.reporting.a j;
    public final rot k;
    public final h l;
    public final k m;
    public final p n;

    public q(com.yandex.mob.okhttp.b bVar, com.yandex.mob.datastore.d dVar, npt nptVar, m mVar, u uVar, d dVar2, l lVar, com.yandex.mob.network.b bVar2, com.yandex.mob.cron.a aVar, com.yandex.mob.reporting.a aVar2, rot rotVar, h hVar, k kVar, p pVar) {
        this.a = bVar;
        this.b = dVar;
        this.c = nptVar;
        this.d = mVar;
        this.e = uVar;
        this.f = dVar2;
        this.g = lVar;
        this.h = bVar2;
        this.i = aVar;
        this.j = aVar2;
        this.k = rotVar;
        this.l = hVar;
        this.m = kVar;
        this.n = pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e2, code lost:
    
        if (r11.b(r13, r0) == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ad, code lost:
    
        if (r13 != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(q qVar, MobTrigger mobTrigger, ContinuationImpl continuationImpl) {
        NotificationsPollingUseCase$requestNotificationsPolling$1 notificationsPollingUseCase$requestNotificationsPolling$1;
        int i;
        rot rotVar;
        xl20 xl20Var;
        Integer l;
        qVar.getClass();
        if (continuationImpl instanceof NotificationsPollingUseCase$requestNotificationsPolling$1) {
            notificationsPollingUseCase$requestNotificationsPolling$1 = (NotificationsPollingUseCase$requestNotificationsPolling$1) continuationImpl;
            int i2 = notificationsPollingUseCase$requestNotificationsPolling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                notificationsPollingUseCase$requestNotificationsPolling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = notificationsPollingUseCase$requestNotificationsPolling$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = notificationsPollingUseCase$requestNotificationsPolling$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    rot rotVar2 = qVar.k;
                    com.yandex.mob.reporting.a aVar = qVar.j;
                    notificationsPollingUseCase$requestNotificationsPolling$1.L$0 = null;
                    notificationsPollingUseCase$requestNotificationsPolling$1.L$1 = rotVar2;
                    notificationsPollingUseCase$requestNotificationsPolling$1.label = 1;
                    Object l2 = aVar.l(mobTrigger, notificationsPollingUseCase$requestNotificationsPolling$1);
                    if (l2 != obj2) {
                        obj = l2;
                        rotVar = rotVar2;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        xl20 xl20Var2 = (xl20) obj;
                        notificationsPollingUseCase$requestNotificationsPolling$1.L$0 = null;
                        notificationsPollingUseCase$requestNotificationsPolling$1.L$1 = xl20Var2;
                        notificationsPollingUseCase$requestNotificationsPolling$1.label = 3;
                        if (qVar.c(xl20Var2, notificationsPollingUseCase$requestNotificationsPolling$1) != obj2) {
                            xl20Var = xl20Var2;
                            if (!(xl20Var instanceof ll20)) {
                            }
                            String r = qke.r(xl20Var, "X-Polling-Interval-Seconds");
                            if (r != null) {
                            }
                            if (l != null) {
                            }
                            return l;
                        }
                        return obj2;
                    }
                    if (i == 3) {
                        xl20Var = (xl20) notificationsPollingUseCase$requestNotificationsPolling$1.L$1;
                        kotlin.b.b(obj);
                        if (!(xl20Var instanceof ll20)) {
                            if (xl20Var instanceof tl20) {
                                rq20 rq20Var = (rq20) ((tl20) xl20Var).a;
                                notificationsPollingUseCase$requestNotificationsPolling$1.L$0 = null;
                                notificationsPollingUseCase$requestNotificationsPolling$1.L$1 = xl20Var;
                                notificationsPollingUseCase$requestNotificationsPolling$1.L$2 = xl20Var;
                                notificationsPollingUseCase$requestNotificationsPolling$1.L$3 = null;
                                notificationsPollingUseCase$requestNotificationsPolling$1.I$0 = 0;
                                notificationsPollingUseCase$requestNotificationsPolling$1.I$1 = 0;
                                notificationsPollingUseCase$requestNotificationsPolling$1.label = 4;
                            } else if (!(xl20Var instanceof ep20) && !(xl20Var instanceof zp20)) {
                                w511.b();
                                return null;
                            }
                        }
                        String r2 = qke.r(xl20Var, "X-Polling-Interval-Seconds");
                        if (r2 != null) {
                        }
                        if (l != null) {
                        }
                        return l;
                    }
                    if (i != 4) {
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Integer num = (Integer) notificationsPollingUseCase$requestNotificationsPolling$1.L$2;
                        kotlin.b.b(obj);
                        return num;
                    }
                    xl20Var = (xl20) notificationsPollingUseCase$requestNotificationsPolling$1.L$1;
                    kotlin.b.b(obj);
                    String r22 = qke.r(xl20Var, "X-Polling-Interval-Seconds");
                    l = r22 != null ? bvu0.l(10, r22) : null;
                    if (l != null) {
                        int intValue = l.intValue();
                        com.yandex.mob.datastore.d dVar = qVar.b;
                        notificationsPollingUseCase$requestNotificationsPolling$1.L$0 = null;
                        notificationsPollingUseCase$requestNotificationsPolling$1.L$1 = null;
                        notificationsPollingUseCase$requestNotificationsPolling$1.L$2 = l;
                        notificationsPollingUseCase$requestNotificationsPolling$1.L$3 = null;
                        notificationsPollingUseCase$requestNotificationsPolling$1.I$0 = intValue;
                        notificationsPollingUseCase$requestNotificationsPolling$1.I$1 = 0;
                        notificationsPollingUseCase$requestNotificationsPolling$1.label = 5;
                        if (dVar.z(intValue, notificationsPollingUseCase$requestNotificationsPolling$1) == obj2) {
                            return obj2;
                        }
                    }
                    return l;
                }
                rotVar = (rot) notificationsPollingUseCase$requestNotificationsPolling$1.L$1;
                kotlin.b.b(obj);
                rotVar.b((Pair) obj);
                gp20 gp20Var = qVar.h;
                NotificationsPollingUseCase$requestNotificationsPolling$response$1 notificationsPollingUseCase$requestNotificationsPolling$response$1 = new NotificationsPollingUseCase$requestNotificationsPolling$response$1(qVar, null);
                notificationsPollingUseCase$requestNotificationsPolling$1.L$0 = null;
                notificationsPollingUseCase$requestNotificationsPolling$1.L$1 = null;
                notificationsPollingUseCase$requestNotificationsPolling$1.label = 2;
                obj = gp20Var.a(notificationsPollingUseCase$requestNotificationsPolling$response$1, notificationsPollingUseCase$requestNotificationsPolling$1);
            }
        }
        notificationsPollingUseCase$requestNotificationsPolling$1 = new NotificationsPollingUseCase$requestNotificationsPolling$1(qVar, continuationImpl);
        Object obj3 = notificationsPollingUseCase$requestNotificationsPolling$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = notificationsPollingUseCase$requestNotificationsPolling$1.label;
        if (i != 0) {
        }
        rotVar.b((Pair) obj3);
        gp20 gp20Var2 = qVar.h;
        NotificationsPollingUseCase$requestNotificationsPolling$response$1 notificationsPollingUseCase$requestNotificationsPolling$response$12 = new NotificationsPollingUseCase$requestNotificationsPolling$response$1(qVar, null);
        notificationsPollingUseCase$requestNotificationsPolling$1.L$0 = null;
        notificationsPollingUseCase$requestNotificationsPolling$1.L$1 = null;
        notificationsPollingUseCase$requestNotificationsPolling$1.label = 2;
        obj3 = gp20Var2.a(notificationsPollingUseCase$requestNotificationsPolling$response$12, notificationsPollingUseCase$requestNotificationsPolling$1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0136, code lost:
    
        if (r3 == r2) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0114, code lost:
    
        if (r8 == r2) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, jse, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0316 -> B:13:0x0317). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01ee -> B:41:0x01f1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x01ff -> B:44:0x0201). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(rq20 rq20Var, ContinuationImpl continuationImpl) {
        NotificationsPollingUseCase$handleNotifications$1 notificationsPollingUseCase$handleNotifications$1;
        int i;
        long b;
        rq20 rq20Var2;
        p pVar;
        l lVar;
        Object m;
        Object obj;
        Object a;
        tk60 tk60Var;
        Set set;
        Iterator it;
        Set set2;
        tk60 tk60Var2;
        int i2;
        Object c;
        List list;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        ?? r1;
        Object obj2;
        int i4;
        Set set3;
        Object obj3;
        rot rotVar;
        Object obj4;
        Iterator it2;
        int i5;
        Object obj5;
        Object obj6;
        Object k;
        rot rotVar2;
        Object obj7;
        if (continuationImpl instanceof NotificationsPollingUseCase$handleNotifications$1) {
            notificationsPollingUseCase$handleNotifications$1 = (NotificationsPollingUseCase$handleNotifications$1) continuationImpl;
            int i6 = notificationsPollingUseCase$handleNotifications$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                notificationsPollingUseCase$handleNotifications$1.label = i6 - Integer.MIN_VALUE;
                NotificationsPollingUseCase$handleNotifications$1 notificationsPollingUseCase$handleNotifications$12 = notificationsPollingUseCase$handleNotifications$1;
                Object obj8 = notificationsPollingUseCase$handleNotifications$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = notificationsPollingUseCase$handleNotifications$12.label;
                com.yandex.mob.reporting.a aVar = this.j;
                rot rotVar3 = this.k;
                int i7 = 2;
                com.yandex.mob.datastore.d dVar = this.b;
                int i8 = 1;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj8);
                        b = this.c.b();
                        rq20Var2 = rq20Var;
                        notificationsPollingUseCase$handleNotifications$12.L$0 = rq20Var2;
                        pVar = this.n;
                        notificationsPollingUseCase$handleNotifications$12.L$1 = pVar;
                        lVar = this.g;
                        notificationsPollingUseCase$handleNotifications$12.L$2 = lVar;
                        notificationsPollingUseCase$handleNotifications$12.J$0 = b;
                        notificationsPollingUseCase$handleNotifications$12.label = 1;
                        m = dVar.m(notificationsPollingUseCase$handleNotifications$12);
                        break;
                    case 1:
                        b = notificationsPollingUseCase$handleNotifications$12.J$0;
                        lVar = (l) notificationsPollingUseCase$handleNotifications$12.L$2;
                        pVar = (p) notificationsPollingUseCase$handleNotifications$12.L$1;
                        rq20 rq20Var3 = (rq20) notificationsPollingUseCase$handleNotifications$12.L$0;
                        kotlin.b.b(obj8);
                        m = obj8;
                        rq20Var2 = rq20Var3;
                        List list2 = (List) m;
                        List list3 = EmptyList.a;
                        if (list2 == null) {
                            list2 = list3;
                        }
                        List list4 = rq20Var2.a;
                        if (list4 != null) {
                            list3 = list4;
                        }
                        notificationsPollingUseCase$handleNotifications$12.L$0 = null;
                        notificationsPollingUseCase$handleNotifications$12.L$1 = null;
                        notificationsPollingUseCase$handleNotifications$12.L$2 = null;
                        notificationsPollingUseCase$handleNotifications$12.label = 2;
                        obj = null;
                        a = pVar.a(lVar, b, list2, list3, notificationsPollingUseCase$handleNotifications$12);
                        break;
                    case 2:
                        kotlin.b.b(obj8);
                        a = obj8;
                        obj = null;
                        tk60 tk60Var3 = (tk60) a;
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        List list5 = tk60Var3.d;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj9 : list5) {
                            MobNotificationType mobNotificationType = ((np20) obj9).b;
                            Object obj10 = linkedHashMap.get(mobNotificationType);
                            if (obj10 == null) {
                                obj10 = new ArrayList();
                                linkedHashMap.put(mobNotificationType, obj10);
                            }
                            ((List) obj10).add(obj9);
                        }
                        tk60Var = tk60Var3;
                        set = linkedHashSet;
                        it = linkedHashMap.entrySet().iterator();
                        int i9 = 0;
                        ?? r12 = obj;
                        if (!it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            MobNotificationType mobNotificationType2 = (MobNotificationType) entry.getKey();
                            List list6 = (List) entry.getValue();
                            if (mobNotificationType2 != null) {
                                notificationsPollingUseCase$handleNotifications$12.L$0 = r12;
                                notificationsPollingUseCase$handleNotifications$12.L$1 = tk60Var;
                                notificationsPollingUseCase$handleNotifications$12.L$2 = set;
                                notificationsPollingUseCase$handleNotifications$12.L$3 = r12;
                                notificationsPollingUseCase$handleNotifications$12.L$4 = it;
                                notificationsPollingUseCase$handleNotifications$12.L$5 = r12;
                                notificationsPollingUseCase$handleNotifications$12.L$6 = r12;
                                notificationsPollingUseCase$handleNotifications$12.L$7 = list6;
                                notificationsPollingUseCase$handleNotifications$12.I$0 = i9;
                                notificationsPollingUseCase$handleNotifications$12.I$1 = 0;
                                notificationsPollingUseCase$handleNotifications$12.label = 3;
                                int i10 = zk60.a[mobNotificationType2.ordinal()];
                                if (i10 == i8) {
                                    i2 = i9;
                                    c = this.e.c(MobTrigger.Notification, notificationsPollingUseCase$handleNotifications$12);
                                } else if (i10 == i7) {
                                    i2 = i9;
                                    c = this.f.c(MobTrigger.Notification, false, false, notificationsPollingUseCase$handleNotifications$12);
                                } else {
                                    if (i10 != 3) {
                                        w511.b();
                                        return r12;
                                    }
                                    MobTrigger mobTrigger = MobTrigger.Notification;
                                    h hVar = this.l;
                                    i2 = i9;
                                    jr20.b(hVar.e, r12, new DetailReportUseCase$invoke$2(hVar, mobTrigger, r12), 3);
                                    c = Boolean.TRUE;
                                }
                                if (c != coroutineSingletons) {
                                    list = list6;
                                    i3 = i2;
                                    r1 = r12;
                                    if (((Boolean) c).booleanValue()) {
                                        i9 = i3;
                                        z = false;
                                        z2 = r1;
                                        if (z) {
                                        }
                                        i7 = 2;
                                        i8 = 1;
                                        r12 = z2;
                                        if (!it.hasNext()) {
                                        }
                                    } else {
                                        i9 = i3;
                                        list6 = list;
                                        z3 = r1;
                                        list = list6;
                                        z = true;
                                        z2 = z3;
                                        if (z) {
                                            Iterator it3 = list.iterator();
                                            while (it3.hasNext()) {
                                                set.add(((np20) it3.next()).a);
                                            }
                                        }
                                        i7 = 2;
                                        i8 = 1;
                                        r12 = z2;
                                        if (!it.hasNext()) {
                                            List list7 = tk60Var.d;
                                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                            Iterator it4 = list7.iterator();
                                            while (it4.hasNext()) {
                                                linkedHashSet2.add(((np20) it4.next()).a);
                                            }
                                            List list8 = tk60Var.c;
                                            ArrayList arrayList = new ArrayList();
                                            for (Object obj11 : list8) {
                                                qp20 qp20Var = (qp20) obj11;
                                                if (!linkedHashSet2.contains(qp20Var.a) || set.contains(qp20Var.a)) {
                                                    arrayList.add(obj11);
                                                }
                                            }
                                            notificationsPollingUseCase$handleNotifications$12.L$0 = r12;
                                            notificationsPollingUseCase$handleNotifications$12.L$1 = tk60Var;
                                            notificationsPollingUseCase$handleNotifications$12.L$2 = set;
                                            notificationsPollingUseCase$handleNotifications$12.L$3 = r12;
                                            notificationsPollingUseCase$handleNotifications$12.L$4 = r12;
                                            notificationsPollingUseCase$handleNotifications$12.L$5 = r12;
                                            notificationsPollingUseCase$handleNotifications$12.L$6 = r12;
                                            notificationsPollingUseCase$handleNotifications$12.L$7 = r12;
                                            notificationsPollingUseCase$handleNotifications$12.label = 4;
                                            if (dVar.y(arrayList, notificationsPollingUseCase$handleNotifications$12) != coroutineSingletons) {
                                                set2 = set;
                                                tk60Var2 = tk60Var;
                                                obj2 = r12;
                                                i4 = tk60Var2.a;
                                                obj4 = obj2;
                                                if (i4 > 0) {
                                                    List list9 = tk60Var2.b;
                                                    notificationsPollingUseCase$handleNotifications$12.L$0 = obj2;
                                                    notificationsPollingUseCase$handleNotifications$12.L$1 = tk60Var2;
                                                    notificationsPollingUseCase$handleNotifications$12.L$2 = set2;
                                                    notificationsPollingUseCase$handleNotifications$12.L$3 = obj2;
                                                    notificationsPollingUseCase$handleNotifications$12.L$4 = obj2;
                                                    notificationsPollingUseCase$handleNotifications$12.L$5 = rotVar3;
                                                    notificationsPollingUseCase$handleNotifications$12.label = 5;
                                                    Serializable j = aVar.j(list9, i4, notificationsPollingUseCase$handleNotifications$12);
                                                    if (j != coroutineSingletons) {
                                                        set3 = set2;
                                                        obj3 = j;
                                                        rotVar = rotVar3;
                                                        obj5 = obj2;
                                                        rotVar.b((Pair) obj3);
                                                        set2 = set3;
                                                        obj4 = obj5;
                                                    }
                                                }
                                                List list10 = tk60Var2.d;
                                                ArrayList arrayList2 = new ArrayList();
                                                for (Object obj12 : list10) {
                                                    if (set2.contains(((np20) obj12).a)) {
                                                        arrayList2.add(obj12);
                                                    }
                                                }
                                                it2 = arrayList2.iterator();
                                                i5 = 0;
                                                obj6 = obj4;
                                                while (it2.hasNext()) {
                                                    np20 np20Var = (np20) it2.next();
                                                    MobNotificationType mobNotificationType3 = np20Var.b;
                                                    if (mobNotificationType3 != null) {
                                                        String str = np20Var.a;
                                                        notificationsPollingUseCase$handleNotifications$12.L$0 = obj6;
                                                        notificationsPollingUseCase$handleNotifications$12.L$1 = obj6;
                                                        notificationsPollingUseCase$handleNotifications$12.L$2 = obj6;
                                                        notificationsPollingUseCase$handleNotifications$12.L$3 = obj6;
                                                        notificationsPollingUseCase$handleNotifications$12.L$4 = obj6;
                                                        notificationsPollingUseCase$handleNotifications$12.L$5 = obj6;
                                                        notificationsPollingUseCase$handleNotifications$12.L$6 = it2;
                                                        notificationsPollingUseCase$handleNotifications$12.L$7 = obj6;
                                                        notificationsPollingUseCase$handleNotifications$12.L$8 = obj6;
                                                        notificationsPollingUseCase$handleNotifications$12.L$9 = obj6;
                                                        notificationsPollingUseCase$handleNotifications$12.L$10 = rotVar3;
                                                        notificationsPollingUseCase$handleNotifications$12.I$0 = i5;
                                                        notificationsPollingUseCase$handleNotifications$12.I$1 = 0;
                                                        notificationsPollingUseCase$handleNotifications$12.I$2 = 0;
                                                        notificationsPollingUseCase$handleNotifications$12.label = 6;
                                                        k = aVar.k(str, mobNotificationType3, notificationsPollingUseCase$handleNotifications$12);
                                                        if (k != coroutineSingletons) {
                                                            rotVar2 = rotVar3;
                                                            obj7 = obj6;
                                                            rotVar2.b((Pair) k);
                                                            obj6 = obj7;
                                                            while (it2.hasNext()) {
                                                            }
                                                        }
                                                    }
                                                }
                                                return zy11.a;
                                            }
                                        }
                                    }
                                }
                            } else {
                                z3 = r12;
                                list = list6;
                                z = true;
                                z2 = z3;
                                if (z) {
                                }
                                i7 = 2;
                                i8 = 1;
                                r12 = z2;
                                if (!it.hasNext()) {
                                }
                            }
                        }
                        return coroutineSingletons;
                    case 3:
                        int i11 = notificationsPollingUseCase$handleNotifications$12.I$0;
                        list = (List) notificationsPollingUseCase$handleNotifications$12.L$7;
                        it = (Iterator) notificationsPollingUseCase$handleNotifications$12.L$4;
                        set = (Set) notificationsPollingUseCase$handleNotifications$12.L$2;
                        tk60Var = (tk60) notificationsPollingUseCase$handleNotifications$12.L$1;
                        kotlin.b.b(obj8);
                        c = obj8;
                        r1 = 0;
                        i3 = i11;
                        if (((Boolean) c).booleanValue()) {
                        }
                        break;
                    case 4:
                        Set set4 = (Set) notificationsPollingUseCase$handleNotifications$12.L$2;
                        tk60 tk60Var4 = (tk60) notificationsPollingUseCase$handleNotifications$12.L$1;
                        kotlin.b.b(obj8);
                        tk60Var2 = tk60Var4;
                        obj2 = null;
                        set2 = set4;
                        i4 = tk60Var2.a;
                        obj4 = obj2;
                        if (i4 > 0) {
                        }
                        List list102 = tk60Var2.d;
                        ArrayList arrayList22 = new ArrayList();
                        while (r0.hasNext()) {
                        }
                        it2 = arrayList22.iterator();
                        i5 = 0;
                        obj6 = obj4;
                        while (it2.hasNext()) {
                        }
                        return zy11.a;
                    case 5:
                        rotVar = (rot) notificationsPollingUseCase$handleNotifications$12.L$5;
                        Set set5 = (Set) notificationsPollingUseCase$handleNotifications$12.L$2;
                        tk60Var2 = (tk60) notificationsPollingUseCase$handleNotifications$12.L$1;
                        kotlin.b.b(obj8);
                        obj3 = obj8;
                        obj5 = null;
                        set3 = set5;
                        rotVar.b((Pair) obj3);
                        set2 = set3;
                        obj4 = obj5;
                        List list1022 = tk60Var2.d;
                        ArrayList arrayList222 = new ArrayList();
                        while (r0.hasNext()) {
                        }
                        it2 = arrayList222.iterator();
                        i5 = 0;
                        obj6 = obj4;
                        while (it2.hasNext()) {
                        }
                        return zy11.a;
                    case 6:
                        i5 = notificationsPollingUseCase$handleNotifications$12.I$0;
                        rot rotVar4 = (rot) notificationsPollingUseCase$handleNotifications$12.L$10;
                        it2 = (Iterator) notificationsPollingUseCase$handleNotifications$12.L$6;
                        kotlin.b.b(obj8);
                        k = obj8;
                        obj7 = null;
                        rotVar2 = rotVar4;
                        rotVar2.b((Pair) k);
                        obj6 = obj7;
                        while (it2.hasNext()) {
                        }
                        return zy11.a;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        notificationsPollingUseCase$handleNotifications$1 = new NotificationsPollingUseCase$handleNotifications$1(this, continuationImpl);
        NotificationsPollingUseCase$handleNotifications$1 notificationsPollingUseCase$handleNotifications$122 = notificationsPollingUseCase$handleNotifications$1;
        Object obj82 = notificationsPollingUseCase$handleNotifications$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = notificationsPollingUseCase$handleNotifications$122.label;
        com.yandex.mob.reporting.a aVar2 = this.j;
        rot rotVar32 = this.k;
        int i72 = 2;
        com.yandex.mob.datastore.d dVar2 = this.b;
        int i82 = 1;
        switch (i) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if (r9 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(xl20 xl20Var, ContinuationImpl continuationImpl) {
        NotificationsPollingUseCase$handleResponseReaction$1 notificationsPollingUseCase$handleResponseReaction$1;
        int i;
        wl20 wl20Var;
        if (continuationImpl instanceof NotificationsPollingUseCase$handleResponseReaction$1) {
            notificationsPollingUseCase$handleResponseReaction$1 = (NotificationsPollingUseCase$handleResponseReaction$1) continuationImpl;
            int i2 = notificationsPollingUseCase$handleResponseReaction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                notificationsPollingUseCase$handleResponseReaction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = notificationsPollingUseCase$handleResponseReaction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = notificationsPollingUseCase$handleResponseReaction$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (xl20Var instanceof tl20) {
                        notificationsPollingUseCase$handleResponseReaction$1.L$0 = null;
                        notificationsPollingUseCase$handleResponseReaction$1.label = 1;
                        obj = this.m.a((tl20) xl20Var, notificationsPollingUseCase$handleResponseReaction$1);
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                kotlin.b.b(obj);
                wl20Var = (wl20) obj;
                if (wl20Var instanceof vl20) {
                    MobTrigger a = ((vl20) wl20Var).a();
                    notificationsPollingUseCase$handleResponseReaction$1.L$0 = null;
                    notificationsPollingUseCase$handleResponseReaction$1.L$1 = null;
                    notificationsPollingUseCase$handleResponseReaction$1.label = 2;
                    if (this.e.c(a, notificationsPollingUseCase$handleResponseReaction$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        notificationsPollingUseCase$handleResponseReaction$1 = new NotificationsPollingUseCase$handleResponseReaction$1(this, continuationImpl);
        Object obj2 = notificationsPollingUseCase$handleResponseReaction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = notificationsPollingUseCase$handleResponseReaction$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        wl20Var = (wl20) obj2;
        if (wl20Var instanceof vl20) {
        }
        return zy11Var2;
    }

    public final void d() {
        this.i.e(new NotificationsPollingUseCase$init$1(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(MobTrigger mobTrigger, ContinuationImpl continuationImpl) {
        NotificationsPollingUseCase$invoke$1 notificationsPollingUseCase$invoke$1;
        int i;
        if (continuationImpl instanceof NotificationsPollingUseCase$invoke$1) {
            notificationsPollingUseCase$invoke$1 = (NotificationsPollingUseCase$invoke$1) continuationImpl;
            int i2 = notificationsPollingUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                notificationsPollingUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = notificationsPollingUseCase$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = notificationsPollingUseCase$invoke$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    NotificationsPollingUseCase$invoke$2 notificationsPollingUseCase$invoke$2 = new NotificationsPollingUseCase$invoke$2(this, mobTrigger, null);
                    notificationsPollingUseCase$invoke$1.L$0 = null;
                    notificationsPollingUseCase$invoke$1.label = 1;
                    if (this.i.f(mobTrigger, notificationsPollingUseCase$invoke$2, notificationsPollingUseCase$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                }
                return zy11.a;
            }
        }
        notificationsPollingUseCase$invoke$1 = new NotificationsPollingUseCase$invoke$1(this, continuationImpl);
        Object obj2 = notificationsPollingUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = notificationsPollingUseCase$invoke$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
