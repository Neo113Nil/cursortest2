package com.yandex.go.scooters.passes.purchase.packages;

import defpackage.ny61;
import defpackage.oip0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ oip0 b;

    public d(vpr vprVar, oip0 oip0Var) {
        this.a = vprVar;
        this.b = oip0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersPackagesPurchaseScreenKt$Details$3$2$1$invokeSuspend$$inlined$filter$1$2$1 scootersPackagesPurchaseScreenKt$Details$3$2$1$invokeSuspend$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof ScootersPackagesPurchaseScreenKt$Details$3$2$1$invokeSuspend$$inlined$filter$1$2$1) {
            scootersPackagesPurchaseScreenKt$Details$3$2$1$invokeSuspend$$inlined$filter$1$2$1 = (ScootersPackagesPurchaseScreenKt$Details$3$2$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
            int i2 = scootersPackagesPurchaseScreenKt$Details$3$2$1$invokeSuspend$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPackagesPurchaseScreenKt$Details$3$2$1$invokeSuspend$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersPackagesPurchaseScreenKt$Details$3$2$1$invokeSuspend$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPackagesPurchaseScreenKt$Details$3$2$1$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (((Number) obj).intValue() > this.b.a.getIntValue()) {
                        scootersPackagesPurchaseScreenKt$Details$3$2$1$invokeSuspend$$inlined$filter$1$2$1.L$0 = null;
                        scootersPackagesPurchaseScreenKt$Details$3$2$1$invokeSuspend$$inlined$filter$1$2$1.L$1 = null;
                        scootersPackagesPurchaseScreenKt$Details$3$2$1$invokeSuspend$$inlined$filter$1$2$1.L$2 = null;
                        scootersPackagesPurchaseScreenKt$Details$3$2$1$invokeSuspend$$inlined$filter$1$2$1.L$3 = null;
                        scootersPackagesPurchaseScreenKt$Details$3$2$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, scootersPackagesPurchaseScreenKt$Details$3$2$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        scootersPackagesPurchaseScreenKt$Details$3$2$1$invokeSuspend$$inlined$filter$1$2$1 = new ScootersPackagesPurchaseScreenKt$Details$3$2$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = scootersPackagesPurchaseScreenKt$Details$3$2$1$invokeSuspend$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPackagesPurchaseScreenKt$Details$3$2$1$invokeSuspend$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
