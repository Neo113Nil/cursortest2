package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: SnapFlingBehavior.kt */
@b6l(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", l = {100}, m = "performFling", v = 1)
/* loaded from: classes11.dex */
public final class k9k0 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ m9k0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9k0(m9k0 m9k0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = m9k0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, this);
    }
}
