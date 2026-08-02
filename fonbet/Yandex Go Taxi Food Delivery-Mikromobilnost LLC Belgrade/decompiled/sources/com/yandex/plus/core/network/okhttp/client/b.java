package com.yandex.plus.core.network.okhttp.client;

import com.yandex.plus.core.network.error.NetworkException;
import defpackage.bt50;
import defpackage.d6w;
import defpackage.ft50;
import defpackage.ny61;
import defpackage.nz50;
import defpackage.pz50;
import defpackage.sz50;
import defpackage.tv50;
import defpackage.uv50;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class b implements uv50 {
    public static final b a = new b();

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.uv50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(tv50 tv50Var, ContinuationImpl continuationImpl) {
        BaseOkHttpNetworkClient$createCallFactory$callFactory$1$innerInterceptors$2$intercept$1 baseOkHttpNetworkClient$createCallFactory$callFactory$1$innerInterceptors$2$intercept$1;
        int i;
        nz50 nz50Var;
        if (continuationImpl instanceof BaseOkHttpNetworkClient$createCallFactory$callFactory$1$innerInterceptors$2$intercept$1) {
            baseOkHttpNetworkClient$createCallFactory$callFactory$1$innerInterceptors$2$intercept$1 = (BaseOkHttpNetworkClient$createCallFactory$callFactory$1$innerInterceptors$2$intercept$1) continuationImpl;
            int i2 = baseOkHttpNetworkClient$createCallFactory$callFactory$1$innerInterceptors$2$intercept$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                baseOkHttpNetworkClient$createCallFactory$callFactory$1$innerInterceptors$2$intercept$1.label = i2 - Integer.MIN_VALUE;
                Object obj = baseOkHttpNetworkClient$createCallFactory$callFactory$1$innerInterceptors$2$intercept$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = baseOkHttpNetworkClient$createCallFactory$callFactory$1$innerInterceptors$2$intercept$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Object obj2 = ((com.yandex.plus.core.network.interceptor.a) tv50Var).b;
                    baseOkHttpNetworkClient$createCallFactory$callFactory$1$innerInterceptors$2$intercept$1.L$0 = null;
                    baseOkHttpNetworkClient$createCallFactory$callFactory$1$innerInterceptors$2$intercept$1.label = 1;
                    obj = ((com.yandex.plus.core.network.interceptor.a) tv50Var).b(obj2, baseOkHttpNetworkClient$createCallFactory$callFactory$1$innerInterceptors$2$intercept$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                sz50 sz50Var = (sz50) obj;
                nz50Var = (nz50) com.yandex.plus.core.network.call.a.a(sz50Var);
                if (nz50Var != null) {
                    return sz50Var;
                }
                d6w d6wVar = nz50.g;
                int i3 = d6wVar.a;
                int i4 = d6wVar.b;
                int i5 = nz50Var.c;
                if (i3 > i5 || i5 > i4) {
                    nz50Var = null;
                }
                if (nz50Var == null) {
                    return sz50Var;
                }
                int i6 = nz50Var.c;
                return new pz50(new NetworkException((i6 == 401 || i6 == 403) ? new bt50(nz50Var) : new ft50(nz50Var), null));
            }
        }
        baseOkHttpNetworkClient$createCallFactory$callFactory$1$innerInterceptors$2$intercept$1 = new BaseOkHttpNetworkClient$createCallFactory$callFactory$1$innerInterceptors$2$intercept$1(this, continuationImpl);
        Object obj3 = baseOkHttpNetworkClient$createCallFactory$callFactory$1$innerInterceptors$2$intercept$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = baseOkHttpNetworkClient$createCallFactory$callFactory$1$innerInterceptors$2$intercept$1.label;
        if (i != 0) {
        }
        sz50 sz50Var2 = (sz50) obj3;
        nz50Var = (nz50) com.yandex.plus.core.network.call.a.a(sz50Var2);
        if (nz50Var != null) {
        }
    }
}
