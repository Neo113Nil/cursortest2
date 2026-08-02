package com.yandex.mob.domain;

import com.yandex.mob.api.model.MobEnvironment;
import defpackage.lq20;
import defpackage.ny61;
import defpackage.pr20;
import defpackage.tm20;
import defpackage.vng;
import defpackage.yn20;
import defpackage.zm20;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class j {
    public final yn20 a;
    public final com.yandex.mob.datastore.c b;
    public final com.yandex.mob.datastore.f c;

    public j(MobEnvironment mobEnvironment, yn20 yn20Var, com.yandex.mob.datastore.c cVar, com.yandex.mob.datastore.f fVar) {
        this.a = yn20Var;
        this.b = cVar;
        this.c = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f0, code lost:
    
        if (r8.c.a(r9, r0) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f2, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0077, code lost:
    
        if (r3.b(r2, r0) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005c, code lost:
    
        if (r9 == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum a(ContinuationImpl continuationImpl) {
        InitialUseCase$invoke$1 initialUseCase$invoke$1;
        Object obj;
        int i;
        tm20 a;
        if (continuationImpl instanceof InitialUseCase$invoke$1) {
            initialUseCase$invoke$1 = (InitialUseCase$invoke$1) continuationImpl;
            int i2 = initialUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                initialUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
                obj = initialUseCase$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = initialUseCase$invoke$1.label;
                com.yandex.mob.datastore.c cVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    initialUseCase$invoke$1.label = 1;
                    obj = cVar.a(initialUseCase$invoke$1);
                } else if (i == 1) {
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return InitialUseCase$Result.FirstLaunch;
                    }
                    a = (tm20) initialUseCase$invoke$1.L$1;
                    kotlin.b.b(obj);
                    List list = a.c;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj2 : list) {
                        zm20 i3 = vng.i((lq20) obj2);
                        Object obj3 = linkedHashMap.get(i3);
                        if (obj3 == null) {
                            obj3 = new ArrayList();
                            linkedHashMap.put(i3, obj3);
                        }
                        ((List) obj3).add(obj2);
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it = linkedHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        lq20 lq20Var = (lq20) kotlin.collections.a.R((List) ((Map.Entry) it.next()).getValue());
                        pr20 pr20Var = lq20Var != null ? new pr20(lq20Var, false) : null;
                        if (pr20Var != null) {
                            arrayList.add(pr20Var);
                        }
                    }
                    initialUseCase$invoke$1.L$0 = null;
                    initialUseCase$invoke$1.L$1 = null;
                    initialUseCase$invoke$1.L$2 = null;
                    initialUseCase$invoke$1.label = 3;
                }
                if (((tm20) obj) == null) {
                    return InitialUseCase$Result.ExistingUser;
                }
                a = this.a.a();
                initialUseCase$invoke$1.L$0 = null;
                initialUseCase$invoke$1.L$1 = a;
                initialUseCase$invoke$1.label = 2;
            }
        }
        initialUseCase$invoke$1 = new InitialUseCase$invoke$1(this, continuationImpl);
        obj = initialUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = initialUseCase$invoke$1.label;
        com.yandex.mob.datastore.c cVar2 = this.b;
        if (i != 0) {
        }
        if (((tm20) obj) == null) {
        }
    }
}
