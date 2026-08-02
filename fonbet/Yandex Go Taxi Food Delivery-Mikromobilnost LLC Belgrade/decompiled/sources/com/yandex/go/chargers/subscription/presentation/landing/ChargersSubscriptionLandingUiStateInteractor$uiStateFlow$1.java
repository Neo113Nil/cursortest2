package com.yandex.go.chargers.subscription.presentation.landing;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.r9;
import defpackage.vpr;
import defpackage.wls;
import defpackage.wta;
import defpackage.zls;
import defpackage.zta;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lyta;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.subscription.presentation.landing.ChargersSubscriptionLandingUiStateInteractor$uiStateFlow$1", f = "ChargersSubscriptionLandingUiStateInteractor.kt", l = {23, 31}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersSubscriptionLandingUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ zta this$0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lvta;", "", "throwable", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.chargers.subscription.presentation.landing.ChargersSubscriptionLandingUiStateInteractor$uiStateFlow$1$2", f = "ChargersSubscriptionLandingUiStateInteractor.kt", l = {29}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.chargers.subscription.presentation.landing.ChargersSubscriptionLandingUiStateInteractor$uiStateFlow$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements zls {
        final /* synthetic */ vpr $$this$flow;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(vpr vprVar, Continuation continuation) {
            super(3, continuation);
            this.$$this$flow = vprVar;
        }

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$$this$flow, (Continuation) obj3);
            anonymousClass2.L$0 = (Throwable) obj2;
            return anonymousClass2.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th = (Throwable) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                vpr vprVar = this.$$this$flow;
                wta wtaVar = new wta(th);
                this.L$0 = null;
                this.label = 1;
                if (vprVar.emit(wtaVar, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersSubscriptionLandingUiStateInteractor$uiStateFlow$1(zta ztaVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ztaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersSubscriptionLandingUiStateInteractor$uiStateFlow$1 chargersSubscriptionLandingUiStateInteractor$uiStateFlow$1 = new ChargersSubscriptionLandingUiStateInteractor$uiStateFlow$1(this.this$0, continuation);
        chargersSubscriptionLandingUiStateInteractor$uiStateFlow$1.L$0 = obj;
        return chargersSubscriptionLandingUiStateInteractor$uiStateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersSubscriptionLandingUiStateInteractor$uiStateFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        if (r5.collect(r7, r6) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r0.emit(defpackage.xta.a, r6) == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.L$0 = vprVar;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        o oVar = new o(new f(this.this$0.a.a.b()), new AnonymousClass2(vprVar, null));
        r9 r9Var = new r9(vprVar, 2);
        this.L$0 = null;
        this.label = 2;
    }
}
