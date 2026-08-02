package com.yandex.go.pin.repository;

import defpackage.i1c0;
import defpackage.ny61;
import defpackage.u0c0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class i implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ o b;

    public i(vpr vprVar, o oVar) {
        this.a = vprVar;
        this.b = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MainPinStyleRepositoryImpl$sourceV2StyleFlow$lambda$0$$inlined$map$1$2$1 mainPinStyleRepositoryImpl$sourceV2StyleFlow$lambda$0$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof MainPinStyleRepositoryImpl$sourceV2StyleFlow$lambda$0$$inlined$map$1$2$1) {
            mainPinStyleRepositoryImpl$sourceV2StyleFlow$lambda$0$$inlined$map$1$2$1 = (MainPinStyleRepositoryImpl$sourceV2StyleFlow$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = mainPinStyleRepositoryImpl$sourceV2StyleFlow$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainPinStyleRepositoryImpl$sourceV2StyleFlow$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mainPinStyleRepositoryImpl$sourceV2StyleFlow$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainPinStyleRepositoryImpl$sourceV2StyleFlow$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    o oVar = this.b;
                    i1c0 f = oVar.d.f(((u0c0) obj).a);
                    if (f == null) {
                        f = oVar.l;
                    }
                    mainPinStyleRepositoryImpl$sourceV2StyleFlow$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    mainPinStyleRepositoryImpl$sourceV2StyleFlow$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    mainPinStyleRepositoryImpl$sourceV2StyleFlow$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    mainPinStyleRepositoryImpl$sourceV2StyleFlow$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    mainPinStyleRepositoryImpl$sourceV2StyleFlow$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(f, mainPinStyleRepositoryImpl$sourceV2StyleFlow$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
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
        mainPinStyleRepositoryImpl$sourceV2StyleFlow$lambda$0$$inlined$map$1$2$1 = new MainPinStyleRepositoryImpl$sourceV2StyleFlow$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mainPinStyleRepositoryImpl$sourceV2StyleFlow$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainPinStyleRepositoryImpl$sourceV2StyleFlow$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
