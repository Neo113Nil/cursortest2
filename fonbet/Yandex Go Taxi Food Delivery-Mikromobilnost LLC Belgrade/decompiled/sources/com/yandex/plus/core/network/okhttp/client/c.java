package com.yandex.plus.core.network.okhttp.client;

import defpackage.gz50;
import defpackage.tv50;
import defpackage.uv50;
import defpackage.zci0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class c implements uv50 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(d dVar, Object obj, int i) {
        this.a = i;
        this.b = dVar;
        this.c = obj;
    }

    @Override // defpackage.uv50
    public final Object a(tv50 tv50Var, ContinuationImpl continuationImpl) {
        int i = this.a;
        Object obj = this.c;
        d dVar = this.b;
        switch (i) {
            case 0:
                return d.a(dVar, ((com.yandex.plus.core.network.interceptor.a) tv50Var).a, (gz50) ((com.yandex.plus.core.network.interceptor.a) tv50Var).b, new BaseOkHttpNetworkClient$runNetworkInterceptorsInOkHttpChain$networkInterceptors$1$1$1((uv50) obj, tv50Var, null), continuationImpl);
            default:
                return d.a(dVar, ((com.yandex.plus.core.network.interceptor.a) tv50Var).a, (gz50) ((com.yandex.plus.core.network.interceptor.a) tv50Var).b, new BaseOkHttpNetworkClient$runNetworkInterceptorsInOkHttpChain$terminalNetworkInterceptor$1$1(dVar, (zci0) obj, null), continuationImpl);
        }
    }
}
