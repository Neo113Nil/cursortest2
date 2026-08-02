package com.yandex.go.taxi.summary.mobilityhub.repository;

import com.yandex.mapkit.RequestPoint;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ll8x;", "<anonymous>", "(Ltse;)Ll8x;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.repository.TransportRoutesRepository$launchRoutesRequest$2", f = "TransportRoutesRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TransportRoutesRepository$launchRoutesRequest$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<RequestPoint> $points;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.summary.mobilityhub.repository.TransportRoutesRepository$launchRoutesRequest$2$1", f = "TransportRoutesRepository.kt", l = {CalendarDayView.DISABLED_DAY_ALPHA}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.summary.mobilityhub.repository.TransportRoutesRepository$launchRoutesRequest$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ List<RequestPoint> $points;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, List list, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$points = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$points, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                b bVar = this.this$0;
                List<RequestPoint> list = this.$points;
                this.label = 1;
                a = b.a(bVar, list, this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                a = ((Result) obj).getValue();
            }
            b bVar2 = this.this$0;
            Throwable a2 = Result.a(a);
            if (a2 == null) {
                r0 r0Var = bVar2.c;
                Result result = new Result((List) a);
                r0Var.getClass();
                r0Var.m(null, result);
            } else {
                r0 r0Var2 = bVar2.c;
                Result result2 = new Result(new Result.Failure(a2));
                r0Var2.getClass();
                r0Var2.m(null, result2);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransportRoutesRepository$launchRoutesRequest$2(b bVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$points = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TransportRoutesRepository$launchRoutesRequest$2 transportRoutesRepository$launchRoutesRequest$2 = new TransportRoutesRepository$launchRoutesRequest$2(this.this$0, this.$points, continuation);
        transportRoutesRepository$launchRoutesRequest$2.L$0 = obj;
        return transportRoutesRepository$launchRoutesRequest$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransportRoutesRepository$launchRoutesRequest$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return tje.N(tseVar, null, null, new AnonymousClass1(this.this$0, this.$points, null), 3);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
