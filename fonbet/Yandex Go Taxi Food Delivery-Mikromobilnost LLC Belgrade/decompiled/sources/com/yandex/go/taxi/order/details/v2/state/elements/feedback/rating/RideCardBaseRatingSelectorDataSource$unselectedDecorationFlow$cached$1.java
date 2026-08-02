package com.yandex.go.taxi.order.details.v2.state.elements.feedback.rating;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.feedback.rating.RideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$cached$1", f = "RideCardBaseRatingSelectorDataSource.kt", l = {MSException.ERROR_BUSY}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$cached$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $imageUrl;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$cached$1(e eVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$imageUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$cached$1(this.this$0, this.$imageUrl, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$cached$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.widget.utils.e eVar = this.this$0.d;
            String str = this.$imageUrl;
            this.label = 1;
            obj = ru.yandex.taxi.widget.utils.e.o(eVar, str, null, this, 14);
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
        return Boolean.valueOf(obj != null);
    }
}
