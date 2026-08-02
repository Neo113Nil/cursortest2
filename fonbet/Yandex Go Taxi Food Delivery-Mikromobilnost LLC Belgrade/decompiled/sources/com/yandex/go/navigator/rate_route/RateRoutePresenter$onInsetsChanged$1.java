package com.yandex.go.navigator.rate_route;

import android.graphics.drawable.Drawable;
import defpackage.m7i0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p7i0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.rate_route.RateRoutePresenter$onInsetsChanged$1", f = "RateRoutePresenter.kt", l = {185}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class RateRoutePresenter$onInsetsChanged$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ p7i0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RateRoutePresenter$onInsetsChanged$1(p7i0 p7i0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = p7i0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RateRoutePresenter$onInsetsChanged$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RateRoutePresenter$onInsetsChanged$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.design.utils.b bVar = this.this$0.z;
            this.label = 1;
            obj = bVar.g(24, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ((m7i0) this.this$0.Dg()).d((Drawable) obj);
        return zy11.a;
    }
}
