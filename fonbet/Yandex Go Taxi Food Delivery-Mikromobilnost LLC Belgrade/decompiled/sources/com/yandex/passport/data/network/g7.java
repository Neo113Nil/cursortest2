package com.yandex.passport.data.network;

import com.yandex.passport.data.network.core.DataEvents;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class g7 extends com.yandex.passport.data.network.core.a {
    public final com.yandex.passport.internal.network.c f;
    public final a7 g;

    public g7(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, a7 a7Var, b7 b7Var, f7 f7Var) {
        super(aVar, cVar, l0Var, b7Var, f7Var);
        this.f = cVar;
        this.g = a7Var;
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.data.network.core.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(z6 z6Var, ContinuationImpl continuationImpl) {
        GetDeviceCodeRequest$run$1 getDeviceCodeRequest$run$1;
        int i;
        if (continuationImpl instanceof GetDeviceCodeRequest$run$1) {
            getDeviceCodeRequest$run$1 = (GetDeviceCodeRequest$run$1) continuationImpl;
            int i2 = getDeviceCodeRequest$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getDeviceCodeRequest$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getDeviceCodeRequest$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getDeviceCodeRequest$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    getDeviceCodeRequest$run$1.L$0 = this;
                    getDeviceCodeRequest$run$1.label = 1;
                    obj = com.yandex.passport.data.network.core.a.e(this, z6Var, getDeviceCodeRequest$run$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (g7) getDeviceCodeRequest$run$1.L$0;
                    kotlin.b.b(obj);
                }
                this.f.b(((Result) obj).getValue(), DataEvents.GetDeviceCode);
                return obj;
            }
        }
        getDeviceCodeRequest$run$1 = new GetDeviceCodeRequest$run$1(this, continuationImpl);
        Object obj2 = getDeviceCodeRequest$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getDeviceCodeRequest$run$1.label;
        if (i != 0) {
        }
        this.f.b(((Result) obj2).getValue(), DataEvents.GetDeviceCode);
        return obj2;
    }
}
