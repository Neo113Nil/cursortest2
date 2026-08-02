package com.yandex.go.summary.interactor.core;

import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ob5;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lob5;", "<anonymous>", "(Ltse;)Lob5;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.core.ComposeSummaryScrollToRequirementInteractor$awaitShowBaseTariffInfoOrFallback$2", f = "ComposeSummaryScrollToRequirementInteractor.kt", l = {36}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ComposeSummaryScrollToRequirementInteractor$awaitShowBaseTariffInfoOrFallback$2 extends SuspendLambda implements wls {
    final /* synthetic */ ob5 $awaitBaseTariffInfoUiState;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lob5;", "showedBaseTariffInfoUiState", "", "<anonymous>", "(Lob5;)Z"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.summary.interactor.core.ComposeSummaryScrollToRequirementInteractor$awaitShowBaseTariffInfoOrFallback$2$1", f = "ComposeSummaryScrollToRequirementInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.ComposeSummaryScrollToRequirementInteractor$awaitShowBaseTariffInfoOrFallback$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ ob5 $awaitBaseTariffInfoUiState;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ob5 ob5Var, Continuation continuation) {
            super(2, continuation);
            this.$awaitBaseTariffInfoUiState = ob5Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$awaitBaseTariffInfoUiState, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((ob5) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ob5 ob5Var = (ob5) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return Boolean.valueOf(jl40.l(ob5Var, this.$awaitBaseTariffInfoUiState));
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeSummaryScrollToRequirementInteractor$awaitShowBaseTariffInfoOrFallback$2(b bVar, ob5 ob5Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$awaitBaseTariffInfoUiState = ob5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ComposeSummaryScrollToRequirementInteractor$awaitShowBaseTariffInfoOrFallback$2(this.this$0, this.$awaitBaseTariffInfoUiState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ComposeSummaryScrollToRequirementInteractor$awaitShowBaseTariffInfoOrFallback$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        r0 r0Var = this.this$0.c.b;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$awaitBaseTariffInfoUiState, null);
        this.label = 1;
        Object x = kotlinx.coroutines.flow.e.x(r0Var, anonymousClass1, this);
        return x == coroutineSingletons ? coroutineSingletons : x;
    }
}
