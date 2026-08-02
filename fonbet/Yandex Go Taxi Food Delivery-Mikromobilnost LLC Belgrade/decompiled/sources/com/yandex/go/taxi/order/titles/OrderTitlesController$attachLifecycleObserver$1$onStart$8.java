package com.yandex.go.taxi.order.titles;

import defpackage.d980;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "formattedSubtitle", "Lru/yandex/taxi/common_models/net/FormattedText;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.titles.OrderTitlesController$attachLifecycleObserver$1$onStart$8", f = "OrderTitlesController.kt", l = {166}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderTitlesController$attachLifecycleObserver$1$onStart$8 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ d980 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderTitlesController$attachLifecycleObserver$1$onStart$8(d980 d980Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = d980Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderTitlesController$attachLifecycleObserver$1$onStart$8 orderTitlesController$attachLifecycleObserver$1$onStart$8 = new OrderTitlesController$attachLifecycleObserver$1$onStart$8(this.this$0, continuation);
        orderTitlesController$attachLifecycleObserver$1$onStart$8.L$0 = obj;
        return orderTitlesController$attachLifecycleObserver$1$onStart$8;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderTitlesController$attachLifecycleObserver$1$onStart$8) create((FormattedText) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        d980 d980Var;
        FormattedText formattedText = (FormattedText) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                d980 d980Var2 = this.this$0;
                try {
                    ru.yandex.taxi.widget.c cVar = d980Var2.k;
                    this.L$0 = formattedText;
                    this.L$1 = d980Var2;
                    this.label = 1;
                    Object e = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, this, 30);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = e;
                    d980Var = d980Var2;
                } catch (Throwable unused) {
                    d980Var = d980Var2;
                    return ru.yandex.taxi.widget.c.f(d980Var.k, formattedText, false, null, 14);
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d980Var = (d980) this.L$1;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable unused2) {
                    return ru.yandex.taxi.widget.c.f(d980Var.k, formattedText, false, null, 14);
                }
            }
            return (CharSequence) obj;
        } catch (CancellationException e2) {
            throw e2;
        }
    }
}
