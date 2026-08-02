package com.ybsdk.feature.stories.internal.data;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import com.ybsdk.core.common.data.network.dto.nfc.NfcInfoDto;
import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.stories.internal.network.StoriesApi;
import com.ybsdk.feature.stories.internal.network.dto.GetVerticalStoriesRequest;
import defpackage.fzw;
import defpackage.g5j0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p860;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Result;", "Log31;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.stories.internal.data.StoriesRepository$getVerticalStories$2", f = "StoriesRepository.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE, 47, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class StoriesRepository$getVerticalStories$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $startStoryId;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoriesRepository$getVerticalStories$2(a aVar, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$startStoryId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new StoriesRepository$getVerticalStories$2(this.this$0, this.$startStoryId, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((StoriesRepository$getVerticalStories$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0099, code lost:
    
        if (r10 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if (r11 == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        StoriesApi storiesApi;
        String str;
        String str2;
        Object b;
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            storiesApi = aVar.a;
            String a = aVar.d.a();
            str = this.$startStoryId;
            fzw b2 = ((p860) this.this$0.b).b();
            this.L$0 = storiesApi;
            this.L$1 = a;
            this.L$2 = str;
            this.label = 1;
            Object y = e.y(b2, this);
            if (y != coroutineSingletons) {
                str2 = a;
                obj = y;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                failure = ((Result) obj).getValue();
                return new Result(failure);
            }
            b.b(obj);
            b = ((Result) obj).getValue();
            Throwable a2 = Result.a(b);
            if (a2 == null) {
                StoriesRepository$getVerticalStories$2$1$1 storiesRepository$getVerticalStories$2$1$1 = new StoriesRepository$getVerticalStories$2$1$1(2, null);
                this.label = 3;
                failure = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) b, storiesRepository$getVerticalStories$2$1$1, this);
            } else {
                failure = new Result.Failure(a2);
            }
            return new Result(failure);
        }
        str = (String) this.L$2;
        str2 = (String) this.L$1;
        storiesApi = (StoriesApi) this.L$0;
        b.b(obj);
        GetVerticalStoriesRequest getVerticalStoriesRequest = new GetVerticalStoriesRequest(str, (NfcInfoDto) obj, ((g5j0) this.this$0.c).a());
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
        b = storiesApi.b(str2, getVerticalStoriesRequest, this);
    }
}
