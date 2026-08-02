package com.yandex.go.safety.center.main;

import defpackage.chr0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.main.SafetyCenterMainPresenter$attachView$5", f = "SafetyCenterMainPresenter.kt", l = {81}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SafetyCenterMainPresenter$attachView$5 extends SuspendLambda implements wls {
    final /* synthetic */ SafetyCenterMainMvpView $mvpView;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyCenterMainPresenter$attachView$5(SafetyCenterMainMvpView safetyCenterMainMvpView, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$mvpView = safetyCenterMainMvpView;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SafetyCenterMainPresenter$attachView$5(this.$mvpView, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SafetyCenterMainPresenter$attachView$5) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SafetyCenterMainMvpView safetyCenterMainMvpView;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            SafetyCenterMainMvpView safetyCenterMainMvpView2 = this.$mvpView;
            com.yandex.go.something_wrong_screen.repository.b bVar = this.this$0.F;
            this.L$0 = safetyCenterMainMvpView2;
            this.label = 1;
            Object c = bVar.c(this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = c;
            safetyCenterMainMvpView = safetyCenterMainMvpView2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            safetyCenterMainMvpView = (SafetyCenterMainMvpView) this.L$0;
            kotlin.b.b(obj);
        }
        safetyCenterMainMvpView.setShakeToggleEnabled((chr0) obj);
        return zy11.a;
    }
}
