package com.yandex.go.summary.interactor.core;

import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.summary.experiments.SummaryPerformanceOptimisationsExperiment;
import com.yandex.go.taxi.summary.shared.lifecycle.SummaryElement;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.aw70;
import defpackage.b2k;
import defpackage.bov0;
import defpackage.c521;
import defpackage.e3n;
import defpackage.fnx0;
import defpackage.fwu0;
import defpackage.hnr0;
import defpackage.iox0;
import defpackage.kp50;
import defpackage.mth;
import defpackage.mvg;
import defpackage.nhv0;
import defpackage.ny61;
import defpackage.o430;
import defpackage.ohv0;
import defpackage.oiv0;
import defpackage.omu0;
import defpackage.phv0;
import defpackage.qhv0;
import defpackage.rhv0;
import defpackage.sf11;
import defpackage.shv0;
import defpackage.sjh;
import defpackage.tiv0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.va1;
import defpackage.vij0;
import defpackage.vng;
import defpackage.vpr;
import defpackage.wa1;
import defpackage.wls;
import defpackage.yv70;
import defpackage.zls;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.taxi.preorder.summary.solid.interactors.p0;
import ru.yandex.taxi.preorder.summary.solid.interactors.q0;
import ru.yandex.taxi.preorder.summary.solid.interactors.y;
import ru.yandex.taxi.preorder.summary.solid.interactors.z;
import ru.yandex.taxi.requirements.repository.RequirementsChangedNotifier;
import ru.yandex.taxi.summary.requirements.list.interactors.u0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2", f = "SummaryLifecycleActionsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SummaryLifecycleActionsInteractor$launchOnAttachActions$2 extends SuspendLambda implements wls {
    final /* synthetic */ bov0 $payload;
    final /* synthetic */ oiv0 $summaryNavigator;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ t this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$1", f = "SummaryLifecycleActionsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ bov0 $payload;
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(t tVar, bov0 bov0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
            this.$payload = bov0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$payload, continuation);
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
            t tVar = this.this$0;
            tVar.e0.i = null;
            tVar.f0.a(this.$payload);
            return zy11.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$10", f = "SummaryLifecycleActionsInteractor.kt", l = {475}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$10, reason: invalid class name */
    final class AnonymousClass10 extends SuspendLambda implements wls {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ t this$0;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lru/yandex/taxi/requirements/repository/RequirementsChangedNotifier$ChangeType;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$10$1", f = "SummaryLifecycleActionsInteractor.kt", l = {239}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$10$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements wls {
            private /* synthetic */ Object L$0;
            int label;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                vpr vprVar = (vpr) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.b.b(obj);
                    RequirementsChangedNotifier.ChangeType changeType = RequirementsChangedNotifier.ChangeType.CHANGE;
                    this.L$0 = null;
                    this.label = 1;
                    if (vprVar.emit(changeType, this) == coroutineSingletons) {
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
        public AnonymousClass10(t tVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass10(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass10) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                kotlinx.coroutines.flow.n nVar = new kotlinx.coroutines.flow.n(this.this$0.u.a, new AnonymousClass1(2, null));
                t tVar = this.this$0;
                kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(nVar, new SummaryLifecycleActionsInteractor$launchOnAttachActions$2$10$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
                nhv0 nhv0Var = new nhv0(tVar, 0);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (oVar.collect(nhv0Var, this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$11", f = "SummaryLifecycleActionsInteractor.kt", l = {244}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$11, reason: invalid class name */
    final class AnonymousClass11 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass11(t tVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass11(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass11) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                u0 u0Var = this.this$0.i0;
                this.label = 1;
                if (u0Var.e(this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$12", f = "SummaryLifecycleActionsInteractor.kt", l = {475}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$12, reason: invalid class name */
    final class AnonymousClass12 extends SuspendLambda implements wls {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass12(t tVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass12(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass12) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(this.this$0.v.c(), new SummaryLifecycleActionsInteractor$launchOnAttachActions$2$12$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
                ohv0 ohv0Var = new ohv0();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (oVar.collect(ohv0Var, this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$13", f = "SummaryLifecycleActionsInteractor.kt", l = {475}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$13, reason: invalid class name */
    final class AnonymousClass13 extends SuspendLambda implements wls {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass13(t tVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass13(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass13) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(this.this$0.w.a(), new SummaryLifecycleActionsInteractor$launchOnAttachActions$2$13$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
                phv0 phv0Var = new phv0();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (oVar.collect(phv0Var, this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$14", f = "SummaryLifecycleActionsInteractor.kt", l = {475}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$14, reason: invalid class name */
    final class AnonymousClass14 extends SuspendLambda implements wls {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass14(t tVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass14(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass14) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(this.this$0.x.c(), new SummaryLifecycleActionsInteractor$launchOnAttachActions$2$14$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
                qhv0 qhv0Var = new qhv0();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (oVar.collect(qhv0Var, this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$15", f = "SummaryLifecycleActionsInteractor.kt", l = {262}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$15, reason: invalid class name */
    final class AnonymousClass15 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass15(t tVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass15(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass15) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                p0 p0Var = this.this$0.y;
                this.label = 1;
                if (p0Var.a(this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$16", f = "SummaryLifecycleActionsInteractor.kt", l = {263}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$16, reason: invalid class name */
    final class AnonymousClass16 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass16(t tVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass16(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass16) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                ru.yandex.taxi.preorder.summary.solid.interactors.g gVar = this.this$0.A;
                this.label = 1;
                if (gVar.b(this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$17", f = "SummaryLifecycleActionsInteractor.kt", l = {264}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$17, reason: invalid class name */
    final class AnonymousClass17 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass17(t tVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass17(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass17) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                ru.yandex.taxi.preorder.summary.solid.interactors.g gVar = this.this$0.A;
                this.label = 1;
                if (gVar.a(this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$18", f = "SummaryLifecycleActionsInteractor.kt", l = {265}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$18, reason: invalid class name */
    final class AnonymousClass18 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass18(t tVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass18(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass18) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                ru.yandex.taxi.preorder.summary.solid.interactors.v vVar = this.this$0.B;
                this.label = 1;
                if (vVar.a(this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$19", f = "SummaryLifecycleActionsInteractor.kt", l = {266}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$19, reason: invalid class name */
    final class AnonymousClass19 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass19(t tVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass19(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass19) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                ru.yandex.taxi.preorder.summary.solid.interactors.s sVar = this.this$0.W;
                this.label = 1;
                if (sVar.a(this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$2", f = "SummaryLifecycleActionsInteractor.kt", l = {182}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(t tVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
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
                tiv0 tiv0Var = this.this$0.U;
                tiv0Var.getClass();
                o430 o430Var = e3n.b;
                long e = e3n.e(kp50.V(((SummaryPerformanceOptimisationsExperiment) tiv0Var.a.b.b()).c, DurationUnit.SECONDS));
                this.label = 1;
                if (kotlinx.coroutines.a.i(e, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            r0 r0Var = this.this$0.Y.a;
            Set N0 = kotlin.collections.a.N0(SummaryElement.a());
            r0Var.getClass();
            r0Var.m(null, N0);
            return zy11.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$20", f = "SummaryLifecycleActionsInteractor.kt", l = {267}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$20, reason: invalid class name */
    final class AnonymousClass20 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass20(t tVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass20(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass20) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                iox0 iox0Var = this.this$0.F;
                this.label = 1;
                if (iox0Var.a(this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$21", f = "SummaryLifecycleActionsInteractor.kt", l = {268}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$21, reason: invalid class name */
    final class AnonymousClass21 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass21(t tVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass21(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass21) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                wa1 wa1Var = this.this$0.J;
                this.label = 1;
                if (kotlinx.coroutines.flow.e.t(((com.yandex.go.taxi.tariffs.internal.repository.k) wa1Var.c).j.b()).collect(new va1(wa1Var), this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$22", f = "SummaryLifecycleActionsInteractor.kt", l = {475}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$22, reason: invalid class name */
    final class AnonymousClass22 extends SuspendLambda implements wls {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass22(t tVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass22(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass22) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(this.this$0.G.d(), new SummaryLifecycleActionsInteractor$launchOnAttachActions$2$22$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
                rhv0 rhv0Var = new rhv0();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (oVar.collect(rhv0Var, this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$23", f = "SummaryLifecycleActionsInteractor.kt", l = {485}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$23, reason: invalid class name */
    final class AnonymousClass23 extends SuspendLambda implements wls {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass23(t tVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass23(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass23) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            int i2 = 1;
            if (i == 0) {
                kotlin.b.b(obj);
                n nVar = new n(new l(new mth(((com.yandex.go.taxi.tariffs.internal.repository.k) this.this$0.a).j.b(), 4)));
                t tVar = this.this$0;
                kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(nVar, new SummaryLifecycleActionsInteractor$launchOnAttachActions$2$23$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
                nhv0 nhv0Var = new nhv0(tVar, i2);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (oVar.collect(nhv0Var, this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$24", f = "SummaryLifecycleActionsInteractor.kt", l = {482}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$24, reason: invalid class name */
    final class AnonymousClass24 extends SuspendLambda implements wls {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ t this$0;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfnx0;", PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, "Lcom/yandex/go/address/models/Address;", "sourceAddress", "Lkotlin/Triple;", "", "Lpex0;", "<anonymous>", "(Lfnx0;Lcom/yandex/go/address/models/Address;)Lkotlin/Triple;"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$24$2", f = "SummaryLifecycleActionsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$24$2, reason: invalid class name */
        final class AnonymousClass2 extends SuspendLambda implements zls {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;
            final /* synthetic */ t this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(t tVar, Continuation continuation) {
                super(3, continuation);
                this.this$0 = tVar;
            }

            @Override // defpackage.zls
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, (Continuation) obj3);
                anonymousClass2.L$0 = (fnx0) obj;
                anonymousClass2.L$1 = (Address) obj2;
                return anonymousClass2.invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                fnx0 fnx0Var = (fnx0) this.L$0;
                Address address = (Address) this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label == 0) {
                    kotlin.b.b(obj);
                    return new Triple(Boolean.valueOf(this.this$0.Q.a(fnx0Var.c)), address, fnx0Var.c);
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass24(t tVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass24(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass24) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(kotlinx.coroutines.flow.e.X(new m0(((com.yandex.go.taxi.tariffs.internal.repository.k) this.this$0.a).j.b(), new p(this.this$0.R.f()), new AnonymousClass2(this.this$0, null)), new SummaryLifecycleActionsInteractor$launchOnAttachActions$2$24$invokeSuspend$$inlined$flatMapLatest$1(this.this$0, null)), new SummaryLifecycleActionsInteractor$launchOnAttachActions$2$24$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
                shv0 shv0Var = new shv0();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (oVar.collect(shv0Var, this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$25", f = "SummaryLifecycleActionsInteractor.kt", l = {475}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$25, reason: invalid class name */
    final class AnonymousClass25 extends SuspendLambda implements wls {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass25(t tVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass25(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass25) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                mth mthVar = new mth(vng.l(((com.yandex.go.taxi.tariffs.internal.repository.k) this.this$0.a).j.b(), new omu0(16), vng.c), 4);
                t tVar = this.this$0;
                kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(mthVar, new SummaryLifecycleActionsInteractor$launchOnAttachActions$2$25$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
                nhv0 nhv0Var = new nhv0(tVar, 2);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (oVar.collect(nhv0Var, this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$26", f = "SummaryLifecycleActionsInteractor.kt", l = {312}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$26, reason: invalid class name */
    final class AnonymousClass26 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass26(t tVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass26(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass26) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                ru.yandex.taxi.preorder.summary.solid.interactors.l lVar = this.this$0.p;
                this.label = 1;
                if (lVar.a(this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$27", f = "SummaryLifecycleActionsInteractor.kt", l = {316}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$27, reason: invalid class name */
    final class AnonymousClass27 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass27(t tVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass27(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass27) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                y yVar = this.this$0.N;
                this.label = 1;
                if (yVar.a(this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$28", f = "SummaryLifecycleActionsInteractor.kt", l = {320}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$28, reason: invalid class name */
    final class AnonymousClass28 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass28(t tVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass28(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass28) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                z zVar = this.this$0.O;
                this.label = 1;
                if (zVar.a(this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$29", f = "SummaryLifecycleActionsInteractor.kt", l = {324}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$29, reason: invalid class name */
    final class AnonymousClass29 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass29(t tVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass29(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass29) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                ru.yandex.taxi.preorder.summary.selector.analytics.a aVar = this.this$0.P;
                this.label = 1;
                if (aVar.a(this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$3", f = "SummaryLifecycleActionsInteractor.kt", l = {475}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(t tVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
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
                tpr f = this.this$0.c.f();
                t tVar = this.this$0;
                kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(f, new SummaryLifecycleActionsInteractor$launchOnAttachActions$2$3$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
                nhv0 nhv0Var = new nhv0(tVar, 3);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (oVar.collect(nhv0Var, this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$30", f = "SummaryLifecycleActionsInteractor.kt", l = {331}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$30, reason: invalid class name */
    final class AnonymousClass30 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass30(t tVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass30(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass30) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                aw70 aw70Var = this.this$0.z;
                this.label = 1;
                if (((ru.yandex.taxi.orderforanother.router.a) aw70Var).a(new yv70(), this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$31", f = "SummaryLifecycleActionsInteractor.kt", l = {338}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$31, reason: invalid class name */
    final class AnonymousClass31 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass31(t tVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass31(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass31) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                q0 q0Var = this.this$0.T;
                this.label = 1;
                if (q0Var.a(this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$33", f = "SummaryLifecycleActionsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$33, reason: invalid class name */
    final class AnonymousClass33 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass33(t tVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass33(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass33 anonymousClass33 = (AnonymousClass33) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass33.invokeSuspend(zy11Var);
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
            t tVar = this.this$0;
            vij0 vij0Var = tVar.h.a;
            if (vij0Var != null) {
                ((ru.yandex.taxi.summary.deeplink.requirement.a) tVar.H.get()).c(vij0Var);
                this.this$0.h.a = null;
            }
            return zy11.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$34", f = "SummaryLifecycleActionsInteractor.kt", l = {357}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$34, reason: invalid class name */
    final class AnonymousClass34 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass34(t tVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass34(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass34) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                ru.yandex.taxi.summary.requirements.list.interactors.d dVar = this.this$0.V;
                this.label = 1;
                if (dVar.a(this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$35", f = "SummaryLifecycleActionsInteractor.kt", l = {360}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$35, reason: invalid class name */
    final class AnonymousClass35 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass35(t tVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass35(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass35) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            zy11 zy11Var = zy11.a;
            if (i == 0) {
                kotlin.b.b(obj);
                fwu0 fwu0Var = this.this$0.Z;
                this.label = 1;
                fwu0Var.getClass();
                if (zy11Var == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return zy11Var;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$36", f = "SummaryLifecycleActionsInteractor.kt", l = {364}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$36, reason: invalid class name */
    final class AnonymousClass36 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass36(t tVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass36(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass36) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                tpr t = kotlinx.coroutines.flow.e.t(((com.yandex.go.taxi.tariffs.internal.repository.k) this.this$0.a).j.b());
                nhv0 nhv0Var = new nhv0(this.this$0, 4);
                this.label = 1;
                if (t.collect(nhv0Var, this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$37", f = "SummaryLifecycleActionsInteractor.kt", l = {374}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$37, reason: invalid class name */
    final class AnonymousClass37 extends SuspendLambda implements wls {
        final /* synthetic */ oiv0 $summaryNavigator;
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass37(t tVar, oiv0 oiv0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
            this.$summaryNavigator = oiv0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass37(this.this$0, this.$summaryNavigator, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass37) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            zy11 zy11Var = zy11.a;
            if (i != 0) {
                if (i == 1) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            v vVar = this.this$0.K;
            oiv0 oiv0Var = this.$summaryNavigator;
            this.label = 1;
            vVar.b.getClass();
            Object k0 = tje.k0(uyj.a, new SummaryUiEventsInteractor$collectSummaryUiEvents$2(vVar, oiv0Var, null), this);
            if (k0 != coroutineSingletons) {
                k0 = zy11Var;
            }
            return k0 == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$38", f = "SummaryLifecycleActionsInteractor.kt", l = {378, 380}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$38, reason: invalid class name */
    final class AnonymousClass38 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass38(t tVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass38(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass38) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
        
            if (r5.b(r4) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
        
            if (r5.b(r4) == r0) goto L15;
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
                com.yandex.go.taxi.summary.shared.lifecycle.a aVar = this.this$0.g0;
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
            this.this$0.h0.h.set(false);
            ru.yandex.taxi.routestats.prefetch.m mVar = this.this$0.h0;
            this.label = 2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$4", f = "SummaryLifecycleActionsInteractor.kt", l = {475}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements wls {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(t tVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
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
                hnr0 e = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.this$0.d).e();
                this.this$0.f.getClass();
                tpr F = kotlinx.coroutines.flow.e.F(e, uyj.a);
                t tVar = this.this$0;
                kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(F, new SummaryLifecycleActionsInteractor$launchOnAttachActions$2$4$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
                nhv0 nhv0Var = new nhv0(tVar, 5);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (oVar.collect(nhv0Var, this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$5", f = "SummaryLifecycleActionsInteractor.kt", l = {475}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$5, reason: invalid class name */
    final class AnonymousClass5 extends SuspendLambda implements wls {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(t tVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
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
            if (i == 0) {
                kotlin.b.b(obj);
                ru.yandex.taxi.summary.topnotification.plus.b a = this.this$0.j.a();
                t tVar = this.this$0;
                kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(a, new SummaryLifecycleActionsInteractor$launchOnAttachActions$2$5$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
                nhv0 nhv0Var = new nhv0(tVar, 6);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (oVar.collect(nhv0Var, this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$6", f = "SummaryLifecycleActionsInteractor.kt", l = {475}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$6, reason: invalid class name */
    final class AnonymousClass6 extends SuspendLambda implements wls {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(t tVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
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
                t tVar = this.this$0;
                kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(tVar.n.e, new SummaryLifecycleActionsInteractor$launchOnAttachActions$2$6$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
                nhv0 nhv0Var = new nhv0(tVar, 7);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (oVar.collect(nhv0Var, this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$7", f = "SummaryLifecycleActionsInteractor.kt", l = {480}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$7, reason: invalid class name */
    final class AnonymousClass7 extends SuspendLambda implements wls {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(t tVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass7(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass7) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                t tVar = this.this$0;
                b2k a = tVar.m.a(new s(((com.yandex.go.taxi.tariffs.internal.repository.k) tVar.d).e()));
                this.this$0.f.getClass();
                tpr F = kotlinx.coroutines.flow.e.F(a, uyj.a);
                t tVar2 = this.this$0;
                kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(F, new SummaryLifecycleActionsInteractor$launchOnAttachActions$2$7$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
                nhv0 nhv0Var = new nhv0(tVar2, 8);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (oVar.collect(nhv0Var, this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$8", f = "SummaryLifecycleActionsInteractor.kt", l = {475}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$8, reason: invalid class name */
    final class AnonymousClass8 extends SuspendLambda implements wls {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(t tVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass8(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass8) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                tpr b = this.this$0.q.b();
                t tVar = this.this$0;
                kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(b, new SummaryLifecycleActionsInteractor$launchOnAttachActions$2$8$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
                nhv0 nhv0Var = new nhv0(tVar, 9);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (oVar.collect(nhv0Var, this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$9", f = "SummaryLifecycleActionsInteractor.kt", l = {MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryLifecycleActionsInteractor$launchOnAttachActions$2$9, reason: invalid class name */
    final class AnonymousClass9 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(t tVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass9(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass9) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                c521 c521Var = this.this$0.E;
                this.label = 1;
                if (((com.yandex.go.taxi.tariffs.internal.repository.k) c521Var.a).j.b().collect(new sf11(4, c521Var), this) == coroutineSingletons) {
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
    public SummaryLifecycleActionsInteractor$launchOnAttachActions$2(t tVar, bov0 bov0Var, oiv0 oiv0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tVar;
        this.$payload = bov0Var;
        this.$summaryNavigator = oiv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SummaryLifecycleActionsInteractor$launchOnAttachActions$2 summaryLifecycleActionsInteractor$launchOnAttachActions$2 = new SummaryLifecycleActionsInteractor$launchOnAttachActions$2(this.this$0, this.$payload, this.$summaryNavigator, continuation);
        summaryLifecycleActionsInteractor$launchOnAttachActions$2.L$0 = obj;
        return summaryLifecycleActionsInteractor$launchOnAttachActions$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SummaryLifecycleActionsInteractor$launchOnAttachActions$2 summaryLifecycleActionsInteractor$launchOnAttachActions$2 = (SummaryLifecycleActionsInteractor$launchOnAttachActions$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        summaryLifecycleActionsInteractor$launchOnAttachActions$2.invokeSuspend(zy11Var);
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
        this.this$0.f.getClass();
        sjh sjhVar = uyj.a;
        com.yandex.go.coroutines.b.g(tseVar, sjhVar, null, new AnonymousClass1(this.this$0, this.$payload, null), 2);
        this.this$0.f.getClass();
        com.yandex.go.coroutines.b.g(tseVar, sjhVar, null, new AnonymousClass2(this.this$0, null), 2);
        com.yandex.go.coroutines.b.g(tseVar, null, null, new AnonymousClass3(this.this$0, null), 3);
        com.yandex.go.coroutines.b.g(tseVar, null, null, new AnonymousClass4(this.this$0, null), 3);
        com.yandex.go.coroutines.b.g(tseVar, null, null, new AnonymousClass5(this.this$0, null), 3);
        com.yandex.go.coroutines.b.g(tseVar, null, null, new AnonymousClass6(this.this$0, null), 3);
        com.yandex.go.coroutines.b.g(tseVar, null, null, new AnonymousClass7(this.this$0, null), 3);
        this.this$0.f.getClass();
        com.yandex.go.coroutines.b.g(tseVar, sjhVar, null, new AnonymousClass8(this.this$0, null), 2);
        this.this$0.f.getClass();
        com.yandex.go.coroutines.b.g(tseVar, sjhVar, null, new AnonymousClass9(this.this$0, null), 2);
        this.this$0.f.getClass();
        com.yandex.go.coroutines.b.g(tseVar, sjhVar, null, new AnonymousClass10(this.this$0, null), 2);
        this.this$0.f.getClass();
        com.yandex.go.coroutines.b.g(tseVar, sjhVar, null, new AnonymousClass11(this.this$0, null), 2);
        com.yandex.go.coroutines.b.g(tseVar, null, null, new AnonymousClass12(this.this$0, null), 3);
        com.yandex.go.coroutines.b.g(tseVar, null, null, new AnonymousClass13(this.this$0, null), 3);
        com.yandex.go.coroutines.b.g(tseVar, null, null, new AnonymousClass14(this.this$0, null), 3);
        this.this$0.f.getClass();
        com.yandex.go.coroutines.b.g(tseVar, sjhVar, null, new AnonymousClass15(this.this$0, null), 2);
        this.this$0.f.getClass();
        com.yandex.go.coroutines.b.g(tseVar, sjhVar, null, new AnonymousClass16(this.this$0, null), 2);
        this.this$0.f.getClass();
        com.yandex.go.coroutines.b.g(tseVar, sjhVar, null, new AnonymousClass17(this.this$0, null), 2);
        this.this$0.f.getClass();
        com.yandex.go.coroutines.b.g(tseVar, sjhVar, null, new AnonymousClass18(this.this$0, null), 2);
        this.this$0.f.getClass();
        com.yandex.go.coroutines.b.g(tseVar, sjhVar, null, new AnonymousClass19(this.this$0, null), 2);
        this.this$0.f.getClass();
        com.yandex.go.coroutines.b.g(tseVar, sjhVar, null, new AnonymousClass20(this.this$0, null), 2);
        this.this$0.f.getClass();
        com.yandex.go.coroutines.b.g(tseVar, sjhVar, null, new AnonymousClass21(this.this$0, null), 2);
        this.this$0.f.getClass();
        com.yandex.go.coroutines.b.g(tseVar, sjhVar, null, new AnonymousClass22(this.this$0, null), 2);
        com.yandex.go.coroutines.b.g(tseVar, null, null, new AnonymousClass23(this.this$0, null), 3);
        this.this$0.f.getClass();
        com.yandex.go.coroutines.b.g(tseVar, sjhVar, null, new AnonymousClass24(this.this$0, null), 2);
        com.yandex.go.coroutines.b.g(tseVar, null, null, new AnonymousClass25(this.this$0, null), 3);
        this.this$0.f.getClass();
        com.yandex.go.coroutines.b.g(tseVar, sjhVar, null, new AnonymousClass26(this.this$0, null), 2);
        this.this$0.f.getClass();
        com.yandex.go.coroutines.b.g(tseVar, sjhVar, null, new AnonymousClass27(this.this$0, null), 2);
        this.this$0.f.getClass();
        com.yandex.go.coroutines.b.g(tseVar, sjhVar, null, new AnonymousClass28(this.this$0, null), 2);
        this.this$0.f.getClass();
        com.yandex.go.coroutines.b.g(tseVar, sjhVar, null, new AnonymousClass29(this.this$0, null), 2);
        this.this$0.r.f.a();
        this.this$0.t.a();
        com.yandex.go.coroutines.b.g(tseVar, null, null, new AnonymousClass30(this.this$0, null), 3);
        this.this$0.L.a(tseVar);
        this.this$0.M.b(tseVar);
        com.yandex.go.coroutines.b.g(tseVar, null, null, new AnonymousClass31(this.this$0, null), 3);
        t tVar = this.this$0;
        ru.yandex.taxi.deeplinks.a.c(tseVar, tVar.S, new q(tVar, tseVar, this.$summaryNavigator));
        com.yandex.go.coroutines.b.g(tseVar, null, null, new AnonymousClass33(this.this$0, null), 3);
        this.this$0.f.getClass();
        com.yandex.go.coroutines.b.g(tseVar, sjhVar, null, new AnonymousClass34(this.this$0, null), 2);
        this.this$0.f.getClass();
        com.yandex.go.coroutines.b.g(tseVar, sjhVar, null, new AnonymousClass35(this.this$0, null), 2);
        this.this$0.f.getClass();
        com.yandex.go.coroutines.b.g(tseVar, sjhVar, null, new AnonymousClass36(this.this$0, null), 2);
        this.this$0.f.getClass();
        com.yandex.go.coroutines.b.g(tseVar, sjhVar, null, new AnonymousClass37(this.this$0, this.$summaryNavigator, null), 2);
        this.this$0.f.getClass();
        com.yandex.go.coroutines.b.g(tseVar, sjhVar, null, new AnonymousClass38(this.this$0, null), 2);
        return zy11.a;
    }
}
