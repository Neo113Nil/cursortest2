package com.yandex.go.payments_widgets;

import com.yandex.go.payments_widgets.plus.UpdatePlusVariablesInteractor$startUpdate$$inlined$safeCollect$1;
import com.yandex.go.payments_widgets.plus.UpdatePlusVariablesInteractor$startUpdate$$inlined$withPreviousEmit$1;
import com.yandex.go.payments_widgets.saver.k;
import com.yandex.go.payments_widgets.yandex_bank.j;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.bms;
import defpackage.g721;
import defpackage.ha2;
import defpackage.kld0;
import defpackage.mdh;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ofa0;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ll8x;", "<anonymous>", "(Ltse;)Ll8x;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments_widgets.UpdatePaymentsVariablesInteractorImpl$startUpdate$2", f = "UpdatePaymentsVariablesInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class UpdatePaymentsVariablesInteractorImpl$startUpdate$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.payments_widgets.UpdatePaymentsVariablesInteractorImpl$startUpdate$2$1", f = "UpdatePaymentsVariablesInteractorImpl.kt", l = {31}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.payments_widgets.UpdatePaymentsVariablesInteractorImpl$startUpdate$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g gVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
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
                ofa0 ofa0Var = this.this$0.a;
                this.label = 1;
                tpr t = kotlinx.coroutines.flow.e.t(new com.yandex.go.payments_widgets.plus.b(new mth(new j0(null, kotlinx.coroutines.flow.e.p(((kld0) ofa0Var.b).a.a.b(), 100L), new UpdatePlusVariablesInteractor$startUpdate$$inlined$withPreviousEmit$1(3, null)), 6), ofa0Var));
                ((tt2) ofa0Var.w).getClass();
                sjh sjhVar = uyj.a;
                if (new o(kotlinx.coroutines.flow.e.F(t, mdh.b), new UpdatePlusVariablesInteractor$startUpdate$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null)).collect(new g721(2, ofa0Var), this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.payments_widgets.UpdatePaymentsVariablesInteractorImpl$startUpdate$2$2", f = "UpdatePaymentsVariablesInteractorImpl.kt", l = {34}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.payments_widgets.UpdatePaymentsVariablesInteractorImpl$startUpdate$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(g gVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = gVar;
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
                j jVar = this.this$0.b;
                this.label = 1;
                if (jVar.a(this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.payments_widgets.UpdatePaymentsVariablesInteractorImpl$startUpdate$2$3", f = "UpdatePaymentsVariablesInteractorImpl.kt", l = {37}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.payments_widgets.UpdatePaymentsVariablesInteractorImpl$startUpdate$2$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(g gVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = gVar;
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
                com.yandex.go.payments_widgets.split.g gVar = this.this$0.c;
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
    @mvg(c = "com.yandex.go.payments_widgets.UpdatePaymentsVariablesInteractorImpl$startUpdate$2$4", f = "UpdatePaymentsVariablesInteractorImpl.kt", l = {40}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.payments_widgets.UpdatePaymentsVariablesInteractorImpl$startUpdate$2$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(g gVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = gVar;
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
                k kVar = this.this$0.d;
                this.label = 1;
                if (kVar.a(this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.payments_widgets.UpdatePaymentsVariablesInteractorImpl$startUpdate$2$5", f = "UpdatePaymentsVariablesInteractorImpl.kt", l = {49}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.payments_widgets.UpdatePaymentsVariablesInteractorImpl$startUpdate$2$5, reason: invalid class name */
    final class AnonymousClass5 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ g this$0;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "hideBalanceChecked", BackendConfig.Restrictions.ENABLED, "hasSection"}, k = 3, mv = {2, 4, 0}, xi = 48)
        @mvg(c = "com.yandex.go.payments_widgets.UpdatePaymentsVariablesInteractorImpl$startUpdate$2$5$1", f = "UpdatePaymentsVariablesInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.payments_widgets.UpdatePaymentsVariablesInteractorImpl$startUpdate$2$5$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements bms {
            /* synthetic */ boolean Z$0;
            /* synthetic */ boolean Z$1;
            /* synthetic */ boolean Z$2;
            int label;

            @Override // defpackage.bms
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                boolean booleanValue3 = ((Boolean) obj3).booleanValue();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(4, (Continuation) obj4);
                anonymousClass1.Z$0 = booleanValue;
                anonymousClass1.Z$1 = booleanValue2;
                anonymousClass1.Z$2 = booleanValue3;
                return anonymousClass1.invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean z = this.Z$0;
                boolean z2 = this.Z$1;
                boolean z3 = this.Z$2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label == 0) {
                    kotlin.b.b(obj);
                    return new Pair(Boolean.valueOf(z), Boolean.valueOf(z2 && z3));
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(g gVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = gVar;
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
                ha2 n = kotlinx.coroutines.flow.e.n(kotlinx.coroutines.flow.e.d(this.this$0.g.b), new com.yandex.go.payments_widgets.yandex_bank.c(ru.yandex.taxi.experiments.d.b(this.this$0.h)), kotlinx.coroutines.flow.e.d(this.this$0.h.d.a), new AnonymousClass1(4, null));
                g721 g721Var = new g721(i2, this.this$0);
                this.label = 1;
                if (n.collect(g721Var, this) == coroutineSingletons) {
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
    public UpdatePaymentsVariablesInteractorImpl$startUpdate$2(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UpdatePaymentsVariablesInteractorImpl$startUpdate$2 updatePaymentsVariablesInteractorImpl$startUpdate$2 = new UpdatePaymentsVariablesInteractorImpl$startUpdate$2(this.this$0, continuation);
        updatePaymentsVariablesInteractorImpl$startUpdate$2.L$0 = obj;
        return updatePaymentsVariablesInteractorImpl$startUpdate$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UpdatePaymentsVariablesInteractorImpl$startUpdate$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        com.yandex.go.coroutines.b.g(tseVar, null, null, new AnonymousClass1(this.this$0, null), 3);
        com.yandex.go.coroutines.b.g(tseVar, null, null, new AnonymousClass2(this.this$0, null), 3);
        com.yandex.go.coroutines.b.g(tseVar, null, null, new AnonymousClass3(this.this$0, null), 3);
        com.yandex.go.coroutines.b.g(tseVar, null, null, new AnonymousClass4(this.this$0, null), 3);
        return com.yandex.go.coroutines.b.g(tseVar, null, null, new AnonymousClass5(this.this$0, null), 3);
    }
}
