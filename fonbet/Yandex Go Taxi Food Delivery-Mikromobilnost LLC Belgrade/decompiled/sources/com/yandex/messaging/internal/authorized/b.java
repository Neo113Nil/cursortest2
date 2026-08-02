package com.yandex.messaging.internal.authorized;

import android.os.Handler;
import defpackage.h3y;
import defpackage.l8x;
import defpackage.ny61;
import defpackage.tje;
import defpackage.wi60;
import defpackage.xdf0;
import defpackage.y9i0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class b {
    public final Handler a;
    public final h3y b;
    public final com.yandex.messaging.domain.j c;
    public final xdf0 d;
    public final wi60 e;

    public b(Handler handler, h3y h3yVar, com.yandex.messaging.domain.j jVar, xdf0 xdf0Var, wi60 wi60Var) {
        this.a = handler;
        this.b = h3yVar;
        this.c = jVar;
        this.d = xdf0Var;
        this.e = wi60Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(y9i0 y9i0Var, ContinuationImpl continuationImpl) {
        CloudMessagesActions$processCloudMessage$1 cloudMessagesActions$processCloudMessage$1;
        int i;
        l8x N;
        if (continuationImpl instanceof CloudMessagesActions$processCloudMessage$1) {
            cloudMessagesActions$processCloudMessage$1 = (CloudMessagesActions$processCloudMessage$1) continuationImpl;
            int i2 = cloudMessagesActions$processCloudMessage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cloudMessagesActions$processCloudMessage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cloudMessagesActions$processCloudMessage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cloudMessagesActions$processCloudMessage$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    N = tje.N(this.d, null, null, new CloudMessagesActions$processCloudMessage$job$1(this, y9i0Var, null), 3);
                    cloudMessagesActions$processCloudMessage$1.L$0 = N;
                    cloudMessagesActions$processCloudMessage$1.label = 1;
                    if (N.u0(cloudMessagesActions$processCloudMessage$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    N = (l8x) cloudMessagesActions$processCloudMessage$1.L$0;
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(!N.isCancelled());
            }
        }
        cloudMessagesActions$processCloudMessage$1 = new CloudMessagesActions$processCloudMessage$1(this, continuationImpl);
        Object obj2 = cloudMessagesActions$processCloudMessage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cloudMessagesActions$processCloudMessage$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(!N.isCancelled());
    }
}
