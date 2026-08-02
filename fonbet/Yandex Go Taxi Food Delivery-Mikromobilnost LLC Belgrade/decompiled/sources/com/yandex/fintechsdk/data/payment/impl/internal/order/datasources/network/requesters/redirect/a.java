package com.yandex.fintechsdk.data.payment.impl.internal.order.datasources.network.requesters.redirect;

import defpackage.an11;
import defpackage.b8f;
import defpackage.kt90;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.x7f;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a extends com.yandex.fintechsdk.core.network.api.request.a {
    public final kt90 b;

    public a(kt90 kt90Var) {
        super(0);
        this.b = kt90Var;
    }

    @Override // com.yandex.fintechsdk.core.network.api.request.a
    public final Object a(Object obj) {
        return new x7f((String) obj);
    }

    @Override // com.yandex.fintechsdk.core.network.api.request.a
    public final Object d(Object obj) {
        return ((b8f) obj).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.fintechsdk.core.network.api.request.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(x7f x7fVar, ContinuationImpl continuationImpl) {
        CreateRedirectIdRequester$executeRequest$1 createRedirectIdRequester$executeRequest$1;
        int i;
        if (continuationImpl instanceof CreateRedirectIdRequester$executeRequest$1) {
            createRedirectIdRequester$executeRequest$1 = (CreateRedirectIdRequester$executeRequest$1) continuationImpl;
            int i2 = createRedirectIdRequester$executeRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                createRedirectIdRequester$executeRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = createRedirectIdRequester$executeRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = createRedirectIdRequester$executeRequest$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                an11 e = qoi0.e(b8f.class);
                createRedirectIdRequester$executeRequest$1.label = 1;
                kt90 kt90Var = this.b;
                kt90Var.getClass();
                Object d = com.yandex.fintechsdk.core.network.impl.internal.network.a.d(kt90Var, x7fVar, e, createRedirectIdRequester$executeRequest$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        createRedirectIdRequester$executeRequest$1 = new CreateRedirectIdRequester$executeRequest$1(this, continuationImpl);
        Object obj2 = createRedirectIdRequester$executeRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = createRedirectIdRequester$executeRequest$1.label;
        if (i == 0) {
        }
    }
}
