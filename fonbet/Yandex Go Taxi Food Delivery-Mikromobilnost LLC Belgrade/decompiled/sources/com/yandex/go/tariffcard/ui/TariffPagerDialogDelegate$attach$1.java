package com.yandex.go.tariffcard.ui;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.bax0;
import defpackage.kb5;
import defpackage.mth;
import defpackage.mvg;
import defpackage.nmv0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.summary.promotions.analytics.SummaryPromotionsAnalytics$SummaryState;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.tariffcard.ui.TariffPagerDialogDelegate$attach$1", f = "TariffPagerDialogDelegate.kt", l = {70}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TariffPagerDialogDelegate$attach$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ r0 this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.tariffcard.ui.TariffPagerDialogDelegate$attach$1$2", f = "TariffPagerDialogDelegate.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.tariffcard.ui.TariffPagerDialogDelegate$attach$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        private /* synthetic */ Object L$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(2, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            vpr vprVar = (vpr) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            zy11 zy11Var = zy11.a;
            if (i == 0) {
                kotlin.b.b(obj);
                this.L$0 = null;
                this.label = 1;
                if (vprVar.emit(zy11Var, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/Pair;", "Lkb5;", "", "<destruct>", "", "<unused var>", "Lnmv0;", "<anonymous>", "(Lkotlin/Pair;Ljava/lang/Object;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.tariffcard.ui.TariffPagerDialogDelegate$attach$1$3", f = "TariffPagerDialogDelegate.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.tariffcard.ui.TariffPagerDialogDelegate$attach$1$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements zls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ r0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(r0 r0Var, Continuation continuation) {
            super(3, continuation);
            this.this$0 = r0Var;
        }

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, (Continuation) obj3);
            anonymousClass3.L$0 = (Pair) obj;
            return anonymousClass3.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Pair pair = (Pair) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            kb5 kb5Var = (kb5) pair.getFirst();
            Boolean bool = (Boolean) pair.getSecond();
            bool.booleanValue();
            return new Pair(this.this$0.c.k(kb5Var.b, kb5Var.a, kb5Var.c != null).a, bool);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00002\u0014\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Pair;", "Lnmv0;", "", "<destruct>", "Lxfj;", "<anonymous>", "(Lkotlin/Pair;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.tariffcard.ui.TariffPagerDialogDelegate$attach$1$4", f = "TariffPagerDialogDelegate.kt", l = {67}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.tariffcard.ui.TariffPagerDialogDelegate$attach$1$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        final /* synthetic */ r0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(r0 r0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = r0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass4) create((Pair) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean booleanValue;
            Pair pair = (Pair) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                nmv0 nmv0Var = (nmv0) pair.getFirst();
                booleanValue = ((Boolean) pair.getSecond()).booleanValue();
                ru.yandex.taxi.summary.promotions.interactor.a aVar = this.this$0.b;
                SummaryPromotionsAnalytics$SummaryState summaryPromotionsAnalytics$SummaryState = SummaryPromotionsAnalytics$SummaryState.EXPANDED;
                this.L$0 = null;
                this.L$1 = null;
                this.Z$0 = booleanValue;
                this.label = 1;
                obj = aVar.a(nmv0Var, summaryPromotionsAnalytics$SummaryState, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                booleanValue = this.Z$0;
                kotlin.b.b(obj);
            }
            return new Pair(obj, Boolean.valueOf(booleanValue));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffPagerDialogDelegate$attach$1(r0 r0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = r0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TariffPagerDialogDelegate$attach$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TariffPagerDialogDelegate$attach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            mth mthVar = new mth(new kotlinx.coroutines.flow.j0(null, new com.yandex.go.taxi.summary.shared.expanded.repository.b(this.this$0.d.c), new TariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$withPreviousEmit$1(3, null)), 6);
            r0 r0Var = this.this$0;
            kotlinx.coroutines.flow.internal.g I = kotlinx.coroutines.flow.e.I(kotlinx.coroutines.flow.e.t(new kotlinx.coroutines.flow.m0(new q0(mthVar, r0Var), new kotlinx.coroutines.flow.n(r0Var.c.d(), new AnonymousClass2(2, null)), new AnonymousClass3(this.this$0, null))), new AnonymousClass4(this.this$0, null));
            this.this$0.a.getClass();
            tpr F = kotlinx.coroutines.flow.e.F(I, uyj.a);
            bax0 bax0Var = new bax0(1, this.this$0);
            this.label = 1;
            if (F.collect(bax0Var, this) == coroutineSingletons) {
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
