package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: LikeScaleAnimator.kt */
@b6l(c = "com.vk.feed.design.compose.newsfeed.footer.LikeScaleAnimator", f = "LikeScaleAnimator.kt", l = {35, 36, 37, 38, 39}, m = "animateLike")
/* loaded from: classes18.dex */
public final class o6z extends ContinuationImpl {
    float F$0;
    float F$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ p6z this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6z(p6z p6zVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = p6zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this);
    }
}
