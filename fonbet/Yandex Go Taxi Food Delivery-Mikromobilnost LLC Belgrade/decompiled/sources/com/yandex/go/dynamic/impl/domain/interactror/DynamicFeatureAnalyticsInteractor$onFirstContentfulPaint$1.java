package com.yandex.go.dynamic.impl.domain.interactror;

import com.yandex.go.dynamic.api.DynamicFeature;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r40;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/yandex/go/dynamic/api/DynamicFeature;", "dynamicFeature", "Lr40;", "activityResult", "Lkotlin/Pair;", "", "<anonymous>", "(Lcom/yandex/go/dynamic/api/DynamicFeature;Lr40;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.dynamic.impl.domain.interactror.DynamicFeatureAnalyticsInteractor$onFirstContentfulPaint$1", f = "DynamicFeatureAnalyticsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class DynamicFeatureAnalyticsInteractor$onFirstContentfulPaint$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DynamicFeatureAnalyticsInteractor$onFirstContentfulPaint$1 dynamicFeatureAnalyticsInteractor$onFirstContentfulPaint$1 = new DynamicFeatureAnalyticsInteractor$onFirstContentfulPaint$1(3, (Continuation) obj3);
        dynamicFeatureAnalyticsInteractor$onFirstContentfulPaint$1.L$0 = (DynamicFeature) obj;
        dynamicFeatureAnalyticsInteractor$onFirstContentfulPaint$1.L$1 = (r40) obj2;
        return dynamicFeatureAnalyticsInteractor$onFirstContentfulPaint$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DynamicFeature dynamicFeature = (DynamicFeature) this.L$0;
        r40 r40Var = (r40) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return new Pair(dynamicFeature, Boolean.valueOf(r40Var.a == -1));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
