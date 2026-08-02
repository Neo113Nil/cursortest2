package com.yandex.go.taxi.order.details.v2.state.elements.feedback.rating;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Lru/yandex/taxi/utils/UiStateDrawableWrapper;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.feedback.rating.RideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$2", f = "RideCardBaseRatingSelectorDataSource.kt", l = {178}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $imageUrl;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$2(e eVar, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = eVar;
        this.$imageUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$2(this.this$0, this.$imageUrl, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((RideCardBaseRatingSelectorDataSource$unselectedDecorationFlow$2) create((Continuation) obj)).invokeSuspend(zy11.a);
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
        e eVar = this.this$0;
        String str = this.$imageUrl;
        this.label = 1;
        Object b = e.b(eVar, str, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
