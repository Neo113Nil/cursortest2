package com.yandex.go.taxi.order.change.source.interactor;

import com.yandex.go.navigation.screen.api.Screen;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/yandex/go/navigation/screen/api/Screen;", MetaDataField.SCREEN_FIELD, "", "Lo2y0;", "orders", "", "<anonymous>", "(Lcom/yandex/go/navigation/screen/api/Screen;Ljava/util/List;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.change.source.interactor.OrderSourcePinStateInteractor$pickupPointVisibilityFlow$1", f = "OrderSourcePinStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderSourcePinStateInteractor$pickupPointVisibilityFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        OrderSourcePinStateInteractor$pickupPointVisibilityFlow$1 orderSourcePinStateInteractor$pickupPointVisibilityFlow$1 = new OrderSourcePinStateInteractor$pickupPointVisibilityFlow$1(3, (Continuation) obj3);
        orderSourcePinStateInteractor$pickupPointVisibilityFlow$1.L$0 = (Screen) obj;
        orderSourcePinStateInteractor$pickupPointVisibilityFlow$1.L$1 = (List) obj2;
        return orderSourcePinStateInteractor$pickupPointVisibilityFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Screen screen = (Screen) this.L$0;
        List list = (List) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean z = true;
        if (screen == Screen.ORDERS_LIST && list.size() > 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
