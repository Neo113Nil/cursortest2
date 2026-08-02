package com.ybsdk.feature.status.screen.internal.data;

import defpackage.ny61;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class c {
    public final StatusScreenApi a;

    public c(StatusScreenApi statusScreenApi) {
        this.a = statusScreenApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Map map, ContinuationImpl continuationImpl) {
        StatusScreenRepository$getStatusScreen$1 statusScreenRepository$getStatusScreen$1;
        int i;
        if (continuationImpl instanceof StatusScreenRepository$getStatusScreen$1) {
            statusScreenRepository$getStatusScreen$1 = (StatusScreenRepository$getStatusScreen$1) continuationImpl;
            int i2 = statusScreenRepository$getStatusScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                statusScreenRepository$getStatusScreen$1.label = i2 - Integer.MIN_VALUE;
                Object obj = statusScreenRepository$getStatusScreen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = statusScreenRepository$getStatusScreen$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                StatusScreenRepository$getStatusScreen$2 statusScreenRepository$getStatusScreen$2 = new StatusScreenRepository$getStatusScreen$2(this, str, map, null);
                statusScreenRepository$getStatusScreen$1.label = 1;
                Object c = com.ybsdk.core.utils.ext.c.c(statusScreenRepository$getStatusScreen$2, statusScreenRepository$getStatusScreen$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        statusScreenRepository$getStatusScreen$1 = new StatusScreenRepository$getStatusScreen$1(this, continuationImpl);
        Object obj2 = statusScreenRepository$getStatusScreen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = statusScreenRepository$getStatusScreen$1.label;
        if (i == 0) {
        }
    }
}
