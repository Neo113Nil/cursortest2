package com.yandex.messaging.domain.miniapp;

import defpackage.e920;
import defpackage.evu0;
import defpackage.ny61;
import defpackage.r5b;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GetMiniappMetadataUseCase$run$1$invokeSuspend$$inlined$map$1$2$1 getMiniappMetadataUseCase$run$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        String str;
        if (continuation instanceof GetMiniappMetadataUseCase$run$1$invokeSuspend$$inlined$map$1$2$1) {
            getMiniappMetadataUseCase$run$1$invokeSuspend$$inlined$map$1$2$1 = (GetMiniappMetadataUseCase$run$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = getMiniappMetadataUseCase$run$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getMiniappMetadataUseCase$run$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = getMiniappMetadataUseCase$run$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getMiniappMetadataUseCase$run$1$invokeSuspend$$inlined$map$1$2$1.label;
                e920 e920Var = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    r5b r5bVar = (r5b) obj;
                    if (r5bVar != null && (str = r5bVar.b) != null) {
                        if (evu0.J(str)) {
                            str = null;
                        }
                        if (str != null) {
                            e920Var = new e920(str, r5bVar.c);
                        }
                    }
                    getMiniappMetadataUseCase$run$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(e920Var, getMiniappMetadataUseCase$run$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        getMiniappMetadataUseCase$run$1$invokeSuspend$$inlined$map$1$2$1 = new GetMiniappMetadataUseCase$run$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = getMiniappMetadataUseCase$run$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getMiniappMetadataUseCase$run$1$invokeSuspend$$inlined$map$1$2$1.label;
        e920 e920Var2 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
