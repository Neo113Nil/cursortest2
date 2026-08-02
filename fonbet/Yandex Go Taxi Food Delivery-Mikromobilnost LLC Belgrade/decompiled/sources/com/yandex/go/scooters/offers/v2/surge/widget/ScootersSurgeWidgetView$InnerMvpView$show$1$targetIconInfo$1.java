package com.yandex.go.scooters.offers.v2.surge.widget;

import android.graphics.drawable.BitmapDrawable;
import defpackage.mvg;
import defpackage.n4v;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.x3p0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ln4v;", "<anonymous>", "(Ltse;)Ln4v;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.surge.widget.ScootersSurgeWidgetView$InnerMvpView$show$1$targetIconInfo$1", f = "ScootersSurgeWidgetView.kt", l = {104}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersSurgeWidgetView$InnerMvpView$show$1$targetIconInfo$1 extends SuspendLambda implements wls {
    final /* synthetic */ x3p0 $uiState;
    int label;
    final /* synthetic */ ScootersSurgeWidgetView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSurgeWidgetView$InnerMvpView$show$1$targetIconInfo$1(ScootersSurgeWidgetView scootersSurgeWidgetView, x3p0 x3p0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = scootersSurgeWidgetView;
        this.$uiState = x3p0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersSurgeWidgetView$InnerMvpView$show$1$targetIconInfo$1(this.this$0, this.$uiState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersSurgeWidgetView$InnerMvpView$show$1$targetIconInfo$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ru.yandex.taxi.widget.utils.e eVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            eVar = this.this$0.mediaInfoConverter;
            String str = this.$uiState.c;
            this.label = 1;
            obj = ru.yandex.taxi.widget.utils.e.k(eVar, str, null, this, 14);
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
        BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
        if (bitmapDrawable != null) {
            return new n4v(bitmapDrawable, this.$uiState.c);
        }
        return null;
    }
}
