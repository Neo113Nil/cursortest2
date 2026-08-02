package com.yandex.go.superapp.order_tracking.eats.presentation.ui.overlay;

import defpackage.cwc;
import defpackage.g2f;
import defpackage.h2f;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.o;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.order_tracking.eats.presentation.ui.overlay.CourierMapOverlayPresenter$attachView$1", f = "CourierMapOverlayPresenter.kt", l = {HProv.PROV_GOST_2001_DH}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class CourierMapOverlayPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ g2f $mvpView;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ h2f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourierMapOverlayPresenter$attachView$1(h2f h2fVar, g2f g2fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = h2fVar;
        this.$mvpView = g2fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CourierMapOverlayPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CourierMapOverlayPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr t = e.t(this.this$0.y.b());
            h2f h2fVar = this.this$0;
            c cVar = new c(t, h2fVar);
            h2fVar.x.getClass();
            tpr F = e.F(cVar, uyj.a);
            g2f g2fVar = this.$mvpView;
            o oVar = new o(F, new CourierMapOverlayPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            cwc cwcVar = new cwc(9, g2fVar);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(cwcVar, this) == coroutineSingletons) {
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
