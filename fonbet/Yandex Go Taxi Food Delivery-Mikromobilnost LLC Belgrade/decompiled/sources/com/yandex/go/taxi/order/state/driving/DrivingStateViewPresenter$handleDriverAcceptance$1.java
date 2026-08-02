package com.yandex.go.taxi.order.state.driving;

import defpackage.amm;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.state.driving.DrivingStateViewPresenter$handleDriverAcceptance$1", f = "DrivingStateViewPresenter.kt", l = {HProv.ALG_SID_NO_HASH}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DrivingStateViewPresenter$handleDriverAcceptance$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrivingStateViewPresenter$handleDriverAcceptance$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DrivingStateViewPresenter$handleDriverAcceptance$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DrivingStateViewPresenter$handleDriverAcceptance$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            this.this$0.d0.getClass();
            sjh sjhVar = uyj.a;
            DrivingStateViewPresenter$handleDriverAcceptance$1$isNeedToShow$1 drivingStateViewPresenter$handleDriverAcceptance$1$isNeedToShow$1 = new DrivingStateViewPresenter$handleDriverAcceptance$1$isNeedToShow$1(this.this$0, null);
            this.label = 1;
            obj = tje.k0(sjhVar, drivingStateViewPresenter$handleDriverAcceptance$1$isNeedToShow$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            ((amm) this.this$0.Dg()).playDriverAcceptance();
        }
        return zy11.a;
    }
}
