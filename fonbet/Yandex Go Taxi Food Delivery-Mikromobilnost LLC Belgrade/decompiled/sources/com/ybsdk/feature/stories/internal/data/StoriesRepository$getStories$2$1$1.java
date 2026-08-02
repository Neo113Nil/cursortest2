package com.ybsdk.feature.stories.internal.data;

import com.ybsdk.core.stories.dto.StoriesResponse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/core/stories/dto/StoriesResponse;", "storiesResponse", "Lhmu0;", "<anonymous>", "(Lcom/ybsdk/core/stories/dto/StoriesResponse;)Lhmu0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.stories.internal.data.StoriesRepository$getStories$2$1$1", f = "StoriesRepository.kt", l = {39}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class StoriesRepository$getStories$2$1$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        StoriesRepository$getStories$2$1$1 storiesRepository$getStories$2$1$1 = new StoriesRepository$getStories$2$1$1(2, continuation);
        storiesRepository$getStories$2$1$1.L$0 = obj;
        return storiesRepository$getStories$2$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StoriesRepository$getStories$2$1$1) create((StoriesResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        StoriesResponse storiesResponse = (StoriesResponse) this.L$0;
        this.label = 1;
        Object e = com.ybsdk.core.stories.b.e(storiesResponse, this);
        return e == coroutineSingletons ? coroutineSingletons : e;
    }
}
