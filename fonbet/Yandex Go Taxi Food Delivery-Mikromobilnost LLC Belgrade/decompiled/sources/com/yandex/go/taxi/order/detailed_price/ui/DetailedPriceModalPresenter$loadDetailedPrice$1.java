package com.yandex.go.taxi.order.detailed_price.ui;

import defpackage.e3j;
import defpackage.g3j;
import defpackage.j3j;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lm3j;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.detailed_price.ui.DetailedPriceModalPresenter$loadDetailedPrice$1", f = "DetailedPriceModalPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailedPriceModalPresenter$loadDetailedPrice$1 extends SuspendLambda implements zls {
    final /* synthetic */ String $buttonTitle;
    int label;
    final /* synthetic */ g3j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailedPriceModalPresenter$loadDetailedPrice$1(g3j g3jVar, String str, Continuation continuation) {
        super(3, continuation);
        this.this$0 = g3jVar;
        this.$buttonTitle = str;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DetailedPriceModalPresenter$loadDetailedPrice$1 detailedPriceModalPresenter$loadDetailedPrice$1 = new DetailedPriceModalPresenter$loadDetailedPrice$1(this.this$0, this.$buttonTitle, (Continuation) obj3);
        zy11 zy11Var = zy11.a;
        detailedPriceModalPresenter$loadDetailedPrice$1.invokeSuspend(zy11Var);
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
        ((e3j) this.this$0.Dg()).render(new j3j(this.$buttonTitle));
        return zy11.a;
    }
}
