package com.ybsdk.feature.autotopup.internal.domain;

import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.t24;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.autotopup.internal.domain.AutoTopupValidationInteractor$subscribeOnValidationResults$1", f = "AutoTopupValidationInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupValidationInteractor$subscribeOnValidationResults$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $onValidationResult;
    int label;
    final /* synthetic */ f this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnoh;", "Lkotlin/Result;", "Lh031;", "it", "<anonymous>", "(Lnoh;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.feature.autotopup.internal.domain.AutoTopupValidationInteractor$subscribeOnValidationResults$1$1", f = "AutoTopupValidationInteractor.kt", l = {71}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.autotopup.internal.domain.AutoTopupValidationInteractor$subscribeOnValidationResults$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((noh) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    kotlin.b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            noh nohVar = (noh) this.L$0;
            this.label = 1;
            Object k = nohVar.k(this);
            return k == coroutineSingletons ? coroutineSingletons : k;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupValidationInteractor$subscribeOnValidationResults$1(f fVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$onValidationResult = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AutoTopupValidationInteractor$subscribeOnValidationResults$1(this.this$0, this.$onValidationResult, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AutoTopupValidationInteractor$subscribeOnValidationResults$1 autoTopupValidationInteractor$subscribeOnValidationResults$1 = (AutoTopupValidationInteractor$subscribeOnValidationResults$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        autoTopupValidationInteractor$subscribeOnValidationResults$1.invokeSuspend(zy11Var);
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
        com.ybsdk.core.utils.ext.c.a(kotlinx.coroutines.flow.e.I(this.this$0.d, new AnonymousClass1(2, null)), this.this$0.a, new t24(0, this.$onValidationResult));
        return zy11.a;
    }
}
