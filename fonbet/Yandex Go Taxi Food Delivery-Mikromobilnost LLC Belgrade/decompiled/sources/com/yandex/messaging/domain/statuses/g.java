package com.yandex.messaging.domain.statuses;

import defpackage.gu21;
import defpackage.it21;
import defpackage.jzz;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.yt21;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;

    public g(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GetStatusByGuidUseCase$run$lambda$1$$inlined$map$1$2$1 getStatusByGuidUseCase$run$lambda$1$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof GetStatusByGuidUseCase$run$lambda$1$$inlined$map$1$2$1) {
            getStatusByGuidUseCase$run$lambda$1$$inlined$map$1$2$1 = (GetStatusByGuidUseCase$run$lambda$1$$inlined$map$1$2$1) continuation;
            int i2 = getStatusByGuidUseCase$run$lambda$1$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getStatusByGuidUseCase$run$lambda$1$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = getStatusByGuidUseCase$run$lambda$1$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getStatusByGuidUseCase$run$lambda$1$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    it21 it21Var = (it21) obj;
                    if (it21Var == null) {
                        it21Var = yt21.k;
                    }
                    gu21 g = jzz.g(it21Var.c, it21Var.e, it21Var.b, it21Var.f, it21Var.d);
                    getStatusByGuidUseCase$run$lambda$1$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(g, getStatusByGuidUseCase$run$lambda$1$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        getStatusByGuidUseCase$run$lambda$1$$inlined$map$1$2$1 = new GetStatusByGuidUseCase$run$lambda$1$$inlined$map$1$2$1(this, continuation);
        Object obj22 = getStatusByGuidUseCase$run$lambda$1$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getStatusByGuidUseCase$run$lambda$1$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
