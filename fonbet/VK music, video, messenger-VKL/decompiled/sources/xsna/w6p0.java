package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: TopAppBarScrollBehavior.kt */
@b6l(c = "com.vk.core.compose.component.topbar.TopAppBarScrollBehaviorKt", f = "TopAppBarScrollBehavior.kt", l = {388, 401, 417}, m = "settleAppBar")
/* loaded from: classes17.dex */
public final class w6p0 extends ContinuationImpl {
    float F$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public w6p0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return m200.B(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, this);
    }
}
