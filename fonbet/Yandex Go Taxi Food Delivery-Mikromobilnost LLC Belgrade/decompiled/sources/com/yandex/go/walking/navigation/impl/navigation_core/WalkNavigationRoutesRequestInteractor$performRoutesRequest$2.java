package com.yandex.go.walking.navigation.impl.navigation_core;

import com.yandex.go.walking.navigation.impl.navigation_core.repository.RoutesRequestStatus;
import defpackage.g050;
import defpackage.mvg;
import defpackage.ngl0;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.walking.navigation.impl.navigation_core.WalkNavigationRoutesRequestInteractor$performRoutesRequest$2", f = "WalkNavigationRoutesRequestInteractor.kt", l = {147, HProv.PP_SET_PIN}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class WalkNavigationRoutesRequestInteractor$performRoutesRequest$2 extends SuspendLambda implements wls {
    final /* synthetic */ tls $actualRequest;
    final /* synthetic */ tls $onRoutingErrorMessage;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkNavigationRoutesRequestInteractor$performRoutesRequest$2(g gVar, tls tlsVar, tls tlsVar2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$onRoutingErrorMessage = tlsVar;
        this.$actualRequest = tlsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WalkNavigationRoutesRequestInteractor$performRoutesRequest$2 walkNavigationRoutesRequestInteractor$performRoutesRequest$2 = new WalkNavigationRoutesRequestInteractor$performRoutesRequest$2(this.this$0, this.$onRoutingErrorMessage, this.$actualRequest, continuation);
        walkNavigationRoutesRequestInteractor$performRoutesRequest$2.L$0 = obj;
        return walkNavigationRoutesRequestInteractor$performRoutesRequest$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WalkNavigationRoutesRequestInteractor$performRoutesRequest$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        if (r10 == r1) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object failure;
        g gVar;
        g050 g050Var;
        tls tlsVar;
        tls tlsVar2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (WalkNavigationRoutesRequestInteractor$CancellationByNewRequest e) {
            failure = new Result.Failure(e);
        }
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                gVar = this.this$0;
                g050Var = gVar.e;
                tls tlsVar3 = this.$onRoutingErrorMessage;
                tlsVar = this.$actualRequest;
                this.L$0 = tseVar;
                this.L$1 = g050Var;
                this.L$2 = gVar;
                this.L$3 = tlsVar3;
                this.L$4 = tlsVar;
                this.label = 1;
                if (g050Var.a(this) != coroutineSingletons) {
                    tlsVar2 = tlsVar3;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                failure = ((Result) obj).getValue();
                return new Result(failure);
            }
            tlsVar = (tls) this.L$4;
            tlsVar2 = (tls) this.L$3;
            gVar = (g) this.L$2;
            g050Var = (g050) this.L$1;
            kotlin.b.b(obj);
            qoh qohVar = gVar.f;
            if (qohVar != null) {
                qohVar.u(new CancellationException() { // from class: com.yandex.go.walking.navigation.impl.navigation_core.WalkNavigationRoutesRequestInteractor$CancellationByNewRequest
                });
            }
            ngl0 ngl0Var = gVar.c;
            ngl0Var.a.l(RoutesRequestStatus.LOADING);
            qoh h = tje.h(tseVar, null, null, new WalkNavigationRoutesRequestInteractor$performRoutesRequest$2$deferred$1$newRequestDeferred$1(gVar, tlsVar2, tlsVar, null), 3);
            gVar.f = h;
            g050Var.d(null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 2;
            obj = h.s(this);
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
    }
}
