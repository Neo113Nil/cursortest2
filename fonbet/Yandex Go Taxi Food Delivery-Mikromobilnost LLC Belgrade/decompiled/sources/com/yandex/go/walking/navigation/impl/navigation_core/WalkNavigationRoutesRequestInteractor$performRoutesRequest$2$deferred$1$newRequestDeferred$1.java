package com.yandex.go.walking.navigation.impl.navigation_core;

import com.yandex.go.walking.navigation.impl.navigation_core.repository.RoutesRequestStatus;
import com.yandex.mapkit.navigation.transport.Navigation;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s541;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.walking.navigation.impl.navigation_core.WalkNavigationRoutesRequestInteractor$performRoutesRequest$2$deferred$1$newRequestDeferred$1", f = "WalkNavigationRoutesRequestInteractor.kt", l = {83, HProv.PP_RESERVED1}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class WalkNavigationRoutesRequestInteractor$performRoutesRequest$2$deferred$1$newRequestDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $actualRequest;
    final /* synthetic */ tls $onRoutingErrorMessage;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkNavigationRoutesRequestInteractor$performRoutesRequest$2$deferred$1$newRequestDeferred$1(g gVar, tls tlsVar, tls tlsVar2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$onRoutingErrorMessage = tlsVar;
        this.$actualRequest = tlsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalkNavigationRoutesRequestInteractor$performRoutesRequest$2$deferred$1$newRequestDeferred$1(this.this$0, this.$onRoutingErrorMessage, this.$actualRequest, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WalkNavigationRoutesRequestInteractor$performRoutesRequest$2$deferred$1$newRequestDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
    
        if (r10 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
    
        if (r10 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0.a;
            this.label = 1;
            obj = bVar.a(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                Object value = ((Result) obj).getValue();
                this.this$0.c.a.l(!(value instanceof Result.Failure) ? RoutesRequestStatus.SUCCESS : RoutesRequestStatus.FAILURE);
                return new Result(value);
            }
            kotlin.b.b(obj);
        }
        g gVar = this.this$0;
        s541 s541Var = gVar.b;
        tpr d = com.yandex.go.coroutines.b.d(kotlinx.coroutines.flow.e.K(new d(s541Var.c), new f(s541Var.e, this.$onRoutingErrorMessage, gVar)), new WalkNavigationRoutesRequestInteractor$performRoutesRequest$2$deferred$1$newRequestDeferred$1$result$1(this.this$0, this.$actualRequest, (Navigation) obj, null));
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
        obj = kotlinx.coroutines.flow.e.y(d, this);
    }
}
