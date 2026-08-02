package com.yandex.go.notifications.acknowledge.domain;

import com.yandex.go.notifications.acknowledge.data.model.PushAckParam;
import com.yandex.go.notifications.acknowledge.data.model.PushAckStatus;
import com.yandex.go.notifications.acknowledge.data.remote.ClientNotifyApi;
import defpackage.cmt;
import defpackage.erq0;
import defpackage.ez7;
import defpackage.fn21;
import defpackage.h3y;
import defpackage.hjt;
import defpackage.jst;
import defpackage.m0g0;
import defpackage.ny61;
import defpackage.tje;
import defpackage.vaj;
import defpackage.zy11;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes12.dex */
public final class a {
    public final fn21 a;
    public final vaj b;
    public final h3y c;
    public final ru.yandex.taxi.jobs.b d;
    public final m0g0 e;
    public final h3y f;
    public final h3y g;

    public a(fn21 fn21Var, vaj vajVar, h3y h3yVar, ru.yandex.taxi.jobs.b bVar, m0g0 m0g0Var, h3y h3yVar2, h3y h3yVar3) {
        this.a = fn21Var;
        this.b = vajVar;
        this.c = h3yVar;
        this.d = bVar;
        this.e = m0g0Var;
        this.f = h3yVar2;
        this.g = h3yVar3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|29|6|7|(0)(0)|12|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0034, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        defpackage.xby.l(defpackage.jst.e, "PUSH_ACK:REQUEST_FAILED", null, r0, "Push ack request with param " + r7 + " failed", 2);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, PushAckParam pushAckParam, UUID uuid, ContinuationImpl continuationImpl) {
        PushAckInteractor$makeRequest$1 pushAckInteractor$makeRequest$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof PushAckInteractor$makeRequest$1) {
            pushAckInteractor$makeRequest$1 = (PushAckInteractor$makeRequest$1) continuationImpl;
            int i2 = pushAckInteractor$makeRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pushAckInteractor$makeRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pushAckInteractor$makeRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pushAckInteractor$makeRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cmt<zy11> a = ((ClientNotifyApi) aVar.c.get()).a(pushAckParam);
                    pushAckInteractor$makeRequest$1.L$0 = pushAckParam;
                    pushAckInteractor$makeRequest$1.L$1 = uuid;
                    pushAckInteractor$makeRequest$1.label = 1;
                    if (ru.yandex.taxi.network.api.a.a(a, null, pushAckInteractor$makeRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uuid = (UUID) pushAckInteractor$makeRequest$1.L$1;
                    pushAckParam = (PushAckParam) pushAckInteractor$makeRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                aVar.c(uuid, pushAckParam.b, pushAckParam.c);
                return zy11.a;
            }
        }
        pushAckInteractor$makeRequest$1 = new PushAckInteractor$makeRequest$1(aVar, continuationImpl);
        Object obj2 = pushAckInteractor$makeRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pushAckInteractor$makeRequest$1.label;
        if (i != 0) {
        }
        aVar.c(uuid, pushAckParam.b, pushAckParam.c);
        return zy11.a;
    }

    public final void b(String str, PushAckStatus pushAckStatus) {
        tje.N(hjt.a, null, CoroutineStart.UNDISPATCHED, new PushAckInteractor$ack$1(this, str, pushAckStatus, null), 1);
    }

    public final void c(UUID uuid, String str, PushAckStatus pushAckStatus) {
        Object putIfAbsent;
        jst.e.n("Push ack [" + str + "] was delivered");
        ConcurrentHashMap concurrentHashMap = ((erq0) this.f.get()).a;
        Object obj = concurrentHashMap.get(str);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj = new CopyOnWriteArraySet()))) != null) {
            obj = putIfAbsent;
        }
        ((Set) obj).add(pushAckStatus);
        if (uuid != null) {
            this.d.c(new ez7("send_push_ack", uuid));
        }
    }
}
