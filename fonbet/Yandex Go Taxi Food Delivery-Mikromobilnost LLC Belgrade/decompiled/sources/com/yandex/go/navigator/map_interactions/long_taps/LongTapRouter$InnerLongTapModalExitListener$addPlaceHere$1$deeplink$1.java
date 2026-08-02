package com.yandex.go.navigator.map_interactions.long_taps;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.coz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/net/Uri;", "<anonymous>", "(Ltse;)Landroid/net/Uri;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.map_interactions.long_taps.LongTapRouter$InnerLongTapModalExitListener$addPlaceHere$1$deeplink$1", f = "LongTapRouter.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class LongTapRouter$InnerLongTapModalExitListener$addPlaceHere$1$deeplink$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ coz this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongTapRouter$InnerLongTapModalExitListener$addPlaceHere$1$deeplink$1(coz cozVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cozVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LongTapRouter$InnerLongTapModalExitListener$addPlaceHere$1$deeplink$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LongTapRouter$InnerLongTapModalExitListener$addPlaceHere$1$deeplink$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        com.yandex.go.navigator.map_interactions.experiment.a aVar = this.this$0.H;
        this.label = 1;
        Comparable c = aVar.c(this);
        return c == coroutineSingletons ? coroutineSingletons : c;
    }
}
