package com.yandex.plus.home;

import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import com.yandex.plus.home.state.UpdateTargetEvent;
import com.yandex.plus.log.api.LogPriority;
import defpackage.b0u;
import defpackage.eqd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rkd0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.yzt;
import defpackage.zls;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltse;", "", "Lcom/yandex/plus/home/state/UpdateTargetEvent;", "events", "Lzy11;", "<anonymous>", "(Ltse;Ljava/util/Set;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.PlusHomeSdkImpl$13", f = "PlusHomeSdkImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PlusHomeSdkImpl$13 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "com.yandex.plus.home.PlusHomeSdkImpl$13$2", f = "PlusHomeSdkImpl.kt", l = {169}, m = "invokeSuspend")
    /* renamed from: com.yandex.plus.home.PlusHomeSdkImpl$13$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(c cVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
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
            com.yandex.plus.home.graphql.plusstate.c b = this.this$0.f.b();
            this.label = 1;
            b.b();
            return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "com.yandex.plus.home.PlusHomeSdkImpl$13$3", f = "PlusHomeSdkImpl.kt", l = {174}, m = "invokeSuspend")
    /* renamed from: com.yandex.plus.home.PlusHomeSdkImpl$13$3, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(c cVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
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
            com.yandex.plus.home.ybsdk.a aVar = (com.yandex.plus.home.ybsdk.a) this.this$0.f.y.getValue();
            if (aVar != null) {
                this.label = 1;
                rkd0 rkd0Var = aVar.c;
                LogPriority logPriority = LogPriority.INFO;
                if (rkd0Var.e(logPriority)) {
                    rkd0Var.b(logPriority, "TreasuryAdapterProxy", "emitUpdateDataEvent()", null);
                }
                Object emit = aVar.d.emit(eqd0.a, this);
                if (emit != coroutineSingletons) {
                    emit = zy11Var;
                }
                if (emit == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return zy11Var;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "com.yandex.plus.home.PlusHomeSdkImpl$13$4", f = "PlusHomeSdkImpl.kt", l = {SubsamplingScaleImageView.ORIENTATION_180}, m = "invokeSuspend")
    /* renamed from: com.yandex.plus.home.PlusHomeSdkImpl$13$4, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass4 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(c cVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
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
            yzt yztVar = (yzt) this.this$0.f.j.getValue();
            this.label = 1;
            yztVar.a();
            return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "com.yandex.plus.home.PlusHomeSdkImpl$13$5", f = "PlusHomeSdkImpl.kt", l = {183}, m = "invokeSuspend")
    /* renamed from: com.yandex.plus.home.PlusHomeSdkImpl$13$5, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass5 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(c cVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
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
            b0u b0uVar = (b0u) this.this$0.f.k.getValue();
            this.label = 1;
            b0uVar.a();
            return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusHomeSdkImpl$13(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PlusHomeSdkImpl$13 plusHomeSdkImpl$13 = new PlusHomeSdkImpl$13(this.this$0, (Continuation) obj3);
        plusHomeSdkImpl$13.L$0 = (tse) obj;
        plusHomeSdkImpl$13.L$1 = (Set) obj2;
        zy11 zy11Var = zy11.a;
        plusHomeSdkImpl$13.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        Set set = (Set) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        rkd0 rkd0Var = this.this$0.b.A;
        LogPriority logPriority = LogPriority.INFO;
        if (rkd0Var.e(logPriority)) {
            rkd0Var.b(logPriority, "PlusHomeSdkImpl", "Collect new target events " + set, null);
        }
        UpdateTargetEvent updateTargetEvent = UpdateTargetEvent.PLUS_AMOUNT;
        if (set.contains(updateTargetEvent) || set.contains(UpdateTargetEvent.ALL)) {
            tje.N(tseVar, null, null, new AnonymousClass2(this.this$0, null), 3);
        }
        if (set.contains(UpdateTargetEvent.FINTECH) || set.contains(UpdateTargetEvent.ALL)) {
            tje.N(tseVar, null, null, new AnonymousClass3(this.this$0, null), 3);
        }
        if (set.contains(updateTargetEvent) || set.contains(UpdateTargetEvent.ALL) || set.contains(UpdateTargetEvent.DAILY)) {
            tje.N(tseVar, null, null, new AnonymousClass4(this.this$0, null), 3);
        }
        if (set.contains(UpdateTargetEvent.FAMILY)) {
            tje.N(tseVar, null, null, new AnonymousClass5(this.this$0, null), 3);
        }
        return zy11.a;
    }
}
