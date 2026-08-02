package com.yandex.go.scooters.qr.preview;

import android.graphics.PointF;
import defpackage.bno0;
import defpackage.kmo0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.qr.preview.ScootersPreviewViewPresenter$attachView$$inlined$collectLatestIn$1", f = "ScootersPreviewViewPresenter.kt", l = {54}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class ScootersPreviewViewPresenter$attachView$$inlined$collectLatestIn$1 extends SuspendLambda implements wls {
    final /* synthetic */ kmo0 $mvpView$inlined;
    final /* synthetic */ tpr $this_collectLatestIn;
    int label;
    final /* synthetic */ bno0 this$0;

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.scooters.qr.preview.ScootersPreviewViewPresenter$attachView$$inlined$collectLatestIn$1$1", f = "ScootersPreviewViewPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.scooters.qr.preview.ScootersPreviewViewPresenter$attachView$$inlined$collectLatestIn$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ kmo0 $mvpView$inlined;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ bno0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(kmo0 kmo0Var, bno0 bno0Var, Continuation continuation) {
            super(2, continuation);
            this.$mvpView$inlined = kmo0Var;
            this.this$0 = bno0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$mvpView$inlined, this.this$0, continuation);
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
            b.b(obj);
            PointF pointF = (PointF) obj2;
            kmo0 kmo0Var = this.$mvpView$inlined;
            float f = pointF.x;
            bno0 bno0Var = this.this$0;
            kmo0Var.R(f - bno0Var.E, pointF.y - (bno0Var.C + bno0Var.B.d));
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPreviewViewPresenter$attachView$$inlined$collectLatestIn$1(tpr tprVar, Continuation continuation, kmo0 kmo0Var, bno0 bno0Var) {
        super(2, continuation);
        this.$this_collectLatestIn = tprVar;
        this.$mvpView$inlined = kmo0Var;
        this.this$0 = bno0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPreviewViewPresenter$attachView$$inlined$collectLatestIn$1(this.$this_collectLatestIn, continuation, this.$mvpView$inlined, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPreviewViewPresenter$attachView$$inlined$collectLatestIn$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tpr tprVar = this.$this_collectLatestIn;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$mvpView$inlined, this.this$0, null);
            this.label = 1;
            if (e.k(tprVar, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
