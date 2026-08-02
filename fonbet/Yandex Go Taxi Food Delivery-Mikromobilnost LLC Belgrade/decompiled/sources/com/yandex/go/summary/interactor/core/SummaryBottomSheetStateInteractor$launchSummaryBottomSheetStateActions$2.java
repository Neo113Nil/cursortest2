package com.yandex.go.summary.interactor.core;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.idv0;
import defpackage.jdv0;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qls0;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.j0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ll8x;", "<anonymous>", "(Ltse;)Ll8x;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.core.SummaryBottomSheetStateInteractor$launchSummaryBottomSheetStateActions$2", f = "SummaryBottomSheetStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SummaryBottomSheetStateInteractor$launchSummaryBottomSheetStateActions$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ jdv0 this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryBottomSheetStateInteractor$launchSummaryBottomSheetStateActions$2$1", f = "SummaryBottomSheetStateInteractor.kt", l = {47}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryBottomSheetStateInteractor$launchSummaryBottomSheetStateActions$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ jdv0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(jdv0 jdv0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = jdv0Var;
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
                jdv0 jdv0Var = this.this$0;
                this.label = 1;
                if (new kotlinx.coroutines.flow.o(kotlinx.coroutines.flow.e.t(new e(new mth(jdv0Var.d.b, 6), jdv0Var)), new SummaryBottomSheetStateInteractor$collectAnchorBottomSheetBehaviorStateChanged$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null)).collect(new idv0(jdv0Var, 0), this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryBottomSheetStateInteractor$launchSummaryBottomSheetStateActions$2$2", f = "SummaryBottomSheetStateInteractor.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryBottomSheetStateInteractor$launchSummaryBottomSheetStateActions$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ jdv0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(jdv0 jdv0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = jdv0Var;
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
                jdv0 jdv0Var = this.this$0;
                this.label = 1;
                if (new kotlinx.coroutines.flow.o(kotlinx.coroutines.flow.e.t(new g(new mth(new j0(null, new mth(jdv0Var.d.b, 6), new SummaryBottomSheetStateInteractor$collectAnchorBottomSheetBehaviorStateChangedAnalytics$$inlined$withPreviousEmit$1(3, null)), 6), jdv0Var)), new SummaryBottomSheetStateInteractor$collectAnchorBottomSheetBehaviorStateChangedAnalytics$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null)).collect(new idv0(jdv0Var, 1), this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.interactor.core.SummaryBottomSheetStateInteractor$launchSummaryBottomSheetStateActions$2$3", f = "SummaryBottomSheetStateInteractor.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.interactor.core.SummaryBottomSheetStateInteractor$launchSummaryBottomSheetStateActions$2$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ jdv0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(jdv0 jdv0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = jdv0Var;
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
                jdv0 jdv0Var = this.this$0;
                this.label = 1;
                if (new kotlinx.coroutines.flow.o(kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(new tpr[]{kotlinx.coroutines.flow.e.s(((com.yandex.go.taxi.tariffs.internal.repository.k) jdv0Var.e).j.b(), new qls0(29)), new i(new mth(new j0(null, new mth(jdv0Var.d.b, 6), new SummaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$withPreviousEmit$1(3, null)), 6))}, 2)), new SummaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null)).collect(new idv0(jdv0Var, 2), this) == coroutineSingletons) {
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
    public SummaryBottomSheetStateInteractor$launchSummaryBottomSheetStateActions$2(jdv0 jdv0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jdv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SummaryBottomSheetStateInteractor$launchSummaryBottomSheetStateActions$2 summaryBottomSheetStateInteractor$launchSummaryBottomSheetStateActions$2 = new SummaryBottomSheetStateInteractor$launchSummaryBottomSheetStateActions$2(this.this$0, continuation);
        summaryBottomSheetStateInteractor$launchSummaryBottomSheetStateActions$2.L$0 = obj;
        return summaryBottomSheetStateInteractor$launchSummaryBottomSheetStateActions$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryBottomSheetStateInteractor$launchSummaryBottomSheetStateActions$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        this.this$0.k.getClass();
        sjh sjhVar = uyj.a;
        com.yandex.go.coroutines.b.g(tseVar, sjhVar, null, new AnonymousClass2(this.this$0, null), 2);
        this.this$0.k.getClass();
        return com.yandex.go.coroutines.b.g(tseVar, sjhVar, null, new AnonymousClass3(this.this$0, null), 2);
    }
}
