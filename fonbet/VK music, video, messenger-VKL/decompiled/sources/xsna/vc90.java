package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: LazyLayoutPager.kt */
@b6l(c = "androidx.compose.foundation.pager.PagerWrapperFlingBehavior", f = "LazyLayoutPager.kt", l = {488}, m = "performFling", v = 1)
/* loaded from: classes11.dex */
public final class vc90 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ wc90 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc90(wc90 wc90Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = wc90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this);
    }
}
