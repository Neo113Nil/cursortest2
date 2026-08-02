package com.yandex.go.payments.maas.domain;

import defpackage.evu0;
import defpackage.i000;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MaasPaymentOptionRepository$maasFlow$lambda$0$$inlined$map$1$2$1 maasPaymentOptionRepository$maasFlow$lambda$0$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof MaasPaymentOptionRepository$maasFlow$lambda$0$$inlined$map$1$2$1) {
            maasPaymentOptionRepository$maasFlow$lambda$0$$inlined$map$1$2$1 = (MaasPaymentOptionRepository$maasFlow$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = maasPaymentOptionRepository$maasFlow$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                maasPaymentOptionRepository$maasFlow$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = maasPaymentOptionRepository$maasFlow$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = maasPaymentOptionRepository$maasFlow$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    i000 i000Var = (i000) obj;
                    if (evu0.J(i000Var.b)) {
                        i000Var = null;
                    }
                    maasPaymentOptionRepository$maasFlow$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    maasPaymentOptionRepository$maasFlow$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    maasPaymentOptionRepository$maasFlow$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    maasPaymentOptionRepository$maasFlow$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    maasPaymentOptionRepository$maasFlow$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(i000Var, maasPaymentOptionRepository$maasFlow$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
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
        maasPaymentOptionRepository$maasFlow$lambda$0$$inlined$map$1$2$1 = new MaasPaymentOptionRepository$maasFlow$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = maasPaymentOptionRepository$maasFlow$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = maasPaymentOptionRepository$maasFlow$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
