package com.yandex.go.inapp_calls.ui.defaultoutgoingcall;

import com.yandex.go.inapp_calls.repository.defaultoutgoingcall.SetDefaultOutgoingCallTypeInteractor$getCallTypesFlow$$inlined$flatMapLatest$1;
import com.yandex.go.inapp_calls.repository.defaultoutgoingcall.g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.ud;
import defpackage.wls;
import defpackage.x7h;
import defpackage.y7h;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.experiments.d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.inapp_calls.ui.defaultoutgoingcall.DefaultCallTypePresenter$attachView$1", f = "DefaultCallTypePresenter.kt", l = {23}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DefaultCallTypePresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ x7h $mvpView;
    int label;
    final /* synthetic */ y7h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultCallTypePresenter$attachView$1(y7h y7hVar, x7h x7hVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = y7hVar;
        this.$mvpView = x7hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DefaultCallTypePresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultCallTypePresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g gVar = this.this$0.x;
            kotlinx.coroutines.flow.internal.g X = e.X(d.b(gVar.b.d), new SetDefaultOutgoingCallTypeInteractor$getCallTypesFlow$$inlined$flatMapLatest$1(null, gVar));
            ud udVar = new ud(23, this.$mvpView, this.this$0);
            this.label = 1;
            if (X.collect(udVar, this) == coroutineSingletons) {
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
