package com.yandex.go.taxi.order.details.v2.state.elements.companion;

import defpackage.d9s;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lru/yandex/taxi/common_models/net/FormattedText;", "timerString", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.companion.RideCardCompanionItemDataSource$getTitleFlow$1", f = "RideCardCompanionItemDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardCompanionItemDataSource$getTitleFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ FormattedText $title;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardCompanionItemDataSource$getTitleFlow$1(FormattedText formattedText, Continuation continuation) {
        super(2, continuation);
        this.$title = formattedText;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardCompanionItemDataSource$getTitleFlow$1 rideCardCompanionItemDataSource$getTitleFlow$1 = new RideCardCompanionItemDataSource$getTitleFlow$1(this.$title, continuation);
        rideCardCompanionItemDataSource$getTitleFlow$1.L$0 = obj;
        return rideCardCompanionItemDataSource$getTitleFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardCompanionItemDataSource$getTitleFlow$1) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return d9s.b("$TIMER$", str, this.$title);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
