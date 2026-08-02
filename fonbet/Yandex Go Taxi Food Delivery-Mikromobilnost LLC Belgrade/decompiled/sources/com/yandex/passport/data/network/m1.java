package com.yandex.passport.data.network;

import com.yandex.passport.data.network.core.DataEvents;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class m1 extends com.yandex.passport.data.network.core.g {
    public final com.yandex.passport.internal.network.c h;
    public final i1 i;

    public m1(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l0 l0Var, com.yandex.passport.internal.network.c cVar, i1 i1Var, com.yandex.passport.data.network.core.o oVar) {
        super(aVar, cVar, l0Var, l1.Companion.serializer(), oVar, "DeviceAuthorizationCommitRequest");
        this.h = cVar;
        this.i = i1Var;
    }

    @Override // com.yandex.passport.data.network.core.a
    public final com.yandex.passport.data.network.core.c c() {
        return this.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.data.network.core.n
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(h1 h1Var, ContinuationImpl continuationImpl) {
        DeviceAuthorizationCommitRequest$run$1 deviceAuthorizationCommitRequest$run$1;
        int i;
        if (continuationImpl instanceof DeviceAuthorizationCommitRequest$run$1) {
            deviceAuthorizationCommitRequest$run$1 = (DeviceAuthorizationCommitRequest$run$1) continuationImpl;
            int i2 = deviceAuthorizationCommitRequest$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deviceAuthorizationCommitRequest$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deviceAuthorizationCommitRequest$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deviceAuthorizationCommitRequest$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    deviceAuthorizationCommitRequest$run$1.L$0 = this;
                    deviceAuthorizationCommitRequest$run$1.label = 1;
                    obj = com.yandex.passport.data.network.core.n.g(this, h1Var, deviceAuthorizationCommitRequest$run$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (m1) deviceAuthorizationCommitRequest$run$1.L$0;
                    kotlin.b.b(obj);
                }
                this.h.b(((Result) obj).getValue(), DataEvents.DeviceAuthorizationCommit);
                return obj;
            }
        }
        deviceAuthorizationCommitRequest$run$1 = new DeviceAuthorizationCommitRequest$run$1(this, continuationImpl);
        Object obj2 = deviceAuthorizationCommitRequest$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deviceAuthorizationCommitRequest$run$1.label;
        if (i != 0) {
        }
        this.h.b(((Result) obj2).getValue(), DataEvents.DeviceAuthorizationCommit);
        return obj2;
    }
}
