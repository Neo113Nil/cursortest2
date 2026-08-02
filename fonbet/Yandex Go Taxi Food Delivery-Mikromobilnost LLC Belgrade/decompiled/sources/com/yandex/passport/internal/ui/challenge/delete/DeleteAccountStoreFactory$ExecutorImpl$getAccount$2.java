package com.yandex.passport.internal.ui.challenge.delete;

import com.yandex.passport.common.core.Uid;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/passport/internal/ModernAccount;", "<anonymous>", "(Ltse;)Lcom/yandex/passport/internal/ModernAccount;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.challenge.delete.DeleteAccountStoreFactory$ExecutorImpl$getAccount$2", f = "DeleteAccountStoreFactory.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DeleteAccountStoreFactory$ExecutorImpl$getAccount$2 extends SuspendLambda implements wls {
    final /* synthetic */ Uid $uid;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteAccountStoreFactory$ExecutorImpl$getAccount$2(j jVar, Uid uid, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$uid = uid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeleteAccountStoreFactory$ExecutorImpl$getAccount$2(this.this$0, this.$uid, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeleteAccountStoreFactory$ExecutorImpl$getAccount$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return this.this$0.e.a().e(this.$uid);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
