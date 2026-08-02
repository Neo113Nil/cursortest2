package com.yandex.plus.pay.internal.feature.user.listener;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.w511;
import defpackage.wcd0;
import defpackage.wls;
import defpackage.xcd0;
import defpackage.ycd0;
import defpackage.zcd0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzcd0;", "it", "", "<anonymous>", "(Lzcd0;)Z"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.internal.feature.user.listener.RestoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$2$1", f = "RestoreInAppPurchasesAccountListener.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RestoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$2$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    public RestoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$2$1() {
        super(2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RestoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$2$1 restoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$2$1 = new RestoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$2$1(2, continuation);
        restoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$2$1.L$0 = obj;
        return restoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RestoreInAppPurchasesAccountListener$tryToRestoreInAppPurchases$2$1) create((zcd0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        zcd0 zcd0Var = (zcd0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (zcd0Var instanceof ycd0) {
            z = false;
        } else {
            if (!(zcd0Var instanceof xcd0) && !(zcd0Var instanceof wcd0)) {
                w511.b();
                return null;
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
