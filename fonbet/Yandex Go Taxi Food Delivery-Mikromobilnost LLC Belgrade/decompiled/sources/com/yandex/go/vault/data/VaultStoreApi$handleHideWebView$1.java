package com.yandex.go.vault.data;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.tse;
import defpackage.u331;
import defpackage.wls;
import defpackage.wpy0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.vault.data.VaultStoreApi$handleHideWebView$1", f = "VaultStoreApi.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class VaultStoreApi$handleHideWebView$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $promiseId;
    int label;
    final /* synthetic */ VaultStoreApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VaultStoreApi$handleHideWebView$1(VaultStoreApi vaultStoreApi, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = vaultStoreApi;
        this.$promiseId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VaultStoreApi$handleHideWebView$1(this.this$0, this.$promiseId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        VaultStoreApi$handleHideWebView$1 vaultStoreApi$handleHideWebView$1 = (VaultStoreApi$handleHideWebView$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        vaultStoreApi$handleHideWebView$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        u331 u331Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        u331Var = this.this$0.callbacks;
        ((com.yandex.go.vault.router.d) ((wpy0) u331Var).b).r(new qu(9));
        this.this$0.callbackResult(this.$promiseId);
        return zy11.a;
    }
}
