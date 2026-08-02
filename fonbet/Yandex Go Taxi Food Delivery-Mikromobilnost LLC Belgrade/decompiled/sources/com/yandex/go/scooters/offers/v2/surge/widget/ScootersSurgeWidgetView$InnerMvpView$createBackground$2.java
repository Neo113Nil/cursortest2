package com.yandex.go.scooters.offers.v2.surge.widget;

import android.content.Context;
import defpackage.d6z;
import defpackage.gtq0;
import defpackage.hgr0;
import defpackage.mrg0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qje;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.xng0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/drawable/NinePatchDrawable;", "<anonymous>", "(Ltse;)Landroid/graphics/drawable/NinePatchDrawable;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.surge.widget.ScootersSurgeWidgetView$InnerMvpView$createBackground$2", f = "ScootersSurgeWidgetView.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersSurgeWidgetView$InnerMvpView$createBackground$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ ScootersSurgeWidgetView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSurgeWidgetView$InnerMvpView$createBackground$2(ScootersSurgeWidgetView scootersSurgeWidgetView, Continuation continuation) {
        super(2, continuation);
        this.this$0 = scootersSurgeWidgetView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersSurgeWidgetView$InnerMvpView$createBackground$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersSurgeWidgetView$InnerMvpView$createBackground$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ru.yandex.taxi.design.utils.a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        aVar = this.this$0.overlayShadowUtil;
        Context context = this.this$0.getContext();
        int d = ru.yandex.taxi.design.utils.c.d(mrg0.go_design_m_space, this.this$0);
        Context context2 = this.this$0.getContext();
        return gtq0.w(aVar, context, d6z.W(qje.t(xng0.bgMain, context), d), new hgr0(0.0f, tje.w(8, context2), tje.w(20, context2), qje.u(context2.getTheme(), xng0.effectShadowBottom)), true, false);
    }
}
