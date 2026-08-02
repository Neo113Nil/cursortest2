package com.yandex.go.notifications.acknowledge.domain;

import com.yandex.go.notifications.acknowledge.data.model.PushAckParam;
import com.yandex.go.notifications.acknowledge.data.model.PushAckParams;
import com.yandex.go.notifications.acknowledge.data.model.PushAckStatus;
import com.yandex.go.notifications.acknowledge.data.remote.ClientNotifyApi;
import defpackage.b64;
import defpackage.cmt;
import defpackage.erq0;
import defpackage.hst;
import defpackage.jst;
import defpackage.m0g0;
import defpackage.ny61;
import defpackage.tls;
import defpackage.w8x;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.jobs.push.j;

/* loaded from: classes8.dex */
public final class b {
    public final ClientNotifyApi a;
    public final m0g0 b;
    public final erq0 c;
    public final com.yandex.go.notifications.acknowledge.data.local.a d;

    public b(ClientNotifyApi clientNotifyApi, m0g0 m0g0Var, erq0 erq0Var, com.yandex.go.notifications.acknowledge.data.local.a aVar) {
        this.a = clientNotifyApi;
        this.b = m0g0Var;
        this.c = erq0Var;
        this.d = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0051, code lost:
    
        if (r10 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PushAckParam pushAckParam, ContinuationImpl continuationImpl) {
        PushAckJobInteractor$sendAck$1 pushAckJobInteractor$sendAck$1;
        Object obj;
        int i;
        PushAckParam pushAckParam2;
        Object obj2;
        Object putIfAbsent;
        if (continuationImpl instanceof PushAckJobInteractor$sendAck$1) {
            pushAckJobInteractor$sendAck$1 = (PushAckJobInteractor$sendAck$1) continuationImpl;
            int i2 = pushAckJobInteractor$sendAck$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pushAckJobInteractor$sendAck$1.label = i2 - Integer.MIN_VALUE;
                obj = pushAckJobInteractor$sendAck$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pushAckJobInteractor$sendAck$1.label;
                erq0 erq0Var = this.c;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pushAckJobInteractor$sendAck$1.L$0 = pushAckParam;
                    pushAckJobInteractor$sendAck$1.label = 1;
                    obj = ((j) this.b).d(pushAckJobInteractor$sendAck$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        pushAckParam2 = (PushAckParam) pushAckJobInteractor$sendAck$1.L$0;
                        kotlin.b.b(obj);
                        String str = pushAckParam2.b;
                        PushAckStatus pushAckStatus = pushAckParam2.c;
                        ConcurrentHashMap concurrentHashMap = erq0Var.a;
                        obj2 = concurrentHashMap.get(str);
                        if (obj2 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj2 = new CopyOnWriteArraySet()))) != null) {
                            obj2 = putIfAbsent;
                        }
                        ((Set) obj2).add(pushAckStatus);
                        return zy11Var;
                    }
                    pushAckParam = (PushAckParam) pushAckJobInteractor$sendAck$1.L$0;
                    kotlin.b.b(obj);
                }
                if (!(obj instanceof w8x)) {
                    return zy11Var;
                }
                String str2 = pushAckParam.b;
                PushAckStatus pushAckStatus2 = pushAckParam.c;
                Set set = (Set) erq0Var.a.get(str2);
                if (set != null ? set.contains(pushAckStatus2) : false) {
                    jst.e.n("pushack scheduled but pushId=" + pushAckParam.b + " and status=" + pushAckStatus2 + " already sent");
                    return zy11Var;
                }
                cmt<zy11> a = this.a.a(pushAckParam);
                pushAckJobInteractor$sendAck$1.L$0 = pushAckParam;
                pushAckJobInteractor$sendAck$1.label = 2;
                if (ru.yandex.taxi.network.api.a.a(a, null, pushAckJobInteractor$sendAck$1) != coroutineSingletons) {
                    pushAckParam2 = pushAckParam;
                    String str3 = pushAckParam2.b;
                    PushAckStatus pushAckStatus3 = pushAckParam2.c;
                    ConcurrentHashMap concurrentHashMap2 = erq0Var.a;
                    obj2 = concurrentHashMap2.get(str3);
                    if (obj2 == null) {
                        obj2 = putIfAbsent;
                    }
                    ((Set) obj2).add(pushAckStatus3);
                    return zy11Var;
                }
                return coroutineSingletons;
            }
        }
        pushAckJobInteractor$sendAck$1 = new PushAckJobInteractor$sendAck$1(this, continuationImpl);
        obj = pushAckJobInteractor$sendAck$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pushAckJobInteractor$sendAck$1.label;
        erq0 erq0Var2 = this.c;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        if (!(obj instanceof w8x)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ef, code lost:
    
        r11 = new java.util.LinkedHashSet();
        r10 = r8.iterator();
        r13 = r8;
        r14 = r9;
        r8 = r4;
        r4 = r2;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ad, code lost:
    
        if (r0 == r3) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x009c, code lost:
    
        if (r0 == r3) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x012b -> B:21:0x0131). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x015e -> B:24:0x0181). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        PushAckJobInteractor$sendAllPushAckParams$1 pushAckJobInteractor$sendAllPushAckParams$1;
        Object obj;
        int i;
        Map linkedHashMap;
        Iterator it;
        Iterator it2;
        EmptySet emptySet;
        Throwable th;
        PushAckJobInteractor$sendAllPushAckParams$1 pushAckJobInteractor$sendAllPushAckParams$12;
        Iterator it3;
        b bVar = this;
        if (continuationImpl instanceof PushAckJobInteractor$sendAllPushAckParams$1) {
            pushAckJobInteractor$sendAllPushAckParams$1 = (PushAckJobInteractor$sendAllPushAckParams$1) continuationImpl;
            int i2 = pushAckJobInteractor$sendAllPushAckParams$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pushAckJobInteractor$sendAllPushAckParams$1.label = i2 - Integer.MIN_VALUE;
                obj = pushAckJobInteractor$sendAllPushAckParams$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pushAckJobInteractor$sendAllPushAckParams$1.label;
                com.yandex.go.notifications.acknowledge.data.local.a aVar = bVar.d;
                tls tlsVar = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pushAckJobInteractor$sendAllPushAckParams$1.label = 1;
                    obj = ((j) bVar.b).d(pushAckJobInteractor$sendAllPushAckParams$1);
                } else if (i == 1) {
                    kotlin.b.b(obj);
                } else if (i == 2) {
                    kotlin.b.b(obj);
                    linkedHashMap = new LinkedHashMap();
                    it = ((Map) obj).entrySet().iterator();
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    PushAckParam pushAckParam = (PushAckParam) pushAckJobInteractor$sendAllPushAckParams$1.L$14;
                    Iterator it4 = (Iterator) pushAckJobInteractor$sendAllPushAckParams$1.L$11;
                    Collection linkedHashSet = (Collection) pushAckJobInteractor$sendAllPushAckParams$1.L$9;
                    Set set = (Set) pushAckJobInteractor$sendAllPushAckParams$1.L$7;
                    String str = (String) pushAckJobInteractor$sendAllPushAckParams$1.L$5;
                    Iterator it5 = (Iterator) pushAckJobInteractor$sendAllPushAckParams$1.L$3;
                    Map map = (Map) pushAckJobInteractor$sendAllPushAckParams$1.L$1;
                    try {
                        try {
                            kotlin.b.b(obj);
                            it3 = it5;
                        } catch (Throwable th2) {
                            th = th2;
                            jst.e.p("Push ack [" + pushAckParam.b + " - " + pushAckParam.c + "] will be sent next time", th);
                            pushAckJobInteractor$sendAllPushAckParams$12 = pushAckJobInteractor$sendAllPushAckParams$1;
                            it2 = it5;
                            pushAckParam = null;
                            if (pushAckParam != null) {
                            }
                            bVar = this;
                            PushAckJobInteractor$sendAllPushAckParams$1 pushAckJobInteractor$sendAllPushAckParams$13 = pushAckJobInteractor$sendAllPushAckParams$12;
                            tlsVar = null;
                            if (!it4.hasNext()) {
                            }
                        }
                        try {
                        } catch (Throwable th3) {
                            th = th3;
                            it5 = it3;
                            jst.e.p("Push ack [" + pushAckParam.b + " - " + pushAckParam.c + "] will be sent next time", th);
                            pushAckJobInteractor$sendAllPushAckParams$12 = pushAckJobInteractor$sendAllPushAckParams$1;
                            it2 = it5;
                            pushAckParam = null;
                            if (pushAckParam != null) {
                            }
                            bVar = this;
                            PushAckJobInteractor$sendAllPushAckParams$1 pushAckJobInteractor$sendAllPushAckParams$132 = pushAckJobInteractor$sendAllPushAckParams$12;
                            tlsVar = null;
                            if (!it4.hasNext()) {
                            }
                        }
                        jst.e.n("Push ack [" + pushAckParam.b + " - " + pushAckParam.c + "] was sent");
                        pushAckJobInteractor$sendAllPushAckParams$12 = pushAckJobInteractor$sendAllPushAckParams$1;
                        it2 = it3;
                        if (pushAckParam != null) {
                            linkedHashSet.add(pushAckParam);
                        }
                        bVar = this;
                        PushAckJobInteractor$sendAllPushAckParams$1 pushAckJobInteractor$sendAllPushAckParams$1322 = pushAckJobInteractor$sendAllPushAckParams$12;
                        tlsVar = null;
                        if (!it4.hasNext()) {
                            PushAckParam pushAckParam2 = (PushAckParam) it4.next();
                            try {
                            } catch (Throwable th4) {
                                th = th4;
                                it5 = it2;
                                pushAckJobInteractor$sendAllPushAckParams$1 = pushAckJobInteractor$sendAllPushAckParams$1322;
                                pushAckParam = pushAckParam2;
                                jst.e.p("Push ack [" + pushAckParam.b + " - " + pushAckParam.c + "] will be sent next time", th);
                                pushAckJobInteractor$sendAllPushAckParams$12 = pushAckJobInteractor$sendAllPushAckParams$1;
                                it2 = it5;
                                pushAckParam = null;
                                if (pushAckParam != null) {
                                }
                                bVar = this;
                                PushAckJobInteractor$sendAllPushAckParams$1 pushAckJobInteractor$sendAllPushAckParams$13222 = pushAckJobInteractor$sendAllPushAckParams$12;
                                tlsVar = null;
                                if (!it4.hasNext()) {
                                }
                            }
                            cmt<zy11> a = bVar.a.a(pushAckParam2);
                            pushAckJobInteractor$sendAllPushAckParams$13222.L$0 = tlsVar;
                            pushAckJobInteractor$sendAllPushAckParams$13222.L$1 = map;
                            pushAckJobInteractor$sendAllPushAckParams$13222.L$2 = tlsVar;
                            pushAckJobInteractor$sendAllPushAckParams$13222.L$3 = it2;
                            pushAckJobInteractor$sendAllPushAckParams$13222.L$4 = tlsVar;
                            pushAckJobInteractor$sendAllPushAckParams$13222.L$5 = str;
                            pushAckJobInteractor$sendAllPushAckParams$13222.L$6 = tlsVar;
                            pushAckJobInteractor$sendAllPushAckParams$13222.L$7 = set;
                            pushAckJobInteractor$sendAllPushAckParams$13222.L$8 = tlsVar;
                            pushAckJobInteractor$sendAllPushAckParams$13222.L$9 = linkedHashSet;
                            pushAckJobInteractor$sendAllPushAckParams$13222.L$10 = tlsVar;
                            pushAckJobInteractor$sendAllPushAckParams$13222.L$11 = it4;
                            pushAckJobInteractor$sendAllPushAckParams$13222.L$12 = tlsVar;
                            pushAckJobInteractor$sendAllPushAckParams$13222.L$13 = tlsVar;
                            pushAckJobInteractor$sendAllPushAckParams$13222.L$14 = pushAckParam2;
                            pushAckJobInteractor$sendAllPushAckParams$13222.label = 3;
                            if (ru.yandex.taxi.network.api.a.a(a, tlsVar, pushAckJobInteractor$sendAllPushAckParams$13222) != coroutineSingletons) {
                                it3 = it2;
                                pushAckJobInteractor$sendAllPushAckParams$1 = pushAckJobInteractor$sendAllPushAckParams$13222;
                                pushAckParam = pushAckParam2;
                                jst.e.n("Push ack [" + pushAckParam.b + " - " + pushAckParam.c + "] was sent");
                                pushAckJobInteractor$sendAllPushAckParams$12 = pushAckJobInteractor$sendAllPushAckParams$1;
                                it2 = it3;
                                if (pushAckParam != null) {
                                }
                                bVar = this;
                                PushAckJobInteractor$sendAllPushAckParams$1 pushAckJobInteractor$sendAllPushAckParams$132222 = pushAckJobInteractor$sendAllPushAckParams$12;
                                tlsVar = null;
                                if (!it4.hasNext()) {
                                    Set set2 = (Set) linkedHashSet;
                                    if (set.size() != set2.size()) {
                                        hst hstVar = jst.e;
                                        int size = set2.size();
                                        int size2 = set.size();
                                        StringBuilder u = b64.u(size, "Push ack params for [", str, "] were sent ", " out of ");
                                        u.append(size2);
                                        hstVar.n(u.toString());
                                    }
                                    map.put(str, new PushAckParams(set2));
                                    bVar = this;
                                    it = it2;
                                    pushAckJobInteractor$sendAllPushAckParams$1 = pushAckJobInteractor$sendAllPushAckParams$132222;
                                    linkedHashMap = map;
                                    tlsVar = null;
                                    if (it.hasNext()) {
                                        tls tlsVar2 = tlsVar;
                                        pushAckJobInteractor$sendAllPushAckParams$1.L$0 = tlsVar2;
                                        pushAckJobInteractor$sendAllPushAckParams$1.L$1 = tlsVar2;
                                        pushAckJobInteractor$sendAllPushAckParams$1.L$2 = tlsVar2;
                                        pushAckJobInteractor$sendAllPushAckParams$1.L$3 = tlsVar2;
                                        pushAckJobInteractor$sendAllPushAckParams$1.L$4 = tlsVar2;
                                        pushAckJobInteractor$sendAllPushAckParams$1.L$5 = tlsVar2;
                                        pushAckJobInteractor$sendAllPushAckParams$1.L$6 = tlsVar2;
                                        pushAckJobInteractor$sendAllPushAckParams$1.L$7 = tlsVar2;
                                        pushAckJobInteractor$sendAllPushAckParams$1.L$8 = tlsVar2;
                                        pushAckJobInteractor$sendAllPushAckParams$1.L$9 = tlsVar2;
                                        pushAckJobInteractor$sendAllPushAckParams$1.L$10 = tlsVar2;
                                        pushAckJobInteractor$sendAllPushAckParams$1.L$11 = tlsVar2;
                                        pushAckJobInteractor$sendAllPushAckParams$1.L$12 = tlsVar2;
                                        pushAckJobInteractor$sendAllPushAckParams$1.L$13 = tlsVar2;
                                        pushAckJobInteractor$sendAllPushAckParams$1.L$14 = tlsVar2;
                                        pushAckJobInteractor$sendAllPushAckParams$1.label = 4;
                                        Object c = aVar.c(linkedHashMap, pushAckJobInteractor$sendAllPushAckParams$1);
                                        if (c != coroutineSingletons) {
                                            return c;
                                        }
                                    } else {
                                        Map.Entry entry = (Map.Entry) it.next();
                                        String str2 = (String) entry.getKey();
                                        Set set3 = ((PushAckParams) entry.getValue()).a;
                                        if (set3 == null) {
                                            emptySet = EmptySet.a;
                                        }
                                        linkedHashSet = new LinkedHashSet();
                                        it4 = emptySet.iterator();
                                        set = emptySet;
                                        str = str2;
                                        map = linkedHashMap;
                                        pushAckJobInteractor$sendAllPushAckParams$132222 = pushAckJobInteractor$sendAllPushAckParams$1;
                                        it2 = it;
                                        if (!it4.hasNext()) {
                                        }
                                    }
                                }
                            }
                            return coroutineSingletons;
                        }
                    } catch (CancellationException e) {
                        throw e;
                    }
                }
                if (!(obj instanceof w8x)) {
                    return zy11.a;
                }
                pushAckJobInteractor$sendAllPushAckParams$1.label = 2;
                obj = aVar.b(pushAckJobInteractor$sendAllPushAckParams$1);
            }
        }
        pushAckJobInteractor$sendAllPushAckParams$1 = new PushAckJobInteractor$sendAllPushAckParams$1(bVar, continuationImpl);
        obj = pushAckJobInteractor$sendAllPushAckParams$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pushAckJobInteractor$sendAllPushAckParams$1.label;
        com.yandex.go.notifications.acknowledge.data.local.a aVar2 = bVar.d;
        tls tlsVar3 = null;
        if (i != 0) {
        }
        if (!(obj instanceof w8x)) {
        }
    }
}
