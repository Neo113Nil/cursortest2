package com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing;

import com.yandex.go.mainscreen.superapp.impl.foundation.data.repository.i;
import defpackage.eci0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o4w0;
import defpackage.qit0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.SuperAppMainScreenViewRouter$InnerNavigator$showSearchbar$1", f = "SuperAppMainScreenViewRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SuperAppMainScreenViewRouter$InnerNavigator$showSearchbar$1 extends SuspendLambda implements wls {
    final /* synthetic */ i $interopRepository;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ o4w0 this$0;
    final /* synthetic */ e this$1;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.SuperAppMainScreenViewRouter$InnerNavigator$showSearchbar$1$1", f = "SuperAppMainScreenViewRouter.kt", l = {373}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.SuperAppMainScreenViewRouter$InnerNavigator$showSearchbar$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ i $interopRepository;
        int label;
        final /* synthetic */ o4w0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(i iVar, o4w0 o4w0Var, Continuation continuation) {
            super(2, continuation);
            this.$interopRepository = iVar;
            this.this$0 = o4w0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$interopRepository, this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                eci0 c = kotlinx.coroutines.flow.e.c(this.$interopRepository.d);
                d dVar = new d(this.this$0);
                this.label = 1;
                if (c.a.collect(dVar, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.SuperAppMainScreenViewRouter$InnerNavigator$showSearchbar$1$2", f = "SuperAppMainScreenViewRouter.kt", l = {383}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.SuperAppMainScreenViewRouter$InnerNavigator$showSearchbar$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ i $interopRepository;
        int label;
        final /* synthetic */ e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(i iVar, e eVar, Continuation continuation) {
            super(2, continuation);
            this.$interopRepository = iVar;
            this.this$0 = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.$interopRepository, this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                eci0 c = kotlinx.coroutines.flow.e.c(this.$interopRepository.e);
                qit0 qit0Var = new qit0(16, this.this$0);
                this.label = 1;
                if (c.a.collect(qit0Var, this) == coroutineSingletons) {
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
    public SuperAppMainScreenViewRouter$InnerNavigator$showSearchbar$1(i iVar, o4w0 o4w0Var, e eVar, Continuation continuation) {
        super(2, continuation);
        this.$interopRepository = iVar;
        this.this$0 = o4w0Var;
        this.this$1 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SuperAppMainScreenViewRouter$InnerNavigator$showSearchbar$1 superAppMainScreenViewRouter$InnerNavigator$showSearchbar$1 = new SuperAppMainScreenViewRouter$InnerNavigator$showSearchbar$1(this.$interopRepository, this.this$0, this.this$1, continuation);
        superAppMainScreenViewRouter$InnerNavigator$showSearchbar$1.L$0 = obj;
        return superAppMainScreenViewRouter$InnerNavigator$showSearchbar$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SuperAppMainScreenViewRouter$InnerNavigator$showSearchbar$1 superAppMainScreenViewRouter$InnerNavigator$showSearchbar$1 = (SuperAppMainScreenViewRouter$InnerNavigator$showSearchbar$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        superAppMainScreenViewRouter$InnerNavigator$showSearchbar$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tje.N(tseVar, null, null, new AnonymousClass1(this.$interopRepository, this.this$0, null), 3);
        tje.N(tseVar, null, null, new AnonymousClass2(this.$interopRepository, this.this$1, null), 3);
        return zy11.a;
    }
}
