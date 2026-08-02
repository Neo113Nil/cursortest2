package com.yandex.go.scooters.qr.ui;

import defpackage.mvg;
import defpackage.npo0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.qr.ui.ScootersQrPresenter$attachView$$inlined$collectLatestIn$1", f = "ScootersQrPresenter.kt", l = {54}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class ScootersQrPresenter$attachView$$inlined$collectLatestIn$1 extends SuspendLambda implements wls {
    final /* synthetic */ npo0 $mvpView$inlined;
    final /* synthetic */ tpr $this_collectLatestIn;
    int label;

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.scooters.qr.ui.ScootersQrPresenter$attachView$$inlined$collectLatestIn$1$1", f = "ScootersQrPresenter.kt", l = {56}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.scooters.qr.ui.ScootersQrPresenter$attachView$$inlined$collectLatestIn$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ npo0 $mvpView$inlined;
        /* synthetic */ Object L$0;
        Object L$1;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, npo0 npo0Var) {
            super(2, continuation);
            this.$mvpView$inlined = npo0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation, this.$mvpView$inlined);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create(obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                if (!booleanValue) {
                    this.$mvpView$inlined.p0();
                    return zy11.a;
                }
                this.L$0 = null;
                this.L$1 = null;
                this.Z$0 = booleanValue;
                this.label = 1;
                if (kotlinx.coroutines.a.i(200L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            this.$mvpView$inlined.M();
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersQrPresenter$attachView$$inlined$collectLatestIn$1(tpr tprVar, Continuation continuation, npo0 npo0Var) {
        super(2, continuation);
        this.$this_collectLatestIn = tprVar;
        this.$mvpView$inlined = npo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersQrPresenter$attachView$$inlined$collectLatestIn$1(this.$this_collectLatestIn, continuation, this.$mvpView$inlined);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersQrPresenter$attachView$$inlined$collectLatestIn$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = this.$this_collectLatestIn;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.$mvpView$inlined);
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
