package com.yandex.go.taxi.summary.shared.lifecycle;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "it", "", "Lcom/yandex/go/taxi/summary/shared/lifecycle/SummaryElement;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.summary.shared.lifecycle.SummaryLargestContentfulProcessor$waitLargestContentfulPaint$2", f = "SummaryLargestContentfulProcessor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SummaryLargestContentfulProcessor$waitLargestContentfulPaint$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SummaryLargestContentfulProcessor$waitLargestContentfulPaint$2 summaryLargestContentfulProcessor$waitLargestContentfulPaint$2 = new SummaryLargestContentfulProcessor$waitLargestContentfulPaint$2(2, continuation);
        summaryLargestContentfulProcessor$waitLargestContentfulPaint$2.L$0 = obj;
        return summaryLargestContentfulProcessor$waitLargestContentfulPaint$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryLargestContentfulProcessor$waitLargestContentfulPaint$2) create((Set) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Set set = (Set) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return Boolean.valueOf(set.size() == SummaryElement.a().size());
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
