package com.yandex.fintechsdk.core.architecture.api.mvi;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pju0;
import defpackage.v7w;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "STATE", "SIDE_EFFECT", "Lpju0;", "Lzy11;", "<anonymous>", "(Lpju0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.core.architecture.api.mvi.StoreExtensionsKt$intent$1", f = "StoreExtensions.kt", l = {25}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class StoreExtensionsKt$intent$1 extends SuspendLambda implements wls {
    final /* synthetic */ wls $intent;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreExtensionsKt$intent$1(wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.$intent = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        StoreExtensionsKt$intent$1 storeExtensionsKt$intent$1 = new StoreExtensionsKt$intent$1(this.$intent, continuation);
        storeExtensionsKt$intent$1.L$0 = obj;
        return storeExtensionsKt$intent$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StoreExtensionsKt$intent$1) create((pju0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            pju0 pju0Var = (pju0) this.L$0;
            wls wlsVar = this.$intent;
            v7w v7wVar = new v7w(pju0Var);
            this.label = 1;
            if (wlsVar.invoke(v7wVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
