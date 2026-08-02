package com.yandex.go.taxi.order.multi.tracking;

import com.yandex.go.taxi.order.models.api.OrderScreenUtils$OrderScreenType;
import defpackage.a850;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.u580;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.object.DriveState;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.multi.tracking.TaxiOrderTrackingPresenter$attachView$$inlined$collectLatestIn$1", f = "TaxiOrderTrackingPresenter.kt", l = {54}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class TaxiOrderTrackingPresenter$attachView$$inlined$collectLatestIn$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $this_collectLatestIn;
    int label;
    final /* synthetic */ i this$0;

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.multi.tracking.TaxiOrderTrackingPresenter$attachView$$inlined$collectLatestIn$1$1", f = "TaxiOrderTrackingPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.multi.tracking.TaxiOrderTrackingPresenter$attachView$$inlined$collectLatestIn$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ i this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(i iVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            DriveState driveState = (DriveState) obj2;
            a850 a850Var = this.this$0.F;
            int i = u580.a[OrderScreenUtils$OrderScreenType.FEED.ordinal()];
            String str = "#none#";
            if (i == 1) {
                switch (u580.b[driveState.ordinal()]) {
                    case 1:
                    case 2:
                        str = "taxi_scheduling";
                        break;
                    case 3:
                        str = "taxi_check_in";
                        break;
                    case 4:
                    case 5:
                        str = "taxi_search";
                        break;
                    case 6:
                        str = "taxi_driving";
                        break;
                    case 7:
                        str = "taxi_waiting";
                        break;
                    case 8:
                        str = "taxi_transporting";
                        break;
                    case 9:
                        str = "taxi_feedback";
                        break;
                }
            } else {
                if (i != 2) {
                    w511.b();
                    return null;
                }
                switch (u580.b[driveState.ordinal()]) {
                    case 1:
                    case 2:
                        str = "feed_taxi_scheduling";
                        break;
                    case 3:
                        str = "feed_taxi_check_in";
                        break;
                    case 4:
                    case 5:
                        str = "feed_taxi_search";
                        break;
                    case 6:
                        str = "feed_taxi_driving";
                        break;
                    case 7:
                        str = "feed_taxi_waiting";
                        break;
                    case 8:
                        str = "feed_taxi_transporting";
                        break;
                    case 9:
                        str = "feed_taxi_feedback";
                        break;
                }
            }
            a850Var.i(str, true);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderTrackingPresenter$attachView$$inlined$collectLatestIn$1(tpr tprVar, Continuation continuation, i iVar) {
        super(2, continuation);
        this.$this_collectLatestIn = tprVar;
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiOrderTrackingPresenter$attachView$$inlined$collectLatestIn$1(this.$this_collectLatestIn, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiOrderTrackingPresenter$attachView$$inlined$collectLatestIn$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = this.$this_collectLatestIn;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (kotlinx.coroutines.flow.e.k(tprVar, anonymousClass1, this) == coroutineSingletons) {
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
