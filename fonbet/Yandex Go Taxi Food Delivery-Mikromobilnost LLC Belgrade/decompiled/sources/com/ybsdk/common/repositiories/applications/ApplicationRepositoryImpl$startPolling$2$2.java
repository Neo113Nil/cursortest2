package com.ybsdk.common.repositiories.applications;

import com.ybsdk.utils.poller.e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s2e0;
import defpackage.tje;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls2e0;", "", "pollingState", "Lzy11;", "<anonymous>", "(Ls2e0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.common.repositiories.applications.ApplicationRepositoryImpl$startPolling$2$2", f = "ApplicationRepositoryImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ApplicationRepositoryImpl$startPolling$2$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $applicationId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplicationRepositoryImpl$startPolling$2$2(b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$applicationId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ApplicationRepositoryImpl$startPolling$2$2 applicationRepositoryImpl$startPolling$2$2 = new ApplicationRepositoryImpl$startPolling$2$2(this.this$0, this.$applicationId, continuation);
        applicationRepositoryImpl$startPolling$2$2.L$0 = obj;
        return applicationRepositoryImpl$startPolling$2$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ApplicationRepositoryImpl$startPolling$2$2 applicationRepositoryImpl$startPolling$2$2 = (ApplicationRepositoryImpl$startPolling$2$2) create((s2e0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        applicationRepositoryImpl$startPolling$2$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (e.a((s2e0) this.L$0)) {
            b bVar = this.this$0;
            tje.N(bVar.b, null, null, new ApplicationRepositoryImpl$removeApplication$1(bVar, this.$applicationId, null), 3);
        }
        return zy11.a;
    }
}
