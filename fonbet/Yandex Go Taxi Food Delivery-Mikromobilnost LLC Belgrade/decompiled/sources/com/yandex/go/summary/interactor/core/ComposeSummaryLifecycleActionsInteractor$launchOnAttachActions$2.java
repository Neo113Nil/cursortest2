package com.yandex.go.summary.interactor.core;

import com.yandex.go.tariffcard.interactor.UpdateRequirementListInfoInteractor$collectUpdateRequirementListInfo$$inlined$safeCollect$1;
import defpackage.a201;
import defpackage.bvf0;
import defpackage.ihd;
import defpackage.jdv0;
import defpackage.jfv0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sf11;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wiq0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.core.ComposeSummaryLifecycleActionsInteractor$launchOnAttachActions$2", f = "ComposeSummaryLifecycleActionsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ComposeSummaryLifecycleActionsInteractor$launchOnAttachActions$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.summary.interactor.core.ComposeSummaryLifecycleActionsInteractor$launchOnAttachActions$2$1", f = "ComposeSummaryLifecycleActionsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.ComposeSummaryLifecycleActionsInteractor$launchOnAttachActions$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
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
            this.this$0.h.a("ComposeSummary.Opened");
            return zy11.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.summary.interactor.core.ComposeSummaryLifecycleActionsInteractor$launchOnAttachActions$2$2", f = "ComposeSummaryLifecycleActionsInteractor.kt", l = {41}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.ComposeSummaryLifecycleActionsInteractor$launchOnAttachActions$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(a aVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, continuation);
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
                jdv0 jdv0Var = this.this$0.b;
                this.label = 1;
                jdv0Var.getClass();
                if (bvf0.n(new SummaryBottomSheetStateInteractor$launchSummaryBottomSheetStateActions$2(jdv0Var, null), this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.interactor.core.ComposeSummaryLifecycleActionsInteractor$launchOnAttachActions$2$3", f = "ComposeSummaryLifecycleActionsInteractor.kt", l = {45}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.ComposeSummaryLifecycleActionsInteractor$launchOnAttachActions$2$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(a aVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                a201 a201Var = this.this$0.f;
                this.label = 1;
                if (new kotlinx.coroutines.flow.o(((com.yandex.go.taxi.tariffs.internal.repository.k) ((wiq0) a201Var.b)).j.b(), new UpdateRequirementListInfoInteractor$collectUpdateRequirementListInfo$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null)).collect(new sf11(7, a201Var), this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.interactor.core.ComposeSummaryLifecycleActionsInteractor$launchOnAttachActions$2$4", f = "ComposeSummaryLifecycleActionsInteractor.kt", l = {82}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.ComposeSummaryLifecycleActionsInteractor$launchOnAttachActions$2$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements wls {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(a aVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                a aVar = this.this$0;
                kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(aVar.d.b, new ComposeSummaryLifecycleActionsInteractor$launchOnAttachActions$2$4$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
                ihd ihdVar = new ihd(aVar, 0);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (oVar.collect(ihdVar, this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.interactor.core.ComposeSummaryLifecycleActionsInteractor$launchOnAttachActions$2$5", f = "ComposeSummaryLifecycleActionsInteractor.kt", l = {82}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.ComposeSummaryLifecycleActionsInteractor$launchOnAttachActions$2$5, reason: invalid class name */
    final class AnonymousClass5 extends SuspendLambda implements wls {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(a aVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass5(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass5) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            int i2 = 1;
            if (i == 0) {
                kotlin.b.b(obj);
                jfv0 jfv0Var = this.this$0.c;
                m0 m0Var = new m0(jfv0Var.c.b, jfv0Var.b.a(), new SummaryExternalFocusMarginsInteractor$stateFlow$1(jfv0Var, null));
                a aVar = this.this$0;
                kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(m0Var, new ComposeSummaryLifecycleActionsInteractor$launchOnAttachActions$2$5$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
                ihd ihdVar = new ihd(aVar, i2);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (oVar.collect(ihdVar, this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.interactor.core.ComposeSummaryLifecycleActionsInteractor$launchOnAttachActions$2$6", f = "ComposeSummaryLifecycleActionsInteractor.kt", l = {82}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.ComposeSummaryLifecycleActionsInteractor$launchOnAttachActions$2$6, reason: invalid class name */
    final class AnonymousClass6 extends SuspendLambda implements wls {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(a aVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass6(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass6) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                tpr x = this.this$0.i.x();
                a aVar = this.this$0;
                kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(x, new ComposeSummaryLifecycleActionsInteractor$launchOnAttachActions$2$6$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
                ihd ihdVar = new ihd(aVar, 2);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (oVar.collect(ihdVar, this) == coroutineSingletons) {
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
    public ComposeSummaryLifecycleActionsInteractor$launchOnAttachActions$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ComposeSummaryLifecycleActionsInteractor$launchOnAttachActions$2 composeSummaryLifecycleActionsInteractor$launchOnAttachActions$2 = new ComposeSummaryLifecycleActionsInteractor$launchOnAttachActions$2(this.this$0, continuation);
        composeSummaryLifecycleActionsInteractor$launchOnAttachActions$2.L$0 = obj;
        return composeSummaryLifecycleActionsInteractor$launchOnAttachActions$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ComposeSummaryLifecycleActionsInteractor$launchOnAttachActions$2 composeSummaryLifecycleActionsInteractor$launchOnAttachActions$2 = (ComposeSummaryLifecycleActionsInteractor$launchOnAttachActions$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        composeSummaryLifecycleActionsInteractor$launchOnAttachActions$2.invokeSuspend(zy11Var);
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
        this.this$0.g.getClass();
        sjh sjhVar = uyj.a;
        com.yandex.go.coroutines.b.g(tseVar, sjhVar, null, new AnonymousClass1(this.this$0, null), 2);
        com.yandex.go.coroutines.b.g(tseVar, null, null, new AnonymousClass2(this.this$0, null), 3);
        this.this$0.g.getClass();
        com.yandex.go.coroutines.b.g(tseVar, sjhVar, null, new AnonymousClass3(this.this$0, null), 2);
        com.yandex.go.coroutines.b.g(tseVar, null, null, new AnonymousClass4(this.this$0, null), 3);
        this.this$0.g.getClass();
        com.yandex.go.coroutines.b.g(tseVar, sjhVar, null, new AnonymousClass5(this.this$0, null), 2);
        this.this$0.g.getClass();
        com.yandex.go.coroutines.b.g(tseVar, sjhVar, null, new AnonymousClass6(this.this$0, null), 2);
        this.this$0.a.a();
        return zy11.a;
    }
}
