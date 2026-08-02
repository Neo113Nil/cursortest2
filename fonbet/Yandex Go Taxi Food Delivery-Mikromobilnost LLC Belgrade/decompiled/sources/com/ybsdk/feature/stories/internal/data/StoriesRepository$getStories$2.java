package com.ybsdk.feature.stories.internal.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.stories.internal.network.StoriesApi;
import com.ybsdk.feature.stories.internal.network.dto.GetStoriesRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Result;", "Lhmu0;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.stories.internal.data.StoriesRepository$getStories$2", f = "StoriesRepository.kt", l = {31, 38}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class StoriesRepository$getStories$2 extends SuspendLambda implements tls {
    final /* synthetic */ Map<String, String> $additionalData;
    final /* synthetic */ String $agreementId;
    final /* synthetic */ String $target;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoriesRepository$getStories$2(a aVar, String str, String str2, Map map, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$target = str;
        this.$agreementId = str2;
        this.$additionalData = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new StoriesRepository$getStories$2(this.this$0, this.$target, this.$agreementId, this.$additionalData, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((StoriesRepository$getStories$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        if (r8 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (r9 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            StoriesApi storiesApi = this.this$0.a;
            GetStoriesRequest getStoriesRequest = new GetStoriesRequest(this.$target, this.$agreementId, this.$additionalData);
            this.label = 1;
            a = storiesApi.a(getStoriesRequest, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                failure = ((Result) obj).getValue();
                return new Result(failure);
            }
            b.b(obj);
            a = ((Result) obj).getValue();
        }
        Throwable a2 = Result.a(a);
        if (a2 == null) {
            StoriesRepository$getStories$2$1$1 storiesRepository$getStories$2$1$1 = new StoriesRepository$getStories$2$1$1(2, null);
            this.label = 2;
            failure = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) a, storiesRepository$getStories$2$1$1, this);
        } else {
            failure = new Result.Failure(a2);
        }
        return new Result(failure);
    }
}
