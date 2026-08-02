package com.yandex.go.places.impl.navigation.common.base;

import defpackage.a5g;
import defpackage.am80;
import defpackage.coa0;
import defpackage.evu0;
import defpackage.k75;
import defpackage.l75;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tse;
import defpackage.u3m;
import defpackage.w7c0;
import defpackage.w9c0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.navigation.common.base.BasePlacesRouter$InnerNavigator$openPaymentsResult$1", f = "BasePlacesRouter.kt", l = {575}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BasePlacesRouter$InnerNavigator$openPaymentsResult$1 extends SuspendLambda implements wls {
    final /* synthetic */ sls $doOnGoBack;
    final /* synthetic */ am80 $payload;
    int label;
    final /* synthetic */ d this$0;
    final /* synthetic */ b this$1;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"La5g;", "it", "Lcoa0;", "<anonymous>", "(La5g;)Lcoa0;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.places.impl.navigation.common.base.BasePlacesRouter$InnerNavigator$openPaymentsResult$1$2", f = "BasePlacesRouter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.places.impl.navigation.common.base.BasePlacesRouter$InnerNavigator$openPaymentsResult$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ w7c0 $config;
        final /* synthetic */ am80 $payload;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(w7c0 w7c0Var, am80 am80Var, Continuation continuation) {
            super(2, continuation);
            this.$config = w7c0Var;
            this.$payload = am80Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.$config, this.$payload, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((a5g) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return new coa0(this.$config, this.$payload.c);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePlacesRouter$InnerNavigator$openPaymentsResult$1(d dVar, b bVar, am80 am80Var, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.this$1 = bVar;
        this.$payload = am80Var;
        this.$doOnGoBack = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BasePlacesRouter$InnerNavigator$openPaymentsResult$1(this.this$0, this.this$1, this.$payload, this.$doOnGoBack, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BasePlacesRouter$InnerNavigator$openPaymentsResult$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.places.experiments.flex.b bVar = this.this$0.D;
            this.label = 1;
            obj = bVar.b(w9c0.b, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        u3m u3mVar = (u3m) obj;
        if (u3mVar != null && u3mVar.c) {
            String str = u3mVar.b;
            String str2 = u3mVar.d;
            if (evu0.J(str2)) {
                str2 = null;
            }
            this.this$1.c(new l75(2), new AnonymousClass2(new w7c0(str, str2), this.$payload, null), new k75(2, this.$doOnGoBack), new l75(0));
        }
        return zy11.a;
    }
}
