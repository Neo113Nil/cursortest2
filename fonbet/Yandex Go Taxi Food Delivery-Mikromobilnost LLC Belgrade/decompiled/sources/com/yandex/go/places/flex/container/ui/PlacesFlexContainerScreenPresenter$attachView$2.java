package com.yandex.go.places.flex.container.ui;

import defpackage.b9c0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.xxl;
import defpackage.zy11;
import flex.engine.a;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lzy11;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.flex.container.ui.PlacesFlexContainerScreenPresenter$attachView$2", f = "PlacesFlexContainerScreenPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesFlexContainerScreenPresenter$attachView$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b9c0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesFlexContainerScreenPresenter$attachView$2(b9c0 b9c0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = b9c0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlacesFlexContainerScreenPresenter$attachView$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PlacesFlexContainerScreenPresenter$attachView$2 placesFlexContainerScreenPresenter$attachView$2 = (PlacesFlexContainerScreenPresenter$attachView$2) create((zy11) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        placesFlexContainerScreenPresenter$attachView$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0.x;
        try {
            xxl xxlVar = a.s0;
            aVar.w(false);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return zy11.a;
    }
}
