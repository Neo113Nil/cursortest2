package com.google.firebase.sessions.api;

import defpackage.g050;
import defpackage.gw00;
import defpackage.ny61;
import defpackage.p2f;
import defpackage.vcr;
import defpackage.vg10;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class a {
    public static final a a = new a();
    public static final Map b = Collections.synchronizedMap(new LinkedHashMap());

    public static vcr a(SessionSubscriber$Name sessionSubscriber$Name) {
        Object obj = b.get(sessionSubscriber$Name);
        if (obj != null) {
            return (vcr) obj;
        }
        vg10.p("Cannot get dependency ", sessionSubscriber$Name, ". Dependencies should be added at class load time.");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7 A[Catch: all -> 0x00c0, TRY_ENTER, TryCatch #0 {all -> 0x00c0, blocks: (B:11:0x0097, B:22:0x00a7, B:23:0x00bf), top: B:10:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0096 -> B:10:0x0097). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        FirebaseSessionsDependencies$getRegisteredSubscribers$1 firebaseSessionsDependencies$getRegisteredSubscribers$1;
        int i;
        Map linkedHashMap;
        Iterator it;
        if (continuationImpl instanceof FirebaseSessionsDependencies$getRegisteredSubscribers$1) {
            firebaseSessionsDependencies$getRegisteredSubscribers$1 = (FirebaseSessionsDependencies$getRegisteredSubscribers$1) continuationImpl;
            int i2 = firebaseSessionsDependencies$getRegisteredSubscribers$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                firebaseSessionsDependencies$getRegisteredSubscribers$1.label = i2 - Integer.MIN_VALUE;
                Object obj = firebaseSessionsDependencies$getRegisteredSubscribers$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = firebaseSessionsDependencies$getRegisteredSubscribers$1.label;
                if (i != 0) {
                    b.b(obj);
                    Map map = b;
                    linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
                    it = map.entrySet().iterator();
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object key = firebaseSessionsDependencies$getRegisteredSubscribers$1.L$5;
                    linkedHashMap = (Map) firebaseSessionsDependencies$getRegisteredSubscribers$1.L$4;
                    g050 g050Var = (g050) firebaseSessionsDependencies$getRegisteredSubscribers$1.L$3;
                    SessionSubscriber$Name sessionSubscriber$Name = (SessionSubscriber$Name) firebaseSessionsDependencies$getRegisteredSubscribers$1.L$2;
                    it = (Iterator) firebaseSessionsDependencies$getRegisteredSubscribers$1.L$1;
                    Map map2 = (Map) firebaseSessionsDependencies$getRegisteredSubscribers$1.L$0;
                    b.b(obj);
                    try {
                        p2f p2fVar = a(sessionSubscriber$Name).b;
                        if (p2fVar == null) {
                            g050Var.d(null);
                            linkedHashMap.put(key, p2fVar);
                            linkedHashMap = map2;
                            if (it.hasNext()) {
                                return linkedHashMap;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            key = entry.getKey();
                            sessionSubscriber$Name = (SessionSubscriber$Name) entry.getKey();
                            g050Var = ((vcr) entry.getValue()).a;
                            firebaseSessionsDependencies$getRegisteredSubscribers$1.L$0 = linkedHashMap;
                            firebaseSessionsDependencies$getRegisteredSubscribers$1.L$1 = it;
                            firebaseSessionsDependencies$getRegisteredSubscribers$1.L$2 = sessionSubscriber$Name;
                            firebaseSessionsDependencies$getRegisteredSubscribers$1.L$3 = g050Var;
                            firebaseSessionsDependencies$getRegisteredSubscribers$1.L$4 = linkedHashMap;
                            firebaseSessionsDependencies$getRegisteredSubscribers$1.L$5 = key;
                            firebaseSessionsDependencies$getRegisteredSubscribers$1.label = 1;
                            if (g050Var.a(firebaseSessionsDependencies$getRegisteredSubscribers$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            map2 = linkedHashMap;
                            p2f p2fVar2 = a(sessionSubscriber$Name).b;
                            if (p2fVar2 == null) {
                                throw new IllegalStateException("Subscriber " + sessionSubscriber$Name + " has not been registered.");
                            }
                        }
                    } catch (Throwable th) {
                        g050Var.d(null);
                        throw th;
                    }
                }
            }
        }
        firebaseSessionsDependencies$getRegisteredSubscribers$1 = new FirebaseSessionsDependencies$getRegisteredSubscribers$1(this, continuationImpl);
        Object obj2 = firebaseSessionsDependencies$getRegisteredSubscribers$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = firebaseSessionsDependencies$getRegisteredSubscribers$1.label;
        if (i != 0) {
        }
    }
}
