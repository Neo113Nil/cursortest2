package com.yandex.go.places.impl.navigation.common.base;

import defpackage.a5g;
import defpackage.evu0;
import defpackage.ima0;
import defpackage.k75;
import defpackage.l75;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tse;
import defpackage.u3m;
import defpackage.v7c0;
import defpackage.v9c0;
import defpackage.wls;
import defpackage.zl80;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.navigation.common.base.BasePlacesRouter$InnerNavigator$openPaymentsCheckout$1", f = "BasePlacesRouter.kt", l = {554}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BasePlacesRouter$InnerNavigator$openPaymentsCheckout$1 extends SuspendLambda implements wls {
    final /* synthetic */ sls $doOnGoBack;
    final /* synthetic */ zl80 $payload;
    int label;
    final /* synthetic */ d this$0;
    final /* synthetic */ b this$1;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"La5g;", "it", "Lima0;", "<anonymous>", "(La5g;)Lima0;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.places.impl.navigation.common.base.BasePlacesRouter$InnerNavigator$openPaymentsCheckout$1$2", f = "BasePlacesRouter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.places.impl.navigation.common.base.BasePlacesRouter$InnerNavigator$openPaymentsCheckout$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ v7c0 $config;
        final /* synthetic */ zl80 $payload;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(v7c0 v7c0Var, zl80 zl80Var, Continuation continuation) {
            super(2, continuation);
            this.$config = v7c0Var;
            this.$payload = zl80Var;
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
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            v7c0 v7c0Var = this.$config;
            zl80 zl80Var = this.$payload;
            return new ima0(v7c0Var, zl80Var.c, zl80Var.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePlacesRouter$InnerNavigator$openPaymentsCheckout$1(d dVar, b bVar, zl80 zl80Var, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.this$1 = bVar;
        this.$payload = zl80Var;
        this.$doOnGoBack = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BasePlacesRouter$InnerNavigator$openPaymentsCheckout$1(this.this$0, this.this$1, this.$payload, this.$doOnGoBack, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BasePlacesRouter$InnerNavigator$openPaymentsCheckout$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.places.experiments.flex.b bVar = this.this$0.D;
            this.label = 1;
            obj = bVar.b(v9c0.b, this);
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
            this.this$1.c(new l75(1), new AnonymousClass2(new v7c0(str, str2), this.$payload, null), new k75(1, this.$doOnGoBack), new l75(0));
        }
        return zy11.a;
    }
}
