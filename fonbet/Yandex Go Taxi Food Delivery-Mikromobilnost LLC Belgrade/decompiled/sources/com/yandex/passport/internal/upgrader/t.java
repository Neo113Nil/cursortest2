package com.yandex.passport.internal.upgrader;

import com.yandex.passport.api.PassportAccountUpgradeStatus;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.methods.MethodRef;
import defpackage.bvf0;
import defpackage.ike;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.uyj;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class t {
    public final m a;
    public final com.yandex.passport.internal.methods.requester.d b;
    public final h c;
    public final ike d = bvf0.a(uyj.a.plus(jl40.a()).plus(com.yandex.passport.internal.util.p.o("UpgradeStatusUpdater")));
    public volatile CopyOnWriteArraySet e;
    public volatile zls f;
    public volatile boolean g;

    public t(m mVar, com.yandex.passport.common.a aVar, com.yandex.passport.internal.methods.requester.d dVar, h hVar) {
        this.a = mVar;
        this.b = dVar;
        this.c = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if (kotlinx.coroutines.a.i(3600000, r0) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r7.b(r0) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0063 -> B:17:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(t tVar, ContinuationImpl continuationImpl) {
        UpgradeStatusUpdater$updateCycle$1 upgradeStatusUpdater$updateCycle$1;
        int i;
        tVar.getClass();
        if (continuationImpl instanceof UpgradeStatusUpdater$updateCycle$1) {
            upgradeStatusUpdater$updateCycle$1 = (UpgradeStatusUpdater$updateCycle$1) continuationImpl;
            int i2 = upgradeStatusUpdater$updateCycle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                upgradeStatusUpdater$updateCycle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = upgradeStatusUpdater$updateCycle$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = upgradeStatusUpdater$updateCycle$1.label;
                if (i != 0) {
                    if (i == 1) {
                        tVar = (t) upgradeStatusUpdater$updateCycle$1.L$0;
                        kotlin.b.b(obj);
                        tVar.getClass();
                        upgradeStatusUpdater$updateCycle$1.L$0 = tVar;
                        upgradeStatusUpdater$updateCycle$1.label = 2;
                    } else {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        tVar = (t) upgradeStatusUpdater$updateCycle$1.L$0;
                    }
                }
                kotlin.b.b(obj);
                if (kotlinx.coroutines.a.p(upgradeStatusUpdater$updateCycle$1.get_context())) {
                    return zy11.a;
                }
                upgradeStatusUpdater$updateCycle$1.L$0 = tVar;
                upgradeStatusUpdater$updateCycle$1.label = 1;
            }
        }
        upgradeStatusUpdater$updateCycle$1 = new UpgradeStatusUpdater$updateCycle$1(tVar, continuationImpl);
        Object obj2 = upgradeStatusUpdater$updateCycle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = upgradeStatusUpdater$updateCycle$1.label;
        if (i != 0) {
        }
        kotlin.b.b(obj2);
        if (kotlinx.coroutines.a.p(upgradeStatusUpdater$updateCycle$1.get_context())) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x010b -> B:10:0x010c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        UpgradeStatusUpdater$checkUpdateTimes$1 upgradeStatusUpdater$checkUpdateTimes$1;
        int i;
        t tVar;
        Iterator it;
        Long valueOf;
        if (continuationImpl instanceof UpgradeStatusUpdater$checkUpdateTimes$1) {
            upgradeStatusUpdater$checkUpdateTimes$1 = (UpgradeStatusUpdater$checkUpdateTimes$1) continuationImpl;
            int i2 = upgradeStatusUpdater$checkUpdateTimes$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                upgradeStatusUpdater$checkUpdateTimes$1.label = i2 - Integer.MIN_VALUE;
                Object obj = upgradeStatusUpdater$checkUpdateTimes$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = upgradeStatusUpdater$checkUpdateTimes$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CopyOnWriteArraySet copyOnWriteArraySet = this.e;
                    if (copyOnWriteArraySet == null) {
                        copyOnWriteArraySet = null;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj2 : copyOnWriteArraySet) {
                        Uid uid = ((o) obj2).a;
                        Object obj3 = linkedHashMap.get(uid);
                        if (obj3 == null) {
                            obj3 = new ArrayList();
                            linkedHashMap.put(uid, obj3);
                        }
                        ((List) obj3).add(obj2);
                    }
                    tVar = this;
                    it = linkedHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = (Iterator) upgradeStatusUpdater$checkUpdateTimes$1.L$1;
                t tVar2 = (t) upgradeStatusUpdater$checkUpdateTimes$1.L$0;
                kotlin.b.b(obj);
                tVar = tVar2;
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Uid uid2 = (Uid) entry.getKey();
                    List list = (List) entry.getValue();
                    tVar.getClass();
                    Iterator it2 = list.iterator();
                    if (it2.hasNext()) {
                        valueOf = Long.valueOf(((o) it2.next()).b.getTimeIntervalMillis());
                        while (it2.hasNext()) {
                            Long valueOf2 = Long.valueOf(((o) it2.next()).b.getTimeIntervalMillis());
                            if (valueOf.compareTo(valueOf2) > 0) {
                                valueOf = valueOf2;
                            }
                        }
                    } else {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        long longValue = valueOf.longValue();
                        m mVar = tVar.a;
                        Long l = (Long) ((com.yandex.passport.internal.util.storage.a) mVar.a.getValue(mVar, m.b[0])).a.get(uid2);
                        if (System.currentTimeMillis() >= (l != null ? l.longValue() : 0L) + longValue) {
                            upgradeStatusUpdater$checkUpdateTimes$1.L$0 = tVar;
                            upgradeStatusUpdater$checkUpdateTimes$1.L$1 = it;
                            upgradeStatusUpdater$checkUpdateTimes$1.label = 1;
                            if (tVar.c(uid2, upgradeStatusUpdater$checkUpdateTimes$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            tVar2 = tVar;
                            tVar = tVar2;
                            while (it.hasNext()) {
                            }
                        }
                    }
                }
                return zy11.a;
            }
        }
        upgradeStatusUpdater$checkUpdateTimes$1 = new UpgradeStatusUpdater$checkUpdateTimes$1(this, continuationImpl);
        Object obj4 = upgradeStatusUpdater$checkUpdateTimes$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = upgradeStatusUpdater$checkUpdateTimes$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0095, code lost:
    
        if (((com.yandex.passport.internal.upgrader.UpgradeStatusUpdateScheduler$invalidateUpdaterStatus$1) r9).invoke(r10, r11, r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        if (r11 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Uid uid, ContinuationImpl continuationImpl) {
        UpgradeStatusUpdater$fireUpdateForUid$1 upgradeStatusUpdater$fireUpdateForUid$1;
        int i;
        Object a;
        Throwable a2;
        if (continuationImpl instanceof UpgradeStatusUpdater$fireUpdateForUid$1) {
            upgradeStatusUpdater$fireUpdateForUid$1 = (UpgradeStatusUpdater$fireUpdateForUid$1) continuationImpl;
            int i2 = upgradeStatusUpdater$fireUpdateForUid$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                upgradeStatusUpdater$fireUpdateForUid$1.label = i2 - Integer.MIN_VALUE;
                Object obj = upgradeStatusUpdater$fireUpdateForUid$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = upgradeStatusUpdater$fireUpdateForUid$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.internal.methods.requester.d dVar = this.b;
                    com.yandex.passport.internal.methods.requester.c cVar = new com.yandex.passport.internal.methods.requester.c(com.yandex.passport.internal.util.p.A(uid), UpgradeStatusRequestType.ACTUAL);
                    upgradeStatusUpdater$fireUpdateForUid$1.L$0 = this;
                    upgradeStatusUpdater$fireUpdateForUid$1.L$1 = uid;
                    upgradeStatusUpdater$fireUpdateForUid$1.label = 1;
                    a = dVar.a(cVar, upgradeStatusUpdater$fireUpdateForUid$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return zy11.a;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uid = (Uid) upgradeStatusUpdater$fireUpdateForUid$1.L$1;
                    this = (t) upgradeStatusUpdater$fireUpdateForUid$1.L$0;
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                m mVar = this.a;
                ((com.yandex.passport.internal.util.storage.a) mVar.a.getValue(mVar, m.b[0])).put(uid, Long.valueOf(System.currentTimeMillis()));
                a2 = Result.a(a);
                if (a2 != null) {
                    PassportAccountUpgradeStatus passportAccountUpgradeStatus = (PassportAccountUpgradeStatus) a;
                    zls zlsVar = this.f;
                    if (zlsVar == null) {
                        zlsVar = null;
                    }
                    upgradeStatusUpdater$fireUpdateForUid$1.L$0 = null;
                    upgradeStatusUpdater$fireUpdateForUid$1.L$1 = null;
                    upgradeStatusUpdater$fireUpdateForUid$1.label = 2;
                } else {
                    this.c.a(MethodRef.GetAccountUpgradeStatus, a2);
                }
                return zy11.a;
            }
        }
        upgradeStatusUpdater$fireUpdateForUid$1 = new UpgradeStatusUpdater$fireUpdateForUid$1(this, continuationImpl);
        Object obj2 = upgradeStatusUpdater$fireUpdateForUid$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = upgradeStatusUpdater$fireUpdateForUid$1.label;
        if (i != 0) {
        }
        m mVar2 = this.a;
        ((com.yandex.passport.internal.util.storage.a) mVar2.a.getValue(mVar2, m.b[0])).put(uid, Long.valueOf(System.currentTimeMillis()));
        a2 = Result.a(a);
        if (a2 != null) {
        }
        return zy11.a;
    }
}
