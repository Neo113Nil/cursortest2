package com.yandex.plus.core.network.uri;

import android.net.Uri;
import defpackage.gz50;
import defpackage.ny61;
import defpackage.sz50;
import defpackage.tv50;
import defpackage.uv50;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class b implements uv50 {
    public final a a;

    public b(a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        if (r15 != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.uv50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(tv50 tv50Var, ContinuationImpl continuationImpl) {
        NetworkRequestUriChanger$intercept$1 networkRequestUriChanger$intercept$1;
        int i;
        gz50 gz50Var;
        if (continuationImpl instanceof NetworkRequestUriChanger$intercept$1) {
            networkRequestUriChanger$intercept$1 = (NetworkRequestUriChanger$intercept$1) continuationImpl;
            int i2 = networkRequestUriChanger$intercept$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                networkRequestUriChanger$intercept$1.label = i2 - Integer.MIN_VALUE;
                Object obj = networkRequestUriChanger$intercept$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = networkRequestUriChanger$intercept$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    gz50 gz50Var2 = (gz50) ((com.yandex.plus.core.network.interceptor.a) tv50Var).b;
                    Uri uri = gz50Var2.a;
                    networkRequestUriChanger$intercept$1.L$0 = tv50Var;
                    networkRequestUriChanger$intercept$1.L$1 = gz50Var2;
                    networkRequestUriChanger$intercept$1.label = 1;
                    Object a = c.a(this.a, uri, networkRequestUriChanger$intercept$1);
                    if (a != coroutineSingletons) {
                        obj = a;
                        gz50Var = gz50Var2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return (sz50) obj;
                }
                gz50Var = (gz50) networkRequestUriChanger$intercept$1.L$1;
                tv50Var = (tv50) networkRequestUriChanger$intercept$1.L$0;
                kotlin.b.b(obj);
                gz50 gz50Var3 = new gz50(((Uri.Builder) obj).build(), gz50Var.b, gz50Var.c, gz50Var.d, gz50Var.e);
                networkRequestUriChanger$intercept$1.L$0 = null;
                networkRequestUriChanger$intercept$1.L$1 = null;
                networkRequestUriChanger$intercept$1.L$2 = null;
                networkRequestUriChanger$intercept$1.L$3 = null;
                networkRequestUriChanger$intercept$1.label = 2;
                obj = ((com.yandex.plus.core.network.interceptor.a) tv50Var).b(gz50Var3, networkRequestUriChanger$intercept$1);
            }
        }
        networkRequestUriChanger$intercept$1 = new NetworkRequestUriChanger$intercept$1(this, continuationImpl);
        Object obj2 = networkRequestUriChanger$intercept$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = networkRequestUriChanger$intercept$1.label;
        if (i != 0) {
        }
        gz50 gz50Var32 = new gz50(((Uri.Builder) obj2).build(), gz50Var.b, gz50Var.c, gz50Var.d, gz50Var.e);
        networkRequestUriChanger$intercept$1.L$0 = null;
        networkRequestUriChanger$intercept$1.L$1 = null;
        networkRequestUriChanger$intercept$1.L$2 = null;
        networkRequestUriChanger$intercept$1.L$3 = null;
        networkRequestUriChanger$intercept$1.label = 2;
        obj2 = ((com.yandex.plus.core.network.interceptor.a) tv50Var).b(gz50Var32, networkRequestUriChanger$intercept$1);
    }
}
