package com.yandex.go.taxi.order.infosharing.data;

import android.net.Uri;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.a3y0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w2y0;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.infosharing.data.TaxiOrderInfoSender$tryShareScreenshot$1", f = "TaxiOrderInfoSender.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderInfoSender$tryShareScreenshot$1 extends SuspendLambda implements wls {
    final /* synthetic */ TaxiOrder $order;
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderInfoSender$tryShareScreenshot$1(a aVar, TaxiOrder taxiOrder, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$order = taxiOrder;
        this.$uri = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiOrderInfoSender$tryShareScreenshot$1(this.this$0, this.$order, this.$uri, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TaxiOrderInfoSender$tryShareScreenshot$1 taxiOrderInfoSender$tryShareScreenshot$1 = (TaxiOrderInfoSender$tryShareScreenshot$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        taxiOrderInfoSender$tryShareScreenshot$1.invokeSuspend(zy11Var);
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
        a aVar = this.this$0;
        try {
            aVar.a(this.$order, new w2y0(this.$uri));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            a3y0.d(aVar.e, "tryShareScreenshot", th, null, 4);
        }
        return zy11.a;
    }
}
