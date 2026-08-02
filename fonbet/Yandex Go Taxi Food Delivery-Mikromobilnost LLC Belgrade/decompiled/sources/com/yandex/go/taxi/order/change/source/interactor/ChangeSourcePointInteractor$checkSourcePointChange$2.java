package com.yandex.go.taxi.order.change.source.interactor;

import com.yandex.go.taxi.order.change.source.data.ChangeSourcePointApi;
import com.yandex.go.taxi.order.change.source.data.CheckChangeSourceParam;
import com.yandex.go.taxi.order.change.source.data.CheckChangeSourceResponse;
import defpackage.cmt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lfmt;", "Lcom/yandex/go/taxi/order/change/source/data/CheckChangeSourceResponse;", "<anonymous>", "(Ltse;)Lfmt;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.change.source.interactor.ChangeSourcePointInteractor$checkSourcePointChange$2", f = "ChangeSourcePointInteractor.kt", l = {42}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ChangeSourcePointInteractor$checkSourcePointChange$2 extends SuspendLambda implements wls {
    final /* synthetic */ zzs $geoPoint;
    final /* synthetic */ String $orderId;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeSourcePointInteractor$checkSourcePointChange$2(c cVar, String str, zzs zzsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$orderId = str;
        this.$geoPoint = zzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChangeSourcePointInteractor$checkSourcePointChange$2(this.this$0, this.$orderId, this.$geoPoint, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChangeSourcePointInteractor$checkSourcePointChange$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        cmt<CheckChangeSourceResponse> b = ((ChangeSourcePointApi) this.this$0.d.getValue()).b(new CheckChangeSourceParam(this.$orderId, Collections.singletonList(this.$geoPoint)));
        this.label = 1;
        Object b2 = ru.yandex.taxi.network.api.a.b(b, null, this);
        return b2 == coroutineSingletons ? coroutineSingletons : b2;
    }
}
