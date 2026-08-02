package com.yandex.go.scooters.offers.v2.surge.widget;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/drawable/NinePatchDrawable;", "<anonymous>", "(Ltse;)Landroid/graphics/drawable/NinePatchDrawable;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.surge.widget.ScootersSurgeWidgetView$InnerMvpView$show$1$background$1", f = "ScootersSurgeWidgetView.kt", l = {100}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersSurgeWidgetView$InnerMvpView$show$1$background$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSurgeWidgetView$InnerMvpView$show$1$background$1(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersSurgeWidgetView$InnerMvpView$show$1$background$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersSurgeWidgetView$InnerMvpView$show$1$background$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tt2 tt2Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e eVar = this.this$0;
        this.label = 1;
        ScootersSurgeWidgetView scootersSurgeWidgetView = eVar.b;
        tt2Var = scootersSurgeWidgetView.appDispatchers;
        tt2Var.getClass();
        Object k0 = tje.k0(uyj.a, new ScootersSurgeWidgetView$InnerMvpView$createBackground$2(scootersSurgeWidgetView, null), this);
        return k0 == coroutineSingletons ? coroutineSingletons : k0;
    }
}
